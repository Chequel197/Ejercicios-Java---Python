package com_chequel_modelos;

import com_chequel_calculos.Clasificacion;

public class Pelicula extends titulo implements Clasificacion{

    public Pelicula(String nombre, int fechaDeLanzamiento) {
        super(nombre, fechaDeLanzamiento);
        //TODO Auto-generated constructor stub
    }

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

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return "pelicula: " + this.getNombre() + "(" + getFechaDeLanzamiento() + ")";
    }
}
