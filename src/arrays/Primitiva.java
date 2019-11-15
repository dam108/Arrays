package arrays;

public class Primitiva {
    private final int[] resultadoSorteo;
    private boolean repetidos = false;
    
    /* CONSTRUCTOR */
    Primitiva () {
        
        // incializamos arrays
        resultadoSorteo = new int[6];
        
        // generamos nuemeros aleatorios entre 1 y 49 y los guaradamos en el array mientras no estan repetidos
        for (int i = 0; i < resultadoSorteo.length; i++) {
            int n;
            // generamos un numero y hacemos un bucle que genere el numero otra vez mientras esta repetido
            do {
                n = (int)(Math.random()* 49 )+1;
                repetidos = repetidos(resultadoSorteo, n);
            } while (repetidos);
            resultadoSorteo[i] = n;
        } // fin for
        

    }// fin Contructor

    // metodo para devolver el resultado del array
    public int[] getResultadoSorteo() {
        return resultadoSorteo;
    }

    // metodo con el que comprobamos si hay repetidos
    public boolean repetidos(int[] arreglo, int valor){
        boolean rep = false;
        // recorremos el arreglo
        for (int i = 0; i < arreglo.length && !rep; i++) {
            // si el numero dentro de la posiscion es igual al valor pasado es que esta repetido
            if(arreglo[i] == valor) {
                rep = true;
            }
        }
        //devolvemos el valor booleano tru si esta repetido , false si no lo esta
        return rep;
    }
    
    public int numeroAciertos(int [] arreglo){
        int contAciertos = 0;
        // en cada iteracion
        for (int i = 0; i < resultadoSorteo.length; i++) {
            // comprobar si cada numero de el primer arreglo se encuentra dentro del segundo arreglo
            for (int j = 0; j < resultadoSorteo.length; j++) {
                if(arreglo[i] == resultadoSorteo[j]) contAciertos++;
            }
        }
        return contAciertos;
    }
    
} // fin class
