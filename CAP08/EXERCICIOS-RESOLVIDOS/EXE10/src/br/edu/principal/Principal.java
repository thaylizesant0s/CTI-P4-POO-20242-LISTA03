package br.edu.principal;

import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        int num;
        double s;
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um número para calcular a sequência de somatórios dos fatoriais: ");
        num = sc.nextInt();

        s = sequencia(num);
        System.out.println("\nA soma dos fatoriais de 1 até " + num + " é: " + s);
    }

    public static double sequencia(int n) {
        int a, b, f;
        double seq;

        seq = 1;

        for (a = 1; a <= n; a++) {
            f = 1;

            for (b = 1; b <= a; b++) {
                f *= b;
            }

            seq += 1.0 / f;
        }

        return seq;
    }
}
