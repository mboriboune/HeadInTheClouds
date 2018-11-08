
public class review {
	public static void main(String[] args) {
		printSixes(25);
	}
	public static void printSixes(int max) {
		for(int i =1; i<=max; i++) {
			if(i%6==0) {
				System.out.print(i+" ");
			}
		}
	}

}
