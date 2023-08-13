package casos;

import java.util.Scanner;

public class SumaOOscan {
	private
	int a;
	int b;
	
	public 
	int geta()
	{
		return this.a;
	}
	int getb()
	{
		return this.b;
	}
	void seta(int a1)
	{
		this.a=a1;
	}
	void setb(int b1)
	{
		this.b=b1;
	}
	
	int funSuma(int funA, int funB)
	{
		int sum;
		sum = funA + funB;
		return sum;
	}
	
	public static void main (String[] args) {
		
		SumaOOscan sumador = new SumaOOscan(); //instanciando un objeto scanner
		
		Scanner teclado = new Scanner(System.in); //numero enteros
		
		System.out.println("ingrese un numero a: " );
		int a = teclado.nextInt();
		System.out.println("  >> numero ingresado a: " + a);
		
	    System.out.println("ingrese un numero b: ");
	    int b = teclado.nextInt();
	    System.out.println("  >> numero ingresado b: " + b);
	    
	    sumador.seta(a);
	    sumador.setb(b);
	    int a1 = sumador.geta();
	    int b1 = sumador.getb();
	    int suma = sumador.funSuma(a1, b);
	    System.out.println("La suma de a y b es: " +suma);
	    System.out.println("La suma de a y b es: " + sumador.funSuma(sumador.geta(), sumador.getb()));
            teclado.close();	
	    
	
		
	}
	
}
