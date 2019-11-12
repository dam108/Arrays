package arrays;
//import java.util.Scanner;
public class EjArrays0701f {
    public static int[] temperaturaMeses;
    public static void main(String[] args) {
        //Scanner teclado = new Scanner(System.in);
        temperaturaMeses = new int [12];
        int[] arrayInicial = new int [12];
        int[] arrayFinal = new int [12];
        int ultimoNum, posicionFinal;
        
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
        System.out.println("Estes son los numeros recien generados :");
        for (int i = 0; i < temperaturaMeses.length; i++) {
            if (i == temperaturaMeses.length - 1)System.out.println(temperaturaMeses[i]);
            else System.out.print(temperaturaMeses[i]+" ,");
        }
        
        System.out.println("Estes son los numeros movidos una posicion a la derecha , pasando el ultimo a primer lugar :");
        
        // guardamos el array en otro variable para trabajar con ella
        for (int i = 0; i < temperaturaMeses.length; i++) {
            arrayInicial[i] = temperaturaMeses[i];
        }

        // guardamos el ultimo numero del array en una variable
        posicionFinal = temperaturaMeses.length - 1;
        ultimoNum = arrayInicial[posicionFinal];
        
        // iteramos desde la penultima posicion de array hasta cero de manera decreciente
        for (int i = posicionFinal - 1; i >=0 ; i--) {
            // desplazamos el entero de la siguiente posicion a la anterior ej: numero que hay el posicion 7 pasa a ocupar la posicion 8
            arrayInicial[i + 1] = arrayInicial[i];
 
        }
        // igualamos la primera posicion del array con la variable que tenia guardado el ultimo numero del array
        arrayInicial[0] = ultimoNum;

        // iteramos el array para imprimir todos los numeros
        for (int i = 0; i < 12; i++) {
            if (i == arrayInicial.length - 1)System.out.println(arrayInicial[i]);
            else System.out.print(arrayInicial[i]+" ,");
        }
        System.out.println("");
    } // fin main
}     // fin class
