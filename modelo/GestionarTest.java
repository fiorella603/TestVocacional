package modelo;

import conexion.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class GestionarTest {
    
    private Conexion c;
    private PreparedStatement ps;
    private Connection cn;
    private ResultSet rs;

    public GestionarTest() {
        this.c = new Conexion();        
        this.ps = null;        
        this.cn = null;
        this.rs = null;
    }
    
    public boolean insertarTest(Test1 t){
        boolean respuesta = false;
        try {              
            cn = c.conectar();
            ps = cn.prepareStatement("INSERT INTO test (nombre, descripcion) VALUES (?,?)");
            ps.setString(1, t.getNombre());
            ps.setString(2, t.getDescripcion());           
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
    
    public ArrayList<Test1> BuscarColeccionTest(){
        ArrayList<Test1> test=new ArrayList<>();
        try {
            cn = c.conectar();
            ps = cn.prepareStatement("SELECT * FROM ");            
            rs = ps.executeQuery();
            while (rs.next()) {
                Test1 t1 = new Test1();
                t1.setId(rs.getInt(1));
                t1.setNombre(rs.getString(2));
                t1.setDescripcion(rs.getString(3));
                test.add(t1);
            }            
        } catch (SQLException e) {
        } finally {
            try {                
                if (ps != null) { ps.close(); }
                if (cn != null) { cn.close(); }
                if (rs != null) { rs.close(); }
            } catch (SQLException e2) {
            }
        }    
        return test;
    }
    
        public ArrayList<Test1> BuscarTestNombre(String nombre){
        ArrayList<Test1> test=new ArrayList<>();
        try {
            cn = c.conectar();
            ps = cn.prepareStatement("SELECT * FROM test WHERE nombre=?");
            ps.setString(1, nombre);
            rs = ps.executeQuery();
            while (rs.next()) {
                Test1 t1 = new Test1();
                t1.setId(rs.getInt(1));
                t1.setNombre(rs.getString(2));
                t1.setDescripcion(rs.getString(3));
                test.add(t1);
            }            
        } catch (SQLException e) {
        } finally {
            try {                
                if (ps != null) { ps.close(); }
                if (cn != null) { cn.close(); }
                if (rs != null) { rs.close(); }
            } catch (SQLException e2) {
            }
        }    
        return test;
    }
        
        public Test1 BuscarTestId(int id){
            Test1 t1 = new Test1();
        try {
            cn = c.conectar();
            ps = cn.prepareStatement("SELECT * FROM test WHERE idtest=?");
            ps.setInt(1, id);
            rs = ps.executeQuery();
            while (rs.next()) {
                t1.setId(rs.getInt(1));
                t1.setNombre(rs.getString(2));
                t1.setDescripcion(rs.getString(3));
            }            
        } catch (SQLException e) {
        } finally {
            try {                
                if (ps != null) { ps.close(); }
                if (cn != null) { cn.close(); }
                if (rs != null) { rs.close(); }
            } catch (SQLException e2) {
            }
        }
        return t1;
    }
    
    public boolean modificarTest(Test1 t){
        boolean respuesta = false;
        try {              
            cn = c.conectar();
            ps = cn.prepareStatement("UPDATE test SET nombre=?, descripcion=? WHERE idtest=?");
            ps.setString(1, t.getNombre());
            ps.setString(2, t.getDescripcion());
            ps.setInt(3, t.getId());            
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
    
    public boolean eliminarTest(int id){
        boolean respuesta = false;
        try {              
            cn = c.conectar();
            ps = cn.prepareStatement("DELETE FROM test WHERE idtest=?");           
            ps.setInt(1, id);
            int res = ps.executeUpdate(); 
            respuesta = res > 0;
        } catch (SQLException e) {
            System.out.println("Error al eliminar: " + e);
        } finally {
            try {                
                if (ps != null) { ps.close(); }
                if (cn != null) { cn.close(); }
            } catch (SQLException e2) {
            }
        }
        return respuesta;
    }
}