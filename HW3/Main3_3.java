import java.util.Scanner; 

public class Main3_3 {

	public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        String str = "";
        String input = keyboard.next();
        
        while (!input.equals("bye")) {
            if (input.equals("s")) {
                str = keyboard.nextLine().trim();
                System.out.println("Sentence(" + str + ")");
            }
            else {
                String test = str;
                int count = 0;
    
                while (test.indexOf(input) != -1) {
                    count ++;
                    test = test.substring(test.indexOf(input) + input.length());
                }
    
                System.out.println(input + ": " + count);
            }
    

            input = keyboard.next();
        }
    
    }

}
