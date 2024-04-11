package ejercicios_java;
import java.util.Scanner;

public class evaluciones {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        double nota = 0;
        double mediaEvalucion = 0;
        double total = 0;
        
        while (nota != -1) {
            System.out.println("Escribe la nota que le darias a la pelicula Matrix");
            nota = teclado.nextDouble();
           
            if (nota != -1 ){
                mediaEvalucion += nota;
                total++;
            }
            
        }
        System.out.println(mediaEvalucion / total);
    }
}
