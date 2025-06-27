/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import conexion.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;


public class GestionarUsuario {
        private Conexion c;
    private PreparedStatement ps;
    private Connection cn;
    private ResultSet rs;

    public GestionarUsuario() {
        this.c = new Conexion();        
        this.ps = null;        
        this.cn = null;
        this.rs = null;
    }
    
    public boolean insertarUsuario(Usuario p){
        boolean respuesta = false;
        try {              
            cn = c.conectar();
            ps = cn.prepareStatement("INSERT INTO usuario (nombre,dni,email,user,contraseña) VALUES (?,?,?,?,?)");
            ps.setString(1, p.getNombre());
            ps.setInt(2, p.getDni());
            ps.setString(3, p.getEmail());
            ps.setString(4, p.getNombreUsuario());  
            ps.setString(5, p.getContrasenia());
            int res = ps.executeUpdate(); 
            respuesta = res>0;
        } catch (SQLException e) {
        }finally {
            try {                
                if (ps!=null) {ps.close();}
                if (cn!=null) {cn.close();}
            } catch (SQLException e2) {
            }
        }    
        return respuesta;
    }
    public ArrayList <Usuario> BuscarUsuarios(){
       ArrayList <Usuario> usuarios= new ArrayList<>();
        try{
            cn = c.conectar();
            ps = cn.prepareStatement("SELECT * FROM usuario");            
            rs = ps.executeQuery();
            while (rs.next()){
                Usuario u1 = new Usuario();
                u1.setId(rs.getInt(1));
                u1.setNombre(rs.getString(2));
                u1.setDni(rs.getInt(3));
                u1.setEmail(rs.getString(4));
                u1.setNombreUsuario(rs.getString(5));
                u1.setContrasenia(rs.getString(6));
                usuarios.add(u1);
            }            
        } catch (SQLException e) {
        }finally {
            try {                
                if (ps!=null) {ps.close();}
                if (cn!=null) {cn.close();}
                if (rs!=null) {rs.close();}
            } catch (SQLException e2) {
            }
        }    
        return usuarios;
    }
     public boolean modificarUsuario(Usuario p){
        boolean respuesta = false;
        try {              
            cn = c.conectar();
            ps = cn.prepareStatement("UPDATE usuario SET nombre=?,dni=?,email=?,user=?,contraseña=? WHERE idusuario=?");
            ps.setString(1, p.getNombre());
            ps.setInt(2, p.getDni());
            ps.setString(3, p.getEmail());
            ps.setString(4, p.getNombreUsuario());    
            ps.setString(5, p.getContrasenia()); 
            ps.setInt(6, p.getId());
            int res = ps.executeUpdate(); 
            respuesta = res>0;
        } catch (SQLException e) {
        }finally {
            try {                
                if (ps!=null) {ps.close();}
                if (cn!=null) {cn.close();}
            } catch (SQLException e2) {
            }
        }    
        return respuesta;
    }
      public boolean eliminarUsuario(int id){
        boolean respuesta = false;
        try {              
            cn = c.conectar();
            ps = cn.prepareStatement("DELETE FROM usuario WHERE idusuario=?");           
            ps.setInt(1, id);
            int res = ps.executeUpdate(); 
            respuesta = res>0;
        } catch (SQLException e) {
        }finally {
            try {                
                if (ps!=null) {ps.close();}
                if (cn!=null) {cn.close();}
            } catch (SQLException e2) {
            }
        }    
        return respuesta;
    }
       public Usuario BuscarUsuarios_dni(int dni){
        Usuario u1 = new Usuario();
        try{
            cn = c.conectar();
            ps = cn.prepareStatement("SELECT * FROM usuario WHERE dni=?");       
            ps.setInt(1, dni);
            rs = ps.executeQuery();   
           
            while (rs.next()){
                u1.setId(rs.getInt(1));
                u1.setNombre(rs.getString(2));
                u1.setDni(rs.getInt(3));
                u1.setEmail(rs.getString(4));
                u1.setNombreUsuario(rs.getString(5));
                u1.setContrasenia(rs.getString(6));
            }            
        } catch (SQLException e) {
        }finally {
            try {                
                if (ps!=null) {ps.close();}
                if (cn!=null) {cn.close();}
                if (rs!=null) {rs.close();}
            } catch (SQLException e2) {
            }
        }    
        return u1;
    }
              public Usuario BuscarUsuarios_id(int id){
        Usuario u1 = new Usuario();
        try{
            cn = c.conectar();
            ps = cn.prepareStatement("SELECT * FROM usuario WHERE idusuario=?"); 
            ps.setInt(1, id);
            rs = ps.executeQuery();
            while (rs.next()){
               
                u1.setId(rs.getInt(1));
                u1.setNombre(rs.getString(2));
                u1.setDni(rs.getInt(3));
                u1.setEmail(rs.getString(4));
                u1.setNombreUsuario(rs.getString(5));
                u1.setContrasenia(rs.getString(6));
            }            
        } catch (SQLException e) {
        }finally {
            try {                
                if (ps!=null) {ps.close();}
                if (cn!=null) {cn.close();}
                if (rs!=null) {rs.close();}
            } catch (SQLException e2) {
            }
        }    
        return u1;
    }
                  public ArrayList <Usuario> BuscarUsuarios_nombre(String nombre){
       ArrayList <Usuario> usuarios= new ArrayList<>();
        try{
            cn = c.conectar();
            ps = cn.prepareStatement("SELECT * FROM usuario WHERE nombre=?");
            ps.setString(1, nombre);
            rs = ps.executeQuery();
            while (rs.next()){
                Usuario u1 = new Usuario();
                u1.setId(rs.getInt(1));
                u1.setNombre(rs.getString(2));
                u1.setDni(rs.getInt(3));
                u1.setEmail(rs.getString(4));
                u1.setNombreUsuario(rs.getString(5));
                u1.setContrasenia(rs.getString(6));
                usuarios.add(u1);
            }            
        } catch (SQLException e) {
        }finally {
            try {                
                if (ps!=null) {ps.close();}
                if (cn!=null) {cn.close();}
                if (rs!=null) {rs.close();}
            } catch (SQLException e2) {
            }
        }    
        return usuarios;
    }
                  public Usuario BuscarUsuario_NombreUsuario(String NombreUsuario){
        Usuario u1 = new Usuario();
        try{
            cn = c.conectar();
            ps = cn.prepareStatement("SELECT * FROM usuario WHERE user=?");  
             ps.setString(1, NombreUsuario);
            rs = ps.executeQuery();
            while (rs.next()){
               
                u1.setId(rs.getInt(1));
                u1.setNombre(rs.getString(2));
                u1.setDni(rs.getInt(3));
                u1.setEmail(rs.getString(4));
                u1.setNombreUsuario(rs.getString(5));
                u1.setContrasenia(rs.getString(6));
               
            }            
        } catch (SQLException e) {
        }finally {
            try {                
                if (ps!=null) {ps.close();}
                if (cn!=null) {cn.close();}
                if (rs!=null) {rs.close();}
            } catch (SQLException e2) {
            }
        }    
        return u1;
}
}
