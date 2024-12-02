package br.edu.principal;

import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        int num;
        Scanner sc = new Scanner(System.in);

        do {
            System.out.print("Digite um número entre 1 e 9 para ver sua tabela de multiplicação: ");
            num = sc.nextInt();
        } while (!(num >= 1 && num <= 9));

        multiplicacao(num);
    }

    public static void multiplicacao(int n) {
        int i, j;

        System.out.println("Tabela de multiplicação de " + n + ":");

        for (i = 1; i <= n; i++) {
            for (j = 1; j <= i; j++) {
                System.out.print(i + " x " + j + " = " + (i * j) + "\t");
            }
            System.out.println();
        }
    }
}
