package arrays;
import java.util.Scanner;
public class EjArrays07021a {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        // creamos el objeto y los arreglos 
        Primitiva primitiva = new Primitiva();
        int [] resultadoSorteo = new int[6];
        int [] boleto = new int[6];
        
        // guardamos en el arreglo los numeros generados desde la clase
        resultadoSorteo = primitiva.getResultadoSorteo();
        
        // comprobamos los aciertos y imprimimos los numeros de boleto y el numero de aciertos
        for (int i = 0; i < boleto.length; i++) {
            System.out.println("Introduce el numero "+(i+1)+" de tu boleto: ");
            boleto[i] = teclado.nextInt();
        }
        
        // imprimimos los numeros del arreglo de la clase
        System.out.println("El numero de la primitiva de hoy es: ");
        for (int i = 0; i < resultadoSorteo.length ; i++) {
            if (i == resultadoSorteo.length - 1)System.out.println(resultadoSorteo[i]);
            else System.out.print(resultadoSorteo[i]+" ,");
        }
        
        // mostramos los numeros del boleto
        for (int i = 0; i < boleto.length ; i++) {
            if (i == boleto.length - 1)System.out.println(boleto[i]);
            else System.out.print(boleto[i]+" ,");
        }
        
        // consultamos el numero de aciertos y los imprimimos
        int aciertos = primitiva.numeroAciertos(boleto);
        System.out.println("tu boleto tiene "+aciertos+" aciertos");
        
        
        
        
    }   // fin main
}       // fin class
