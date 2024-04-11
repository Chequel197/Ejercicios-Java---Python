package ejercicios_java;
import java.util.Scanner;

public class loops {
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        double nota = 0; 
        double mediaEvalucion = 0;
        
        for (int i = 0; i < 3; i++) {
            System.out.println("Escribe la nota que le darias a la pelicula Matrix");
            nota = teclado.nextDouble();
            mediaEvalucion = mediaEvalucion + nota;
        }
        System.out.println(mediaEvalucion / 3);
    }
}
