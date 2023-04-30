package Entidad;

import static java.lang.module.ModuleDescriptor.read;
import java.util.Scanner;

public class Libro {
    Scanner consola = new Scanner(System.in);
    public int ISBN;
    public String titulo;
    public String autor;
    public int numDePaginas;

    public Libro() {
    }

    public Libro(int ISBN, String titulo, String autor, int numDePaginas) {
        this.ISBN = ISBN;
        this.titulo = titulo;
        this.autor = autor;
        this.numDePaginas = numDePaginas;
    }

    @Override
    public String toString() {
        return "Libro{" + "ISBN=" + ISBN + ", titulo=" + titulo + ", autor=" + autor + ", numDePaginas=" + numDePaginas + '}';
    }
 
}
