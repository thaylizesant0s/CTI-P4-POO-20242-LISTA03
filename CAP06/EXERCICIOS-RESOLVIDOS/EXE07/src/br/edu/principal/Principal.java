package br.edu.principal;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        int[] vet = new int[8];
        int aux, i, j, z;

        Scanner sc = new Scanner(System.in);

        i = 0;
        while (i < 8) {  
            System.out.print("Digite o " + (i + 1) + "º número: "); 
            aux = sc.nextInt();
            j = 0;  
            while (j < i && vet[j] < aux) {
                j++;
            }
            z = i;
            while (z > j) {  
                vet[z] = vet[z - 1];
                z--;
            }
            vet[j] = aux;
            i++;
        }

        System.out.println("Vetor ordenado:");
        for (i = 0; i < 8; i++) {  
            System.out.print(vet[i] + " ");
        }
    }
}
