package Exercicios07;

import java.util.Scanner;

public class Atividade06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner (System.in);
	
		System.out.println("Digite um numero para exibir todos os pares até ele: ");
		int t = entrada.nextInt();
		int l = 0;		
		for(int i =1;i <= t;i++){			
			l = 2 * i;			
			System.out.println(l);
	
	}

}}
