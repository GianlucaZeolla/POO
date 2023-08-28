package aa;

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

    public Alumno(String juan, int edad, double promedio) {

    }

    public  String getNombre() {
        return nombre;
    }

	public int getEdad() {
        return edad;
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
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Creando el objeto alumno....");
        System.out.println("¿desea continuar? Ingrese 1 para si, 2 para no");
        int deseoContinuar = scanner.nextInt();

        if (deseoContinuar == 1) {
            System.out.println("ingreso");
            Alumno alu1 = new Alumno("juan", 23,new double[] {8.25});
        
        System.out.println("atributos de alu1: ");
        System.out.println("nombre: " + alu1.getNombre());
        System.out.println("edad: " + alu1.getEdad());
        System.out.println("promedio: " + alu1.getPromedio()[0]);
        } else {
            System.out.println("que tenga buen dia");
        }
        
        

        }
    }
