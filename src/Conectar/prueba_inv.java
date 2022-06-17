
package Conectar;

//import conexionBD.Conexion;
import java.sql.Connection;
import javax.swing.JOptionPane;


public class prueba_inv {
    
     public static void main(String[] args) {
        Connection con;
        con = conex_inv.iniciarConexion();
        if (con != null){
            JOptionPane.showMessageDialog(null, "CONEXION EXITOSA");
            }else{
                 JOptionPane.showMessageDialog(null, "ERROR EN LA CONEXION");
        }
    }
}
