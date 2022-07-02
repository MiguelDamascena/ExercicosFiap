package Exercicios06;

import java.util.Scanner;

public class Atividade06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Scanner entrada = new Scanner (System.in);
		System.out.println("Digite quantos anos você tem: ");
		int idade = entrada.nextInt();
		if(idade >= 18 && idade <= 70) {
			System.out.println("Você é obrigado a votar!");
		}else if ((idade >= 16 && idade < 18) || (idade > 70)) {
			System.out.println("Você não é obrigado a votar!");
		}else {
			System.out.println("você não pode votar!");
		}
	}

}
