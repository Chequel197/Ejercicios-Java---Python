import com_chequel_modelos.*;
public class principal {
    public static void main(String[] args) {
       Pelicula miPelicula = new Pelicula(); 
       //aqui creamos un objeto utlizando las variables/ caracteristicas que le dimos a Pelicula.java y de esta forma usamos las mismas 
       //variables para diferentes peliculas y asi nos ahorramos de repetir codigo
 
       miPelicula.nombre = "Encanto";
       miPelicula.fechaDeLanzamiento = 2021;
       miPelicula.duracionEnMinutos = 120;

       miPelicula.evalua(10);
       miPelicula.evalua(7); 
       //se establece el punta de la pelicula y luego se llama funcion para que haga las respectivas sumas
       //luego se muestra en pantalla 
       System.out.println("suma de la nota: " + miPelicula.getTotalDeLasEvaluaciones());
       miPelicula.nuestraFichaTecnica(); 
       //aqui usamos una funcion para acortar el codigo y asi evitar la
       //repeticion del codigo y hacer mas reutlizable

        //Pelicula otraPelicula = new Pelicula();
        //otraPelicula.nombre = "Matrix";
        //otraPelicula.fechaDeLanzamiento = 2000;
        //otraPelicula.duracionEnMinutos = 180;
        //otraPelicula.nuestraFichaTecnica();
    }
}
