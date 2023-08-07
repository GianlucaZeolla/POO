package caso4;

public class SumaOOacc 
{
private
   int a=5;   //atributo
   int b=10;  //atributo	
 public  
   int FunSuma()        // Método de la clase
   {
     return this.a + this.b;
   }

   public static void main(String[] args)  //Método main
   {
	  SumaOOacc sumador=new SumaOOacc(); //Creación del Objeto sumador
	  int suma=0;		
	  suma=sumador.FunSuma(); //Mensaje para el Objeto sumador para que haga la suma
	  System.out.println("La suma de a y b es: "+ suma);
	  System.out.println("Valor de a: " + sumador.a);
	  System.out.println("Valor de b: " + sumador.b);
	  sumador.a=20;
	  sumador.b=30;
	  suma=sumador.FunSuma();
	  System.out.println("La suma de a y b es: "+ suma);
	  System.out.println("Valor de a: " + sumador.a);
	  System.out.println("Valor de b: " + sumador.b);	  
   }
}
