package hw01_task01;

import java.util.Scanner;

/**
 *
 * @author ramntry
 */
public class FactorialMain {

    /**
     * @param n the factorial argument (n! will be calculated)
     */ 
    public static int factorial(int n) {
        int base = 1;
        for (int i = 2; i <= n; i++) {
            base *= i;
        }
        return base;
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("This program calculates the factorial n!\nn = ");
        Scanner scann = new Scanner(System.in);
        System.out.println("n! = " + factorial(scann.nextInt()));
    }

}
