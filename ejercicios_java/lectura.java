package ejercicios_java;
import java.util.Scanner;

public class lectura {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Escribe el nombre de tu pelicula favorita");
        String Pelicula = teclado.nextLine();
        System.out.println("Ahora escribe la fecha de lanzamiento");
        String fechaDeLanzamiento = teclado.nextLine();
        System.out.println("Que nota le das a esta pelicula");
        double nota = teclado.nextDouble();

        System.out.println(Pelicula);
        System.out.println(fechaDeLanzamiento);
        System.out.println(nota);
    }
}
