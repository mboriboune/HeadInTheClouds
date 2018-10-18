import java.util.*;

public class question_one {
	public static void main(String[] args) {
		Scanner console = new Scanner(System.in);
		System.out.print("Enter first number:");
		int n1 = console.nextInt();
		System.out.print("Enter second number:");
		int n2 = console.nextInt();
		System.out.print("Enter third number:");
		int n3 = console.nextInt();
		calcSum(n1,n2,n3);
		calcAvg(n1,n2,n3);
	}

	public static void calcSum(int n1, int n2, int n3) {
		if(n1<n2 ) {
			n1 = n1+n2;		
		}
		if(n2<n3){
			n3 = n3-n2;
		}
		System.out.println("The summation of all numbers: "+(n1+n2+n3));
	}
	public static void calcAvg(int n1, int n2, int n3) {
		double avg = (n1+n2+n3)/3.0;
		System.out.println("The average of alll numbers: "+avg);
	}

}
