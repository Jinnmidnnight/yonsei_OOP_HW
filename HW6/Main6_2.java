package HW6;
public class Main6_2 {

	public static void main(String[] args) {
		int[] a = {8, 5, 6, 2, 4, 7, 9, 3};
		showArray(a);
		sort(a); 
		System.out.println(); 
		int[] b = {9, 8, 7, 6, 5, 4, 3, 2}; 
		showArray(b);
		sort(b);
		System.out.println(); 
		int[] c = {1, 2, 3, 4, 5, 6, 7, 8}; 
		showArray(c);
		sort(c);
	}
	
    static void showArray(int[] a) {
        String str = "";
        for (int i=0; i<a.length; i++) {
            str += a[i] + " ";
        }
        System.out.println(str.trim());
    }

    static void sort(int[] a) {
        int index;
        for (index=1; index < a.length; index++) {
            for (int i = 0; i < index; i++) {
                if (a[index] < a[i]) {
                    int temp = a[index];
                    a[index] = a[i];
                    a[i] = temp;
                }
            }
            showArray(a);
        }
    }

}

