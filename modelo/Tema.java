package modelo;

import java.util.ArrayList;

/**
 *
 * @author Us
 */
public class Tema {
    private int id;
   private String nombre;
   private String descripcion;
   private int idtest;
   private ArrayList<Pregunta> preguntas;

    public Tema() {
    }

    public Tema(int id, String nombre, String descripcion, int idtest, ArrayList<Pregunta> preguntas) {
        this.id = id;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.idtest = idtest;
        this.preguntas = preguntas;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getIdtest() {
        return idtest;
    }

    public void setIdtest(int idtest) {
        this.idtest = idtest;
    }

    public ArrayList<Pregunta> getPreguntas() {
        return preguntas;
    }

    public void setPreguntas(ArrayList<Pregunta> preguntas) {
        this.preguntas = preguntas;
    }

   
   
}
