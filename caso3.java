package caso3;

public class SumaOO {

		   int a=5;
		   int b=10;	
		   int FunSuma()
		   {
			return this.a + this.b;
		   }
			public static void main(String[] args) 
			{
				SumaOO sumador=new SumaOO();
				int suma=0;		
				suma=sumador.FunSuma();
				System.out.println("La suma de a y b es: "+ suma);
			}

	}
