
public class cookies {//prints numbers from 1 to a given maximum.
		public static void main(String[] args) {      
		    
			printNumbers(10);
		   }
		public static void printNumbers(int x) {
			System.out.print("1");
			int i =2;
			while(i<x) {
				if(i%2!=0) {
					System.out.print(","+i);
				}
				i++;
				}
		}
}
	
