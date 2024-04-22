package com_chequel_modelos;

public class Series extends titulo{
    private int temporadas;
    private int episodiosPorTemporadas;
    private int minutosPorEpisodios;
    
    @Override
    public int getDuracionEnMinutos(){
        return temporadas * episodiosPorTemporadas * minutosPorEpisodios;
    }
    /**
     * @return int return the temporadas
     */
    public int getTemporadas() {
        return temporadas;
    }

    /**
     * @param temporadas the temporadas to set
     */
    public void setTemporadas(int temporadas) {
        this.temporadas = temporadas;
    }

    /**
     * @return int return the episodiosPorTemporadas
     */
    public int getEpisodiosPorTemporadas() {
        return episodiosPorTemporadas;
    }

    /**
     * @param episodiosPorTemporadas the episodiosPorTemporadas to set
     */
    public void setEpisodiosPorTemporadas(int episodiosPorTemporadas) {
        this.episodiosPorTemporadas = episodiosPorTemporadas;
    }

    /**
     * @return int return the minutosPorEpisodios
     */
    public int getMinutosPorEpisodios() {
        return minutosPorEpisodios;
    }

    /**
     * @param minutosPorEpisodios the minutosPorEpisodios to set
     */
    public void setMinutosPorEpisodios(int minutosPorEpisodios) {
        this.minutosPorEpisodios = minutosPorEpisodios;
    }

}
