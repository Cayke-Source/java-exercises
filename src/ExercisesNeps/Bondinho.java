package ExercisesNeps;

import java.util.Scanner;

public class Bondinho {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int m = sc.nextInt();

        if(a >= 1 && a <= 50 && m >= 1 && m <= 50) {
            
            int total = a + m;

            if(total > 50) {
                System.out.print("N");
            }

            else {
                System.out.print("S");
            }
            
        }

        else {
            System.out.print("Entrada Invalida.");
        }
        
        sc.close();
    }
}
