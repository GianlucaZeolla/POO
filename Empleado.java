public class Empleado {
    private String nombre;
    private int sueldoBasico;

    public double getSueldoBasico() {
        return sueldoBasico;
    }

    public String getNombre() {
        return nombre;
    }

    public void setSueldoBasico(int sueldoBasico) {
        this.sueldoBasico = sueldoBasico;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    //  setters y getters de los atributos de la super clase empleados

    public double averiguarSueldo() {
        return sueldoBasico;
    }
    public double calculaSueldo() { //aca creo el metodo puente
        return averiguarSueldo();
    }
}
class Mozo extends Empleado {
    private double propinas;

    public double getPropinas() {
        return propinas;
    }

    public void setPropinas(double propinas) {    //setters y getters de la clase mozo
        this.propinas = propinas;
    }
    @Override
    public double averiguarSueldo() {
        return super.averiguarSueldo();
    }
}
class Cajero extends Empleado {
    @Override
    public double averiguarSueldo() {
        return super.averiguarSueldo();
    }
}
 class Main {
    public static void main(String[] args) {
        Mozo mozo = new Mozo();
        mozo.setNombre("Raul");
        mozo.setSueldoBasico(1000);
        mozo.setPropinas(200);

        Cajero cajero = new Cajero();
        cajero.setNombre("Josefa");
        cajero.setSueldoBasico(1500);

        System.out.println("El salario del mozo: " + mozo.getNombre() + " es: $" + mozo.averiguarSueldo());
        System.out.println("El salario del cajero: " + cajero.getNombre() + " es: $" + cajero.averiguarSueldo());
    }
}

