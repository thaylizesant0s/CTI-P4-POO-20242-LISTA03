package br.edu.principal;

import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        int num, s;
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um número para calcular a sequência de somatórios dos fatoriais: ");
        num = sc.nextInt();

        s = sequencia(num);
        System.out.println("\nA soma dos fatoriais de 1 até " + num + " é: " + s);
    }

    public static int sequencia(int n) {
        int a, b, f, seq;

        seq = 0;

        System.out.println("\nCalculando a sequência:");

        for (a = 1; a <= n; a++) {
            f = 1;

            System.out.print("Calculando o fatorial de " + a + ": ");
            for (b = 1; b <= a; b++) {
                f *= b;
            }
            System.out.println(f);

            seq += f;
            System.out.println("Soma acumulada até " + a + " é: " + seq);
        }

        return seq;
    }
}
