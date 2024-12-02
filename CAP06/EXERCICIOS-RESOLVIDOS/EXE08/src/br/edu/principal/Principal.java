package br.edu.principal;

import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] X = new int[5];
        int[] Y = new int[5];
        int[] R = new int[10];
        int i, j, aux;

        for (i = 1; i <= 5; i++) {
            System.out.print("Digite o " + i + "º número para o vetor X: ");
            X[i - 1] = sc.nextInt();
        }

        for (i = 1; i <= 5; i++) {
            for (j = 1; j <= 4; j++) {
                if (X[j - 1] > X[j]) {
                    aux = X[j - 1];
                    X[j - 1] = X[j];
                    X[j] = aux;
                }
            }
        }

        for (i = 1; i <= 5; i++) {
            System.out.print("Digite o " + i + "º número para o vetor Y: ");
            Y[i - 1] = sc.nextInt();
        }

        for (i = 1; i <= 5; i++) {
            for (j = 1; j <= 4; j++) {
                if (Y[j - 1] > Y[j]) {
                    aux = Y[j - 1];
                    Y[j - 1] = Y[j];
                    Y[j] = aux;
                }
            }
        }

        j = 1;  
        
        for (i = 1; i <= 5; i++) {
            R[j - 1] = X[i - 1]; 
            j = j + 1;
            R[j - 1] = Y[i - 1]; 
            j = j + 1;
        }

        for (i = 1; i <= 10; i++) {
            for (j = 1; j <= 9; j++) {
                if (R[j - 1] > R[j]) {
                    aux = R[j - 1];
                    R[j - 1] = R[j];
                    R[j] = aux;
                }
            }
        }

        System.out.println("Vetor X ordenado:");
        for (i = 1; i <= 5; i++) {
            System.out.println(X[i - 1]);
        }

        System.out.println("Vetor Y ordenado:");
        for (i = 1; i <= 5; i++) {
            System.out.println(Y[i - 1]);
        }

        System.out.println("Vetor R ordenado:");
        for (i = 1; i <= 10; i++) {
            System.out.println(R[i - 1]);
        }
    }
}
