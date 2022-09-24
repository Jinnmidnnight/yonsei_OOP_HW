public class Main1_2 {

	public static void main(String[] args) {
		int x = 32;
		int y = 56; 
		int z;
		int p;
		byte b1 = 12;
		byte b2 = 5;
		byte b3; 
		byte b4; 
		float f1;
		float f2 = 1.53f;
		double d1;
		double d2 = 2.3456;
		
		z = x + y; 
		p = b1 + b2; 
		b3 = (byte)(b1 + b2); 
		b4 = (byte)(d2 + y); 
		f1 = (float)(d2 + x); 
		d1 = f2 + d2; 
		
		System.out.println("z = " + z);
		System.out.println("p = " + p);
		System.out.println("b3 = " + b3); 
		System.out.println("b4 = " + b4); 
		System.out.println("f1 = " + f1); 
		System.out.println("d1 = " + d1); 

	}

}
