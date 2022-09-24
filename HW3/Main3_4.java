public class Main3_4 {

	public static void main(String[] args) {
		for (int i = 1; i <= 5; ++i) {
			for (int j = 7; j >= 3; --j) {
				if (j==3) {System.out.printf("%2d", i*j);}
				else {System.out.printf("%2d ", i*j);} }
			System.out.println();
		}
    }

}
