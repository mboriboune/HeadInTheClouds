
public class EyeAndJay {
	public static void main(String[] args) {
		for(int i =1; i <=10;i++)
		{for(int j=1; j<=i/5; j++) {
			System.out.println("i="+i+"j="+j);
		}
	}
		for(int i =1; i<=3; i++) {
			System.out.println("outer loop i=" + i);
			for(int j=i; j<=3; j++) {
				System.out.println("\ti= "+ i + "j= " + j);
			}
		}
}
}
