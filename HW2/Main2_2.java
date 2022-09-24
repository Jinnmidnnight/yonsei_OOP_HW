import java.util.Scanner;

public class Main2_2 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        int i1 = keyboard.nextInt();
        int i2 = keyboard.nextInt();

        double d1 = keyboard.nextDouble();

        String s1 = keyboard.next();
        String s2 = keyboard.next();

        String nothing = keyboard.nextLine();
        String last = keyboard.nextLine();

        System.out.println("int(" + i1 + ") int(" + i2 + ")");
        System.out.println("double("+ d1 + ")");
        System.out.println("String("+ s1 + ") String(" + s2 + ")");
        System.out.println("Sentence("+ last + ")");
    }
} 
