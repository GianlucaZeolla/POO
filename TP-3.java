import java.util.Scanner;

public class computadora {
	private
	String pantalla;
	String teclado;
	int unidadDisco;
	char disco;
	static int numero;
	
	public computadora() {
	}
	computadora (String p, String t, int ud, char d) {
		setPantalla(p);
		teclado = t;
		unidadDisco = ud;
		disco = d;
	}
	public String getPantalla() {
		return pantalla;
	}
	public void setPantalla(String pantalla) {
		this.pantalla = pantalla;
	}
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("se van a agregar 4 componentes");
		System.out.println("1) pantalla, 2) teclado, 3) unidadDisco, 4) disco");
		System.out.println("ingrese el numero que desee ver:  ");
		while(numero != 4) {
		
		computadora c = new computadora(); 
		c.pantalla = "pantalla";
		c.teclado = "teclado";
		c.unidadDisco = 001;
		c.disco = 'A';
		
		int numero = scanner.nextInt();
		if(numero == 1) {
			System.out.println("primer componente = " +  c. pantalla);
			System.out.println("ingrese en numero 2 seguir viendo:  ");
		} else if(numero == 2) {
			System.out.println("segundo componente = " +  c.teclado);
			System.out.println("ingrese en numero 3 seguir viendo:  ");
		} else if(numero == 3) {
			System.out.println("tercer componente = " +  c.unidadDisco);
			System.out.println("ingrese en numero 4 seguir viendo:  ");
		} else if(numero == 4) {
			System.out.println("cuarto componente = " +  c.disco);
	
	} else {
		System.out.println("numero no valido, solo hay componentes del 1 al 4");
	}
		}
	}
}
