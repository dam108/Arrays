package arrays;
//import java.util.Scanner;
public class EjArrays0701g {
    public static int[] temperaturaMeses;
    public static void main(String[] args) {
        //Scanner teclado = new Scanner(System.in);
        temperaturaMeses = new int [12];
        int[] arrayInicial = new int [12];
        int primeraPosArray = 0;
        int ultimaPosArray = 0;


        
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
        
        System.out.println("Estes son los numeros movidos una posicion a la izquierda , pasando el primero al ultimo lugar :");
        
        // guardamos el array en otro variable para trabajar con ella
        for (int i = 0; i < temperaturaMeses.length; i++) {
            // si la iteracion es la primera guardamos en una variable el entero que contiene
            if( i + 1 < temperaturaMeses.length ) arrayInicial[i] = temperaturaMeses[i + 1];
        }
        // pasarmos el ultimo para el primero  y el primero para el segundo
        arrayInicial[arrayInicial.length - 1] = temperaturaMeses[0];
        

        // imprimimos el segundo array ya con las posiciones desplazadas hacia la izquierda
        for (int i = 0; i < temperaturaMeses.length; i++) {
            if (i == temperaturaMeses.length - 1)System.out.println(arrayInicial[i]);
            else System.out.print(arrayInicial[i]+" ,");
            
        }
        

 
        
        System.out.println("");
    } // fin main
}     // fin class
