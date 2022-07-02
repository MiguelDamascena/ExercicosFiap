package Exercicios06;

import java.util.Scanner;

public class Atividade11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
  Scanner entrada = new Scanner (System.in);
        System.out.println("estado");
	 int estado = entrada.nextInt();
	System.out.println("peso");
	double peso = entrada.nextDouble();
	System.out.println("codigoa");
	int codigo = entrada.nextInt();
	
	double quilos = peso * 1000;
	
	if((estado == 1) && ((codigo> 10) && (codigo <=20))) {
		
		double preco = (quilos*100);
		double porcentagem = preco*0.35;
		double total = preco+porcentagem;
		System.out.println(quilos);
		System.out.println(preco);
		System.out.println(porcentagem);
		System.out.println(total);
	}
	else if((estado == 1) && ((codigo> 20) && (codigo <=30))) {
		double preco = (quilos*250);
		double porcentagem = preco*0.35;
		double total = preco+porcentagem;
		System.out.println(quilos);
		System.out.println(preco);
		System.out.println(porcentagem);
		System.out.println(total);
	}
	else if((estado == 1) && ((codigo> 30) && (codigo <=40))) {
		double preco = (quilos*340);
		double porcentagem = preco*0.35;
		double total = preco+porcentagem;
		System.out.println(quilos);
		System.out.println(preco);
		System.out.println(porcentagem);
		System.out.println(total);
	}
	else if((estado == 2) && ((codigo> 10) && (codigo <=20))) {
		double preco = (quilos*100);
		double porcentagem = preco*0.25;
		double total = preco+porcentagem;
		System.out.println(quilos);
		System.out.println(preco);
		System.out.println(porcentagem);
		System.out.println(total);
	}
	else if((estado == 2) && ((codigo> 20) && (codigo <=30))) {
		double preco = (quilos*250);
		double porcentagem = preco*0.25;
		double total = preco+porcentagem;
		System.out.println(quilos);
		System.out.println(preco);
		System.out.println(porcentagem);
		System.out.println(total);
	}
	else if((estado == 2) && ((codigo> 30) && (codigo <=40))) {
		double preco = (quilos*340);
		double porcentagem = preco*0.25;
		double total = preco+porcentagem;
		System.out.println(quilos);
		System.out.println(preco);
		System.out.println(porcentagem);
		System.out.println(total);
	}
	else if((estado == 3) && ((codigo> 10) && (codigo <=20))) {
		double preco = (quilos*100);
		double porcentagem = preco*0.15;
		double total = preco+porcentagem;
		System.out.println(quilos);
		System.out.println(preco);
		System.out.println(porcentagem);
		System.out.println(total);
	}
	else if((estado == 3) && ((codigo> 20) && (codigo <=30))) {
		double preco = (quilos*250);
		double porcentagem = preco*0.15;
		double total = preco+porcentagem;
		System.out.println(quilos);
		System.out.println(preco);
		System.out.println(porcentagem);
		System.out.println(total);
	}
	else if((estado == 3) && ((codigo> 30) && (codigo <=40))) {
		double preco = (quilos*340);
		double porcentagem = preco*0.15;
		double total = preco+porcentagem;
		System.out.println(quilos);
		System.out.println(preco);
		System.out.println(porcentagem);
		System.out.println(total);
	}
	else if((estado == 4) && ((codigo> 10) && (codigo <=20))) {
		double preco = (quilos*100);
		double porcentagem = preco*0.05;
		double total = preco+porcentagem;
		System.out.println(quilos);
		System.out.println(preco);
		System.out.println(porcentagem);
		System.out.println(total);
	}
	else if((estado == 4) && ((codigo> 20) && (codigo <=30))) {
		double preco = (quilos*250);
		double porcentagem = preco*0.05;
		double total = preco+porcentagem;
		System.out.println(quilos);
		System.out.println(preco);
		System.out.println(porcentagem);
		System.out.println(total);
	}
	else if((estado == 4) && ((codigo> 30) && (codigo <=40))) {
		double preco = (quilos*340);
		double porcentagem = preco*0.05;
		double total = preco+porcentagem;
		System.out.println(quilos);
		System.out.println(preco);
		System.out.println(porcentagem);
		System.out.println(total);
	}
	else if((estado == 5) && ((codigo> 10) && (codigo <=20))) {
		double preco = (quilos*100);
		
		double total = preco;
		System.out.println(quilos);
		System.out.println(preco);
		System.out.println("Isento");
		System.out.println(total);
	}
	else if((estado == 5) && ((codigo> 20) && (codigo <=30))) {
		double preco = (quilos*100);
		
		double total = preco;
		System.out.println(quilos);
		System.out.println(preco);
		System.out.println("Isento");
		System.out.println(total);
	}
	else if((estado == 5) && ((codigo> 30) && (codigo <=40))) {
		double preco = (quilos*100);
		
		double total = preco;
		System.out.println(quilos);
		System.out.println(preco);
		System.out.println("Isento");
		System.out.println(total);
}
	}

}
