package arrays;
import java.time.*;
import java.util.Locale;
import java.time.format.TextStyle;
//import java.util.Scanner;
public class EjArrays0701b {
    public static int[] temperaturaMeses;
    public static void main(String[] args) {
        //Scanner teclado = new Scanner(System.in);
        temperaturaMeses = new int [12];
        
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
        //  imprimimos todos los numeros del array con las tres primeras letras de los nombres de los meses
        for (int i = 0; i < temperaturaMeses.length; i++) {
            // sacamos el mes en cada iteracion
            Month mes = Month.of(i+1);
            // usamos la notacion española
            Locale pais = new Locale("es", "ES");
            // imprimimos solo las tres primeras letras de cada mes y luego el contenido del array en cada iteracion
            System.out.println( mes.getDisplayName(TextStyle.SHORT, pais)+": "+ temperaturaMeses[i] );

        }
        System.out.println("");
    } // fin main
}     // fin class
