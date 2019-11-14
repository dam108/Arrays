package arrays;
import java.util.Scanner;

public class EjArrays0703a {
    public static Scanner teclado = new Scanner(System.in);
    public static Parking parking = new Parking();
    public static void main(String[] args) {
        int opcion;
        do {
            
            opcion = pedirOpcion();
            ejecutarOpcion(opcion);

        }while (opcion != 0 );
 
    }   // fin main
    
    public static int pedirOpcion(){
        System.out.println("Pulsa 1 para aparcar:");
        System.out.println("Pulsa 2 para consultar las matriculas de los coches aparcados");
        System.out.println("Pulsa 3 para desaparcar");
        System.out.println("Pulsa 4 para saber la cantidad de plazas libres");
        System.out.println("Pulsa 0 para salir: ");
        int opcion = teclado.nextInt();
        return opcion;
        
    }
    public static void ejecutarOpcion(int opcion){
        
        switch(opcion){
            case 1:
                System.out.println("Introduce la matricula: ");
                int matricula = teclado.nextInt();
                int plaza = parking.aparcar(matricula);
                if (plaza == 0)System.out.println("El parking esta lleno\n\n\n");
                else {
                    System.out.println("Se a aparcado tu coche con exito.\n\n\n");
                    /* imprimimos las plazas ocupadas con las matriculas
                    System.out.println("Estado del parking: ");
                    estadoParking();*/
                }
                break;
                
            case 2:
                estadoParking();
                break;
            case 3:
                System.out.println("Vamos a sacar el ultimo coche que entro al garaje");
                int matriculaRetirar = parking.desaparcar();
                if (matriculaRetirar != 0) System.out.println("Se ha retirado el coche con la matricula: "+matriculaRetirar+"\n\n\n");
                else System.out.println("No hay ningun coche en el parking\n\n\n");
                break;
            case 4:
                int plazasLibres = parking.getPlazasLibres();
                System.out.println("El parking tiene "+plazasLibres+" plazas libres.\n\n\n");
                break;
        }
    }
    
    public static void estadoParking(){
        int [] matriculas = parking.getArrayParking();
        for (int i = parking.getPlazas() -1; i >= 0; i--) {
            int numPlaza = i + 1;
            int matricula = matriculas[i];
            if ( matriculas[i] !=0) System.out.printf("La plaza %d esta ocupada por el coche %d.\n", numPlaza, matricula );
            else System.out.printf("La plaza %d no esta ocupada por ningun coche.\n", numPlaza);
        }
        System.out.println("\n\n\n");
    }
    
    
    
}       // fin class
