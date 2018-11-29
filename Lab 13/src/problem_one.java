//[] array = {1 2 3}, Find the sum of the above number in an array
public class problem_one {
	public static void main(String[] args) {
		int[] array = {1,2,3};

		int sum = 0;
		for(int i =0; i<3;i++) {
		sum = sum+ array[i];
	}
	
		System.out.println(sum);
}
}
