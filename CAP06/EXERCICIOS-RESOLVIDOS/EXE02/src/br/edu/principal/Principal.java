package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] qtd = new int[11]; 
        double[] preco = new double[11]; 
        int i, tot_geral, tot_vend, maior, ind;
        double comissao;
        
        tot_geral = 0;
        
        for (i = 1; i < 11; i++) {
            System.out.print("Informe a quantidade vendida do objeto " + i + ": ");
            qtd[i] = sc.nextInt();
            
            System.out.print("Informe o preço unitário do objeto " + i + ": ");
            preco[i] = sc.nextDouble();
        }

        for (i = 1; i < 11; i++) {
            tot_vend = qtd[i] * (int) preco[i];  
            System.out.println("Objeto " + i + " - Quantidade vendida: " + qtd[i] + ", Preço unitário: R$ " + preco[i] + ", Total de vendas: R$ " + tot_vend);
            tot_geral = tot_geral + tot_vend; 
        }

        comissao = tot_geral * 5.0/100;
        
        System.out.println("Total geral das vendas: R$ " + tot_geral);
        System.out.println("Comissão do vendedor: R$ " + comissao);

        maior = qtd[1];
        ind = 1;
        for (i = 2; i < 11; i++) {
            if (qtd[i] > maior) {
                maior = qtd[i];
                ind = i;
            }
        }
        
        System.out.println("Objeto mais vendido: Preço: R$ " + preco[ind] + ", Posição no vetor: " + ind);

	}

}
