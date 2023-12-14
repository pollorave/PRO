public class Hucha{
    private double Dinero;
    private double DineroInicial;
    private double DineroActual;
    
    public Hucha(){
        Dinero=0;
        DineroInicial=0;
        DineroActual=0;
    }
    
    public double getDinero(){
        return Dinero;
    }
    
    public double getDineroInicial(){
        return DineroInicial;
    }
    
    public double getDineroActual(){
        return DineroActual;
    }
    
    public void insertarDinero(double Dinero)
    {
        if (DineroActual>0){
            Dinero+=DineroActual;
        }
    }
    
    public void sacarDinero(double Dinero)
    {
        if (Dinero>=DineroActual && DineroActual>0){
            Dinero-=DineroActual;
        }
    }
    
    public void printDetalles(){
        System.out.printf("Hay %.2f euros en la hucha\n", Dinero);
    }
}