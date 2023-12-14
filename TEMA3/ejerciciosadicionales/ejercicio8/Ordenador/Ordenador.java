public class Ordenador{
    private int maxMemoria;
    private int memoriaInstalada;

    public Ordenador(int maximo){
        if (maximo > 0)maxMemoria=maximo;
        else maxMemoria=1024;
        memoriaInstalada=0;
    }
     
    public int getMaxMemoria(){
        return maxMemoria;
    }
    
    public int getMemoriaDisponible(){
        return maxMemoria - memoriaInstalada;
    }
    
    public void vaciarMemoria(){
        memoriaInstalada=0;
    }
    
    public boolean instalar256Mb(){
        if (getMemoriaDisponible()<256) return false;
        else
        {
            memoriaInstalada+=256;
            return true;
        }
    }
    
    public boolean instalarMemoria(int cuantaMemoria){
        if (getMemoriaDisponible()>=cuantaMemoria){
            memoriaInstalada+=cuantaMemoria;
            return true;
        }
        else{
            System.out.println("No es posible instalar esa cantidad de memoria");
            return false;
        }
    }
    
    public void printInformacion(){
        System.out.println("Este ordenador puede tener hasta "+maxMemoria+"Mb de memoria.");
        System.out.println("Todavía es posible instalar "+(maxMemoria - memoriaInstalada)+"Mb.");
    }
}
