public class Main4_3 {

	public static void main(String[] args) {
		Phone43 p1 = new Phone43();
		Phone43 p2 = new Phone43("Samsung", "red", 4.5, 5);
		Phone43 p3 = new Phone43("Samsung", "blue", 4.5, -3);
		Phone43 p4 = new Phone43("Apple", "black", 5.5, 2);
		Phone43 p5 = new Phone43("Samsung", "yellow", -8.1, 0);
		
		System.out.println("p1:" + p1);
		System.out.println("p2:" + p2);
		System.out.println("p3:" + p3);
		System.out.println("p4:" + p4);
		System.out.println("p5:" + p5);
		
		p1.setBrand("Apple");
		p1.setColor("green");
		p1.setSize(5.5);
		p1.setVolume(-2);

		System.out.println("p1:" + p1);
		System.out.println("p1 == p2 ? " + p1.equals(p2));
		System.out.println("p1 == p4 ? " + p1.equals(p4));
		System.out.println("p2 == p3 ? " + p2.equals(p3));
		System.out.println("p2 == p5 ? " + p2.equals(p5)); 
		
		p1.volumeUp();
		p1.volumeUp(7);
		p3.volumeDown(5);
		p2.volumeDown();
		p5.volumeDown(3);
		
		System.out.println("p1:" + p1);
		System.out.println("p2:" + p2);
		System.out.println("p3:" + p3);
		System.out.println("p4:" + p4);
		System.out.println("p5:" + p5);
		
	}

}

class Phone43 {
    private String brand;
    private String color;
    private double size;
    private int volume;

    public Phone43() {
        brand = "nobrand";
        color = "nocolor";
        size = 0.0;
        volume = 0;
    }
    public Phone43(String brand, String color, double size, int volume) {
        this.brand = brand;
        this.color = color;
        if (size >= 0.0) {
            this.size = size;
        }
        else {
            this.size = 0.0;
        }
        if (volume >= 0) {
            this.volume = volume;
        }
        else {
            this.volume = 0;
        }
    }
    public String toString() {
        return "[PHONE] brand(" + brand + ") size(" + size + ") color(" + color + ") volume(" + volume + ")"; 
    }
    public boolean equals(Phone43 phone) {
        if (brand.equals(phone.brand) && size == phone.size) {
            return true;
        }
        else {
            return false;
        }
    }
    public void setBrand(String brand) {
        this.brand = brand;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public void setSize(double size) {
        this.size = size;
    }
    public void setVolume(int volume) {
        if (volume >= 0) {
            this.volume = volume;
        }
        else {
            this.volume = 0;
        }
    }
    public void volumeUp() {
        volume ++;
    }
    public void volumeUp(int volume) {
        this.volume += volume;
    }
    public void volumeDown() {
        volume --;
        if (this.volume < 0) {
            this.volume = 0;
        }
    }
    public void volumeDown(int volume) {
        this.volume -= volume;
        if (this.volume < 0) {
            this.volume = 0;
        }
    }
}