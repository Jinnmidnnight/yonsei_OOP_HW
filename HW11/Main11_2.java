package HW11;

public class Main11_2 {
    public static void main(String[] args) {
        String a = "abcdefgabcabcd";
        String b = "This is an apple.";
        String c = "bbbaaabbbaaabbb";
        String d = "a";
        String e = "bcdefghijklmnop";

        System.out.println(a + " " + lastIndexOf('a', a));
        System.out.println(b + " " + lastIndexOf('a', b));
        System.out.println(c + " " + lastIndexOf('a', c));
        System.out.println(d + " " + lastIndexOf('a', d));
        System.out.println(e + " " + lastIndexOf('a', e));

    }

    public static int lastIndexOf(char ch, String str) {
        if (str.charAt(str.length() - 1) == ch) { return str.length() -1; }
        if (str.length() <= 1) { return -1; }
        return lastIndexOf(ch, str.substring(0, str.length() - 1));
    }
}
