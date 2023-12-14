
public class Cuenta{
    private String nombre;
    private int numcuenta;
    private double saldo;
    
    public Cuenta(){
        nombre="Angel";
        numcuenta=0;
        saldo=0;
    }
    
    public Cuenta (String quenombre, int quenumcuenta, double quesaldo){
        nombre=quenombre;
        numcuenta=quenumcuenta;
        saldo=quesaldo;
    }
    
    public void setnombre (String n){
        nombre=n;
    }
    
    public void setnumcuenta (int nc){
        numcuenta=nc;
    }
    
    public void setsaldo (double s){
        saldo=s;
    }
    
    public String getnombre(){
        return nombre;
    }
    
    public int getnumcuenta(){
        return numcuenta;
    }
    
    public double getsaldo(){
        return saldo;
    }
    
    public void print(){
        System.out.println("El titular de la cuenta es: "+nombre);
        System.out.println("El numero de la cuenta es: "+numcuenta);
        System.out.println("El saldo de la cuenta es: "+saldo);
    }
}