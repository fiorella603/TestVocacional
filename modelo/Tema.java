/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author Us
 */
public class Tema {
    private int id;
   private String nombre;
   private String descripcion;
   
   private Pregunta[] pregunta;

    public Tema() {
    }

    public Tema(String nombre, String descripcion, int id, Pregunta[] pregunta) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.id = id;
        this.pregunta = pregunta;
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

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Pregunta[] getPregunta() {
        return pregunta;
    }

    public void setPregunta(Pregunta[] pregunta) {
        this.pregunta = pregunta;
    }
    
}
