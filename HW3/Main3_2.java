public class Main3_2 {

	public static void main(String[] args) {
		String str1 = "Korea";
		String str2 = new String("Korea");
		String str3 = str2;
		String str4 = "Korea";
		String str5 = "5Korea";
		String str6 = new String("Kor");
		String str7 = "korea";
		
		System.out.println(str1 ==  str5 ); 
		System.out.println(str2 ==  str3); 
		System.out.println(str1 == str4 ); 
		System.out.println(str1.equals(str2 ));
		System.out.println(str1.equals(str5 ));
		System.out.println(str1.compareTo(str6) < 0); 
		System.out.println(str1.compareTo(str2 ) == 0);
		System.out.println(str1.compareTo(str5) < 0);

	}

}
