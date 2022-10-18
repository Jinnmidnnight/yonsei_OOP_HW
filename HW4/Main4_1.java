public class Main4_1 {
    public static void main(String[] args) {
        Pet41 p1 = new Pet41();
        Pet41 p2 = new Pet41("Mary", 3, "white");
        Pet41 p3 = new Pet41("Popo", 2, "brown");
        Pet41 p4 = new Pet41("Coco", -1, "black");
        Pet41 p5; 
        Pet41 p6 = p1; 
        
        System.out.println("p1's name: " + p1.getName());
        System.out.println("p1's age: " + p1.getAge());
        System.out.println("p1's color: " + p1.getColor()); 
        
        p1.setAll("Popo",  2, "brown");
        p5 = new Pet41();
        p5.setName("Lulu");
        p5.setAge(5);
        p5.setColor("yellow");
        p4.setAll("Toto", -3, "blue");
        
        System.out.println("p1 == p6 ? " + (p1 == p6));
        System.out.println("p1 == p3 ? " + (p1 == p3));
        System.out.println("p1.equals(p3) ? " + p1.equals(p3));
        System.out.println("p2.equals(p5) ? " + p2.equals(p5));
        
        System.out.println("p1:" + p1);
        System.out.println("p2:" + p2);
        System.out.println("p3:" + p3);
        System.out.println("p4:" + p4);
        System.out.println("p5:" + p5);
        System.out.println("p6:" + p6);
    }
}

class Pet41 {
    private String name;
    private int age;
    private String color;

    public Pet41() {
        name = "noname";
        age = 0;
        color = "nocolor";
    }
    public Pet41(String name, int age, String color) {
        this.name = name;
        if (age >= 0) {
            this.age = age;
        }
        else {
            this.age = 0;
        }
        this.color = color;
    }
    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }
    public String getColor() {
        return color;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setAge(int age) {
        if (age >= 0) {
            this.age = age;
        }
        else {
            this.age = 0;
        }
    }
    public void setColor(String color) {
        this.color = color;
    }
    public void setAll(String name, int age, String color) {
        this.name = name;
        if (age >= 0) {
            this.age = age;
        }
        else {
            this.age = 0;
        }
        this.color = color;
    }
    public boolean equals(Pet41 pet) {
        if (name.equals(pet.name) && age == pet.age && color.equals(pet.color)) {
            return true;
        }
        else {
            return false;
        }
    }
    public String toString() {
        return "[PET] name(" + name + ") age(" + age + ") color(" + color + ")";
    }
}