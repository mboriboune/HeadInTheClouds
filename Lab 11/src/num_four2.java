import java.util.Scanner;

public class num_four2 {
	public static void main(String[] args) {
		Scanner console = new Scanner(System.in);
		int x = console.nextInt();
		int y = console.nextInt();

		System.out.println(containdigit(x,y));
	}
	public static boolean containdigit(int x , int y) {
	while (x > 0) 
    { 
        if (x % 10 == y) {

  
        x = x / 10;
        return true;}
        
        }
    }
	return false; 
    
}



}
