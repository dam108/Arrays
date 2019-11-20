package arrays;

import java.util.Scanner;
public class EjArrays0707 {
    public static Scanner teclado;
    
    public static void main(String[] args) {
        teclado = new Scanner(System.in);
        float c1 = Float.parseFloat(args[0]) , c2 = Float.parseFloat(args[1]);
        boolean validarInt;
        do {
            
            /*System.out.println("Introduce el cateto 1: ");
            c1 = teclado.nextFloat();*/
            validarInt = checkEnteros(c1);
        } while (!validarInt);

        do {
           /* System.out.println("Introduce el cateto 2: ");
            c2 = teclado.nextFloat();*/
            validarInt = checkEnteros(c2);
        } while (!validarInt);
        
        double hipotenusa = getHipotenusa((int)c1, (int)c2);
        System.out.printf("Hipotenusa = %.2f \n", hipotenusa);
        
    }   // fin main
    
    /* FUNCIONES */

    public static double getHipotenusa(int c1,int c2){
        
        double  h = (c1*c1) + (c2*c2);
        return Math.sqrt(h);
    }
    
    public static boolean checkEnteros(float n1){
        if ( n1 % 1 == 0 && n1 > 0 ) return true; 
        else {
            System.out.println("El numero no es entero, mete un nuemero entero.");
            return false;
        } 
    }

    /* FIN FUNCIONES */
    
}       // fin class
