package Exercicios07;

import java.util.Scanner;

public class Atividade01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	Scanner	entrada = new Scanner (System.in);
		String pp = "nao";
		do {
			System.out.println("Ol� mundo");
			System.out.println("Voc� quer apare�a novamente?");
			pp = entrada.nextLine();
		}while(pp.equals("sim"));
		System.out.println("fim");
	}

}
