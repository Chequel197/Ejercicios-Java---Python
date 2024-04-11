package OrientacionObjetos;

public class principal {
    public static void main(String[] args) {
       Pelicula miPelicula = new Pelicula();
       miPelicula.nombre = "Encanto";
       miPelicula.fechaDeLanzamiento = 2021;
       miPelicula.duracionEnMinutos = 120;

       System.out.println(miPelicula.nombre);
       System.out.println(miPelicula.fechaDeLanzamiento);
       System.out.println(miPelicula.duracionEnMinutos);
    }
}
