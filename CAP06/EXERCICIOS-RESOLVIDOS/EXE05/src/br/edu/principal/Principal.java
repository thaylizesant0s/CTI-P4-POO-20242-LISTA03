package br.edu.principal;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        int[] X = new int[10];
        int[] Y = new int[10];
        int[] U = new int[20];
        int[] D = new int[10];
        int[] S = new int[10];
        int[] P = new int[10];
        int[] IT = new int[10];
        int i, j, k;
        int cont_u = 1, cont_d = 1, cont_i = 1;

        Scanner sc = new Scanner(System.in);

        for (i = 0; i < 10; i++) {
            System.out.print("Digite o " + (i + 1) + "º número para X: ");
            X[i] = sc.nextInt();
            System.out.print("Digite o " + (i + 1) + "º número para Y: ");
            Y[i] = sc.nextInt();
        }

        for (i = 0; i < 10; i++) {
            j = 1;
            while (j < cont_u && X[i] != U[j]) {
                j++;
            }
            if (j >= cont_u) {
                U[cont_u] = X[i];
                cont_u++;
            }
        }

        for (i = 0; i < 10; i++) {
            j = 1;
            while (j < cont_u && Y[i] != U[j]) {
                j++;
            }
            if (j >= cont_u) {
                U[cont_u] = Y[i];
                cont_u++;
            }
        }

        System.out.println("\nUnião U:");
        for (i = 1; i < cont_u; i++) {
            System.out.print(U[i] + " ");
        }

        for (i = 0; i < 10; i++) {
            j = 0;
            while (j < 10 && X[i] != Y[j]) {
                j++;
            }
            if (j == 10) {
                k = 0;
                while (k < cont_d && X[i] != D[k]) {
                    k++;
                }
                if (k >= cont_d) {
                    D[cont_d] = X[i];
                    cont_d++;
                }
            }
        }

        System.out.println("\nDiferença D:");
        for (i = 1; i < cont_d; i++) {
            System.out.print(D[i] + " ");
        }

        for (i = 0; i < 10; i++) {
            S[i] = X[i] + Y[i];
            P[i] = X[i] * Y[i];
        }

        System.out.println("\nSoma S:");
        for (i = 0; i < 10; i++) {
            System.out.print(S[i] + " ");
        }

        System.out.println("\nProduto P:");
        for (i = 0; i < 10; i++) {
            System.out.print(P[i] + " ");
        }

        for (i = 0; i < 10; i++) {
            j = 0;
            while (j < 10 && X[i] != Y[j]) {
                j++;
            }
            if (j < 10) {
                k = 0;
                while (k < cont_i && IT[k] != X[i]) {
                    k++;
                }
                if (k >= cont_i) {
                    IT[cont_i] = X[i];
                    cont_i++;
                }
            }
        }

        System.out.println("\nItens Comuns IT:");
        for (i = 1; i < cont_i; i++) {
            System.out.print(IT[i] + " ");
        }
    }
}
