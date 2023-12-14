public class Conversor{
    private double Grados;

    public Conversor(){
        Grados=0;
    }
    
    public void setGrados(double cuantosGrados){
        Grados=cuantosGrados;
    }
    
    public double getGrados(){
        return Grados;
    }
    
    public double aFarenheit(double Centigrados){
        return (Centigrados*9/5)+32;
    }
    
    public double aCentigrados(double Fahrenheit){
        return (Fahrenheit-32)*5/9;
    }
}
