package arrays;

public class EjArrays07021b {
    public static void main(String[] args) {
        final int maxBoletos = 1000, maxLongitud = 6;
        int cont3 = 0, cont4 = 0, cont5 = 0, cont6 = 0;
        
        // creamos el objeto y los arreglos 
        Primitiva primitiva = new Primitiva();
        int [] resultadoSorteo = new int[maxLongitud];
        int [][] boletos = new int[maxBoletos][maxLongitud];
        
        // guardamos en el arreglo los numeros generados desde la clase
        resultadoSorteo = primitiva.getResultadoSorteo();
        
        // generamos array bidimensional con 1000 boletos
        boletos = primitiva.generarBoletos(maxBoletos, maxLongitud);
        
        
        // imprimimos los numeros del arreglo de la clase
        System.out.println("El numero de la primitiva de hoy es: ");
        for (int i = 0; i < resultadoSorteo.length ; i++) {
            if (i == resultadoSorteo.length - 1)System.out.println(resultadoSorteo[i]);
            else System.out.print(resultadoSorteo[i]+" ,");
        }
        
        // mostramos los numeros de los 1000 boletos
        System.out.println("Los resultados de los 1000 boletos son: ");
        for (int i = 0; i < boletos.length; i++) {
            System.out.print((i+1)+". ");
            for (int j = 0; j < boletos[i].length; j++) {
                if (j == boletos[i].length - 1) System.out.print(boletos[i][j]);
                else System.out.print(boletos[i][j]+" ,");
            }
            System.out.println("");
        }
        
        // consultamos el numero de aciertos de los 1000 boletos y los imprimimos
        for (int i = 0; i < boletos.length; i++) {
            int aciertos = primitiva.numeroAciertos(boletos[i]);
            if ( aciertos == 3 ) cont3++;
            if ( aciertos == 4 ) cont4++;
            if ( aciertos == 5 ) cont5++;
            if ( aciertos == 6 ) cont6++;
        }
        System.out.println("los cantidad de boletos con 3 aciertos es: "+cont3);
        System.out.println("los cantidad de boletos con 4 aciertos es: "+cont4);
        System.out.println("los cantidad de boletos con 5 aciertos es: "+cont5);
        System.out.println("los cantidad de boletos con 6 aciertos es: "+cont6);
      
        
    }   // fin main
}       // fin class
