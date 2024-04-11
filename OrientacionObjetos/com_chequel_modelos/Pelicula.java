package com_chequel_modelos;
public class Pelicula {
    public String nombre;
        public int fechaDeLanzamiento;
        public int duracionEnMinutos;
        public boolean incluidoEnElPlan;
        private double sumaDeLasEvaluciones;
        private int totalDeLasEvaluaciones;
        
        public int getTotalDeLasEvaluaciones(){
            return totalDeLasEvaluaciones;
        }

        public void nuestraFichaTecnica(){
            System.out.println(nombre);
            System.out.println(fechaDeLanzamiento);
            System.out.println(duracionEnMinutos);
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
 }
