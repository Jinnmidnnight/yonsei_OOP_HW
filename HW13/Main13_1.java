package HW13;


public class Main13_1 {

	public static void main(String[] args) {
		
		// Dog, Tree, Closet, Chair, Bag
		
		MyObject131[] obj = new MyObject131[5]; 
		obj[0] = new Dog131("popo", 3, "bulldog"); // name, age, breed (품종)
		obj[1] = new Tree131("pinetree", 15, 25); // name, age, height
		obj[2] = new Closet131("chiffonier", "brown", 2); // name (서랍장), color, # of doors
		obj[3] = new Chair131("arm_chair", "yellow", 4);  // name, color, # of legs
		obj[4] = new Bag131("sholder_bag", "red", 32);  // name, color, size
		
		showInfo(obj);
		System.out.println();
		showLivingThing(obj);
		System.out.println();
		showNonLivingThing(obj);
		System.out.println();
		showMovable(obj);
		System.out.println();
		showBuiltIn(obj);
		System.out.println();
		showShouldable(obj);

	}
	
    public static void showInfo(MyObject131[] obj) {
        System.out.println("------- show info -------");
        for (int i=0; i<obj.length;i++) {
            System.out.println(obj[i]);
        }
    }
    public static void showLivingThing(MyObject131[] obj) {
        System.out.println("------- show living things -------");
        for (int i=0; i<obj.length;i++) {
            if (obj[i] instanceof LivingThing131) {
                System.out.println(obj[i]);
            }
        }
    }
    public static void showNonLivingThing(MyObject131[] obj) {
        System.out.println("------- show non-living things -------");
        for (int i=0; i<obj.length;i++) {
            if (obj[i] instanceof NonLivingThing131) {
                System.out.println(obj[i]);
            }
        }
    }
    public static void showMovable(MyObject131[] obj) {
        System.out.println("------- show movable objects -------");
        for (int i=0; i<obj.length;i++) {
            if (obj[i] instanceof Movable131) {
                System.out.println(obj[i]);
            }
        }
    }
    public static void showBuiltIn(MyObject131[] obj) {
        System.out.println("------- show built-in objects -------");
        for (int i=0; i<obj.length;i++) {
            if (obj[i] instanceof Stationary131) {
                System.out.println(obj[i]);
            }
        }
    }
    public static void showShouldable(MyObject131[] obj) {
        System.out.println("------- show portable objects -------"); 
        for (int i=0; i<obj.length;i++) {
            if (obj[i] instanceof Portable131) {
                if (obj[i].name == "sholder_bag") {
                    System.out.print(obj[i]);
                }
                else {
                    System.out.println(obj[i]);
                }
            }
        }
    }
}

class MyObject131 {
    protected String name;
    public String toString() {
        return "[MY_OBJECT] name("+name+")";
    }
    public MyObject131() {}
    public MyObject131(String name) {
        this.name = name;
    }
}

class LivingThing131 extends MyObject131 {
    protected int age;
    public String toString() {
        return super.toString() + " [LIVING] age("+age+")";
    }
    public LivingThing131() {}
    public LivingThing131(String name, int age) {
        super(name);
        this.age = age;
    }
}

class NonLivingThing131 extends MyObject131 {
    protected String color;
    public String toString() {
        return super.toString()+" [NON_LIVING] color("+color+")";
    }
    public NonLivingThing131() {}
    public NonLivingThing131(String name, String color) {
        super(name);
        this.color = color;
    }
}

class Dog131 extends LivingThing131 implements Movable131, Portable131 {
    protected String breed;
    public Dog131(String name, int age, String breed) {
        super(name, age);
        this.breed = breed;
    }
    public String toString() {
        return super.toString()+" [DOG] breed("+breed+") self_movable("+self_movable()+") is_shoulderable("+shoulderable()+")";
    }
    public boolean self_movable() {
        return true;
    }
    public boolean shoulderable() {
        return false;
    }
}

class Tree131 extends LivingThing131 implements Stationary131 {
    protected int height;
    public Tree131(String name, int age, int height) {
        super(name, age);
        this.height = height;
    }
    public String toString() {
        return super.toString()+" [TREE] height("+height+") built-in("+built_in()+")";
    }
    public boolean built_in() {
        return false;
    }
}

class Closet131 extends NonLivingThing131 implements Stationary131 {
    protected int numDoors;
    public Closet131(String name, String color, int numDoors) {
        super(name, color);
        this.numDoors = numDoors;
    }
    public String toString() {
        return super.toString()+" [CLOSET] numDoors("+numDoors+") isBuiltIn("+built_in()+")";
    }
    public boolean built_in() {
        return true;
    }
}

class Chair131 extends NonLivingThing131 implements Movable131 {
    protected int numLegs;
    public Chair131(String name, String color, int numLegs) {
        super(name, color);
        this.numLegs = numLegs;
    }
    public String toString() {
        return super.toString()+" [CHAIR] numLegs("+numLegs+")";
    }
    public boolean self_movable() {
        return false;
    }
}

class Bag131 extends NonLivingThing131 implements Movable131, Portable131 {
    protected int size;
    public Bag131(String name, String color, int size) {
        super(name, color);
        this.size = size;
    }
    public String toString() {
        return super.toString()+" [BAG] size("+size+") self_movable("+self_movable()+") is_shoulderable("+shoulderable()+")";
    }
    public boolean self_movable(){
        return false;
    }
    public boolean shoulderable() {
        return true;
    }
}

interface Movable131 {
    boolean self_movable();
}
interface Stationary131 {
    boolean built_in();
}
interface Portable131 {
    boolean shoulderable();
}