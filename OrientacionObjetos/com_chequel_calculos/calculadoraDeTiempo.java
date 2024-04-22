package com_chequel_calculos;

import com_chequel_modelos.Pelicula;
import com_chequel_modelos.Series;
import com_chequel_modelos.titulo;

public class calculadoraDeTiempo {
    private  int tiempoTotal;

    public void incluye(titulo titulo){
        this.tiempoTotal =+ titulo.getDuracionEnMinutos();
    }

 /**
     * @return int return the tiempoTotal
     */
    public int getTiempoTotal() {
        return tiempoTotal;
    }
}
