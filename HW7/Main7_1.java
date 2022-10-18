package HW7;
public class Main7_1 {

	public static void main(String[] args) {
		Product71 pro1 = new Product71("MyProduct");
		TV71 tv1 = new TV71("SamsungTV", 75);
		TV71 tv2 = new TV71(); 
		TV71 tv3 = new TV71(tv1);
		Computer71 com1 = new Computer71();
		Computer71 com2 = new Computer71("Macbook", 7);
		
		showInfo(pro1);
		showInfo(tv1);
		showInfo(tv2);
		showInfo(tv3);
		showInfo(com1);
		showInfo(com2);
		System.out.println(); 
		
		tv1.setName("LGTV");
		showInfo(tv1);
		showInfo(tv3);
	}
	
	static void showInfo(Product71 pro) {
		pro.work();
		System.out.println(pro);
	}

}

class Product71 {
    protected String name;
    
    public Product71() {name = "Noname";};
    public Product71(String name) {
        this.name = name;
    }
    public void setName(String newName) {
        name = newName;
    }
    public void work() {
        System.out.println("product " + name + " works.");
    }
    public String toString() {
        return "[PRODUCT] name("+name+")";
    }
}

class TV71 extends Product71{
    protected int displaySize;

    public TV71() {
        super();
    }
    public TV71(String name, int displaySize) {
        super(name);
        this.displaySize = displaySize;
    }
    public TV71(TV71 tv) {
        name = tv.name;
        displaySize = tv.displaySize;
    }
    public void work() {
        System.out.println("TV "+ name + " shows the movie.");
    }
    public String toString() {
        return super.toString() + " [TV] displaySize("+displaySize+")";
    }
}

class Computer71 extends Product71 {
    protected int numCores;

    public Computer71() {super();};
    public Computer71(String name, int numCores) {
        super(name);
        this.numCores = numCores;
    }
    public void work() {
        System.out.println("Computer "+ name + " runs a program.");
    }
    public String toString() {
        return super.toString() + " [COMPUTER] numCores("+numCores+")";
    }

}
