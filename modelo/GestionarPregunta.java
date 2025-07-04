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

/**
 *
 * @author PC24
 */

public class GestionarPregunta {
      
    private Conexion c;
    private PreparedStatement ps;
    private Connection cn;
    private ResultSet rs;
    

    public GestionarPregunta() {
        this.c = new Conexion();        
        this.ps = null;        
        this.cn = null;
        this.rs = null;
    }
    
     public boolean insertarPregunta(Pregunta p){
        boolean respuesta = false;
        try {              
            cn = c.conectar();
            ps = cn.prepareStatement("INSERT INTO pregunta (pregunta,respuesta,valor, idTema) VALUES (?,?,?,?)");
            ps.setString(1, p.getPregunta());
            
            if (respuesta == false ){
               ps.setInt(2, 0);
            } else{
                ps.setInt(2, 1);
            }
            ps.setInt(3, p.getValor());
            ps.setInt(4,p.getIdtema());           
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
    
       public ArrayList<Pregunta> BuscarColeccionPregunta(){
        ArrayList<Pregunta> pregunta=new ArrayList<>();
        try{
           cn = c.conectar();
            ps = cn.prepareStatement("SELECT * FROM pregunta");            
            rs = ps.executeQuery();
          
            
            while (rs.next()){
                Pregunta p1 = new Pregunta();
                p1.setId(rs.getInt(1));
                p1.setPregunta(rs.getString(2));
              if (rs.getInt(3)== 1 ){
               p1.setRespuesta(true);
            } else{
                p1.setRespuesta(false);
            }
                p1.setValor(rs.getInt(4));
                p1.setIdtema(rs.getInt(5));
                pregunta.add (p1);
               
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
        return pregunta;
    }   
         public boolean modificarPregunta(Pregunta p){
        boolean respuesta = false;

        try {              
            cn = c.conectar();
            ps = cn.prepareStatement("UPDATE pregunta SET pregunta=?,respuesta=?,valor=? WHERE idpregunta=?");
            ps.setString(1, p.getPregunta());
            if (p.getRespuesta()){
                System.out.println("");
            ps.setInt(2,1);
            }
           else
           { 
                  System.out.println("");
 
                ps.setInt(2,0);
           }
            ps.setInt(3, p.getValor());  
            ps.setInt(4, p.getId());  
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


       
           
     public boolean eliminarPregunta(int id){
        boolean respuesta = false;
        try {              
            cn = c.conectar();
            ps = cn.prepareStatement("DELETE FROM pregunta WHERE idpregunta=?");           
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
  
}
