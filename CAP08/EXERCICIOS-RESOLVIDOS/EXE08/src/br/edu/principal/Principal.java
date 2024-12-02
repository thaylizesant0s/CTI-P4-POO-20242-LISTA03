package br.edu.principal;

import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        int hora_i, min_i, hora_f, min_f, minutos;
        Scanner sc = new Scanner(System.in);

        System.out.println("Calcule a diferença de tempo em minutos entre dois horários.");
        
        System.out.print("Digite a hora inicial (0 a 23): ");
        hora_i = sc.nextInt();
        System.out.print("Digite os minutos iniciais (0 a 59): ");
        min_i = sc.nextInt();

        System.out.print("Digite a hora final (0 a 23): ");
        hora_f = sc.nextInt();
        System.out.print("Digite os minutos finais (0 a 59): ");
        min_f = sc.nextInt();

        minutos = calculo(hora_i, min_i, hora_f, min_f);
        
        System.out.println("A diferença total em minutos entre os horários é: " + minutos + " minutos.");
    }

    public static int calculo(int h_i, int m_i, int h_f, int m_f) {
        int tot_h, tot_m, total;

        if (m_f < m_i) {
            m_f += 60;
            h_f -= 1;
        }

        if (h_f < h_i) {
            h_f += 24;
        }

        tot_m = m_f - m_i;
        tot_h = h_f - h_i;
        total = tot_h * 60 + tot_m;

        return total;
    }
}
