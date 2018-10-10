
public class problem_2 {
	public static void main(String[] args) {
		int x = 3;
		int y = 4;
		hypotenuse(x,y);
	}
	public static void hypotenuse(int x, int p) {
		int z;
		z =(x*x)+(p*p);
		System.out.println(Math.sqrt(z));
	}

}
