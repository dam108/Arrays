package arrays;
import java.util.Scanner;
public class EjArrays07021c {
    public static void main(String[] args) {
        int aciertos = 0;
        long contador = 0;
        
        // creamos el objeto y los arreglos 
        Primitiva primitiva = new Primitiva();
        int [] resultadoSorteo = new int[6];
        int [] boleto = new int[6];
        
        // guardamos en el arreglo los numeros generados desde la clase
        resultadoSorteo = primitiva.getResultadoSorteo();
        
        // generamos boletos hasta que tengamos uno con 6 aciertos
        while (aciertos != 6){
            boleto = primitiva.generarBoleto();
            aciertos = primitiva.numeroAciertos(boleto);
            contador++;
            
        }
        
        // imprimimos los numeros del arreglo de la clase
        System.out.println("El numero de la primitiva de hoy es: ");
        for (int i = 0; i < resultadoSorteo.length ; i++) {
            if (i == resultadoSorteo.length - 1)System.out.println(resultadoSorteo[i]);
            else System.out.print(resultadoSorteo[i]+" ,");
        }
        
        // mostramos los numeros del boleto
        System.out.println("El numero del boleto premiado es: ");
        for (int i = 0; i < boleto.length ; i++) {
            if (i == boleto.length - 1)System.out.println(boleto[i]);
            else System.out.print(boleto[i]+" ,");
        }
        
        // consultamos el numero de aciertos y los imprimimos
        System.out.println("tu boleto tiene "+aciertos+" aciertos");
        System.out.println("Es el boleto numero: "+contador+" que se genera.");
        
        
        
    }   // fin main
}       // fin class
