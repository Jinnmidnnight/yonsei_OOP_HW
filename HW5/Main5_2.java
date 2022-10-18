package HW5;
import java.util.Scanner; 

public class Main5_2 {

	public static void main(String[] args) {
		
		Player52 p0 = new Player52(0);
		Player52 p1 = new Player52(1); 
		
		System.out.println(p0);
		System.out.println(p1);
		System.out.println("GAME START");
		System.out.println("turn = 0"); 
		
		Scanner keyboard = new Scanner(System.in);
        int turn = 0;
        int input = keyboard.nextInt();
        while(input != -1) {
            if(input == 0) {
                if(input == turn) {
                    p0.setScore(keyboard.nextInt() + p0.getScore());
                    turn = 1;

                    System.out.println(true);
                    System.out.println(p0);
                    System.out.println(p1);
                    System.out.println("turn = " + turn);
                }
                else {
                    keyboard.nextInt();

                    System.out.println(false);
                    System.out.println(p0);
                    System.out.println(p1);
                    System.out.println("turn = " + turn);
                }
            }
            else if (input == 1) {
                if(input == turn) {
                    p1.setScore(keyboard.nextInt() + p1.getScore());
                    turn = 0;

                    System.out.println(true);
                    System.out.println(p0);
                    System.out.println(p1);
                    System.out.println("turn = " + turn);
                }
                else {
                    keyboard.nextInt();

                    System.out.println(false);
                    System.out.println(p0);
                    System.out.println(p1);
                    System.out.println("turn = " + turn);
                }
            }
            input = keyboard.nextInt();
        }
        System.out.println("BYE");
	}
}

class Player52 {
    private int id;
    private int score;

    public Player52() {};
    public Player52(int id) {
        this.id = id;
    }
    public String toString() {
        return "[PLAYER] id(" + id + ") score(" + score + ")";
    }
    public int getScore() {
        return score;
    }
    public void setScore(int score) {
        this.score = score;
    }
}
