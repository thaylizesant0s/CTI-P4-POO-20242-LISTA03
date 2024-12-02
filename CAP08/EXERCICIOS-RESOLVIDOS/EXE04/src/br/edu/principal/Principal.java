package br.edu.principal;

import java.util.Scanner;

public class Principal {
    
    public static void main(String[] args) {
        double seg;
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Digite a quantidade de segundos que deseja converter: ");
        seg = sc.nextDouble();
        
        transformacao(seg);
    }
    
    public static void transformacao(double segundos) {
        double h, m, s, r;
        
        h = segundos / 3600;
        r = segundos % 3600;
        m = r / 60;
        s = r % 60;
        
        System.out.println("Tempo convertido: " + (int)h + " horas, " + (int)m + " minutos e " + (int)s + " segundos.");
    }
}
