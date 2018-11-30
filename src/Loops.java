import java.util.Scanner;

public class Loops {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);{
		}
		for (int i=0; i < 100; i ++) {
			if (i % 2 == 0) {
			System.out.println( i);
			}
		}
		for (int i = 100; i >= 1; i -= 3) {
 				System.out.println(i);
 
		}
	
 		for (int i = 1; i <= 100; i += 2) {
 
			System.out.println(i);
		}
		
	for(int i = 0; i <= 100; i++){
			
			if(i % 3 == 0 && i % 5 == 0) {
				System.out.println("Hello World");
			}
			else if(i % 3 == 0) {
				System.out.println("Hello");
			}
			else if(i % 5 == 0) {
				System.out.println("World");
			}
			
			else
			{
				System.out.println(i);
			}

		
	}

	}
}
