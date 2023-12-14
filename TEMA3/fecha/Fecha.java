public class Fecha{
    private int dia, mes, anio;
    
    public Fecha(){
        dia=28;
        mes=9;
        anio=2023;
    }
    
    public Fecha(int d, int m, int a){
        dia=d;
        mes=m;
        anio=a;
    }
    
    public Fecha(Fecha copia){
        dia=copia.dia;
        mes=copia.mes;
        anio=copia.anio;
    }
    
    public void setdia(int valordia){
        dia=valordia;
    }
    
    public void setmes(int valormes){
        mes=valormes;
    }
    
    public void setanio(int valoranio){
        anio=valoranio;
    }
    
    public int getdia(){
        return dia;
    }
    
    public int getmes(){
        return mes;
    }
    
    public int getanio(){
        return anio;
    }
    
    public String toString(){
        return("La fecha de hoy es: "+dia+"-"+mes+"-"+anio+".");
    }
}