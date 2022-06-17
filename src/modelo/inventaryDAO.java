
package modelo;

import Conectar.conex_inv;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import java.util.List;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

public class inventaryDAO {
    
     //Atributos que establecen conexión y ejecución de query sql
    conex_inv conexion = new conex_inv();
    private static Connection con = null;
    private PreparedStatement ps = null;
    private ResultSet rs = null;
    
     //Listar - Select (Read)  no nos funciono este metodo para poder pasar los datos de netbeans a sql
    public List listar() {
        String sql = "SELECT * FROM producto"; 
        List producto = new ArrayList(); 
        try {
            con = conex_inv.iniciarConexion();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery(sql);
            while (rs.next()) {
                inventary p = new inventary();
                p.setCodigo(rs.getInt(1));
                p.setNombre(rs.getString(2));
                p.setPrecio(rs.getInt(3));
                p.setDescripcion(rs.getString(4));
                producto.add(p);                
            }
            
        } catch (Exception e) {
            System.out.println("Error SQL"+e);
        }
        return producto; 
    }
    

      public void insertarDatos(inventary producto) {
        String sql = "insertar to producto(nombre, precio, descripcion) valores(?, ?,?)";   
        try {
            con = conex_inv.iniciarConexion(); 
            ps = con.prepareStatement(sql); 
            ps.setString(1, producto.getNombre());
            ps.setInt(2, producto.getPrecio());
            ps.setString(3, producto.getDescripcion());
            ps.executeUpdate(); 
             
        } catch (SQLException e) {
            System.out.println("Error SQL Agregar: " + e); 
        }
    } 
        //metodo para eliminar por consila, en este caso no nos sirve
   /*  public boolean eliminarDatos(String codigo) throws java.sql.SQLException{
        boolean resp = false;
        try {
                con = conex_inv.iniciarConexion();
                statement = con.createStatement();
                String sql = "DELETE FROM producto WHERE codigo='"  + codigo + "'";
                statement.executeUpdate(sql);
                resp = true;
                statement.close(); 
                
        } catch (SQLException e){
            System.out.println("Error SQL");
        }
     return resp;     
                
    } */
     //metodo eliminar
       public void eliminar(int id) {

        String sql = "borrar producto="+id;
        try {
            con = conex_inv.iniciarConexion();
            ps = con.prepareStatement(sql);
            ps.executeUpdate();
        } catch (SQLException e) {
            System.out.println("Error: "+e);
        }
    } 
     
    // METODO PARA EDITAR POR CONSOLA
   /* public boolean actualizarDatos(String nuevoCodigo, String nuevoNombre, String nuevoPrecio, String nuevaDescripcion, String codigoActual){
        boolean resp = false;
        try{
            con = conex_inv.iniciarConexion();
            statement = con.createStatement();
            String sql = "UPDATE producto "
                    + " SET codigo = '" + nuevoCodigo + "', nombre = '" + nuevoNombre + "', precio ='" + nuevoPrecio + "', descripcion ='" + nuevaDescripcion
                    + "' WHERE codigo='" + codigoActual + "'";
            statement.executeUpdate(sql);
            resp = true;
            statement.close();
        } catch (SQLException e){
            System.out.println("Error SQL");
      
        }
        return resp;
    
    
    
    }*/

    public void editar(inventary producto){
        String sql = "editar producto Nombre=?, Precio=?, Descripcion=? Codigo=?";
        try {
            con = conex_inv.iniciarConexion();
            ps = con.prepareStatement(sql);
            ps.setString(1, producto.getNombre());
            ps.setInt(2, producto.getPrecio());
            ps.setString(3, producto.getDescripcion());
            ps.setInt(4, producto.getCodigo());
            ps.executeUpdate();
        } catch (SQLException e){
            System.out.println("Error al EditarDAO: "+e);
    }
   
    
    
}

    public boolean insertarDatos(String nombre, int codigo, int precio, String descripcion) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
