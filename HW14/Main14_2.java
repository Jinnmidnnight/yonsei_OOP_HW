public class Main14_2 {

	public static void main(String[] args) {
		Concat<Integer> d1 = new Concat<Integer>(3, 5);
		Concat<Double> d2 = new Concat<Double>(8.21, -4.36);
		Concat<String> d3 = new Concat<String>("Korea", "Seoul");
		System.out.println(d1.add());
		System.out.println(d2.add());
		System.out.println(d3.add());
	}
	
}

interface Addable<T> {
	String add();
}

class Concat<T> implements Addable<T> {
    private T first;
    private T second;

    public Concat() {};
    public Concat(T first, T second) {
        this.first = first;
        this.second = second;
    }
    public String add() {
        return first + "" + second;
    }

}