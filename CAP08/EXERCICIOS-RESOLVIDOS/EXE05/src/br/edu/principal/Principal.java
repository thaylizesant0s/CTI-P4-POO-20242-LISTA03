package br.edu.principal;

import java.util.Scanner;

public class Principal {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        double precoantigo, precoatual, acrescimo;

        System.out.print("Digite o preço antigo: ");
        precoantigo = sc.nextDouble();

        System.out.print("Digite o preço atual: ");
        precoatual = sc.nextDouble();

        acrescimo = calculo_reajuste(precoantigo, precoatual);

        System.out.println("O aumento percentual foi de: " + acrescimo + "%");
    }

    public static double calculo_reajuste(double PA, double PN) {
        double result;

        result = (100 * PN - 100 * PA) / PA;

        return result;
    }
}
