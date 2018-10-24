import java.util.Scanner;

public class Number_Two {
	public static void main(String[] args) {
		Scanner console = new Scanner(System.in);
		System.out.println("Enter String ");
		String inputstr = console.next();

		System.out.println("Enter Integer ");
		int x = console.nextInt();
		splitter(inputstr, x);
		
	}
	public static void splitter(String y, int x) {
		for (int i = 0; i< y.length(); i+=3) {
			if(i<=y.length()-3) {
			System.out.println(y.substring (i, i+x)); 

			}


		
	}

}}
