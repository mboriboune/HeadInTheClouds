
public class problem_two {
	public static void main(String[] args) {
		for(int i=3; i>=1; i--){
			for(int j=i;j<=3;j++)
				{
				System.out.print(" ");
				}
		for(int k=1;k<i*2;k++)
		{
			System.out.print("*");
		}
		System.out.println("");
	}

}
}