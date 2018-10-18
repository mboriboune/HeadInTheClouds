

import java.util.*;//so that i can use Scanner.

public class Scanner_example {
	public static void main(String[] args) {
		Scanner console = new Scanner(System.in);// scanner format.
		
		System.out.print("How old are you?");// prompt meaning a message telling the user what input to type.
		int age = console.nextInt();//nextInt() reads an int from the user and returns it//
		
		int years = 65 - age;
		System.out.println(years+ " years to retirement!");
		
	}
	

}
