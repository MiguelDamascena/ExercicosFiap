package Exercicios07;

import java.util.Scanner;

public class Atividade09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner entrada = new Scanner (System.in);
		System.out.println("Digite um numero para imprimir todos os numeros positivos divisiveis: ");
		int p = 0;
		do {
			p = entrada.nextInt();
		}while(p < 0);
		for(int o = 1;o <= p;o++) {
			
			int q = p%o;
			if(q == 0) {
				System.out.println(o);
			}
			
		}
		System.out.println("fim");
		
	}

}
