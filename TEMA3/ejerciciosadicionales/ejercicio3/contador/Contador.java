public class Contador{
    private int Valor;
    
    public Contador(){
        Valor=0;
    }
    
    public void Decrementar(){
        if (Valor>0) Valor--;
    }
    
    public void Incrementar(){
        Valor++;
    }
    
    public int getContador(){
        return Valor;
    }
    
    public void printContador(){
        System.out.println("Cuenta: "+Valor);
    }
    
    public void reset(){
        Valor=0;
    }
}
