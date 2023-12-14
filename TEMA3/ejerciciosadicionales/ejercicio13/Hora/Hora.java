public class Hora{
    private int horas;
    private int minutos;
    private int segundos;

    public Hora(){
        horas=0;
        minutos=0;
        segundos=0;
    }
    
    public int getHoras(){
        return horas;
    }
    
    public int getMinutos(){
        return minutos;
    }
    
    public int getSegundos(){
        return segundos;
    }
    
    public void avanzarSegundo(int segundo){
        segundos++;
        
        if(segundos==60) minutos++;
        if(segundos==60) segundos=0;
        if(minutos==60) horas++;
        if(minutos==60) minutos=0;
        if(horas==24) horas=0;
    }
    
    public String toString(){
        return horas+":"+minutos+":"+segundos;
    }
    
    public void printHora(){
        System.out.println(toString());
    }
}
