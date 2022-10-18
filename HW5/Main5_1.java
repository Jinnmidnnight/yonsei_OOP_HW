package HW5;
public class Main5_1 {

	public static void main(String[] args) {
        Member51 Tom = new Member51("General", "Tom", 42);
        Member51 Jane = new Member51("Jane", 25);
        Member51 Coby = new Member51("Coby", 33);

        System.out.println(Tom);
        System.out.println(Jane);
        System.out.println(Coby);
        System.out.println();

        Jane.setDept("Management");

        System.out.println(Tom);
        System.out.println(Jane);
        System.out.println(Coby);
        System.out.println();

        Coby.setDept("Development");

        System.out.println(Tom);
        System.out.println(Jane);
        System.out.println(Coby);
        System.out.println();

	}

}

class Member51 {
    private static String dept;
    private String name;
    private int age;

    public Member51() {};
    public Member51(String newDept, String name, int age) {
        dept = newDept;
        this.name = name;
        this.age = age;
    }
    public Member51(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public void setDept(String newDept) {
        dept = newDept;
    }
    public String toString() {
        return "[MEMBER] dept(" + dept + ") name(" + name + ") age(" + age + ")";
    }
}