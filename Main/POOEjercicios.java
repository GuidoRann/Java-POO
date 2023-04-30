package Main;

//import Entidad.Libro;
//import Entidad.Circunferencia;
//import Entidad.Operacion;
//import Entidad.Rectangulo;
//import Entidad.Cancion;
//import Entidad.Puntos;
//import Entidad.Juego;
//import Entidad.Cuenta;
//import Entidad.Empleado;
//import Entidad.RectanguloArea;

import Entidad.*;

public class POOEjercicios {

    public static void main(String[] args) {

        // -------------- Ejercicio 1
        /*
        Libro libro1 = new Libro(654, "El gato negro", "E.A.Poe", 344);
        
        System.out.println(libro1);
         */
       
        // -------------- Ejercicio 2
        /*
        Circunferencia circulo1 = new Circunferencia(19);
        System.out.println( circulo1.getRadio());
        System.out.println( circulo1.area());        
        System.out.println( circulo1.perimetro());
         */
        
        // -------------- Ejercicio 3
        /*
        Operacion calculo = new Operacion(4, 2);
        System.out.println(calculo.sumar());
        System.out.println(calculo.restar());
        System.out.println(calculo.multiplicar());
        System.out.println(calculo.dividir());
        
        calculo.crearOperacion();
        System.out.println(calculo.sumar());
        System.out.println(calculo.restar());
        System.out.println(calculo.multiplicar());
        System.out.println(calculo.dividir());
         */
        
        // -------------- Ejercicio 4
        /*
        Rectangulo rect = new Rectangulo();
        
        rect.crearRectangulo();
        System.out.println("El perimetro del rectangulo es: " + rect.perimetro());
        System.out.println("La superficie del rectangulo es: " + rect.superficie());
        
        System.out.println(rect);
        rect.dibujarRectangulo();
         */
        
        // -------------- Ejercicio Extra 1
        /*
        Cancion cancion1 = new Cancion("Deadhead", "Devin Townsend");
        System.out.println(cancion1);
         */
        
        // -------------- Ejercicio Extra 2
        /*
        Puntos primerCaso = new Puntos();
        primerCaso.crearPuntos();
        
        System.out.println("La distancia entre ambos puntos es de: " + primerCaso.distancia());
         */
        
        // -------------- Ejercicio Extra 3
        /*
        Juego encontrar = new Juego();
        encontrar.iniciar_juego();
        */
        
        // -------------- Ejercicio Extra 4
        /*
        Cuenta banco = new Cuenta(150000, "Guido");
        banco.retirarDinero();
        */
        
        // -------------- Ejercicio Extra 5
        /*
        Empleado empleado1 = new Empleado("Guido", 32, 150000);
        empleado1.calcular_aumento();
        */
        
        // -------------- Ejercicio Extra 6
        /*
        RectanguloArea rectangulo1 = new RectanguloArea(4, 6);
        rectangulo1.calcular_area(); 
        */
    }
}
