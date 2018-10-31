import java.util.Scanner;

/*write a method name containdigit that accepts two integer parameters a and b 
a is positive number and b is any single digit number from 0-9 inclusive 
your method should return return;
true if a contains b at among its digits and
false otherwise
example containdigit (3415,1) should return true
hint use while loop*/
public class num_four {
	public static void main(String[] args) {
		Scanner console = new Scanner(System.in);
		int x = console.nextInt();
		int y = console.nextInt();
		boolean  z =0;
		containdigit(x,y, z);
	}
	public static boolean containdigit(int x, int y, boolean z) {
		while(x>0) {
			int numbers= x%10;
			if(numbers==y) {
				z = true;
			}
			else {
				z = false;
			}
		}
		return z;
		

	}
}


