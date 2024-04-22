package com_chequel_modelos;

import com_chequel_calculos.Clasificacion;

public class Pelicula extends titulo implements Clasificacion{
    private String director;
    
    /**
     * @return String return the director
     */
    public String getDirector() {
        return director;
    }

    /**
     * @param director the director to set
     */
    public void setDirector(String director) {
        this.director = director;
    }

    @Override
    public int getClasificacion(){
        return (int) calculaMedia() / 2;
    }
}
