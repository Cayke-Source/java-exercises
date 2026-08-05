package ExercisesNeps;

import java.util.Scanner;

public class PremioDoMilhao {
	
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int numeroEntradas = sc.nextInt();
		
		int totalAcessos = 0;
		int diasNecessarios = 0;
		
		for(int i = 0; i < numeroEntradas; i++) {
			
			int numeroAcessos = sc.nextInt();
			
			if(totalAcessos < 1000000) {
				totalAcessos += numeroAcessos;
				diasNecessarios = i;
				
			}
			
			
			
		}
		
		System.out.println(diasNecessarios+1);
		sc.close();
		
	}
	
	
}