import java.util.Scanner;

public class Number_One {
	public static void main(String[] args) {
		Scanner console = new Scanner(System.in);
		System.out.print("Enter two numbers: ");
		double one = console.nextDouble();
		double two = console.nextDouble();
		System.out.println("("+one+","+two+")");
		System.out.println("Quadrant is " + quadrant(one, two));
	}
	public static int quadrant(double one, double two) {
		if(one>0 && two>0) {
			return 1;
		}
		else if(one<0 && two>0) {
			return 2;
		}
		else if(one<0 && two<0) {
			return 3;
		}
		else if(one>0 && two<0) {
			return 4;
		}
		else {
			return 0;
		}
		
	}

}
