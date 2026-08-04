package ExercisesNeps;

import java.util.Scanner;

public class DivisaoReal {

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		
		double num1 = sc.nextDouble();
		double num2 = sc.nextDouble();
		
		if(num2 == 0) {
			System.out.println("Erro: Não é possivel divisão por zero.");
		}
		
		else {
			double result = num1 / num2;
			System.out.printf("%n%.2f / %.2f = %.2f", num1, num2, result);
		}
		
		sc.close();
		
	}
	
	
}
