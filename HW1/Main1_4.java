public class Main1_4 {

	public static void main(String[] args) {
		
		String str1 = "KoreaSeoul234Seoul56Seoul7Seoul890";
        System.out.println(str1);

        String str2 = str1.substring(str1.indexOf("Seoul") + 5);
        System.out.println(str2);
        System.out.println(str2.charAt(0));

        String str3 = str2.substring(str2.indexOf("Seoul") + 5);
        System.out.println(str3);
        System.out.println(str3.charAt(0));

        String str4 = str3.substring(str3.indexOf("Seoul") + 5);
        System.out.println(str4);
        System.out.println(str4.charAt(0));

        String str5 = str4.substring(str4.indexOf("Seoul") + 5);
        System.out.println(str5);
        System.out.println(str5.charAt(0));

        System.out.println(str5.indexOf("Seoul"));
	}

}