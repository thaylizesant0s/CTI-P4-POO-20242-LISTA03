package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        int[] num = new int[8];
        int[] pos = new int[8];
        int[] neg = new int[8];
        int cont_n, cont_p, i;

        cont_n = 1;
        cont_p = 1; 

        for (i = 1; i <= 8; i++) {
            System.out.print("Digite o " + i + "º número inteiro: ");
            num[i - 1] = sc.nextInt();

            if (num[i - 1] >= 0) {
                pos[cont_p - 1] = num[i - 1]; 
                cont_p = cont_p + 1;
            } else {
                neg[cont_n - 1] = num[i - 1];
                cont_n = cont_n + 1;
            }
        }

        if (cont_n == 1) {
            System.out.println("Vetor de negativos vazio");
        } else {
            System.out.println("Vetor de negativos:");
            for (i = 1; i < cont_n; i++) { 
                System.out.println(neg[i - 1]);
            }
        }

        if (cont_p == 1) {
            System.out.println("Vetor de positivos vazio");
        } else {
            System.out.println("Vetor de positivos:");
            for (i = 1; i < cont_p; i++) { 
                System.out.println(pos[i - 1]);
            }
        }

	}

}
