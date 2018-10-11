
public class problem_7 {
	public static void main(String[] args) {
		String a = "ABCDEF"; 
		Hello(a);
		}
	public static void Hello(String b) {
		for (int i = 0; i< b.length(); i++) {
			System.out.print(b.charAt(i));
			i++;
			System.out.println(b.charAt(i));				
		}
	}
}
