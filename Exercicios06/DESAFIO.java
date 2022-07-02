package Exercicios06;

import java.util.Scanner;

public class DESAFIO {

	public static void main(String[] args) {
	Scanner entrada = new Scanner (System.in);
	
	System.out.println("Digite o lado A do triangulo");
	double ladoa = entrada.nextDouble();
	System.out.println("Digite o lado B do triangulo");
	double ladob = entrada.nextDouble();
	System.out.println("Digite o lado C do triangulo");
	double ladoc = entrada.nextDouble();
	
	if( ( ladoa > ladob && ladoa > ladoc ) && ( ladob > ladoc ) ) { 
	    System.out.println(ladoa);
	    System.out.println(ladob);
	    System.out.println(ladoc);
	}
	else if( ( ladoa > ladob && ladoa > ladoc ) && ( ladoc > ladob ) ) { 
	    System.out.println(ladoa);
	    System.out.println(ladoc);
	    System.out.println(ladob);
	}
	else if( ( ladob > ladoa && ladob > ladoc ) && ( ladoa > ladoc ) ) {
	    System.out.println(ladob);
	    System.out.println(ladoa);
	    System.out.println(ladoc);
	}
	else if( ( ladob > ladoa && ladob > ladoc ) && ( ladoc > ladoa ) ) { 
	    System.out.println(ladob);
	    System.out.println(ladoc);
	    System.out.println(ladoa);
	}
	else if( ( ladoc > ladoa && ladoc > ladob ) && ( ladoa > ladob ) ) { 
	    System.out.println(ladoc);
	    System.out.println(ladoa);
	    System.out.println(ladob);
	}
	else if( ( ladoc > ladoa && ladoc > ladob ) && ( ladob > ladoa ) ) { 
	    System.out.println(ladob);
	    System.out.println(ladoa);
	}
	
	boolean nt = ladoa >= ladob+ladoc;
	boolean tr = (ladoa*ladoa) == (ladob*ladob) + (ladoc*ladoc);
	boolean to = (ladoa*ladoa) > (ladob*ladob) + (ladoc*ladoc);
	boolean ta = (ladoa*ladoa) < (ladob*ladob) + (ladoc*ladoc);
	boolean te = (ladoa == ladob)&&(ladob == ladoc);
	boolean ti = ((ladoa == ladob)&&(ladoa != ladoc) || (ladob == ladoc)&&(ladob !=ladoa))||(ladoa == ladoc)&&(ladoa != ladob);
	
	if(nt == true) {
		System.out.println("Não forma triangulo");
	}
	else if(tr == true) {
		System.out.println("Triangulo retangulo");
	}
	else if(to == true) {
		System.out.println("Trinagulo obtusangulo");
	}
	else if(ta == true) {
		System.out.println("Triangulo acutangulo");
	}
	if(te == true) {
		System.out.println("Triangulo equilatero");
	}
	else if(ti == true) {
		System.out.println("Triangulo isosceles");
	}
	else {
		System.out.println("deu ruim pessoal");
	}
	}}
