package Exercicios06;

import java.util.Scanner;

public class Atividade08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner entrada = new Scanner (System.in);
		System.out.println("Digite o total de kms pertcorridos: ");
		double kms = entrada.nextDouble();
		System.out.println("Digite o tanto de combustivel gasto: ");
		double combu = entrada.nextDouble();
		
		double total = kms/combu ;
		if(total >= 8) {
			System.out.println("Autonomia legal");
		}else {
			System.out.println("Esse carro bebe em! ");
		}
	}

}
