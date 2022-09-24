import java.util.Scanner;

public class Main3_1
{
	public static void main(String[] args)
	{
		Scanner keyboard = new Scanner(System.in);
		
		String grade;
		double r = keyboard.nextDouble();
		
		int r_10 = (int)(r * 10);
		
		switch (r_10 / 5) {
		case 6:
		case 5:
			grade = "Very Good";
			break;
		case 4:
			grade = "Good";
			break;
		case 3:
			grade = "So So";
			break;
		case 2:
			grade = "Bad";
			break;
		default:
			grade = "Very Bad";
		
		}
		System.out.println(grade);
		
	}
} 