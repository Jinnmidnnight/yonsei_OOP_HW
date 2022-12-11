package HW15;
import java.util.Queue;
import java.util.LinkedList; 

public class Main15_2 {
	public static void main(String[] args) {
        StackByQueue<Integer> sq = new StackByQueue<Integer>();

        System.out.println("sq empty? "+sq.empty());
        System.out.println("sq.pop() = "+sq.pop());

        sq.push(1); sq.push(2); sq.push(3); sq.push(4);
        
        System.out.println("sq: "+sq);
        int size = sq.queue.size();
        for (int i=0; i<size; i++) {
            System.out.println("sq.pop() = "+sq.pop()+"  "+sq);
        }
        System.out.println("sq.pop() = "+sq.pop()+"  "+sq);

    }
}

class StackByQueue<T> {
    LinkedList<T> queue;

    public boolean empty() {
        if (queue == null) {
            return true;
        }
        return false;
    }

    public T pop() {
        if (queue == null || queue.size() == 0) {
            return null;
        }
        T last = queue.getLast();
        queue.remove(queue.size()-1);
        return last;
    }

    public void push(T item) {
        if (queue == null) {
            queue = new LinkedList<T>();
        }
        queue.add(item);
    }

    public String toString() {
        if (queue != null) {
            String str = "";
            LinkedList<T> nQueue = new LinkedList<T>(queue);
            str += "[";
            for (int i=0; i<queue.size(); i++) {
                str += nQueue.poll();
                if (i < queue.size()-1) {str += ", ";}
            }
            str += "]";
            return str;
        }
        else {return "[]";}
    }

}