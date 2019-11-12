package arrays;
//import java.util.Scanner;
public class EjArrays0701a {
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
        //  imprimimos todos los numeros del array en linea separados por una coma
        for (int i = 0; i < temperaturaMeses.length; i++) {
            if (i == temperaturaMeses.length - 1)System.out.println(temperaturaMeses[i]);
            else System.out.print(temperaturaMeses[i]+" ,");
        }
        System.out.println("");
    } // fin main
}     // fin class
