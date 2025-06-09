/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
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
   
   private ArrayList<Pregunta> preguntas;

    public Tema() {
    }

    public Tema(int id, String nombre, String descripcion, ArrayList<Pregunta> preguntas) {
        this.id = id;
        this.nombre = nombre;
        this.descripcion = descripcion;
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

    public ArrayList<Pregunta> getPreguntas() {
        return preguntas;
    }

    public void setPreguntas(ArrayList<Pregunta> preguntas) {
        this.preguntas = preguntas;
    }

   
   
}
