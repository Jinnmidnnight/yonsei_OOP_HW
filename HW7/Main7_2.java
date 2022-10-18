package HW7;
public class Main7_2 {

	public static void main(String[] args) {
		BankAccount72 a1 = new BankAccount72(); // 잔액 0 일반계좌 개설
		BankAccount72 a2 = new BankAccount72(3000);  // 잔액 3000 일반계좌 개설
		BankAccount72 a3 = new BankAccount72(-2000); // 잔액 -2000 일반계좌 개설
		BankAccountCredit72 c1 = new BankAccountCredit72(1000, 7); // 잔액 1000, 연리 7%, 신용계좌 개설
		BankAccountCredit72 c2 = new BankAccountCredit72(-500, 7); // 잔액 -500, 연리 7%, 신용계좌 개설
		BankAccountCredit72 c3 = new BankAccountCredit72(-2000); // 잔액 -2000, 연리 default 4%, 신용계좌 개설
		BankAccountLimit72 l1 = new BankAccountLimit72(); // 잔액 0, 인출한도 default 1000, 제한계좌 개설
		BankAccountLimit72 l2 = new BankAccountLimit72(5000); // 잔액 5000, 인출한도 default 1000, 제한계좌 개설
		BankAccountLimit72 l3 = new BankAccountLimit72(3000, 500); // 잔액 3000, 인출한도 500, 제한계좌 개설
		
		System.out.println("a1: " + a1);
		System.out.println("a2: " + a2); 
		System.out.println("a3: " + a3); 
		System.out.println("c1: " + c1); 
		System.out.println("c2: " + c2); 
		System.out.println("c3: " + c3); 
		System.out.println("l1: " + l1); 
		System.out.println("l2: " + l2); 
		System.out.println("l3: " + l3); 
		System.out.println(); 
		
		a1.deposit(1000); // a1에 1000 예치
		System.out.println("a1: " + a1); 
		
		a2.withdraw(1000); // a2에서 1000원 인출
		System.out.println("a2: " + a2); 
		
		a3.withdraw(1000); // a3에서 1000원을 인출 시도
		System.out.println("a3: " + a3); 
		
		c1.withdraw(2000); // c1에서 2000원 인출
		System.out.println("c1: " + c1); 
		
		System.out.print("c2's interest for debt 240 for 1 year: "); // c2 계좌의 1년간 대출 240에 대한 이자
		System.out.println(c2.calcInterest(1.0, 240)); 
		c2.settlement(1.0, 240); // c2 계좌를 1년간 대출 240에 대해 정산
		System.out.println("c2: " + c2); 
		
		c3.deposit(5000); // c3에 5000원 예치
		System.out.println("c3: " + c3); 
		c3.settlement(0.25, 1000); // c3 계좌를 3개월 (0.25년) 간 대출 1000에 대해 정산
		System.out.println("c3: " + c3); 
		
		l1.withdraw(2000); // l1 계좌에서 2000 인출 시도
		System.out.println("l1: " + l1); 
		l3.withdraw(300); // l3 계좌에서 300 인출 시도
		System.out.println("l3: " + l3); 
		System.out.println(); 
		
		a3.deposit(1000);
		c1.deposit(2000);
		c2.deposit(1516);
		c3.withdraw(1990);
		l1.deposit(1000);
		l2.withdraw(1000);
		l2.withdraw(1000);
		l2.withdraw(1000);
		l2.withdraw(1000);
		
		System.out.println("a1: " + a1);
		System.out.println("a2: " + a2); 
		System.out.println("a3: " + a3); 
		System.out.println("c1: " + c1); 
		System.out.println("c2: " + c2); 
		System.out.println("c3: " + c3); 
		System.out.println("l1: " + l1); 
		System.out.println("l2: " + l2); 
		System.out.println("l3: " + l3); 
		System.out.println(); 
		
		// equals는 비교하는 class가 같아야 하며, 모든 instance variable value가 같아야 true 가 되도록 
		// 프로그램 하십시오. 
		
		System.out.println("a1 equals a2 ? " + a1.equals(a2));
		System.out.println("a1 equals a3 ? " + a1.equals(a3));
		System.out.println("a1 equals c1 ? " + a1.equals(c1));
		System.out.println("c1 equals a2 ? " + c1.equals(a2)); 
		System.out.println("c1 equals c2 ? " + c1.equals(c2));
		System.out.println("c2 equals c3 ? " + c2.equals(c3));
		System.out.println("l1 equals l2 ? " + l1.equals(l2));
		System.out.println("l3 equals l2 ? " + l3.equals(l2));
		System.out.println("l1 equals c2 ? " + l1.equals(c2));
		System.out.println("l1 equals a1 ? " + l1.equals(a1));
	    System.out.println("a1 equals null ? " + a1.equals(null)); 
	    
	    // compareTo 는 서로 다른 종류의 account라도 balance의 크기만 비교하도록 코딩 하십시오. 
	    // return value 0는 같다. -1은 call한 쪽이 작다. +1은 call한 쪽이 크다. 
	    // BankAccount72 나 그 descendant class가 아닌 다른 class가 주어진 경우 
	    // output에 나온 메시지를 프린트하고 프로그램을 끝내도록 합니다. 
	    
	    System.out.println("a1.compareTo(a2) = " + a1.compareTo(a2));
	    System.out.println("a2.compareTo(a1) = " + a2.compareTo(a1));
	    System.out.println("a3.compareTo(a1) = " + a3.compareTo(a1));
	    System.out.println("c1.compareTo(a1) = " + c1.compareTo(a1));
	    System.out.println("c1.compareTo(c2) = " + c1.compareTo(c2));
	    System.out.println("c1.compareTo(l3) = " + c1.compareTo(l3));
	    System.out.println("l2.compareTo(a2) = " + l2.compareTo(a2));
	    Integer x = new Integer(500);
	    System.out.println(a3.compareTo(x));
	    
	}

}

