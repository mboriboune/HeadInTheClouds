package lab14;

public class problem_one {
	public static void main(String[] args) {
		int i;
		for(i=0; i<=100; i++) {
			if(i%7==0) {
				int sum = 0;
				sum = sum + i;
				System.out.println(sum);
			}
		}
	}

}
