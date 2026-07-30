package ExercisesNeps;

import java.util.Scanner;

public class Gangorra {
	
	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		
		
		int p1 = sc.nextInt();
		int c1 = sc.nextInt();
		
		int p2 = sc.nextInt();
		int c2 = sc.nextInt();
		
		int ladoDireito = p1 * c1;
		
		int ladoEsquerdo = p2 * c2;
		
		if(ladoDireito == ladoEsquerdo) {
			System.out.println("0");
		}
		else if(ladoDireito > ladoEsquerdo) {
			System.out.println("-1");
		}
		else {
			System.out.println("1");
		}
		
		sc.close();
		
	}
	
}