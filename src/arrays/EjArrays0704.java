package arrays;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class EjArrays0704 {
    public static Scanner teclado = new Scanner(System.in);
    public static Parking2 parking = new Parking2();
    public static void main(String[] args) {
        int opcion;
        do {
            
            opcion = pedirOpcion();
            ejecutarOpcion(opcion);

        }while (opcion != 0 );
 
    }   // fin main
    
    public static int pedirOpcion(){
        System.out.println("-------------------------------------------------------");
        System.out.println("MENU PARKING");
        System.out.println("-------------------------------------------------------");
        System.out.println("1.- Aparcar:");
        System.out.println("2.- Consultar las matriculas de los coches aparcados");
        System.out.println("3.- Desaparcar");
        System.out.println("4.- Saber la cantidad de plazas libres");
        System.out.println("0.- Salir: ");
        System.out.println("-------------------------------------------------------");
        int opcion = teclado.nextInt();
        teclado.nextLine();
        return opcion;
        
    }
    
    public static void ejecutarOpcion(int opcion){
        
        switch(opcion){
            case 1:
                System.out.println("Introduce la matricula: ");
                String matricula = teclado.nextLine();
                boolean plaza = parking.aparcar(matricula);
                if (!plaza)System.out.println("El parking esta lleno\n");
                else System.out.println("Se a aparcado tu coche con exito.\n");
                break;
             case 2:
                if (parking.plazasOcupadas() == 0) System.out.println("No hay coches en el parking");
                else estadoParking();
                break;
            case 3:
                int posicion = parking.getPlazasLibres();
                if (posicion < 20){
                    System.out.println("Vamos a sacar el ultimo coche que entro al garaje");
                    double precioCentimos = parking.getPrecioParking(posicion);
                    if( precioCentimos == 3000) retirarCobrar(posicion, precioCentimos);
                    else retirarCobrar(posicion, precioCentimos);
                }else System.out.println("No hay ningun coche en el parking.");
                
                break;
            case 4:
                int plazasLibres = parking.getPlazasLibres();
                System.out.println("El parking tiene "+plazasLibres+" plazas libres.\n");
                break;
        }
    }

    public static void estadoParking(){
        String [] matriculas = parking.getArrayParking();
        LocalTime [] horas = parking.getHoraParking();
        for (int i = parking.getPlazas() - 1; i >= 0; i--) {
            int numPlaza = parking.getPlazas() - i;
            String matricula = matriculas[i];
            LocalTime hora = horas[i];
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("kk:mm:ss");
            
            if ( !matriculas[i].equals("") ) {
                System.out.printf("La plaza %d esta ocupada por el coche %s", numPlaza, matricula );
                System.out.println(" que entro en el parking a la hora: "+hora.format(formatter));
            }
        }
        System.out.println("\n");
    }
    
    public static void retirarCobrar(int posicion, double precio){
        String matriculaRetirar = parking.desaparcar();
            double precioParking = precio / 100;
                System.out.printf("Se ha retirado el coche con la matricula: %s, el precio de la estancia es de: %.2f €\n", matriculaRetirar, precioParking);
    }
}       // fin class
