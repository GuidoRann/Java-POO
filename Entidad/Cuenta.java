package Entidad;

import java.util.Scanner;

public class Cuenta {
    
    Scanner consola = new Scanner(System.in);
    private int saldo;
    private String titular;

    public Cuenta(int saldo, String titular) {
        this.saldo = saldo;
        this.titular = titular;
    }

    public void retirarDinero() {
        System.out.println("Hola " + titular);
        boolean salir = true;

        do {
            System.out.println("Ingrese el monto a retirar");
            int monto = consola.nextInt();
            if (monto <= saldo) {
                saldo -= monto;
                System.out.println("Su saldo restante es de: " + saldo);
            } else {
                System.out.println("Saldo insuficiente, ingrese otro monto");
            }
            System.out.println("Quiere realizar otra extraccion? \nS- Si \nN- No");
            String opcion = consola.next();
            
            switch (opcion) {
                case "s" -> salir = true;
                case "n" -> salir = false;
                default -> System.out.println("Opcion no encontrada");
            }
        
        } while (salir);
        System.out.println("Hasta la proxima...");
    }
}
