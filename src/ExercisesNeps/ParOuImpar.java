package ExercisesNeps;


import java.util.Scanner;

public class ParOuImpar {
	
	
	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		
		
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		
		if(num1 <= 10 && num2 <= 10) {
			
			int result = num1 + num2;
			
			if(result % 2 == 0) {
				System.out.println("Bino.");
			}
			
			else {
				System.out.println("Cino.");
			}
			
		}
		
		else {
			System.out.println("Entrada invalida.");
		}
		
	
		sc.close();
		
	}
	
	
}