package Exercicios07;

import java.util.Scanner;

public class Atividade03 {
	public static void main(String[] args) {
		
	Scanner entrada = new Scanner (System.in);
	System.out.println("entrada:");
	int n = entrada.nextInt();
	
	
	
	
	int cont = 0;
	
	int ta = 0;
	do {
		
		ta = (n*cont);
		cont++;
		System.out.println(ta);
	}while(cont <= 25);
}}
