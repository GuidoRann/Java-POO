package Entidad;

import java.util.Scanner;

public class Circunferencia {

    Scanner consola = new Scanner(System.in);
    private double radio;

    public Circunferencia(double radio) {
        this.radio = radio;
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    public void crearCircunferencia() {
        System.out.println("Ingrese el radio de la circunferencia");
        setRadio(consola.nextDouble());
    }

    public double area() {
        return Math.PI * Math.pow(radio, 2);
    }
    
    public double perimetro(){
        return 2 * Math.PI * radio;
    }

    @Override
    public String toString() {
        return "Circunferencia{" + ", radio=" + radio + '}';
    }
    
    

}
