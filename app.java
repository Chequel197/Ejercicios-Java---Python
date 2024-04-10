public class app {
     public static void main(String[] arg) {
     
        System.out.println("Bienvenido a Stream macht");
        System.out.println("Matrix");
        
      int fechaDeLanzamiento = 1999;
      boolean incluidoEnElPlan = true;
      double notaDeLaPelicula = 8.2;

      double media = (8.2 + 8.6 + 7)/3;
      System.out.println(media);

      // String sinopsis = """
      //       Matrix, es una genial pelicula
      //       se estreno en: 
      //       """ + fechaDeLanzamiento;
     System.out.println(sinopsis);

     int stars = (int) media / 2;
     System.out.println(stars);

    
      

     
     /*
     Una de las formas más comunes de formatear textos en Java es utilizando el método format() de la clase String. 
     Este método permite formatear un texto utilizando marcadores de posición (placeholders), que se representan con el 
     carácter % seguido de una letra que indica el tipo de dato que se insertará en el marcador de posición. Por ejemplo, 
     %s indica que se insertará una
     cadena en el marcador de posición, %d indica un valor entero y %f indica un valor decimal.

     En este ejemplo, los valores de las variables "nombre", "edad" y "valor" se pasan como parámetros 
     al método String.format, reemplazando los marcadores de posición %s, %d y %.2f, respectivamente. El 
     resultado impreso será "Mi nombre es María, tengo 30 años y hoy gasté 55.99 dolares". Observa también 
     que el marcador de posición %.2f indica que el valor debe ser formateado con dos decimales.

     double celsius = 35.2;
     String nombre = "Maria";
     int edad = 30;
     double valor = 55.9999;
     System.out.println(String.format("Mi nombre es %s, tengo %d años y hoy gasté %.2f dolares", nombre, edad, valor));
     double temperatura = (int) (celsius * 1.8) + 32;
     System.out.println(String.format("la tempera es de %.2f en grados celsius, en Fahrenheit es %.2f", celsius, temperatura));
 */
    
     }
}