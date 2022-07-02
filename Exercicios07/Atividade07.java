package Exercicios07;

import java.util.Scanner;

public class Atividade07 {

public static void main(String[] args) {
	
	Scanner entrada = new Scanner (System.in);
	double m = 0;
	int i = 1;
	int l=0;
	System.out.println("Digite a media de toda a sala: ");
	double ma = entrada.nextDouble();
	do {
		System.out.println("Digite a nota de um aluno: ");
		m = entrada.nextDouble();
		if(m >= ma) {
			l++;
		}
		i++;
	}while(i <= 20);
	System.out.println(l);
	
}}
