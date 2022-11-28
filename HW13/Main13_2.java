package HW13;

public class Main13_2 {

	public static void main(String[] args) {
		
		NumberPair132 np1 = new NumberPair132(2, 1, 3, 1); 
		System.out.println(np1);
		System.out.println("[SUM] " + np1.addFrac() + " = " + np1.add());
		System.out.println("[SUB] " + np1.subFrac() + " = " + np1.sub());
		System.out.println("[MUL] " + np1.mulFrac() + " = " + np1.mul());
		
		System.out.println(); 
		
		NumberPair132 np2 = new NumberPair132(2, 5, 3, 2); 
		System.out.println(np2);
		System.out.println("[SUM] " + np2.addFrac() + " = " + np2.add());
		System.out.println("[SUB] " + np2.subFrac() + " = " + np2.sub());
		System.out.println("[MUL] " + np2.mulFrac() + " = " + np2.mul());
		
	}

}

class NumberPair132 {
	
	class Fraction132 {
        private int nomi;
        private int denomi;
    
        public Fraction132(int nomi, int denomi) {
            this.nomi = nomi;
            this.denomi = denomi;
        }
        public String toString() {
            return nomi+"/"+denomi;
        }
	}
	
    private Fraction132 first;
    private Fraction132 second;

	public NumberPair132(int f_n, int f_d, int s_n, int s_d) {
        first = new Fraction132(f_n, f_d);
        second = new Fraction132(s_n, s_d);
    }
    public String toString() {
        return "[NUM PAIR] ([FRAC] "+first+") ([FRAC] "+second+")";
    }
    public String add() {
        double f = (double)first.nomi / (double)first.denomi;
        double s = (double)second.nomi / (double)second.denomi;
        return String.format("%.1f",f + s);
    }
    public String sub() {
        double f = (double)first.nomi / (double)first.denomi;
        double s = (double)second.nomi / (double)second.denomi;
        return String.format("%.1f",f - s);
    }
    public String mul() {
        double f = (double)first.nomi / (double)first.denomi;
        double s = (double)second.nomi / (double)second.denomi;
        return String.format("%.1f",f * s);
    }
    public String addFrac() {
        int new_nomi; int new_denomi;
        if (first.denomi == second.denomi) {
            new_nomi = first.nomi + second.nomi;
            new_denomi = first.denomi;
        }
        else {
            new_nomi = first.denomi*second.nomi+second.denomi*first.nomi;
            new_denomi = first.denomi*second.denomi;
        }
        return "[FRAC] "+new_nomi+"/"+new_denomi;
    }
    public String subFrac() {
        int new_nomi; int new_denomi;
        if (first.denomi == second.denomi) {
            new_nomi = first.nomi - second.nomi;
            new_denomi = first.denomi;
        }
        else {
            new_nomi = (second.denomi*first.nomi)-(first.denomi*second.nomi);
            new_denomi = first.denomi*second.denomi;
        }
        return"[FRAC] "+new_nomi+"/"+new_denomi;
    }
    public String mulFrac() {
        int new_nomi; int new_denomi;
        new_nomi = first.nomi*second.nomi;
        new_denomi = first.denomi*second.denomi;
        return "[FRAC] "+new_nomi+"/"+new_denomi;
    }
}

