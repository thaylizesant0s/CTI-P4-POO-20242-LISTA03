package br.edu.principal;

import java.util.Scanner;

public class Principal {
    
    public static void main(String[] args) {
        double num1, num2, s;
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Digite o primeiro número: ");
        num1 = sc.nextDouble();
        
        System.out.print("Digite o segundo número: ");
        num2 = sc.nextDouble();
        
        s = somar(num1, num2);
        
        System.out.println("soma = " + s);
    }
    
    public static double somar(double num1, double num2) {
        double s = 0;
        
        for (double i = num1 + 1; i < num2; i++) {
            s = s + i;
        }
        
        return s;
    }
}
