
public class review_problem_7 {
	public static void main(String[] args) {//for loop way
		for(int i =1; i<=5; i++) {
			for(int j = 1; j<=i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	System.out.println("____________________");		
}
		public static void main1(String[] args) {//while loop way
			int i = 1;
			while(i<=5) {
				int j =1;
				while(j<=i) {
				System.out.print("*");
				j++;
			}
				System.out.println();
				i++;
		}
}
		public static void main2(String[] args) {
			int max = 5;
			int i = 1;
			do {
				int j =1;
				do {
					System.out.print("*");
					j++;
				}
				while(j<=i);
				System.out.println();
				i++;
			} while(i<=max);
				
		}
			
}
