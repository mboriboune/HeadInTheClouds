package Test_3_review;//example of a nested loop.

public class Nest {
	public static void main(String[] args) {
		for(int i =1; i<=5; i++) {//outer loop prints 5 times of *
			for(int j = 1; j<=10;j++) {//inner loops repeats it by 10 times
				System.out.print("*");
			}
System.out.println();
		}
		System.out.println("_____________");
	}
}