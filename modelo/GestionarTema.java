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

/**
 *
 * @author Us
 */
public class GestionarTema {
        
    private Conexion c;
    private PreparedStatement ps;
    private Connection cn;
    private ResultSet rs;

    public GestionarTema() {
        this.c = new Conexion();        
        this.ps = null;        
        this.cn = null;
        this.rs = null;
    }
     public boolean insertarTema(Tema t){
        boolean respuesta = false;
        try {              
            cn = c.conectar();
            ps = cn.prepareStatement("INSERT INTO tema (nombre_tema,idtema) VALUES (?,?)");
            ps.setString(1,t.getNombre());
            ps.setInt(2, t.getIdtest());
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
     
 public Tema buscarTema(int id) {
    Tema tema = new  Tema();
    try {
        cn = c.conectar();
        ps = cn.prepareStatement("SELECT * FROM tema WHERE id_tema = ?");
        ps.setInt(1, id);
        rs = ps.executeQuery();

        if (rs.next()) {
            tema = new Tema();
            tema.setId(rs.getInt(1));
            tema.setNombre(rs.getString(2));
            tema.setIdtest(rs.getInt(3));
        }
    } catch (SQLException e) {
    } finally {
        try {
            if (rs != null) { rs.close(); }
            if (ps != null) { ps.close(); }
            if (cn != null) { cn.close(); }
        } catch (SQLException e2) {
        }
    }
    return tema;
}
 
public boolean modificarTema(Tema t) {
    boolean respuesta = false;
    try {              
        cn = c.conectar();
        ps = cn.prepareStatement("UPDATE tema SET nombre_tema=? WHERE id_tema= ? ");
        ps.setString(1, t.getNombre());
        ps.setInt(2, t.getId());
        int res = ps.executeUpdate(); 
        respuesta = res > 0;
    } catch (SQLException e) {
    } finally {
        try {                
            if (ps != null) { ps.close(); }
            if (cn != null) { cn.close(); }
        } catch (SQLException e2) {
        }
    }    
    return respuesta;
}
 public boolean eliminarTema(int id) {
    boolean respuesta = false;
    try {
        cn = c.conectar();
        ps = cn.prepareStatement("DELETE FROM tema WHERE id_tema = ?");
        ps.setInt(1, id);
        int res = ps.executeUpdate();
        respuesta = res > 0;
    } catch (SQLException e) {
    } finally {
        try {
            if (ps != null) { ps.close(); }
            if (cn != null) { cn.close(); }
        } catch (SQLException e2) {
        }
    }
    return respuesta;
}
public Tema buscarTemaPorNombre(String nombre) {
    Tema tema = new Tema();
    try {
        cn = c.conectar();
        ps = cn.prepareStatement("SELECT * FROM tema WHERE nombre_tema = ?");
        ps.setString(1, nombre);
        rs = ps.executeQuery();

        if (rs.next()) {
            tema = new Tema();
            tema.setId(rs.getInt(1));
            tema.setNombre(rs.getString(2));
            tema.setIdtest(rs.getInt(3));
        }
    } catch (SQLException e) {
        
    } finally {
        try {
            if (rs != null) { rs.close(); }
            if (ps != null) { ps.close(); }
            if (cn != null) { cn.close(); }
        } catch (SQLException e2) {
           
        }
    }
    return tema;
}

}
