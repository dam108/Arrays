package arrays;

import java.util.Scanner;
public class EjArrays0706 {
    public static TemperaturaDia temperaturaDia= new TemperaturaDia();
    public static Scanner teclado;
    public static int [][] temperaturas;
    
    public static void main(String[] args) {
        teclado = new Scanner(System.in);
        temperaturas = new int[12][31];
        temperaturas = temperaturaDia.getTemperaturas();
        
        getInfo();
        
    }   // fin main
    
    /* FUNCIONES */
    
    public static void getInfo(){
        System.out.println("-----------------------------------------------------------------------");
        System.out.println("La temperatura media del año es: "+ temperaturaDia.tempMediaYear()+" º.");
        System.out.println("-----------------------------------------------------------------------");
        System.out.println("-----------------------------------------------------------------------");
        System.out.println("El día mas caluroso del año es: "+ temperaturaDia.getDiaCaluroso()+" º.");
        System.out.println("-----------------------------------------------------------------------");
        System.out.println("-----------------------------------------------------------------------");
        if (temperaturaDia.get30Grados()) System.out.println("Hay un dia que pasa de 30 grados.");
        else System.out.println("No hay ningun dia que pase de 30 grados.");
        System.out.println("-----------------------------------------------------------------------");     
        
        for (int i = 0; i < temperaturas.length; i++) {
            System.out.println("-----------------------------------------------------------------------");
            System.out.println("Mes "+(i+1)+": ");
            System.out.println("La temperatura Media de este mes es: "+temperaturaDia.totalMediaMes(i)+"º.");
           System.out.println("-----------------------------------------------------------------------");
            for (int j = 0; j < temperaturas[i].length; j++) {
                if (j == 30) {
                    System.out.print(temperaturas[i][j]+".\n");
                    System.out.println("-----------------------------------------------------------------------");
                }
                else System.out.print(temperaturas[i][j]+", ");
            }
        }
    }
    
    /* FIN FUNCIONES */
    
}       // fin class
