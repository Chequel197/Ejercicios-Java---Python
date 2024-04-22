package com_chequel_modelos;

import com_chequel_calculos.Clasificacion;

public class Episodio implements Clasificacion{
    
    private int numero; 
    private String nombre; 
    private Series serie;
    private int totalVisualizaciones; 

    /**
     * @return int return the numero
     */
    public int getNumero() {
        return numero;
    }

    /**
     * @param numero the numero to set
     */
    public void setNumero(int numero) {
        this.numero = numero;
    }

    /**
     * @return String return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return Series return the serie
     */
    public Series getSerie() {
        return serie;
    }

    /**
     * @param serie the serie to set
     */
    public void setSerie(Series serie) {
        this.serie = serie;
    }

    @Override
    public int getClasificacion(){
        if (totalVisualizaciones >= 300){
            return 300;
        } else if (totalVisualizaciones >= 100){
            return 100;
        } else {
            return 50;
        }
    }

    /**
     * @return int return the totalVisualizaciones
     */
    public int getTotalVisualizaciones() {
        return totalVisualizaciones;
    }

    /**
     * @param totalVisualizaciones the totalVisualizaciones to set
     */
    public void setTotalVisualizaciones(int totalVisualizaciones) {
        this.totalVisualizaciones = totalVisualizaciones;
    }

}
