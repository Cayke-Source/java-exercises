package ExercisesNeps;

import java.util.Scanner;

public class Lampadas {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		int a = 0;
		int b = 0;
		
		for(int i = 0; i < n; i++) {
			
			int posInterruptor = sc.nextInt();
			
			if(posInterruptor == 1) {
				a = (a == 0) ? 1 : 0;
			}
			
			else if(posInterruptor == 2) {
				a = (a == 0) ? 1 : 0;
				b = (b == 0) ? 1 : 0;
			}
			
		}
		
		System.out.println(a);
		System.out.println(b);
		
		sc.close();
	}
	
}