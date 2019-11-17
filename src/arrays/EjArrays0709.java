package arrays;

import java.util.Scanner;
public class EjArrays0709 {
    public static Scanner teclado;
    public static void main(String[] args) {
        int [] alumnos = new int [30];
        teclado = new Scanner(System.in);
        int totalMayoresEdad = crearAlumnos(alumnos);
        getMayoresEdad(alumnos, totalMayoresEdad);

    }   // fin main
    
    /* FUNCIONES */
    
    public static int crearAlumnos(int [] alumnos){
        int totalMayoresEdad = 0;
        System.out.println("------------------------------------------");
        System.out.print("Edades de los alumnos : \n");
        for (int i = 0; i <alumnos.length ; i++) {
            alumnos[i] = (int)(Math.random() * 11) + 15;
            if (alumnos[i] > 17) totalMayoresEdad++;
            if (i + 1 == alumnos.length) System.out.print(alumnos[i]+".\n");
            else System.out.print(alumnos[i]+", ");
        }
        System.out.println("------------------------------------------");
        System.out.println("Total mayores de edad: "+totalMayoresEdad);
        System.out.println("------------------------------------------");
        
        return totalMayoresEdad;
    }
    
    public static void getMayoresEdad(int [] alumnos, int longitud){
        
        int mayoresEdad[] = new int[alumnos.length]; 
        System.out.print("Edades de los mayores de edad: \n");
        
        // recorremos el array y nos quedamos con las edades de los mayores de edad y los que son menores cambiamos esa edad y la ponemos en 0
        for (int i = 0; i < alumnos.length; i++) {
            if(alumnos[i] >= 18) {
                mayoresEdad[i] = alumnos[i];
            } else mayoresEdad[i] = 0;
        }
        
        //ordenamos los mayores de edad en las primeras posiciones del array
        int posMin;
        for (int i = 0; i < mayoresEdad.length; i++) {
            posMin = i;
            for (int j = 0; j < mayoresEdad.length; j++) {
                if (mayoresEdad[j] < mayoresEdad[posMin]){
                    posMin = j;
                }
            }
            int aux = mayoresEdad[i];
            mayoresEdad[i] = mayoresEdad[posMin];
            mayoresEdad[posMin] = aux;
         }
        
        // imprimimos solo los mayores de edad
        for (int i = 0; i < longitud; i++) {
            if (i+1 == longitud) System.out.print(mayoresEdad[i]+".\n");
            else System.out.print(mayoresEdad[i]+", ");
        }
        System.out.println("------------------------------------------");
    }
        
    /* FIN FUNCIONES */
    
}       // fin class
