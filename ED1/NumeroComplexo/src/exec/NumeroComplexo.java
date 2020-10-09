package exec;
public class NumeroComplexo {
	private double NR1,NR2,NI1,NI2;
	public NumeroComplexo(double NR1, double NR2, double NI1, double NI2) {
		this.NR1 = NR1;
		this.NR2 = NR2;
		this.NI1 = NI1;
		this.NI2 = NI2;
	}
	public static boolean eigual (double N1,double N2) {
		if (N1 == N2) {
			return true;
		}
		else {
			return false;
		}
	}
	public void soma () {
		double x,y;
		boolean igual;
		x = NR1 + NI1; 
		y = NR2 + NI2; 
		igual = eigual (x,y);
		System.out.println(x + "," + y);
		if (igual == true) {
			System.out.println("São iguais");
		}
		else {
			System.out.println("São diferentes");
		}	
	}
	public void subtracao () {
		double x,y;
		boolean igual;
		x = NR1 - NI1; 
		y = NR2 - NI2; 
		igual = eigual (x,y);
		System.out.println(x + "," + y);
		if (igual == true) {
			System.out.println("São iguais");
		}
		else {
			System.out.println("São diferentes");
		}	
	}
	public void multiplicacao () {
		double x,y;
		boolean igual;
		x = NR1 * NI1; 
		y = NR2 * NI2; 
		igual = eigual (x,y);
		System.out.println(x + "," + y);
		if (igual == true) {
			System.out.println("São iguais");
		}
		else {
			System.out.println("São diferentes");
		}	
	}
	public void divisao () {
		double x,y;
		boolean igual;
		x = NR1 / NI1; 
		y = NR2 / NI2; 
		igual = eigual (x,y);
		System.out.println(x + "," + y);
		if (igual == true) {
			System.out.println("São iguais");
		}
		else {
			System.out.println("São diferentes");
		}	
	}
	

}
