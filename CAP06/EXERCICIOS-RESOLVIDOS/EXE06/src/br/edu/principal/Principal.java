package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        int[] vet = new int[10];
        int i, j, aux;

        for (i = 1; i <= 10; i++) {
            System.out.print("Digite o " + i + "º número inteiro: ");
            vet[i - 1] = sc.nextInt();
        }

        for (i = 1; i <= 10; i++) {
            for (j = 1; j <= 9; j++) {
                if (vet[j - 1] < vet[j]) {
                    aux = vet[j - 1];
                    vet[j - 1] = vet[j];
                    vet[j] = aux;
                }
            }
        }

        System.out.println("Vetor ordenado:");
        for (i = 1; i <= 10; i++) {
            System.out.println(vet[i - 1]);
        }

	}

}
