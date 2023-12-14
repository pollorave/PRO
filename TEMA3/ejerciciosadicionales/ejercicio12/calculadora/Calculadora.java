public class Calculadora{
    private int cantidad;
    private int suma;
    private int maximo;
    private int minimo;

    public Calculadora(){
        cantidad=0;
        suma=0;
        maximo=0;
        minimo=0;
    }
    
    public int getCantidad(){
        return cantidad;
    }
    
    public int getSuma(){
        return suma;
    }
    
    public int getMaximo(){
        return maximo;
    }
    
    public int getMinimo(){
        return minimo;
    }
    
    public void introducirNumero(int num){
        cantidad++;
        suma+=num;
        
        if(num>maximo) maximo=num;
        if(num<=minimo || num<maximo) minimo=num;
    }
    
    public double getMedia(double media){
        media=suma/cantidad;
        return media;
    }
}
