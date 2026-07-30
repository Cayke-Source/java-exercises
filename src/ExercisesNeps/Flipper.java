package ExercisesNeps;

import java.util.Scanner;

public class Flipper {
	 public static void main(String[] args) {

	        Scanner sc = new Scanner(System.in);

	        int p = sc.nextInt();
	        int r = sc.nextInt();

	        if(p == 1 && r == 1) {
	            System.out.println("A");
	        }
	        else if(p == 1 && r == 0) {
	            System.out.println("B");
	        }

	        else {
	            System.out.println("C");
	        }

	        sc.close();
	    }
	}

	

