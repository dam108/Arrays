package arrays;
import java.util.Scanner;
public class EjArrays07021c {
    public static Primitiva primitiva;
    public static void main(String[] args) {
        int aciertos = 0;
        long contador = 0;
        
        // creamos el objeto y los arreglos 
        primitiva = new Primitiva();
        int [] resultadoSorteo = new int[6];
        int [] boleto = new int[6];
        
        // guardamos en el arreglo los numeros generados desde la clase
        resultadoSorteo = primitiva.getResultadoSorteo();
        
        // generamos boletos hasta que tengamos uno con 6 aciertos
        while (aciertos != 6){
            boleto = generarBoleto(boleto.length);
            aciertos = primitiva.numeroAciertos(boleto);
            contador++;
            
        }
        
        // imprimimos los numeros del arreglo de la clase
        System.out.println("El numero de la primitiva de hoy es: ");
        imprimirBoletos(resultadoSorteo);
        
        // mostramos los numeros del boleto
        System.out.println("El numero del boleto premiado es: ");
        imprimirBoletos(boleto);
                
        // consultamos el numero de aciertos y los imprimimos
        System.out.println("tu boleto tiene "+aciertos+" aciertos");
        System.out.println("Es el boleto numero: "+contador+" que se genera.");
        
    }   // fin main
    
    public static int[] generarBoleto(int longitudArray) {
        boolean repetidos = false;
        int[] boleto = new int[longitudArray];
        for (int i = 0; i < longitudArray; i++) {
            int n;
            // generamos un numero y hacemos un bucle que genere el numero otra vez mientras esta repetido
            do {
                // genero un numero
                n = (int)(Math.random()* 49 )+1;
                // comprobamos si ese numero esta repetido
                repetidos = primitiva.repetidos(boleto, n);
            } while (repetidos);
            boleto[i] = n;
        } // fin for
        return boleto;
    }
    
    public static void imprimirBoletos(int [] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (i == arr.length - 1)System.out.println(arr[i]);
            else System.out.print(arr[i]+" ,");
        }
    }
    
}       // fin class