class BankAccount72 {
    protected int balance;

    public BankAccount72() {};
    public BankAccount72(int balance) {
        if (balance <= 0) {
            balance = 0;
        }
        this.balance = balance;
    }
    public String toString() {
        return "[ACCOUNT] balance("+balance+")";
    }
    public void deposit(int money) {
        balance += money;
        if (balance <= 0) {
            balance = 0;
        }
    }
    public void withdraw(int money) {
        balance -= money;
        if (balance <= 0) {
            balance = 0;
        }
    }
    public boolean equals(Object otherObject) {
        if(otherObject== null) {
            return false;
        }
        else if (getClass() != otherObject.getClass()) {
            return false;
        }
        else
        {
            BankAccount72 a = (BankAccount72)otherObject;
            return(balance == a.balance);
        }
    }
    public String compareTo(BankAccount72 otherObject) {
        if (balance < otherObject.balance) {
            return "-1";
        }
        else if (balance > otherObject.balance) {
            return "1";
        }
        else {
            return "0";
        }
    }
    public String compareTo(BankAccountCredit72 otherObject) {
        if (balance < otherObject.balance) {
            return "-1";
        }
        else if (balance > otherObject.balance) {
            return "1";
        }
        else {
            return "0";
        }
    }
    public String compareTo(BankAccountLimit72 otherObject) {
        if (balance < otherObject.balance) {
            return "-1";
        }
        else if (balance > otherObject.balance) {
            return "1";
        }
        else {
            return "0";
        }
    }
    public String compareTo(Object otherObject) {
        return "Wrong Argument other. Quit the program.";
    }

}

class BankAccountCredit72 extends BankAccount72 {
    protected int ar;

    public BankAccountCredit72() {
        super();
        ar = 4;
    }
    public BankAccountCredit72(int balance) {
        this.balance = balance;
        ar = 4;
    }
    public BankAccountCredit72(int balance, int ar) {
        this.balance = balance;
        this.ar = ar;
    }
    public String toString() {
        return super.toString()+" [CREDIT] annualRate("+ar+")";
    }
    public void withdraw(int money) {
        balance -= money;
    }
    public int calcInterest(double year, int money) {
        double per = ar / 100.0;
        double ans = year * money * per;
        return (int) ans;
    }
    public void settlement(double year, int money) {
        balance -= calcInterest(year, money);
    }
    public boolean equals(Object otherObject) {
        if(otherObject== null) {
            return false;
        }
        else if (getClass() != otherObject.getClass()) {
            return false;
        }
        else
        {
            BankAccountCredit72 a = (BankAccountCredit72)otherObject;
            return(balance == a.balance && ar == a.ar);
        }
    }

}

class BankAccountLimit72 extends BankAccount72 {
    protected int wl;

    public BankAccountLimit72() {
        super();
        wl = 1000;
    }
    public BankAccountLimit72(int balance) {
        super(balance);
        wl = 1000;
    }
    public BankAccountLimit72(int balance, int wl) {
        super(balance);
        this.wl = wl;
    }
    public String toString() {
        return super.toString()+" [LIMIT] withdrawLimit("+wl+")";
    }
    public void withdraw(int money) {
        if (money > wl) {
            money = wl;
        }
        balance -= money;
        if (balance <= 0) {
            balance = 0;
        }
    }
    public boolean equals(Object otherObject) {
        if(otherObject== null) {
            return false;
        }
        else if (getClass() != otherObject.getClass()) {
            return false;
        }
        else
        {
            BankAccountLimit72 a = (BankAccountLimit72)otherObject;
            return(balance == a.balance && wl == a.wl);
        }
    }


}