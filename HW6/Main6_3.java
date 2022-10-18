package HW6;
public class Main6_3 {

	public static void main(String[] args) {
		
		Student63[] student = new Student63[3];
		
		Subject63[] sub1 = new Subject63[3]; 
		sub1[0] = new Subject63("Math", 87);
		sub1[1] = new Subject63("English", 92);
		sub1[2] = new Subject63("Physics", 75);
		
		student[0] = new Student63("Tom", sub1);
		student[1] = new Student63("Jane", 2); // 2 Courses
		student[1].setSub(0, "Literature", 67);
		student[1].setSub(1, "Chemistry", 94);
		
		student[2] = new Student63(student[0]); // Copy Constructor
		student[2].setName("Popo");
		student[2].setSub(0, "Psychology", 54);
		student[2].setSub(1, "Biology", 85);
		student[2].setSub(2, "Philosophy", 43);
		
		for (int i = 0; i < 3; i++) {
			System.out.print(i + ": ");
			System.out.println(student[i]);
			System.out.printf("        average: %f\n", student[i].getAverage());
		}
		System.out.println();
		
		sub1[1].setName("Calculus");
		sub1[1].setScore(100);
		System.out.println("sub1[1]: " + sub1[1]);
		
		for (int i = 0; i < 3; i++) {
			System.out.print(i + ": ");
			System.out.println(student[i]);
			System.out.printf("        average: %f\n", student[i].getAverage());
		}
		
		
	}

}

class Student63 {
	private String name; 
	private Subject63[] sub; 
	
    public double getAverage() {
        double total = 0;
        for (int i=0; i<sub.length; i++) {
            total += sub[i].getScore();
        }
        return total / sub.length;
    }
    public void setSub(int num, String name, int score) {
        sub[num] = new Subject63(name, score);
    }
    public void setName(String newName) {
        name = newName;
    }
    public Student63(Student63 student) {
        name = student.name;
        sub = new Subject63[student.sub.length];
        for (int i=0; i<sub.length; i++) {
            sub[i] = student.sub[i];
        }
    }
	public Student63() {};
    public Student63(String name, Subject63[] sub) {
        this.name = name;
        this.sub = new Subject63[sub.length];
        for (int i=0; i<this.sub.length; i++) {
            this.sub[i] = new Subject63(sub[i]);
        }
    }
    public Student63(String name, int num) {
        this.name = name;
        sub = new Subject63[num];
    }
    public String toString() {
        String str = "";
        for (int i=0; i<sub.length;i++) {
            str += "\n        " + sub[i].toString();
        }
        return "[STUDENT] name(" + name + ") subjects(" + sub.length + ")" + str;
    }
}

class Subject63 {
	private String name;
	private int score; 
	
	public Subject63() {};
    public Subject63(Subject63 sub) {
        name = new String(sub.name);
        score = sub.score;
    }
    public Subject63(String name, int score) {
        this.name = name;
        this.score = score;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setScore(int score) {
        this.score = score;
    }
    public String toString() {
        return "[SUB] name(" + name + ") score(" + score + ")";
    }
    public int getScore() {
        return score;
    }

}