import java.util.Scanner; 

public class Main3_3 {

	public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        while (true) {
            String str = keyboard.nextLine().trim();

            if (str.length() == 0) {
                str = "";
            }
            else if (str.charAt(0) == 's' && str.length() < 2) {
                str = "";
            }
            else if (str.substring(0, 2).equals("s ") && str.length() >= 2) {
                str = str.substring(2);
            }
            else if (str.equals("bye")) {
                System.exit(0);
            }

            System.out.println("Sentence(" + str + ")");

            while (true) {
                String word = keyboard.next();

                if (word.equals("s")) {
                    break;
                }
                else if (word.equals("bye")) {
                    System.exit(0);
                }

                String test = str;
                int count = 0;

                while (true) {
                    if (test.indexOf(word) != -1) {
                        count ++;
                        test = test.substring(test.indexOf(word) + word.length());
                    }
                    else {
                        break;
                    }
                }

                System.out.println(word + ": " + count);

            }
        } 
    }

}
