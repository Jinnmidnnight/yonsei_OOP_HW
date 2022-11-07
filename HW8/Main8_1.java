package HW8;

public class Main8_1 {

	public static void main(String[] args) {
		int[] data1 = {0, 0, 1, 2, 3, 5, 6, 6, 6, 7, 8, 9, 9, 9}; 
		int[] data2 = {0, 1, 2, 5, 5, 5, 6, 6, 7, 8, 9};
		
		Average81[] aver = new Average81[6];
		
		aver[0] = new Average81(data1);
		aver[1] = new Average81(data2);
		aver[2] = new AverageDomi81(data1);
		aver[3] = new AverageDomi81(data2); 
		aver[4] = new AverageMedian81(data1);
		aver[5] = new AverageMedian81(data2); 
		
		for (int i = 0; i < 6; i++) {
			showAverage(aver[i]);
			System.out.println(); 
		}
	}
	
	static void showAverage(Average81 avg) {
		avg.print();
	}

}

// your code here for class Average81, AverageDomi81, Average

class Average81 {
    private int[] data;

    public Average81(int[] data) {
        this.data = new int[data.length];
        for (int i=0; i<this.data.length; i++) {
            this.data[i] = data[i];
        }
    }
    public void print() {
        double total = 0;
        String str = "(";
        for (int i=0; i<data.length; i++) {
            total += data[i];
            str += data[i] + " ";
        }
        System.out.print(str.strip() + ") average = " + (total / data.length));
    }
    public int[] getData() {
        return data;
    }
}

class AverageDomi81 extends Average81 {
    public AverageDomi81(int[] data) {
        super(data);
    }
    public void print() {
        double answer = 0;
        int arr_max = 0;
        
        for (int i = 0; i < getData().length; i++) {
            if (getData()[i] > arr_max) {
                arr_max = getData()[i];
            }
        }
        
        int[] count = new int[arr_max + 1];
        int max = 0;
        
        for (int i = 0; i < getData().length; i++) {
            count[getData()[i]]++;
        }
        
        for (int i = 0; i < count.length; i++) {
            if (count[i] >= max) {
                max = count[i];
                answer = i;
            }
        }

        String str = "(";
        for (int i=0; i<getData().length; i++) {
            str += getData()[i] + " ";
        }
        System.out.print(str.strip() + ") average = " + answer);
    }

}

class AverageMedian81 extends Average81 {
    public AverageMedian81(int[] data) {
        super(data);
    }
    public void print() {
        double answer;

        if (getData().length % 2 != 0) {
            int index = (getData().length + 1) / 2 - 1;
            answer = getData()[index];
        }
        else {
            int index1 = getData().length / 2 - 1;
            int index2 = getData().length / 2;
            answer = (index1 + index2) / 2;
        }

        String str = "(";
        for (int i=0; i<getData().length; i++) {
            str += getData()[i] + " ";
        }
        System.out.print(str.strip() + ") average = " + answer);

    }
}