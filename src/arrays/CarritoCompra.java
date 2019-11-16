package arrays;

public class CarritoCompra {
    private int ocupadas = 0;
    private Producto [] producto;
    
    /*CONSTRUCTOR*/
    CarritoCompra (){
        // creamos el carrito con un array de 100 posiciones
       producto = new Producto[100];
        // en cada posicion del carrito creamos un producto vacio
        for (int i = 0; i < producto.length; i++) {
            // DEBUG producto[i] = new Producto(i+1, " "+(i+1)+" ", i+1, i+1);
            producto[i] = new Producto();
        }
       
    } // fin constructor
    
    /*METODOS*/
    
    public Producto[] getEstadoCarrito(){
        return this.producto;
    }
    
    public void ordenar(){
    
        // ordenar productos en orden ascendente por precio unitario ( primero baratos ultimo caros)
        // delcaramos la variable en la que se va a guardar la posicion del minimo
        int posMin;
        // recorremos el array prodcuto
        for (int i = 0; i < producto.length - 1; i++) {
            // en cada vuelta guardamos la posicion
            posMin = i;
            // en cada vuelta comprobamos si nuestro precio el mayor y si lo es lo cambiamos por el precio de la posiicon en la que estamos
            for (int j = i +1; j < producto.length; j++) {
                if ( producto[j].getPrecioUnidad() < producto[posMin].getPrecioUnidad() ) posMin = j;
            }
            // intercambio del acutal i con el menos
            Producto aux = producto[i];
            producto[i] = producto[posMin];
            producto[posMin] = aux;
        }
    }
    
    public boolean agregarProducto(int cod, String des, float precioU, int cant){
        int pos = posicionesOcupadas();
        if (pos == 100) return false;
        else {
            producto[pos] = new Producto (cod, des, precioU, cant);
            ordenar();
            return true;
        }
    }
    
    public boolean eleminarProducto( int cod){
        for (int i = 0; i < producto.length; i++) {
          if (producto[i].getCodigoProducto() == cod){
              producto[i] = new Producto();
              ordenar();
              return true;
          }  
        }
        return false;
    }
    
    public boolean modificarCantidad(int cod, int cant){
        for (int i = 0; i < producto.length; i++) {
          if (producto[i].getCodigoProducto() == cod){
              producto[i].setCantidad(cant);
              producto[i].setPrecioTotal(producto[i].getCantidad() * producto[i].getPrecioUnidad());
              return true;
          }  
        }
        return false;
    }
    
    public void vaciarCarrito(){
        for (int i = 0; i <  producto.length; i++) {
            producto[i] = new Producto();
        }
    }
    
    public int posicionesOcupadas(){
        for (int i = 0; i < producto.length; i++) {
            int codigo = producto[i].getCodigoProducto();
            if ( codigo != 0 ) ocupadas++;
        }
        int n = ocupadas;
        ocupadas = 0;
        return n;
    }
    
    /* GETTERS AND SETTERS */
    
    public int getCodigoProducto(int pos) {
        return producto[pos].getCodigoProducto();
    }

    public String getDescripcion(int pos) {
        return producto[pos].getDescripcion();
    }

    public float getPrecioUnidad(int pos) {
        return producto[pos].getPrecioUnidad();
    }

    public int getCantidad(int pos) {
        return producto[pos].getCantidad();
    }

    public float getPrecioTotal(int pos) {
        return producto[pos].getPrecioTotal();
    }

} // fin class
