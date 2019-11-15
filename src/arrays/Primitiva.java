package arrays;

public class Primitiva {
    private int[] resultadoSorteo = new int[6];
    private int[] boleto = new int[6];
    private int [][] boletos;
    private boolean repetidos = false;
    Primitiva () {
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
    
    public int[][] generarBoletos(int cantidad, int longitud){
        int [][] boletos = new int[cantidad][longitud];
        for (int i = 0; i < boletos.length; i++) {
            
            for (int j = 0; j < boletos[i].length; j++) {
                // comprobamos si esta repetido y si no lo guardamos
                int n;
                // generamos un numero y hacemos un bucle que genere el numero otra vez mientras esta repetido
                do {
                    n = (int)(Math.random()* 49 )+1;
                    repetidos = repetidos(boletos[i], n);
                } while (repetidos);
                boletos[i][j] = n;
            }
        }
        return boletos;
    }
    
    public int[] generarBoleto() {
        for (int i = 0; i < boleto.length; i++) {
            int n;
            // generamos un numero y hacemos un bucle que genere el numero otra vez mientras esta repetido
            do {
                // genero un numero
                n = (int)(Math.random()* 49 )+1;
                // comprobamos si ese numero esta repetido
                repetidos = repetidos(boleto, n);
            } while (repetidos);
            boleto[i] = n;
        } // fin for
        return boleto;
    }
} // fin class

/* sacar metodos que no van aqui y ponerlos en los mains*/