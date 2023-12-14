public class Cafetera{
    private int capacidadMaxima;
    private int capacidadActual;

    public Cafetera(){
        capacidadActual=0;
        capacidadMaxima=1000;
    }
    
    public int getActual(){
        return capacidadActual;
    }
    
    public int getMaxima(){
        return capacidadMaxima;
    }
    
    public void setActual(int act){
        if(act>0 || act<=capacidadMaxima) capacidadActual=act;
    }
    
    public void setMaxima(int max){
        if(max>0) capacidadMaxima=max;
    }
    
    public void llenarCafetera(){
        capacidadActual=capacidadMaxima;
    }
    
    public void servirTaza(int taza){
        if(taza!=capacidadMaxima) capacidadActual=capacidadMaxima;
    }
    
    public void vaciarCafetera(){
        capacidadActual=0;
    }
    
    public void agregarCafe(int cafe){
        if (cafe < (capacidadMaxima-capacidadActual)) capacidadActual+=cafe;
        else capacidadActual=capacidadMaxima;
    }
}
