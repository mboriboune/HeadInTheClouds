import java.util.Random;

public class Nm_One {//Dice program, sum equal to 7.
	public static void main(String[] args) {
		Random rand = new Random();
		int tries = 0;
		int sum = 0;
		do
		{
			int number2 = rand.nextInt(6)+1;
			int number1 = rand.nextInt(6)+1;
			sum = number1 + number2;
			System.out.println(number1 + "+" + number2 + " is equal to " + sum);
			tries++;
		} while(sum !=7);
		System.out.println("you won after " + tries + " tries.");
		
	}

}
