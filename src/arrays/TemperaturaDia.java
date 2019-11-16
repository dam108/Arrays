package arrays;

public class TemperaturaDia {
    int [][] temperaturas = new int [12][31];
    
    /*CONSTRUCTOR*/
    TemperaturaDia (){
        // generamos el array que simula 12 meses , 31 dias por mes
        generarTemperaturas();
    }

    /* FIN CONSTRUCTORES */

    /*METODOS*/
    
    private void generarTemperaturas(){
        temperaturas = new int [12][31];
        // generar temperaturas para cada dia del año
        for (int i = 0; i < temperaturas.length; i++) {
            for (int j = 0; j < temperaturas[i].length; j++) {
                switch (i + 1){
                    case 1:
                    case 3:
                    case 11:
                    case 12: 
                        temperaturas[i][j] = (int) (Math.random()* 31) - 10;
                        break;    
                    case 4:
                    case 5:
                    case 6:
                    case 7:
                    case 8:
                    case 9:
                    case 10: 
                        if (j+1 > 30) temperaturas[i][j] = 999;
                        else temperaturas[i][j] = (int) (Math.random()* 26) + 10 ;
                        break;
                    case 2:
                        if (j+1 > 28 ) temperaturas[i][j] = 999;
                        else temperaturas[i][j] = (int) (Math.random()* 31) - 10;
                        break;
                }
            }
        }
    }
    
    public int tempMediaYear(){
        int totalMeses = temperaturas.length;
        int totalMediaYear = 0;
        for (int i = 0; i < totalMeses; i++) {
            // sacar la temperatura media de cada mes 
            // sumarla y hacer un total 
            totalMediaYear += totalMediaMes(i);
        }
        // dividir total entre cantidad de meses
        return totalMediaYear / totalMeses;
    }
    
    public int totalMediaMes(int mes){
        // sumar todas las temperaturas menores a 999
        int totalDias = 0;
        int totalTemperaturas = 0;
        for (int i = 0; i < temperaturas[mes].length; i++) {
                if( temperaturas[mes][i] < 999) {
                    totalTemperaturas += temperaturas[mes][i];
                    totalDias++;
                }
        }
        // dividir el total entre el total de los dias que no tengan como temperatura 999
        return totalTemperaturas / totalDias;
    
    }

    /* GETTERS Y SETTERS */
    
    public int[][] getTemperaturas(){
        return temperaturas;
    }
    
    public int getDiaCaluroso(){
        int diaCaluroso = 0;
        for (int i = 0; i < temperaturas.length; i++) {
            for (int j = 0; j < temperaturas[i].length; j++) {
                if (temperaturas[i][j] > diaCaluroso && temperaturas[i][j] < 999) diaCaluroso = temperaturas[i][j];
            }
        }
        return diaCaluroso;
    }

} // fin class
