package arrays;

public class Parking {
    private final int plazas;
    private String [] matriculas;
    private int ocupadas;
    private int libres;
    
    /*CONSTRUCTOR*/
    Parking (){
        
        matriculas = new String [20];
        plazas = 20;
        libres =  plazas;
        ocupadas = 0;
        // creamos el array matriculas con un cero en cada posicion incial indicando que estan todas vacias
        for (int i = 0; i < plazas; i++) {
            matriculas[i] = "";
        }
    } // fin constructor
    
    /*METODOS*/
    
    public int plazasOcupadas(){
        for (int i = 0; i < matriculas.length; i++) {
            if (!matriculas[i].equals("")) ocupadas++;
        }
        int n = ocupadas;
        ocupadas = 0;
        return n;
    }
    
    public String[] getArrayParking(){
        return matriculas;
    }
    
    public boolean aparcar(String matricula){
        int n = plazasOcupadas();
        int l = getPlazasLibres() - 1;
        if ( n == 20 ) return false;
        else matriculas[l] = matricula;
        return true;
    }
    
    public String desaparcar(){
        int n = getPlazasLibres();
        if (n == plazas) return "";
        else {
            String matriculaRetrirar = matriculas[n];
            matriculas[n] = "";
            return matriculaRetrirar;
        }
    }
    
    public int getPlazasLibres(){
        libres = plazas - plazasOcupadas();
        return this.libres;
    }
    
    public int getPlazas(){
        return this.plazas;
    }
    
} // fin class
