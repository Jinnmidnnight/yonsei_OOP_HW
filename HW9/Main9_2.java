import java.util.Scanner; 

public class Main9_2 {

	public static void main(String[] args) {
		
		Scanner keyboard = new Scanner(System.in);
		boolean done = false; 
		int c = 0; 
		
		while (!done) { 
			try {
				c = getMenu(keyboard);
                done = true;
            }
			catch (WrongMenuException e) {
                System.out.println("Wrong Menu selected: "+e.num);
            }
            finally {
                System.out.println("You've selected the menu.");
            }
		
		}
		
		System.out.println("Menu: " + c);

	
	
    }

    static int getMenu(Scanner sc) throws WrongMenuException {
        int num = sc.nextInt();
        if (num < 1 || num > 5) {
            throw new WrongMenuException(num);
        }
        return num;
    }
}

class WrongMenuException extends Exception {
    public int num;
    public WrongMenuException(int num) {
        this.num = num;
    }
}
