package Exercicios06;

import java.util.Scanner;

public class Atividade10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Scanner entrada = new Scanner (System.in);

        System.out.println("Digite o seu nome: ");
String nome = entrada.nextLine();
System.out.println(nome+" digite o seu salario: ");
double salario = entrada.nextDouble();
boolean criterio1 = salario <= 280;
boolean criterio2 = salario >280 && salario <=700;
boolean criterio3 = salario >700 && salario <=1500;
boolean criterio4 = salario >1500;

if(criterio1 == true) {
	double salarioA1 = salario * 0.20;
	double salarioAB = salario + salarioA1;
	System.out.println(nome+" antes do reajuste seu salario era de: "+salario);
	System.out.println("Foi aumentado 20% o seu salario!");
	System.out.println("O valor do seu aumento foi de: "+salarioA1);
	System.out.println("O seu novo salario é: "+salarioAB);
}
else if(criterio2 == true) {
	double salarioA1 = salario * 0.15;
	double salarioAB = salario + salarioA1;
	System.out.println(nome+" antes do reajuste seu salario era de: "+salario);
	System.out.println("Foi aumentado 15% o seu salario!");
	System.out.println("O valor do seu aumento foi de: "+salarioA1);
	System.out.println("O seu novo salario é: "+salarioAB);
	
}
else if(criterio3 == true) {
	double salarioA1 = salario * 0.10;
	double salarioAB = salario + salarioA1;
	System.out.println(nome+" antes do reajuste seu salario era de: "+salario);
	System.out.println("Foi aumentado 10% o seu salario!");
	System.out.println("O valor do seu aumento foi de: "+salarioA1);
	System.out.println("O seu novo salario é: "+salarioAB);
	
}
else if(criterio4 == true) {
	double salarioA1 = salario * 0.05;
	double salarioAB = salario + salarioA1;
	System.out.println(nome+" antes do reajuste seu salario era de: "+salario);
	System.out.println("Foi aumentado 5% o seu salario!");
	System.out.println("O valor do seu aumento foi de: "+salarioA1);
	System.out.println("O seu novo salario é: "+salarioAB);
	
}
else {
	System.out.println("Valor de salario não cadastrado!");
}
	}

}
