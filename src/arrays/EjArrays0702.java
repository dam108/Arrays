package arrays;
//import java.util.Scanner;
public class EjArrays0702 {
    public static void main(String[] args) {
        
        Primitiva Primitva = new Primitiva();
        int [] resultadoSorteo = new int[6];
        resultadoSorteo = Primitva.getResultadoSorteo();
        
        for (int i = 0; i < resultadoSorteo.length ; i++) {
            System.out.println(resultadoSorteo[i]);
        }
        
        
        
        
    }   // fin main
}       // fin class
