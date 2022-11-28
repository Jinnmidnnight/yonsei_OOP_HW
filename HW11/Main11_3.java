package HW11;

public class Main11_3 {
    public static void main(String[] args) {
        String a = "This is test";
        String b = "a a a a a a a";
        String c = "";
        String d = " ";
        String e = "       ";
        String f = "SEOUL";
        String g = "  SEOUL   KOREA ";

        print(a);
        print(b);
        print(c);
        print(d);
        print(e);
        print(f);
        print(g);

    }
    public static int countWords(String s) {
        if (s.isEmpty()) return 0;
        if (s.indexOf(' ') == -1) return 1;
        if (s.charAt(0) == ' ') return countWords(s.substring(1));
        return 1 + countWords(s.substring(s.indexOf(' ') + 1));
    }
    public static void print(String a) {
        System.out.println("["+a+"] "+countWords(a));
    }


}