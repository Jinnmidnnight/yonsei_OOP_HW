public class Main14_4 {

	public static void main(String[] args) {
		MyClass144<Integer> c1 = new MyClass144<Integer>(4);
		MyClass144<String> c2 = new MyClass144<String>("Korea");
		MyClass144<Double> c3 = new MyClass144<Double>(5.43);
		
		c1.print(3.62);
		c2.print(-5);
		c3.print("Seoul");
	}

}

class MyClass144<T> {
    private T x;

    public MyClass144() {};
    public MyClass144(T x) {
        this.x = x;
    }
    public void print(Object y) {
        System.out.println(x + "" + y);
    }
    
}
