import com_chequel_modelos.*;
import com_chequel_modelos.com_chequel_calculos.calculadoraDeTiempo;
public class principal {
    public static void main(String[] args) {
       Pelicula miPelicula = new Pelicula(); 
       //aqui creamos un objeto utlizando las variables/ caracteristicas que le dimos a Pelicula.java y de esta forma usamos las mismas 
       //variables para diferentes peliculas y asi nos ahorramos de repetir codigo
 
       miPelicula.setNombre("Encanto");
       miPelicula.setFechaDeLanzamiento(2021); 
       miPelicula.setDuracionEnMinutos(120);
       miPelicula.evalua(10);
       miPelicula.evalua(7); 
       //se establece el punta de la pelicula y luego se llama funcion para que haga las respectivas sumas
       //luego se muestra en pantalla 
       System.out.println("suma de la nota: " + miPelicula.getTotalDeLasEvaluaciones());
       miPelicula.nuestraFichaTecnica(); 
       //aqui usamos una funcion para acortar el codigo y asi evitar la
       //repeticion del codigo y hacer mas reutlizable


        serie CasaDragon = new serie();
        CasaDragon.setNombre("La casa del dragon");
        CasaDragon.setFechaDeLanzamiento(2022);
        CasaDragon.setDuracionEnMinutos(120);
        CasaDragon.setTemporadas(20);
        CasaDragon.setMinutosPorEpisodios(40);
        CasaDragon.setEpisodiosPorTemporadas(12);
        CasaDragon.nuestraFichaTecnica();
        
        calculadoraDeTiempo calculadora = new calculadoraDeTiempo();
        calculadora.incluye(miPelicula);
        System.out.println(calculadora.getTiempoTotal());

        //Pelicula otraPelicula = new Pelicula();
        //otraPelicula.nombre = "Matrix";
        //otraPelicula.fechaDeLanzamiento = 2000;
        //otraPelicula.duracionEnMinutos = 180;
        //otraPelicula.nuestraFichaTecnica();
    }
}
