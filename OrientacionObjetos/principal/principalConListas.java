package principal;
import java.util.ArrayList;
import com_chequel_modelos.*;

public class principalConListas {
    public static void main(String[] args) {

        Pelicula miPelicula = new Pelicula("La casa", 1998);
        var LuisMiguel = new Pelicula("Historia de luis miguel", 1998);
        Series CasaDragon = new Series("casa dragon", 2022);
        
        


        ArrayList<titulo> lista = new ArrayList<>();
        lista.add(miPelicula);
        miPelicula.evalua(9);
        lista.add(LuisMiguel);
        LuisMiguel.evalua(5);
        lista.add(CasaDragon);
        CasaDragon.evalua(8);
        
        for (titulo item : lista) {
            System.out.println(item.getNombre());
            if (item instanceof Pelicula) {
                Pelicula pelicula = (Pelicula) item;
            System.out.println(pelicula.getClasificacion());
            }
            
        }
    }
}
