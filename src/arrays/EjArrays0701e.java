package arrays;
import java.time.*;
import java.util.Locale;
import java.time.format.TextStyle;
//import java.util.Scanner;
public class EjArrays0701e {
    public static int[] temperaturaMeses;
    public static void main(String[] args) {
        //Scanner teclado = new Scanner(System.in);
        temperaturaMeses = new int [12];
        int minima = 100, tempMin, mesMasFrio = 0;
        String mesMostrar;
        
        // calculamos un numero aleatorio y lo guardamos en una posicion del array 
        for (int i = 0; i < 12; i++) {
            // si es enero , febrero, marzo, noviembre o diciembre el numero aleatorio esta entre -10 y 20
            if (i == 0 || i == 1 || i == 2 || i == 10 || i == 11){
                int n = (int) (Math.random()* 31) - 10;
                temperaturaMeses[i] = n;
            } else { // si no es ninguno de los anteriores meses el numero aleatorio esta entre 10 y 40
                int n = (int) ( Math.random()* 31) + 10 ;
                temperaturaMeses[i] = n;
            }
        }
        
        for (int i = 0; i < temperaturaMeses.length; i++) {
            
            // si ese mes el es mas frio de todos guardamos su numero para luego  sacar su nombre
            if (temperaturaMeses[i] < minima ) mesMasFrio = i;
            
            // en cada iteracion comparamos cual es la temperatura minima y la guardamos 
             tempMin = Math.min(minima, temperaturaMeses[i]);
             minima = tempMin;

        }
        // sacamos el nombre del mes de manera automatica
        Month mes = Month.of(mesMasFrio + 1);
        Locale pais = new Locale("es", "ES");
        mesMostrar = mes.getDisplayName(TextStyle.FULL, pais);
        
        // imprimimos la temperatura minima y su mes
        if (minima < 0){
            System.out.printf("El mes mas frio del año es %s y su temperatura es de : %d", mesMostrar,minima);
        } else System.out.printf("El mes mas frio del año es %s y su temperatura es de : %d", mesMostrar, minima);
        
        
        System.out.println("");
    
    } // fin main
}     // fin class
