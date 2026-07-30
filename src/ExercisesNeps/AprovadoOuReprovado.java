package ExercisesNeps;


import java.util.Scanner;


public class AprovadoOuReprovado{
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		double n1 = sc.nextDouble();
		double n2 = sc.nextDouble();
		
		double media = (n1 + n2) / 2;
		
		if(media >= 7) {
			System.out.println("Aprovado");
		}
		else if(media < 7 && media >= 4) {
			System.out.println("Recuperacao");
		}
		else {
			System.out.println("Reprovado");
		}
		
		sc.close();
		
	}

}