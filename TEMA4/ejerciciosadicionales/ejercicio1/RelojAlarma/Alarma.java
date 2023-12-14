public class Alarma{
    private int horas;
    private int minutos;
    private int segundos;

    public Alarma(){
        horas=7;
        minutos=0;
        segundos=0;
    }
    
    public String getHoras()
    {
        if (horas<10)
            return "0" + horas;
        else
            return  "" + horas;
    }
    
    public String getMinutos()
    {
        if (minutos<10)
            return "0" + minutos;
        else
            return  "" + minutos;
    }
    
    public String getSegundos()
    {
        if (segundos<10)
            return "0" + segundos;
        else
            return  "" + segundos;
    }
    
    public String getHoraAlarma(){
        return horas+":"+minutos+":"+segundos;
    }
    
    public void setHoraAlarma(int h, int m, int s){
        if(h<0 || h>23) horas=7;
        else horas=h;
        if(m<0 || m>59) minutos=0;
        else minutos=m;
        if(s<0 || s>59) horas=s;
        else segundos=0;
    }
}
