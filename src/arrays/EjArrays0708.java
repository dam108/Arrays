package arrays;

import java.util.Scanner;
public class EjArrays0708 {
    public static Scanner teclado;
    public static AgendaTelefonica [] agenda = new AgendaTelefonica [9];
    public static void main(String[] args) {
        boolean buscar;
        teclado = new Scanner(System.in);
        
        agenda[0] = new AgendaTelefonica("Marta", 611111111 );
        agenda[1] = new AgendaTelefonica("Miguel", 622222222 );
        agenda[2] = new AgendaTelefonica("Ana", 633333333 );
        agenda[3] = new AgendaTelefonica("Daniel", 644444444);
        agenda[4] = new AgendaTelefonica("Pedro", 655555555 );
        agenda[5] = new AgendaTelefonica("Juan", 666666666 );
        agenda[6] = new AgendaTelefonica("Hector", 677777777 );
        agenda[7] = new AgendaTelefonica("Jose", 688888888);
        agenda[8] = new AgendaTelefonica("Daniel", 699999999 );
    
        do {
            /*System.out.println("Introduce un nombre: ");
            String nombre = teclado.nextLine();*/
            buscar = buscarNombre(args[0]);
        } while(!buscar);
        
        
        
    }   // fin main
    
    /* FUNCIONES */
    
    public static boolean buscarNombre(String n){
        for (int i = 0; i < agenda.length; i++) {
            String nombreTelefono = agenda[i].getNombre();
            if ( n.equals(nombreTelefono)){
                System.out.println("-------------------");
                System.out.println( agenda[i].getNombre() +" | "+ agenda[i].getTelefono() );
                System.out.println("-------------------");
                return true;
            } 
        }
        System.out.println("El nombre no esta en la agenda.");
        return false;
    }
        
    /* FIN FUNCIONES */
    
}       // fin class
