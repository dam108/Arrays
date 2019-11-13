package arrays;

public class Primitiva {
    private int[] resultadoSorteo = new int[6];
    private int[] boleto = new int[6];
    private int [][] boletos;
    
    Primitiva () {
        // generamos nuemeros aleatorios entre 1 y 49 y los guaradamos en el array mientras no estan repetidos
        for (int i = 0; i < resultadoSorteo.length; i++) {
            // generamos numero
            int n = (int)(Math.random()* 49 )+1;
            // comprobamos si esta repetido y si no lo guardamos
            if(repetidos(resultadoSorteo, n) == false){
                resultadoSorteo[i] = n;
            } // fin if
            else {// en el caso de que si este repetido generamos otro numero aleatorio
                n = (int)(Math.random()* 49 )+1;
                // comprobamos si esta repetido otra vez y si no lo guardamos
                if(repetidos(resultadoSorteo, n) == false){
                resultadoSorteo[i] = n;
                } //fin if
            } // fin else
        } // fin for
        

    }// fin Contructor

    // metodo para devolver el resultado del array
    public int[] getResultadoSorteo() {
        return resultadoSorteo;
    }
    
    
    // metodo con el que comprobamos si hay repetidos
    public boolean repetidos(int[] arreglo, int valor){
        boolean repetidos = false;
        // recorremos el arreglo
        for (int i = 0; i < arreglo.length && !repetidos; i++) {
            // si el numero dentro de la posiscion es igual al valor pasado es que esta repetido
            if(arreglo[i] == valor) {
                repetidos = true;
            }

        }
        //devolvemos el valor booleano tru si esta repetido , false si no lo esta
        return repetidos;
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
                // generamos numero
                int n = (int)(Math.random()* 49 )+1;
                // comprobamos si esta repetido y si no lo guardamos
                if(repetidos(boletos[i], n) == false){
                    boletos[i][j] = n;
                } // fin if
                else {// en el caso de que si este repetido generamos otro numero aleatorio
                    n = (int)(Math.random()* 49 )+1;
                    // comprobamos si esta repetido otra vez y si no lo guardamos
                    if(repetidos(boletos[i], n) == false){
                    boletos[i][j] = n;
                    } //fin if
                } // fin else
            }
        }
        return boletos;
    }
    
    public int[] generarBoleto() {
        for (int i = 0; i < boleto.length; i++) {
            // generamos numero
            int n = (int)(Math.random()* 49 )+1;
            // comprobamos si esta repetido y si no lo guardamos
            if(repetidos(boleto, n) == false){
                boleto[i] = n;
            } // fin if
            else {// en el caso de que si este repetido generamos otro numero aleatorio
                n = (int)(Math.random()* 49 )+1;
                // comprobamos si esta repetido otra vez y si no lo guardamos
                if(repetidos(boleto, n) == false){
                boleto[i] = n;
                } //fin if
            } // fin else
        } // fin for
        return boleto;
    }

} // fin class
