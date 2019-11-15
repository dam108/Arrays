package arrays;
//import java.util.Scanner;
public class EjArrays0702 {
    public static void main(String[] args) {
        
        Primitiva primitva = new Primitiva();
        int [] resultadoSorteo = new int[6];

        
        resultadoSorteo = primitva.getResultadoSorteo();

        
        for (int i = 0; i < resultadoSorteo.length ; i++) {
            System.out.println(resultadoSorteo[i]);
        }

        
        
        
    }   // fin main
}       // fin class
