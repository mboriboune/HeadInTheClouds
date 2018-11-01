package Homeowrk_4;

public class HW4 {
	public static void main(String [] args) {
		System.out.println(getStrippedNumber(152));
	}
	
	public static int getStrippedNumber(int num) {
	    int numberOfDecSets;
	    if ((numberOfDecSets = num % 10) == 0) {
	        return num - numberOfDecSets;
	    } else {
	        return num - (numberOfDecSets + 1 );
	    }
	}

}
