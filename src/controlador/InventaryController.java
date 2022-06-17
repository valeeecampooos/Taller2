
package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;
import java.util.Scanner;
import modelo.inventary;
import modelo.inventaryDAO;



public class InventaryController implements ActionListener {
    
    public void create() {
        inventaryDAO vd = new inventaryDAO();
        inventary v = new inventary("");
        
        if  (vd.insertarDatos(v.getNombre(), v.getCodigo(), v.getPrecio(), v.getDescripcion())){
            System.out.println("Ingreso exitoso");
        
        }else {
            System.out.println("No se pudo ingresar");
        
        }
    
    
    }
    
    
    public void read (){
        inventaryDAO vd = new inventaryDAO();
        List inventary = vd.listar();
        for (int i = 0; i < inventary.size(); i++){
            System.out.println(inventary.get(i).toString());
        }
    
    }
    
        
    public void update(){
        inventaryDAO vd = new inventaryDAO();
        Scanner intro = new Scanner(System.in);
        
        System.out.println("Ingrese el código que busca");
        String codigoActual = intro.next();
        
        System.out.println("Ingrese un nuevo codigo");
        String nuevoCodigo = intro.next();
        
        System.out.println("Ingrese un nuevo nombre");
        String nuevoNombre = intro.next();
        
        System.out.println("Ingrese un nuevo precio");
        String nuevoPrecio = intro.next();
        
        System.out.println("Ingrese una nueva descripcion");
        String nuevaDescripcion = intro.next();
        
        
        if (vd.actualizarDatos(nuevoCodigo, nuevoNombre, nuevoPrecio, nuevaDescripcion, codigoActual)){
            System.out.println("Actualizado");
        } else {
            System.out.println("Error");
        }
    
    
    
    }
    
    
    public void delete() {
        inventaryDAO vd  = new inventaryDAO();
        
        if (vd.eliminarDatos("")){
            System.out.println("Eliminado");
        }else {
            System.out.println("No se pudo eliminar");
        
        }
        
  
    }
      private void insertarProducto(){
       try{
           if(validarDatos()){
               if(cargarDatos()){
                   Producto producto = new Producto(nombre, precio, descripcion);
                   inventariodao.insertarDatos(producto);
                   JOptionPanel.showMessageDialog(null, "Registro exitoso"); 
                   limpiarCampos();
               }  
           }
       }catch(Exception e) {
           System.out.println("Error Insertar: "+e);
       }finally{
           listarTabla();//vuelve a listar tabla
       }
   
}
   
    @Override
    public void actionPerformed(ActionEvent e) {
        String comando = e.getActionCommand();
        if (comando == "create"){
            create();
        } else if (comando == "read"){
            read();
        } else if (comando == "update"){
            update();
        } else if (comando == "delete"){
            delete();
        }
        
    }
    
    
    
    
}
