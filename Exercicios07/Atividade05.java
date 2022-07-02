package Exercicios07;

import java.util.Scanner;

public class Atividade05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner entrada = new Scanner (System.in);
		
		double m = 0;
		double t = 0;
		int i = 0;
		do {
			System.out.println("Digite um numero: ");
			m = entrada.nextDouble();
			if(m > t) {
				t = m;
			}
			i++;
		}while(i < 12);
		System.out.println(t);
	}

}
