package Exercicios07;

import java.util.Scanner;

public class Atividade08 {
	public static void main(String[] args) {
	
	Scanner entrada = new Scanner (System.in);
	
	int n = 0;
	int p= 0;
	do {
		System.out.println("Digite um numero positivo para ser calculado a soma de todos os numeros inteiro a partir de 1: ");
		n = entrada.nextInt();
	}while(n < 0);
	for(int o = 1;o <= n;o++) {
		p = p+ o;	
	}
	System.out.println(p);
	}

}
