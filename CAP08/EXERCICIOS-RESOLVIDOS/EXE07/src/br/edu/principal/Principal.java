package br.edu.principal;

import java.util.Scanner;

public class Principal {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        double nota1, nota2, nota3, m;
        String letra;

        System.out.print("Digite a nota 1: ");
        nota1 = sc.nextDouble();

        System.out.print("Digite a nota 2: ");
        nota2 = sc.nextDouble();

        System.out.print("Digite a nota 3: ");
        nota3 = sc.nextDouble();

        do {
            System.out.print("Digite a letra (A para média aritmética, P para média ponderada): ");
            letra = sc.next();
        } while (!letra.equals("A") && !letra.equals("P"));

        m = calcula_media(nota1, nota2, nota3, letra);

        if (letra.equals("A")) {
            System.out.println("A média aritmética é: " + m);
        } else {
            System.out.println("A média ponderada é: " + m);
        }
    }

    public static double calcula_media(double n1, double n2, double n3, String l) {
        double media;

        if (l.equals("A")) {
            media = (n1 + n2 + n3) / 3;
        } else {
            media = (n1 * 5 + n2 * 3 + n3 * 2) / (5 + 3 + 2);
        }

        return media;
    }
}
