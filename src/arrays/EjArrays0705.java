package arrays;

import java.util.Scanner;
public class EjArrays0705 {
    public static CarritoCompra carrito;
    public static Scanner teclado;
    public static void main(String[] args) {
        teclado = new Scanner(System.in);
        carrito = new CarritoCompra();
        
        menuCarrito();

    }   // fin main
    
    /* FUNCIONES */
    
    public static void menuCarrito(){
        int opcion;
        do {
            
            System.out.println("-----------------------------");
            System.out.println(" MENU SUPERMERCADO ");
            System.out.println("-----------------------------");
            System.out.println("1.- Comprar un producto.");
            System.out.println("2.- Mostrar el carrito.");
            System.out.println("3.- Vaciar  el carrito.");
            System.out.println("4.- Eleminar un producto.");
            System.out.println("5.- Modificar la cantidad de Unidades de un producto.");
            System.out.println("0.- Salir");
            opcion = teclado.nextInt();
            ejecutarOpcion(opcion);
            
        } while(opcion !=0);
        
    }
    
    public static void ejecutarOpcion( int n){
        switch(n){
            case 1: // agregamos producto al carrito
                agregarProductoCarrito();break;
            case 2: 
                // ver producto todos los productos 
                imprimirCarrito();break;
            case 3:
                // vaciamos el carrito entero
                carrito.vaciarCarrito();break;
            case 4:
                // Eliminamos un producto
                eleminarProductoCarrito();break;

            case 5: 
                // Modificar producto
                modificarProductoCarrito();break;
        }
    }

    public static void imprimirCarrito(){
        if (carrito.posicionesOcupadas() == 0) System.out.println("El carrito esta vacio");
        else {
            int libres = carrito.getEstadoCarrito().length - carrito.posicionesOcupadas();
            System.out.println("Tu carrito tiene "+libres+" huevos libres.");
            for (int i = 0; i < carrito.getEstadoCarrito().length; i++) {
                int cod = carrito.getCodigoProducto(i);
                if (cod != 0){
                    System.out.print((i+1)+".- ");
                    System.out.print("Código: "+carrito.getCodigoProducto(i)+", ");
                    System.out.print("Descripción: "+carrito.getDescripcion(i)+", ");
                    System.out.print("Precio Unidad: "+carrito.getPrecioUnidad(i)+", ");
                    System.out.print("Cantidad: "+carrito.getCantidad(i)+", ");
                    System.out.print("Precio Total: "+carrito.getPrecioTotal(i)+".\n");
                }
            }
        }
    }
    
    public static void agregarProductoCarrito(){
        System.out.println("Inidca el codigo del producto: ");
        int cod = teclado.nextInt();teclado.nextLine();
        System.out.println("Indica el nombre o descripcion: ");
        String des = teclado.nextLine();
        System.out.println("Indica el precio por unidad: ");
        float precioU = teclado.nextFloat();
        System.out.println("Indica la cantidad que quieres comprar: ");
        int cant = teclado.nextInt();
        // agregamos el producto
        boolean agregar  = carrito.agregarProducto(cod, des, precioU, cant);
        if (agregar) System.out.println("Se ha agregado el producto a tu carrito.");
        else System.out.println("No se ha podido agregar el producto a tu carrito.");    
    }

    public static void eleminarProductoCarrito(){
        System.out.println("Introduce el codigo del producto a eliminar: ");
        int cod = teclado.nextInt();                
        boolean eliminado = carrito.eleminarProducto(cod);
        if(eliminado) System.out.println("El producto con codigo "+cod+" ha sido retirado de la cesta.");
        else System.out.println("No se ha podido eliminar el producto.");
    }
    
    public static void modificarProductoCarrito(){
        System.out.println("Introduce el codigo del producto que deseas modificar la cantidad: ");
        int codCant = teclado.nextInt();
        System.out.println("Introduce la cantidad nueva: ");
        int cant = teclado.nextInt();
        boolean modificarCant = carrito.modificarCantidad(codCant, cant);
        if (modificarCant) System.out.println("La cantidad se ha modificado con exito.");
        else System.out.println("No se ha podido modificar la cantidad.");
    }
    /* FIN FUNCIONES */
    
}       // fin class
