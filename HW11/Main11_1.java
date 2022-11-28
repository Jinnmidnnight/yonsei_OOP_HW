package HW11;
import java.util.Arrays;

public class Main11_1 {
    public static void main(String[] args) {
        int[] a = {3, 7, 1, 12, 4, 9, 15, 17, 6, 5};
        int[] b = {-4, -6, 9, 8, 7, 2, 3, 6, -2};
        int[] c = {3};
        int[] d = {4, 2};
        
        print(a);
        print(b);
        print(c);
        print(d);

    }
    public static int findMax(int[] a, int index) {
        if (index > 0) {
            return Math.max(a[index], findMax(a, index-1));
        } else {
            return a[0];
        }
    }
    
    public static void print(int[] a) {
        System.out.print("[");
        for (int i=0; i<a.length; i++) {
            if (i==a.length-1) {
                System.out.print(a[i]+"]");
            }
            else {
                System.out.print(a[i]+", ");
            }
        }
        System.out.println(" "+findMax(a, a.length-1));
    }
}
