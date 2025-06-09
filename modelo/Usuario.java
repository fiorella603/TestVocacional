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
public class Usuario {
    private int id;
    private String email;
    private String nombreUsuario;
    private int dni;
    private String contrasenia;
    private String nombre;
    private ArrayList <Test> test;

    public Usuario() {
    }

    public Usuario(int id, String email, String nombreUsuario, int dni, String contrasenia, String nombre, ArrayList<Test> test) {
        this.id = id;
        this.email = email;
        this.nombreUsuario = nombreUsuario;
        this.dni = dni;
        this.contrasenia = contrasenia;
        this.nombre = nombre;
        this.test = test;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public String getContrasenia() {
        return contrasenia;
    }

    public void setContrasenia(String contrasenia) {
        this.contrasenia = contrasenia;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Test> getTest() {
        return test;
    }

    public void setTest(ArrayList<Test> test) {
        this.test = test;
    }
    

   
    
}
