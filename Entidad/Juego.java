package Entidad;

import java.util.Scanner;

public class Juego {

    Scanner consola = new Scanner(System.in);
    public int intentos;
    public String jugador1;
    public String jugador2;

    public void iniciar_juego() {
        System.out.print("Jugador nº1: Ingresa un numero para adivinar >>");
        int numAdiv = consola.nextInt();
        int prueba;
        intentos = 0;
        do {
            System.out.print("Jugador nº2: Adivina el numero oculto >>");
            prueba = consola.nextInt();
            intentos++;

            if (intentos < 4) {
                if (prueba > numAdiv) {
                    System.out.println("Intenta con un numero MAS BAJO");
                } else if (prueba < numAdiv) {
                    System.out.println("Intenta con un numero MAS ALTO");
                }

            }
            
        } while (prueba != numAdiv && intentos < 4);

            if (prueba == numAdiv) {
                System.out.println("GANASTE! haz encontrado el numero oculto");
            } else if (intentos == 4) {
                System.out.println("PERDISTE! demasiados intentos =/");
            }
        }    
    }

