
package jar;

import java.util.List;

public class Pelicula {
   
    private String titulo;
    private int anio;
    private Persona director;
    private List<Genero> generos;
    // constructores, //metodos, //Geters y Setters
   
    
    //constructor para titulo 
    public Pelicula(String titulo) {
        this.titulo= titulo;
    }
    
    //constructor vacio
    public Pelicula() {
    }
//constructor lleno
    public Pelicula(String titulo, int anio, Persona director, List<Genero> generos) {
        this.titulo = titulo;
        this.anio = anio;
        this.director = director;
        this.generos = generos;
    }

    
    //Getter y Setter
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public Persona getDirector() {
        return director;
    }

    public void setDirector(Persona director) {
        this.director = director;
    }

    public List<Genero> getGeneros() {
        return generos;
    }

    public void setGeneros(List<Genero> generos) {
        this.generos = generos;
    }

    void SetAnio(int i) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}







