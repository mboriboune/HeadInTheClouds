import java.util.Scanner;

public class Num_Two {//Enter a 5 digit number and calculate the sum of its digits.
			public static void main(String[] args) {
				Scanner console = new Scanner(System.in);
				System.out.println("Enter a 5 digit number: ");
				int num = console.nextInt();
				System.out.println(add(num));
				console.close();
			}
			public static int add(int num) {
				int sum = 0;
				int number = num;
				while(number>0) {
					sum = sum + (number%10);
					number = number/10;
				}
				return sum;
				
			}
}

