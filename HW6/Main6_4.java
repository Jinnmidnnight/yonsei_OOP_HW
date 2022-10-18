package HW6;
public class Main6_4 {

	public static void main(String[] args) {
		int a1[][] = {{1, 2, 3}, {4, 5}, {6}}; 
		int b1[][] = {{1}, {2, 3}, {4, 5, 6}, {7}};
		
		System.out.println("--a1--");
		showArray(a1);
		int a2[][] = change(a1);
		System.out.println("--a2--");
		showArray(a2);
		
		System.out.println("--b1--");
		showArray(b1);
		int b2[][] = change(b1);
		System.out.println("--b2--");
		showArray(b2);
		
	}
	
	static void showArray(int[][] x) {
        for (int i=0; i<x.length; i++) {
            boolean begin = true;
            String line = "";
            for (int j=0; j<x[i].length; j++) {
                if (begin) {
                    line += x[i][j];
                    begin = false;
                }
                else{
                    line += " " + x[i][j];
                }
            }
            System.out.println(line);
        }
    }
	
    static int[][] change(int[][] x) {
        int y_row = 0;
        for (int i=0; i<x.length; i++) {
            if (y_row <= x[i].length) {
                y_row = x[i].length;
            }
        }

        int[][] y = new int[y_row][x.length];
        for (int i=0; i<x.length; i++) {
            for (int j=0; j<x[i].length;j++) {
                y[j][i] = x[i][j];
            }
        }

        return y;
    }
}

