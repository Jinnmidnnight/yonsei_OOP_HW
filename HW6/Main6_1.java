package HW6;
public class Main6_1 {

	public static void main(String[] args) {
		Bus61 b1 = new Bus61(); 
		Bus61 b2 = new Bus61(35, "AB", "CD", 5);
		Bus61 b3 = new Bus61(b1); 
		
		System.out.println("b1: " + b1);
		System.out.println("b2: " + b2); 
		System.out.println("b3: " + b3); 
		System.out.println(); 
		
		b1.setNumber(557);
		b1.setOrigin("EF");
		b1.setDestination("GH");
		b3.setNumber(9876);
		b3.setOrigin("IJ");
		b3.setDestination("KL");
		
		System.out.println("b1: " + b1);
		System.out.println("b2: " + b2); 
		System.out.println("b3: " + b3); 
		System.out.println(); 
		
        b1.setSeat(2, true);
		b1.setSeat(1, true);
		b1.setSeat(5, true);
		b2.setSeat(3, true);
		b2.setSeat(0, true);
		
		for (int i = 0; i < b3.getNumSeats(); i++) {
			b3.setSeat(i, true);
		}
		
		System.out.println("b1: " + b1);
		System.out.println("b2: " + b2); 
		System.out.println("b3: " + b3); 
		System.out.println("b1 full? " + b1.isFull());
		System.out.println("b3 full? " + b3.isFull());
		System.out.println(); 
		
		b1.setSeat(b1.nextEmptySeat(), true);
		b2.setSeat(b2.nextEmptySeat(), true);
		b3.clearAllSeats();
		
		System.out.println("b1: " + b1);
		System.out.println("b2: " + b2); 
		System.out.println("b3: " + b3); 

	}

}


class Bus61 {
    private int num;
    private String ori;
    private String des;
    private String[] seat;

    public void clearAllSeats() {
        for (int i = 0; i < this.seat.length; i++) {
            this.seat[i] = "o";
        }
    }
    public int nextEmptySeat() {
        for (int i = 0; i < seat.length; i++) {
            if (seat[i].equals("o")) {
                return i;
            }
        }
        return -1;
    }
    public boolean isFull() {
        for (int i = 0; i < seat.length; i++) {
            if (seat[i].equals("o")) {
                return false;
            }
        }
        return true;
    }
    public int getNumSeats() {
        return seat.length;
    }
    public void setSeat(int newSeat, boolean flag) {
        if (flag == true && newSeat < seat.length) {
            seat[newSeat] = "x";
        }
    }
    public Bus61() {
        num = 0;
        ori = "NON";
        des = "NON";
        seat = new String[3];

        for (int i = 0; i < this.seat.length; i++) {
            this.seat[i] = "o";
        }

    };
    public Bus61(int num, String ori, String des, int seat) {
        this.num = num;
        this.ori = ori;
        this.des = des;
        this.seat = new String[seat];

        for (int i = 0; i < this.seat.length; i++) {
            this.seat[i] = "o";
        }
    }
    public Bus61(Bus61 bus) {
        num = bus.num;
        ori = new String(bus.ori);
        des = new String(bus.des);
        seat = new String[bus.seat.length];

        for (int i = 0; i < this.seat.length; i++) {
            this.seat[i] = "o";
        }

    }
    public void setNumber(int newNum) {
        num = newNum;
    }
    public void setOrigin(String newOri) {
        ori = new String(newOri);
    }
    public void setDestination(String newDes) {
        des = new String(newDes);
    }
    public String toString() {
        String str = "";
        for (int i = 0; i < seat.length; i++) {
            str += seat[i] + " ";
        }
        return "[BUS] number(" + num + ") origin(" + ori + ") dest(" + des + ") seats(" + seat.length + ") " + str.trim();
    }
}