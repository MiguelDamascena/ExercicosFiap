package Exercicios06;

public class Atividade07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int A = 5;
		int B = 7;
		int C = 4;
		int D = 8;
		
		boolean EA = (A <= B) && (B < D);
		boolean EB = (A == B) || (C != B);
		boolean EC = (D>A) && (C >= B); 
		boolean ED = (A<=B) || (C<=D);
		boolean EE = ((B>D) || (C<A)) && (D<=B);
		
		System.out.println(EA+" "+EB+" "+EC+" "+ED+" "+EE);
	}

}
