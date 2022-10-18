package HW5;
public class Main5_3 {

	public static void main(String[] args) {
		User53 u1 = new User53("Tomy", "Samsung/2020");
		User53 u2 = new User53("Jane", "Apple/2022");
		User53 u3 = new User53(u1);
		User53 u4 = new User53(u2); 
		
		System.out.println("u1:" + u1);
		System.out.println("u2:" + u2);
		System.out.println("u3:" + u3);
		System.out.println("u4:" + u4);
		System.out.println(); 
		
		Phone53 p1 = u2.getPhone();
		p1.setYear(2019);
		System.out.println("p1:" + p1);
		System.out.println(); 
		
		System.out.println("u1:" + u1);
		System.out.println("u2:" + u2);
		System.out.println("u3:" + u3);
		System.out.println("u4:" + u4);
		System.out.println(); 
		
		u2.setPhone(p1);
		System.out.println("After set phone p1 to u2:");
		System.out.println(); 
		
		System.out.println("u1:" + u1);
		System.out.println("u2:" + u2);
		System.out.println("u3:" + u3);
		System.out.println("u4:" + u4);
		System.out.println(); 
		
		Phone53 p2 = u2.getPhone();
		p2.setBrand("LG");
		System.out.println("p2:" + p2);
		System.out.println(); 
		
		System.out.println("u1:" + u1);
		System.out.println("u2:" + u2);
		System.out.println("u3:" + u3);
		System.out.println("u4:" + u4);
	}

}

class User53 {
	private String name;
	private Phone53 phone;
	
	public User53() {}
	public User53(String name, String phone) {
		this.name = name;
		this.phone = new Phone53(phone);
	}
	public User53(User53 user) {
		name = user.name;
		phone = new Phone53(user.phone);
	}
	public Phone53 getPhone() {
		return new Phone53(phone);
	}
	public void setPhone(Phone53 phone) {
		this.phone = new Phone53(phone);
	}
	public String toString() {
		return "[USER] name(" + name + ") [PHONE] brand(" + phone.getBrand() + ") year(" + phone.getYear() + ")";
	}
}

class Phone53 {
	private String brand;
	private int year; 
	
	public Phone53() {}
	public Phone53(String phone) {
		int delimiter = phone.indexOf("/");
		brand = phone.substring(0, delimiter);
		year = Integer.parseInt(phone.substring(delimiter + 1));
	}
	public Phone53(Phone53 phone) {
		brand = phone.brand;
		year = phone.year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public String getBrand() {
		return brand;
	}
	public int getYear() {
		return year;
	}
	public String toString() {
		return "[PHONE] brand(" + brand + ") year(" + year + ")";
	}
}