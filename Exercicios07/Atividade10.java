package Exercicios07;

import java.util.Scanner;

public class Atividade10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner entrada = new Scanner (System.in);
		int p=0;                   
        for (int i=2; i<=2000; i++) {
    
	for (int j=1; j<=i; j++) {
        if (i % j == 0) {
            p++;
        }
        }
        if (p == 2) {
        System.out.println("O número " + i + " é PRIMO!");
        }
    	p = 0;
	}

}}
