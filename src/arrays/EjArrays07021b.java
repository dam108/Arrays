package arrays;

public class EjArrays07021b {
    public static Primitiva primitiva;
    public static void main(String[] args) {
        final int maxBoletos = 1000, maxLongitud = 6;
        int cont3 = 0, cont4 = 0, cont5 = 0, cont6 = 0;
        
        // creamos el objeto y los arreglos 
        primitiva = new Primitiva();
        int [] resultadoSorteo = new int[maxLongitud];
        int[] boleto = new int[maxLongitud];
        
        // guardamos en el arreglo los numeros generados desde la clase
        resultadoSorteo = primitiva.getResultadoSorteo();
        
        // imprimimos los numeros del arreglo de la clase
        System.out.println("El numero de la primitiva de hoy es: ");
        for (int i = 0; i < resultadoSorteo.length ; i++) {
            if (i == resultadoSorteo.length - 1)System.out.println(resultadoSorteo[i]);
            else System.out.print(resultadoSorteo[i]+" ,");
        }
        System.out.println("-------------------------------------");
        
        // generamos 1000 boletos
        for (int i = 0; i < maxBoletos; i++) {
            boleto = generarBoleto(maxLongitud);
            System.out.print("Boleto nº "+(i+1)+": ");
            // imprimimos los boletos 1 a 1
            imprimirBoletos(boleto);
            int aciertos = primitiva.numeroAciertos(boleto);
            if ( aciertos == 3 ) cont3++;
            if ( aciertos == 4 ) cont4++;
            if ( aciertos == 5 ) cont5++;
            if ( aciertos == 6 ) cont6++;
        }
        System.out.println("los cantidad de boletos con 3 aciertos es: "+cont3);
        System.out.println("los cantidad de boletos con 4 aciertos es: "+cont4);
        System.out.println("los cantidad de boletos con 5 aciertos es: "+cont5);
        System.out.println("los cantidad de boletos con 6 aciertos es: "+cont6);
        
    } // fin main
    
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
