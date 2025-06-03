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
public class Test {
    private int id;
    private String nombre;
    private String descripcion;
    private Tema[] temas;

    public Test() {
    }

    public Test(String nombre, int id, String descripcion, Tema[] temas) {
        this.nombre = nombre;
        this.id = id;
        this.descripcion = descripcion;
        this.temas = temas;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Tema[] getTemas() {
        return temas;
    }

    public void setTemas(Tema[] temas) {
        this.temas = temas;
    }
    
  
}
