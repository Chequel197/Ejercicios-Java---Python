import com_chequel_calculos.FiltroRecomendacion;
import com_chequel_calculos.calculadoraDeTiempo;
import com_chequel_modelos.*;
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
       miPelicula.nuestraFichaTecnica();
       System.out.println("suma de la nota: " + miPelicula.getTotalDeLasEvaluaciones()); 
       //aqui usamos una funcion para acortar el codigo y asi evitar la
       //repeticion del codigo y hacer mas reutlizable

        Series CasaDragon = new Series();
        CasaDragon.setNombre("La casa del dragon");
        CasaDragon.setFechaDeLanzamiento(2022);
        CasaDragon.setTemporadas(1);
        CasaDragon.setMinutosPorEpisodios(50);
        CasaDragon.setEpisodiosPorTemporadas(10);
        CasaDragon.nuestraFichaTecnica();
        
        calculadoraDeTiempo calculadora = new calculadoraDeTiempo();
        calculadora.incluye(miPelicula);
        calculadora.incluye(CasaDragon);
        System.out.println("suma de los tiempos: " + calculadora.getTiempoTotal());

        FiltroRecomendacion filtroRecomendacion = new FiltroRecomendacion();
        filtroRecomendacion.filtra(miPelicula);
        
        Episodio episodio = new Episodio();
        episodio.setNumero(1);
        episodio.setNombre("la casa");
        episodio.setSerie(CasaDragon);
        episodio.setTotalVisualizaciones(300);
        filtroRecomendacion.filtra(episodio);


        //Pelicula otraPelicula = new Pelicula();
        //otraPelicula.nombre = "Matrix";
        //otraPelicula.fechaDeLanzamiento = 2000;
        //otraPelicula.duracionEnMinutos = 180;
        //otraPelicula.nuestraFichaTecnica();
    }
}
