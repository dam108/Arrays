package arrays;

public class Parking {
    private final int plazas;
    private int [] matriculas = new int[20];
    private int ocupadas = 0;
    private int libres;
    
    /*CONSTRUCTOR*/
    Parking (){
        plazas = 20;
        for (int i = 0; i < plazas; i++) {
            matriculas[i] = 0;
        }
    } // fin constructor
    
    /*METODOS*/
    public int plazasOcupadas(){
        for (int i = 0; i < matriculas.length; i++) {
            if (matriculas[i]!=0) ocupadas++;
        }
        int n = ocupadas;
        ocupadas = 0;
        return n;
    }
    // esto tiene trabajo de mas cambia lo que te dijo fernando por que las plazaa ocupadas sustituyen a los for que tienes por abajo
    public int[] getArrayParking(){
        return matriculas;
    }
    
    public int aparcar(int matricula){

        if (ocupadas == 20) return 0;
        else {
            for (int i = plazas - 1; i >= 0; i--) {
                if (matriculas[i] == 0){
                    matriculas[i] = matricula;
                    return i;
                }
            }
        } 
        return 0;
    }
    
    public int desaparcar(){
        for (int i = 0; i < plazas; i++) {
            if (matriculas[i] != 0){
                int matriculaRetirar = matriculas[i];
                matriculas[i] = 0;
                return matriculaRetirar;
            }
        }
        return 0;
        
    }
    
    public int getPlazasLibres(){
        libres = plazas - plazasOcupadas();
        return this.libres;
    }
    
    public int getPlazas(){
        return this.plazas;
    }

    
} // fin class
