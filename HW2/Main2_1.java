import java.text.NumberFormat;
import java.util.Locale; 

public class Main2_1 {

	public static void main(String[] args) {
        NumberFormat USD = NumberFormat.getCurrencyInstance(Locale.US);
        NumberFormat WON = NumberFormat.getCurrencyInstance(Locale.KOREA);
        NumberFormat YEN = NumberFormat.getCurrencyInstance(Locale.JAPAN);

        System.out.printf("USA%11s  KOR%12s  JPN%11s%n" , USD.format(10), WON.format(10 * 1304), YEN.format(10 * 135.1));
        System.out.printf("USA%11s  KOR%12s  JPN%11s%n" , USD.format(100), WON.format(100 * 1304), YEN.format(100 * 135.1));
        System.out.printf("USA%11s  KOR%12s  JPN%11s%n" , USD.format(1000), WON.format(1000 * 1304), YEN.format(1000 * 135.1));
        System.out.printf("USA%11s  KOR%12s  JPN%11s%n" , USD.format(10000), WON.format(10000 * 1304), YEN.format(10000 * 135.1));

    }
}