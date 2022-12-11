package HW15;
import javax.swing.text.Position;

public class Main15_1 {
	
	public static void main(String[] args) {
	
		LinkedList3<Book151> list = new LinkedList3<Book151>();
		list.addToStart(new Book151("AAA", 351));
		list.addToStart(new Book151("BBB", 278));
		list.addToStart(new Book151("CCC", 846));
		
		System.out.println(list);
		
		list.addAfter(0,  new Book151("DDD", 222));
		list.addAfter(2,  new Book151("EEE", 323));
		
		System.out.println(list);
		
		list.addAfter(3,  new Book151("FFF", 111));
		list.addAfter(5,  new Book151("GGG", 123));
		list.addAfter(7,  new Book151("HHH", 321));
		
		System.out.println(list);
		
		list.deleteAfter(4);
		list.deleteAfter(2);
		list.deleteAfter(8);
		
		System.out.println(list);
		
	}
	
}

class Book151 {
	private String title;
	private int pages;
	
	public Book151(String title, int pages) {
		this.title = title;
		this.pages = pages;
	}
	
	public String toString() {
		return "[BOOK] title(" + title + ") pages(" + pages + ")";
	}
}

class LinkedList3<T>
{
	public String toString() {
		String str = "[\n";
		Node<T> current = head; 
		while (current != null) {
			str += " " + current.data.toString() + "\n";
			current = current.link; 
		}
		str += "]";
		return str; 
	}
	
	public boolean addAfter(int index, T data) {
        Node<T> position = head;
        for (int i=0; i<index; i++) {
            if (position.link == null)
                return false;
            position = position.link;
        }
        position.link = new Node<T>(data, position.link);
        return true;
    }
    
    public boolean deleteAfter(int index) {
        Node<T> position = head;
        for (int i=0; i<index; i++) {
            if (position.link == null)
                return false;
            position = position.link;
        }
        position.link = position.link.link;
        return true;
    }
	
    private class Node<T>
    {
        private T data;
        private Node<T> link;

        public Node()
        {
             data = null;
             link = null;
        }

        public Node(T newData, Node<T> linkValue)
        {
            data = newData;
            link = linkValue;
        }
     }

    private Node<T> head;

    public LinkedList3( )
    {
        head = null;
    }

    public void addToStart(T itemData)
    {
        head = new Node<T>(itemData, head);
    }

    public boolean deleteHeadNode( )
    {
        if (head != null)
        {
            head = head.link;
            return true;
        }
        else
            return false;
    }

    public int size( )
    {
        int count = 0;
        Node<T> position = head;
        while (position != null)
        {
            count++;
            position = position.link;
        }
        return count;
    }

    public boolean contains(T item)
    {
        return (find(item) != null);
    }

    private Node<T> find(T target)
    {
        Node<T> position = head;
        T itemAtPosition;
        while (position != null)
        {
            itemAtPosition = position.data;
            if (itemAtPosition.equals(target))
                return position;
            position = position.link;
        }
        return null; //target was not found
    }

    public T findData(T target)
    {
        return find(target).data;
    }

    public void outputList( )
    {
        Node<T> position = head;
        while (position != null)
        {
            System.out.println(position.data);
            position = position.link;
        }
    }

    public boolean isEmpty( )
    {
        return (head == null);
    }

    public void clear( )
    {
        head = null;
    }

    public boolean equals(Object otherObject)
    {
        if (otherObject == null)
            return false;
        else if (getClass( ) != otherObject.getClass( ))
            return false;
        else
        {
            LinkedList3<T> otherList = (LinkedList3<T>)otherObject;
            if (size( ) != otherList.size( ))
                return false;
            Node<T> position = head;
            Node<T> otherPosition = otherList.head;
            while (position != null)
            {
                if (!(position.data.equals(otherPosition.data)))
                    return false;
                position = position.link;
                otherPosition = otherPosition.link;
            }
            return true; //no mismatch was not found
        }
    }

}