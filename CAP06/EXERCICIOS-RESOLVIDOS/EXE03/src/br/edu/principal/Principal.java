package br.edu.principal;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        int[] vet1 = new int[10];
        int[] vet2 = new int[10];
        int[] vet3 = new int[20];
        int i, j = 1;

        Scanner sc = new Scanner(System.in);

        for (i = 1; i <= 10; i++) {
            System.out.print("Digite o " + i + "º número para o vetor 1: ");
            vet1[i - 1] = sc.nextInt();
            vet3[j - 1] = vet1[i - 1];
            j++;

            System.out.print("Digite o " + i + "º número para o vetor 2: ");
            vet2[i - 1] = sc.nextInt();
            vet3[j - 1] = vet2[i - 1];
            j++;
        }

        System.out.println("\nVetor 3:");
        for (i = 1; i <= 20; i++) {
            System.out.println("Índice " + i + ": " + vet3[i - 1]);
        }
    }
}
