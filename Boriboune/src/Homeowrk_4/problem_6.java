package Homeowrk_4;

import java.util.Scanner;

public class problem_6 {
	public static void main(String[] args) {
		Scanner age = new Scanner(System.in);
		System.out.println("How old are you?");
		int GivenAge = age.nextInt();
		Vote(GivenAge);
	}
	public static void Vote(int x) {
		if(x>=18) {
			
			System.out.println("You can vote in the US midterm election!");
			
		}
		else {
			System.out.println("You can't vote yet!");
		}
	}
	
}
