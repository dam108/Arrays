package arrays;
//import java.time.*;
//import java.util.Locale;
//import java.time.format.TextStyle;
//import java.util.Scanner;
public class EjArrays0701c {
    public static int[] temperaturaMeses;
    public static void main(String[] args) {
        //Scanner teclado = new Scanner(System.in);
        temperaturaMeses = new int [12];
        float sumaTemperaturas = 0;
        float media;
        
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
 
             sumaTemperaturas += temperaturaMeses[1];

        }
        
        media= sumaTemperaturas / (temperaturaMeses.length - 1);
       
        if (media < 0){
            System.out.printf("La temperatura media del año es: %.1f", media);
        } else System.out.printf("La temperatura media del año es: +%.1f", media);
        
        System.out.println("");
    
    } // fin main
}     // fin class
