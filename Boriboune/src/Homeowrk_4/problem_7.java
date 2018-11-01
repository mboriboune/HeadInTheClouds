package Homeowrk_4;

public class problem_7 {
	public static void main(String[] args) {
		int sum = 0;
		for(int i = 11; i<=88; i++) {
			if(i%4==0 || i%7==0)
			System.out.println(i);
			sum = sum+i;
		}
		System.out.println(sum);
	}
}
