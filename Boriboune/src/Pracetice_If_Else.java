
public class Pracetice_If_Else {
	public static void main(String[] args) {
		System.out.println(countFactors(24));
	}
	
	public static int countFactors(int number) {
		
		int count = 0;
		for(int i = 1; i<=number;i++) {
			if(number % i ==0) {
				count++;
			}
		}
		return count;
	}
	

}
