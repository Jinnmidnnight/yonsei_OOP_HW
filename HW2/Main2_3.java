import java.util.Scanner;

public class Main2_3 {

	public static void main(String[] args) {
		
       Scanner scannerObject = new Scanner(System.in);
       
       int num_100, num_50, num_10, num_5, num_1, rem_100, rem_50, rem_10, rem_5;
       
       int input_num = scannerObject.nextInt();
       
       num_100 = input_num / 100;
       rem_100 = input_num % 100;
       
       num_50 = rem_100 / 50;
       rem_50 = rem_100 % 50;
       
       num_10 = rem_50 / 10;
       rem_10 = rem_50 % 10;

       num_5 = rem_10 / 5;
       rem_5 = rem_10 % 5;

       num_1 = rem_5;
       
       System.out.println("100" + "("+num_100+") " + "50" + "("+num_50+") " 
    		   + "10" + "("+num_10+") "+ "5" + "("+num_5+") " + "1" + "("+num_1+")");
    }

}
