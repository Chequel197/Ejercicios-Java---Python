package ejercicios_java;
import java.util.Random;
import java.util.Scanner;

import javax.sound.midi.Soundbank;

public class advinanza {
    public static void main(String[] args) 
    {
        Scanner teclado = new Scanner(System.in);
        double numeroPedido = 0;
        double numeroRandom = new Random().nextInt(100);
       

        System.out.println("Juguemos al juego de la adivinanza");
            System.out.println("Escribe un numero del 1 - 100");

        for (int i = 0; i < 5; i++) {
            numeroPedido = teclado.nextDouble();

            if (numeroPedido < numeroRandom){
                System.out.println("Es un numero mayor");
            } else if (numeroPedido > numeroRandom){
                System.out.println("Es un numero menor");
            } else {
                System.out.println("Has acertado en el numero, el numero era "+ numeroRandom);
            }
        }
    }
}
