package Entidad;

import java.util.Scanner;

public class Operacion {
    Scanner consola = new Scanner(System.in);
    private int num1;
    private int num2;

    public Operacion(int num1, int num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    public Operacion() {
    }

    public int getNum1() {
        return num1;
    }

    public int getNum2() {
        return num2;
    }

    public void setNum1(int num1) {
        this.num1 = num1;
    }

    public void setNum2(int num2) {
        this.num2 = num2;
    }
    
    public void crearOperacion(){
        System.out.println("Ingrese el primer numero");
        num1 = consola.nextInt();

        System.out.println("Ingrese el segundo numero");
        num2 = consola.nextInt();
    }
    
    public int sumar(){
        return num1 + num2;
    }
    
    public int restar(){
        return num1 - num2;
    }
    
    public double multiplicar(){
        if (num1 == 0 || num2 == 0) {
            System.out.println("No se puede multiplicar por 0");
            return 0;
        } else return num1 * num2;
    }
    
    public double dividir(){
        if (num1 == 0 || num2 == 0) {
            System.out.println("No se puede dividir por 0");
            return 0;
        } else return num1 / num2;
    }

    @Override
    public String toString() {
        return "Operacion{" + ", num1=" + num1 + ", num2=" + num2 + '}';
    }
    
    
}
