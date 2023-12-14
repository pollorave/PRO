public class Numero{
    private int x;

    public Numero(){
        x=999;
    }
    
    public void setX(int X){
        if (x > 99 && x < 1000){
            this.x = x;
        }
        else {
           System.out.println("El valor debe ser de 3 cifras"); 
        }
    }
    
    public int getX(){
        return x;
    }
    
    public boolean esPar(){
        return x %2 == 0;
    }
    
    public int getPrimeraCifra(){
        return x/100;
    }
    
    public int getSegundaCifra(){
        return (x%100)/10;
    }
    
    public int getUltimaCifra(){
        return x%10;
    }
    
    public int sumaCifras(){
        return getPrimeraCifra()+getSegundaCifra()+getUltimaCifra();
    }
}
