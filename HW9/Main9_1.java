import java.util.Scanner; 

public class Main9_1 {

	public static void main(String[] args) {
		
		Scanner keyboard = new Scanner(System.in);
		int year = 0, month = 0, day = 0; 
		
		boolean done = false;

        while (!done) {
            try {
                year = keyboard.nextInt();
                if (year < 0) {
                    throw new WrongYearException(year);
                }
                month = keyboard.nextInt();
                if (month < 0 || month > 12) {
                    throw new WrongMonthException(month);
                }
                day = keyboard.nextInt();
                if (month == 2) {
                    if (day < 0 || day > 28) {
                        throw new WrongDayException(month, day);
                    }
                }
                else if (month==4 || month==6 || month==9 || month==11) {
                    if (day < 0 || day > 30) {
                        throw new WrongDayException(month, day);
                    }
                }
                else {
                    if (day < 0 || day > 31) {
                        throw new WrongDayException(month, day);
                    }
                }

                System.out.println("Good Date: year("+year+") month("+month+") day("+day+")");
                done = true;
            }
            catch (WrongYearException e) {
                System.out.println("Wrong Year: "+e.year+" System quit.");
                System.exit(0);
            }
            catch (WrongDayException e) {
                System.out.println("Wrong Day: month("+e.month+") day("+e.day+") System quit.");
                System.exit(0);
            }
            catch (WrongMonthException e) {
                System.out.println("Wrong Month: "+e.month+" System quit.");
                System.exit(0);
            }
        }
	
	}
	
}

class WrongYearException extends Exception {
    public int year;

    public WrongYearException(int year) {
        this.year = year;
    }
}

class WrongMonthException extends Exception {
    public int month;

    public WrongMonthException(int month) {
        this.month = month;
    }
}

class WrongDayException extends WrongMonthException {
    public int day;

    public WrongDayException(int month, int day) {
        super(month);
        this.day = day;
    }
}