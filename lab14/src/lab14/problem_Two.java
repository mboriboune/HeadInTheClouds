package lab14;

import java.util.Scanner;

//Inform Unish in which idrection should he travel to meet your name. take coordinates using scanner class.//
public class problem_Two {
	public static void main(String[] args) {
		Scanner console = new Scanner(System.in);
		System.out.println("Where are you? (enter first point, then enter second)");
		int w = console.nextInt();
		int x = console.nextInt();
		System.out.println("His location");
		int y = console.nextInt();
		int z = console.nextInt();
		YourLocation(w,x,y,z);

	}

	public static void YourLocation(int w, int x, int y, int z) {
		if(z>x) {
			System.out.print("N");
		}
		if(x>z) {
			System.out.print("S");
		}
			if(y>w) {
			
			System.out.print("E");
		}
		if(w>y) {
			System.out.print("W");
		}
		
		
	}
}
