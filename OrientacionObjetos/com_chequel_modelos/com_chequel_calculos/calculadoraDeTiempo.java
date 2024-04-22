package com_chequel_modelos.com_chequel_calculos;

import com_chequel_modelos.Pelicula;

public class calculadoraDeTiempo {
    private  int tiempoTotal;
    

    public void incluye(Pelicula pelicula){
        tiempoTotal =+ Pelicula.getDuracionEnMinutos();
    }


    /**
     * @return int return the tiempoTotal
     */
    public int getTiempoTotal() {
        return tiempoTotal;
    }

    /**
     * @param tiempoTotal the tiempoTotal to set
     */
    public void setTiempoTotal(int tiempoTotal) {
        this.tiempoTotal = tiempoTotal;
    }

}
