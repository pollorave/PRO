public class Fecha{
    private int dia, mes, anio;
    
    public Fecha(int d, int m, int a){
        dia=d;
        mes=m;
        anio=a;
    }
    
    public int getDia(){
        return dia;
    }
    
    public int getMes(){
        return mes;
    }
    
    public int getAnio(){
        return anio;
    }
    
    public boolean esBisiesto(int anio){
        if (anio%4==0 && anio%100!=0 && anio%400==0)
        return true;
        else return false;
    }
    
    public void diasMes(){
        
    }
    
    public void printCorta(){
        System.out.printf(dia+"-"+mes+"-"+anio);
    }
    
    public void printLarga(){
        System.out.printf(dia+" de "+mes+" de "+anio);
    }
    
    public boolean esCorrecta(){
        if (dia>=1 && dia<=31) return true;
        if (mes>=1 && mes<=12) return true;
        if (mes!=2 && dia>=1 && dia<=31 || mes!=2 && dia>=1 && dia<=30) return true;
        if (mes==2 && dia>=1 && dia<=28 || mes==2 && dia>=1 && dia<=29) return true;
        else return false;
    }
}
