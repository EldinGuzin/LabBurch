import java.util.Scanner;

public class Task6 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Type first number: ");
		int num1 = scanner.nextInt();
		System.out.println("Type second number: ");
		int num2 = scanner.nextInt();
		
		if(num1 > num2) {
			
			System.out.println("Greater number: " + num1);
			
		}
		
		if(num2 > num1) {
			
			System.out.println("Greater number: " + num2);
			
			
			
		}
		
		if(num1 == num2) {
			
			System.out.println("The numbers are equal");
		}
		
		
		
	}

}
