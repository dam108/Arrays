package arrays;
//import java.util.Scanner;

import java.time.Month;
import java.time.format.TextStyle;
import java.util.Locale;

public class EjArrays0701h {
    public static int[] temperaturaMeses;
    public static void main(String[] args) {
        //Scanner teclado = new Scanner(System.in);
        temperaturaMeses = new int [12];
        int numerMesCaluroso;
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
        //  imprimimos todos los numeros del array en linea separados por una coma
        System.out.println("Estes son las temperaturas recien generados :");
        for (int i = 0; i < temperaturaMeses.length; i++) {
            if (i == temperaturaMeses.length - 1)System.out.println(temperaturaMeses[i]);
            else System.out.print(temperaturaMeses[i]+" ,");
        }
        
        // buscamos mes con mas de 30º
        numerMesCaluroso =  getMesCaluroso(); 
        Month mes = Month.of(numerMesCaluroso + 1);
        Locale pais = new Locale("es", "ES");
        mesMostrar = mes.getDisplayName(TextStyle.FULL, pais);
        
        System.out.print("El primer mes que su temperatura es mayor que 30º es: ");
        System.out.print(mesMostrar);
        System.out.println("");
       
        

        System.out.println("");
    } // fin main
    
    public static int getMesCaluroso(){
        int num;
        // iteramos el array y cuando encuetra una temperatura mayor que 30º nos devuelve el numero de la posicion de ese mes.
        for (int i = 0; i < temperaturaMeses.length; i++) {
            if (temperaturaMeses[i] > 30 ) {
                num = i;
                return num;
            }
        }
        return 0;
    }
}     // fin class
