package caso5;

public class SumaOOsg 
{
  private
	int a;
    int b;

  public
    void seta(int a1)
    {
        this.a=a1;
    }
    void setb(int b1)
    {
        this.b=b1;
    }
    int geta()
    {
      return this.a;
    }
    int getb()
    {
       return this.b;
    }

    int FunSuma(int fa, int fb)
    {
        int sum;
        sum=fa+fb;
        return sum;
    }

	public static void main(String[] args) 
	{
		SumaOOsg sumador=new SumaOOsg();
	    sumador.seta(5);
	    sumador.setb(10);
	    int a=sumador.geta();
	    int b=sumador.getb();
	    int suma=sumador.FunSuma(a,b);
	    System.out.println("La suma de a y b es: " +suma);
	    System.out.println("La suma de a y b es: " + sumador.FunSuma(sumador.geta(), sumador.getb()));	    
	}
}
