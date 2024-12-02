package br.edu.principal;

import java.util.Scanner;

public class Principal {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        double a, b, c, result;

        System.out.print("Digite o valor de 'a' (deve ser maior que 1): ");
        do {
            a = sc.nextDouble();
        } while (a <= 1);

        System.out.print("Digite o valor de 'b': ");
        b = sc.nextDouble();
        
        System.out.print("Digite o valor de 'c': ");
        c = sc.nextDouble();

        result = divisores(a, b, c);

        System.out.println("Soma dos inteiros = " + result);
    }

    public static double divisores(double a, double b, double c) {
        double s = 0;
        double r;

        for (double i = b; i <= c; i++) {
            r = i % a;
            
            if (r == 0) {
                s += i;
            }
        }

        return s;
    }
}
