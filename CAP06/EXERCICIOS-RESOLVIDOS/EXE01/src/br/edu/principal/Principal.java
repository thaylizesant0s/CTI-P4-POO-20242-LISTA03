package br.edu.principal;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        int[] num = new int[9];
        int i, j, cont;

        Scanner sc = new Scanner(System.in);

        for (i = 1; i <= 9; i++) {
            System.out.print("Digite o " + i + "º número: ");
            num[i - 1] = sc.nextInt();
        }

        for (i = 1; i <= 9; i++) {
            cont = 0;
            for (j = 1; j <= num[i - 1]; j++) {
                if (num[i - 1] % j == 0) {
                    cont++;
                }
            }
            if (cont <= 2) {
                System.out.println("Número primo: " + num[i - 1]);
                System.out.println("Posição do número primo na lista: " + i);
            }
        }
    }
}
