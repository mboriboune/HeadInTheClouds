import java.util.Scanner;

//Write a method to find prime numbers
//get the integer value into a method as isPrime(number)
//In the method test the number is prime or not
//return a boolean value from the method
//hint use a for loop not a while loop

public class Num_Three {
	
	public static void main(String[]args) {
		Scanner console = new Scanner(System.in);
		System.out.println("Input a integer: ");
		int x = console.nextInt();
		System.out.println(isPrime(x));
		}
		
	public static boolean isPrime(int number) {
		int factors = 0;
		for(int i =1; i<=number; i++) {
			if(number%i==0) {
				factors++;
			}
		}
		if ( factors==2) {
		
			return true;
		}
		else {
			System.out.println("Prime");
			return false;
		}
		
		
	}

}
