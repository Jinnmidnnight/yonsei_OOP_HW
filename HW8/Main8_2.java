package HW8;

public class Main8_2 {

	public static void main(String[] args) {
		Member82[] member = new Member82[8];
		member[0] = new Teacher82(132, "Tom");
		member[1] = new Teacher82(155, "Jane", "English");
		member[2] = new Student82(2022931, "John");
		member[3] = new Student82(2019862, "Emma", "Math", "Science", "Java");
		member[4] = new Student82(2020355, "Harper", "English");
		member[5] = new Student82(2020223, "Anna", "Statistics", "Science", "English", "Math");
		member[6] = new Staff82(205, "Nicole", "Clerk");
		member[7] = new Staff82(237, "David", "Accountant");
		
		for (int i = 0; i < member.length; i++) {
			System.out.println(member[i]);
			member[i].showRole();
			System.out.println();
		}
		
	}

}

// your code for class Member82, Teacher82, Student82, and Staff82 

abstract class Member82 {
    protected int id;
    protected String name;

    abstract public void showRole();

    public Member82(int id, String name) {
        this.id = id;
        this.name = name;
    }
    public String toString() {
        return  "id("+id+") name("+name+")";
    }
}

class Teacher82 extends Member82 {
    private String subject;

    public Teacher82(int id, String name) {
        super(id, name);
        subject = "NONE";
    }
    public Teacher82(int id, String name, String subject) {
        super(id, name);
        this.subject = subject;
    }
    public void showRole() {
        System.out.println("teaching the subject: "+subject);
    }
    public String toString() {
        return "[TEACHER] subject("+subject+") " + super.toString();
    }
}

class Student82 extends Member82 {
    private String[] course;

    public Student82(int id, String name) {
        super(id, name);
        course = new String[0];
    }
    public Student82(int id, String name, String c1) {
        super(id, name);
        course = new String[1];
        course[0] = c1;
    }
    public Student82(int id, String name, String c1, String c2, String c3) {
        super(id, name);
        course = new String[3];
        course[0] = c1;
        course[1] = c2;
        course[2] = c3;
    }
    public Student82(int id, String name, String c1, String c2, String c3, String c4) {
        super(id, name);
        course = new String[4];
        course[0] = c1;
        course[1] = c2;
        course[2] = c3;
        course[3] = c4;
    }
    public void showRole() {
        System.out.println("taking "+course.length+" courses");
    }
    public String toString() {
        String str = "";
        for (int i=0; i<course.length; i++) {
            if (i != course.length-1) {
                str += course[i] + ", ";
            }
            else {
                str += course[i];
            }
        }

        return "[STUDENT] course("+str+") " + super.toString();
    }
}

class Staff82 extends Member82 {
    private String duty;

    public Staff82(int id, String name) {
        super(id, name);
    }
    public Staff82(int id, String name, String duty) {
        super(id, name);
        this.duty = duty;
    }
    public void showRole() {
        System.out.println("perform the duty: "+duty);
    }
    public String toString() {
        return "[STAFF] duty("+duty+") " + super.toString();
    }
}