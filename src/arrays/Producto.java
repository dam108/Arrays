package arrays;

public class Producto {
    private int codigoProducto;
    private String descripcion;
    private float precioUnidad;
    private int cantidad;
    private float precioTotal;
    
    /*CONSTRUCTOR*/
    Producto (){
        
        this.codigoProducto = 0;
        this.descripcion = "";
        // hack momentaneo
        this.precioUnidad = 99999999;
        this.cantidad = 0;
        this.precioTotal = cantidad * precioUnidad;
        
    } 
    
    Producto(int cod, String des, float precioU, int cant){
        
        this.codigoProducto = cod;
        this.descripcion = des;
        this.precioUnidad = precioU;
        this.cantidad = cant;
        this.precioTotal = cantidad * precioUnidad;
        
    }
    
    /* FIN CONSTRUCTORES */

    /*METODOS*/

    /* GETTERS Y SETTERS */
    
    public void setCodigoProducto(int codigoProducto) {
        this.codigoProducto = codigoProducto;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public void setPrecioUnidad(float precioUnidad) {
        this.precioUnidad = precioUnidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public void setPrecioTotal(float precioTotal) {
        this.precioTotal = precioTotal;
    }
    
    public int getCodigoProducto() {
        return codigoProducto;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public float getPrecioUnidad() {
        return precioUnidad;
    }

    public int getCantidad() {
        return cantidad;
    }

    public float getPrecioTotal() {
        return precioTotal;
    }

} // fin class
