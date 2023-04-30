package Entidad;

public class Empleado {
    private String nombre;
    private int edad;
    private int salario;

    public Empleado(String nombre, int edad, int salario) {
        this.nombre = nombre;
        this.edad = edad;
        this.salario = salario;
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public int getSalario() {
        return salario;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setSalario(int salario) {
        this.salario = salario;
    }
    
    
    public void calcular_aumento(){
        
        if (edad > 30) {
            salario += salario * 0.10; 
            System.out.println("Su aumento de salario es de un 10%");
        } else {
            salario += salario * 0.5;
            System.out.println("Su aumento de salario es de un 5%");
        }
        
        System.out.println(salario);
        
    }
}
