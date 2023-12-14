public class Calentador{
    private int temperatura;
    private int minimo;
    private int maximo;
    private int incremento;

    public Calentador(int queMinimo, int queMaximo){
        temperatura=15;
        minimo=queMinimo;
        maximo=queMaximo;
        incremento=5;
        if(minimo>15) temperatura=minimo;
        if(maximo<15) temperatura=maximo;
    }
    
    public int getTemperatura(){
        return temperatura;
    }
    
        public int getMinimo(){
        return minimo;
    }
    
    public int getMaximo(){
        return maximo;
    }
    
    public int getIncremento(){
        return incremento;
    }
    
    public void setIncremento(int i){
        if(i>=1) incremento=i;
    }
    
    public void calentar(){
        temperatura+=incremento;
        if (temperatura > maximo) temperatura=maximo;
    }
    
    public void enfriar(){
        temperatura-=incremento;
        if (temperatura < minimo) temperatura=minimo;
    }
}
