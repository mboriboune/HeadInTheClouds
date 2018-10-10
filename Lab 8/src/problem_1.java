
public class problem_1 {
	public static void main(String[] args) {
		int x = 2;
		int y = 4;
		addition(x,y);
		subtraction(x, y);
		multiplication(x,y);
		division(x,y);
		
	}
	public static void addition(int y, int p) {
		int z = y + p;
		System.out.println(z);
	}
	public static void subtraction(int x, int p) {
		int z = x - p;
		System.out.println(z);
		
	}
	public static void multiplication(int x, int p) {
		int z = x*p;
		System.out.println(z);
}
	public static void division(int x, int p) {
		int z = x/p;
		System.out.println(z);
	}
}
