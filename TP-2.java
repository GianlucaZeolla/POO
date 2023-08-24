import java.io.ObjectOutput;
import java.util.Scanner;

public class Alumno {
    private String nombre;
    private int edad;
    private double[] promedio;

    public Alumno(String nombre, int edad, double[] promedio) {
        this.nombre = nombre;
        this.edad = edad;
        this.promedio = promedio;
    }

    public Alumno(String juan, int edad, double v) {

    }

    public String getNombre() {
        return getNombre();
    }

    public int getEdad() {
        return getEdad();
    }

    public double[] getPromedio() {
        return promedio;
    }

    public void setNombre(String nombre) {
        return;
    }

    public void setEdad(int edad) {
        return;
    }

    public void setPromedio(double[] promedio) {
        return;
    }


    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Creando el objeto alumno1....");
        System.out.println("¿desea continuar? Ingrese 1 para si, 0 para no");
        int deseoContinuar = teclado.nextInt();

        if (deseoContinuar == 1) {
            System.out.println("ingreso");
        } else {
            System.out.println("que tenga buen dia");
        }
        Alumno alu1 = new Alumno("juan", 23, 8.25);
        System.out.println("atributos de alu1: ");
        System.out.println("nombre: " + alu1.nombre);
        System.out.println("edad: " + alu1.getEdad());
        System.out.println("promedio: " + alu1.getPromedio());






        }
    }
