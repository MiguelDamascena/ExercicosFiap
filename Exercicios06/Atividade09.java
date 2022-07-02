package Exercicios06;

import java.util.Scanner;

public class Atividade09 {
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner (System.in);
		System.out.println("Entre essas:"
				+"\r\n" + "Residencia"
				+"\r\n" + "Comercio"
				+"\r\n" + "Industria"
				+"\r\n" + "Digite em qual você se encontra: ");
		String tereno = entrada.nextLine();
		if(tereno.equals("Residencia")) {
			System.out.println("Quantos Kw/h foi gasto na sua residencia?");
			double kwh1 = entrada.nextDouble();
			double total1 = kwh1*0.60;
			System.out.println("Você tera que pagar: "+total1);
		}
		else if (tereno.equals("Comercio")) {
			System.out.println("Quantos Kw/h foi gasto na sua residencia?");
			double kwh2 = entrada.nextDouble();
			double total2 = kwh2*0.48;
			System.out.println("Você tera que pagar: "+total2);
		}
		else if (tereno.equals("Industria")) {
			System.out.println("Quantos Kw/h foi gasto na sua residencia?");
			double kwh3 = entrada.nextDouble();
			double total3 = kwh3*1.29;
			System.out.println("Você tera que pagar: "+total3);
		}
		else {
			System.out.println("Não trabalhamos com "+tereno);
		}
	}
}
