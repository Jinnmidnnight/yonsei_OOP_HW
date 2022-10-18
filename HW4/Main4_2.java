public class Main4_2 {

	public static void main(String[] args) {
		int x = 3, y = 5; 
		int z = add(x, y); 
		Number42 n1 = new Number42(8);
		Number42 n2 = new Number42(12);
		Number42 n3 = add(n1, n2); 
		String42 s1 = new String42("Korea");
		String42 s2 = new String42("Seoul");
		String42 s3 = add(s1, s2); 
		String str = add(s1, "Busan");
		
		System.out.println("z = " + z);
		System.out.println("n3 = " + n3);
		System.out.println("s3 = " + s3); 
		System.out.println("str = " + str);
	}
	
	static int add(int x, int y) {
        return x + y;
    }
    
    static Number42 add(Number42 x, Number42 y) {
        int num = x.getNumber() + y.getNumber();
        Number42 z = new Number42(num);
        return z;
    }
    
    static String42 add(String42 x, String42 y) {
        String str = x.getString() + y.getString();
        String42 z = new String42(str);
        return z;
    }

    static String add(String42 x, String y) {
        String z = x.getString() + y;
        return z;
    }
}

// your code for class Number42 and String42

class Number42 {
    private int number;
    public Number42() {}
    public Number42(int number) {
        this.number = number;
    }
    public int getNumber() {
        return number;
    }
    public String toString() {
        return "[NUMBER] " + number;
    }
}

class String42 {
    private String str;
    public String42() {}
    public String42(String str) {
        this.str = str;
    }
    public String getString() {
        return str;
    }
    public String toString() {
        return "[STRING] " + str;
    }

}
