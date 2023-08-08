package casos;

public class caso2
{	
  static int FunSuma(int fa,int fb)
{
	return fa+fb;
}
	public static void main(String[] args) 
	{
		int a=5;
		int b=10;
		int suma=0;		
		suma=FunSuma(a,b);
		System.out.println("La suma de a y b es: "+ suma);
	}
}
