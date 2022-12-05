public class Main14_3 {

	public static void main(String[] args) {
		TwoData<Integer,Integer> d1 = new TwoData<Integer,Integer>(5, 3); 
		TwoData<Double,Integer> d2 = new TwoData<Double,Integer>(-3.234, -7);
		TwoData<Integer,String> d3 = new TwoData<Integer,String>(8, "Korea");
		TwoData<String,Double> d4 = new TwoData<String,Double>("Seoul", 3.54);
		TwoData<String,String> d5 = new TwoData<String,String>("Korea", "Seoul");
		
		System.out.println(d1.lessFirst());
		System.out.println(d2.lessFirst());
		System.out.println(d3.lessFirst());
		System.out.println(d4.lessFirst());
		System.out.println(d5.lessFirst());
	}
	
}

class TwoData<T1, T2> {
    private T1 first;
    private T2 second;

    public TwoData() {};
    public TwoData(T1 first, T2 second) {
        this.first = first;
        this.second = second;
    }
    public boolean lessFirst() {
        String new_first = String.valueOf(first);
        String new_second = String.valueOf(second);
        TwoData<String, String> newData = new TwoData<String, String>(new_first, new_second);

        if (newData.first.compareTo(newData.second) <= 0) {
            return true;
        }
        else {
            return false;
        }
    }
}
