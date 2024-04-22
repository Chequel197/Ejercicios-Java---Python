package com_chequel_calculos;

public class FiltroRecomendacion {
    public void filtra(Clasificacion clasificacion){
        if (clasificacion.getClasificacion() >= 300){
            System.out.println("Muy bien evaluado en el momento");
        } else if (clasificacion.getClasificacion() >= 100){
            System.out.println("popular en el momento");
        } else {
            System.out.println("Colocalo en tu lista para despues");
        }
    }
}
