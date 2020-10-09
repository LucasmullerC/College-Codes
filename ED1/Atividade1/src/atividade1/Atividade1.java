package atividade1;
import java.util.Scanner;
public class Atividade1 {
	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		double delta,X1,X2;
		int a,b,c;
		System.out.print("Digite o valor de a: ");
	    a = input.nextInt();
	    System.out.print("Digite o valor de b: ");
	    b = input.nextInt();
	    System.out.print("Digite o valor de c: ");
	    c = input.nextInt();
	    delta = (b*b) - (4 * a * c);
	    if(delta >= 0) {
	    	CalculaX (delta,a,b,c);
	    }
	    else {
	    	System.out.print("Delta não possui raiz!");
	    }

	}
	public static void CalculaX (double delta,int a,int b,int c) {
		double X1,X2;
		X1 = (-(b) + Math.sqrt(delta)) / (2 * a);
	    X2 = (-(b) - Math.sqrt(delta)) / (2 * a);
	    System.out.println("X' = " +X1);
	    System.out.println("X'' = " +X2);
	   
	}

}
