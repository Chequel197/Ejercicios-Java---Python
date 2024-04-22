package com_chequel_modelos;

public class titulo {

    private String nombre;
    private int fechaDeLanzamiento;
    private static int duracionEnMinutos;
    private boolean incluidoEnElPlan;
    private double sumaDeLasEvaluciones;
    private int totalDeLasEvaluaciones;

    public int getTotalDeLasEvaluaciones(){
        return totalDeLasEvaluaciones;
    }

    public void nuestraFichaTecnica(){
        System.out.println(nombre);
        System.out.println(fechaDeLanzamiento);
        System.out.println(getDuracionEnMinutos());
        // funcion para mostrar los valores en pantalla con solo llamarla
    }
    public void evalua(double nota){
        sumaDeLasEvaluciones += nota;
        // aqui se hace la suma de las evalucione que se le hace la pelicula
        totalDeLasEvaluaciones++;
        // aqui se crea esta variable para guardar la cantidad de personas que evaluado la pelicula y usalo en la 
        // funcion "calculaMedia()" y como el nombre lo dice sacar una media de las evaluaciones

    }

    public double calculaMedia(){
        return sumaDeLasEvaluciones / totalDeLasEvaluaciones;
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
     * @return int return the fechaDeLanzamiento
     */
    public int getFechaDeLanzamiento() {
        return fechaDeLanzamiento;
    }

    /**
     * @param fechaDeLanzamiento the fechaDeLanzamiento to set
     */
    public void setFechaDeLanzamiento(int fechaDeLanzamiento) {
        this.fechaDeLanzamiento = fechaDeLanzamiento;
    }

    /**
     * @return int return the duracionEnMinutos
     */
    public int getDuracionEnMinutos() {
        return duracionEnMinutos;
    }

    /**
     * @param duracionEnMinutos the duracionEnMinutos to set
     */
    public void setDuracionEnMinutos(int duracionEnMinutos) {
        titulo.duracionEnMinutos = duracionEnMinutos;
    }

    /**
     * @return boolean return the incluidoEnElPlan
     */
    public boolean isIncluidoEnElPlan() {
        return incluidoEnElPlan;
    }

    /**
     * @param incluidoEnElPlan the incluidoEnElPlan to set
     */
    public void setIncluidoEnElPlan(boolean incluidoEnElPlan) {
        this.incluidoEnElPlan = incluidoEnElPlan;
    }

    /**
     * @return double return the sumaDeLasEvaluciones
     */
    public double getSumaDeLasEvaluciones() {
        return sumaDeLasEvaluciones;
    }

    /**
     * @param sumaDeLasEvaluciones the sumaDeLasEvaluciones to set
     */
    public void setSumaDeLasEvaluciones(double sumaDeLasEvaluciones) {
        this.sumaDeLasEvaluciones = sumaDeLasEvaluciones;
    }

    /**
     * @param totalDeLasEvaluaciones the totalDeLasEvaluaciones to set
     */
    public void setTotalDeLasEvaluaciones(int totalDeLasEvaluaciones) {
        this.totalDeLasEvaluaciones = totalDeLasEvaluaciones;
    }

}