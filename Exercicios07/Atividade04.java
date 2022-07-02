package Exercicios07;

import java.util.Scanner;

public class Atividade04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner (System.in);
		
		int joelma = 0;
		int cbb = 1;
		for(int aleluia = 0;cbb <= 10; cbb++) {
			System.out.println("Digite um numero: ");
			aleluia = entrada.nextInt();
			
			
			joelma = joelma + aleluia;
			
		}
		System.out.println(joelma);
	}

}
