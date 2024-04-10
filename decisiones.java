public class decisiones {
    public static void main(String[] args) {
        int fechaDeLanzamiento = 1999;
        boolean incluidoEnElPlan = true;
        double notaDeLaPelicula = 8.2;
        String tipoplan = "plus";

         if (fechaDeLanzamiento > 2000) {
             System.out.println("Peliculas mas populares");

         } else {
            System.out.println("Peliculas retro que valen la pena ver");
         }
        
        if (incluidoEnElPlan && tipoplan.equals("plus")){
            System.out.println("DIsfruta de tu pelicula");
        } else {
            System.out.println("Pelicula no disponible para su ");
        }

    }
}
