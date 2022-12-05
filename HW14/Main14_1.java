import java.util.ArrayList; 

public class Main14_1 {

	public static void main(String[] args) {
		
		ArrayList<Book141> list = new ArrayList<Book141>();
		
		list.add(new Book141("Gone with the wind", 455));
        list.add(new Book141("The door to the future", 312));
        list.add(new Book141("Key of your life", 155));
        list.add(new Book141("We need a new leader", 274));
		
		showList(list);
		
		System.out.println();
		System.out.println("Changing 3rd element to some other one");
		
		list.set(2, new Book141("My precious life", 432));
		
		showList(list);
		
		System.out.println();
		System.out.println("Inserting a new element as a third element");
		
        Book141 cpp = new Book141("C++ mastering course", 324);
		list.add(2, cpp);
		
		showList(list);
		
		System.out.println();
		
		System.out.println("Does the list contain cpp? " + list.contains(cpp));
        System.out.println("Index of cpp? " + list.indexOf(cpp));
		
		System.out.println();
		
		System.out.println("Removing a second element");
        list.remove(1);
		
		showList(list);

	}
	
	public static void showList(ArrayList<Book141> list) {
        System.out.println("---list---");
        for (int i=0; i<list.size();i++) {
            System.out.println(list.get(i));
        }
    }

}

class Book141 {
    private String title;
    private int pages;

    public Book141() {};
    public Book141(String title, int pages) {
        this.title = title;
        this.pages = pages;
    }
    public String toString() {
        return "[BOOK] title("+title+") pages("+pages+")";
    }
}