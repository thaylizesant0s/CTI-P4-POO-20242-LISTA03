package br.edu.principal;

import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double num, x;

        System.out.print("Digite um número: ");
        num = sc.nextDouble();

        x = verifica(num);

        if (x == 0) {
            System.out.println("Número positivo");
        } else {
            System.out.println("Número negativo");
        }
    }

    public static double verifica(double num) {
        double res;

        if (num >= 0) {
            res = 1;
        } else {
            res = 0;
        }

        return res;
    }
}
