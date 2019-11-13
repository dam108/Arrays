package arrays;
//import java.util.Scanner;

import java.time.Month;
import java.time.format.TextStyle;
import java.util.Locale;

public class EjArrays0701i {
    public static int[] temperaturaMeses;
    public static void main(String[] args) {
        //Scanner teclado = new Scanner(System.in);
        temperaturaMeses = new int [12];
        int numerMesCaluroso;
        String mesMostrar;
        int ocurrencias = 0;
        
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
        
        // calculamos el numero que mas se repite
        // recorremos el array y en cada posicion recorremos el array denuevo comrobando si se repite
        int mayor = mayorOcurrencia(temperaturaMeses);
        System.out.println("La temperatura que mas se repite es: "+mayor);
            
        

        System.out.println("");
    } // fin main
    public static int mayorOcurrencia(int[]a){
        int mayor = a[0];
        for(int i=1; i<a.length; i++){
            if(ocurrencias(mayor,a)<ocurrencias(a[i],a))
            mayor = a[i];
        }
        return mayor;
}
 
    public static int ocurrencias(int n, int[]arr){
            int cuantos = 0;//contador, neutro del +
            for(int i=0; i<arr.length; i++){
                 if(n==arr[i])   //si n es igual al elemento i
                    cuantos++;    //el contador icrementa en 1.
            }
            return cuantos;//devuelve al contador.
    }

}     // fin class
