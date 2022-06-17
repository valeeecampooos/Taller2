
package modelo;

public class inventary {
    
    //atributos de los productos de inventario
    private String nombre;
    private int codigo;
    private int precio;
    private String descripcion;

    //constructor vacio
    public inventary() {
    }
    //contructor editar el producto del inventario

    public inventary(String nombre, int codigo, int precio, String descripcion) {
        this.nombre = nombre;
        this.codigo = codigo;
        this.precio = precio;
        this.descripcion = descripcion;
    }
    
    //constructor ingresar productos al inventario

    public inventary(String nombre, int precio, String descripcion) {
        this.nombre = nombre;
        this.precio = precio;
        this.descripcion = descripcion;
    }

    public inventary(String string) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    
    // get y set

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    @Override
    public String toString() {
        return "inventary{" + "nombre=" + nombre + ", codigo=" + codigo + ", precio=" + precio + ", descripcion=" + descripcion + '}';
    }
    
  
    
    
}
