public class Personaje{
    private String nombre;
    private char NORTE, SUR, ESTE, OESTE;
    private int x;
    private int y;
    private char orientacion;

    public Personaje(String queNombre){
        nombre=queNombre;
        x=0;
        y=0;
        orientacion=N;
    }
    
    public String getNombre(){
        return nombre;
    }
    
    public char getOrientacion(){
        return orientacion;
    }
    
    public int getCoordenadas(){
        return (x,y);
    }
    
    public void avanzar(int distancia){
        switch(orientacion){
            case NORTE:
                y-=distancia;
                break;
            case ESTE:
                x+=distancia;
                break;
            case SUR:
                y+=distancia;
                break;
            case OESTE:
                x-=distancia;
                break;
        };
    }
    
    public void girar(){
        switch(orientacion){
            case NORTE:
                orientacion=ESTE;
                break;
            case ESTE:
                orientacion=SUR;
                break;
            case SUR:
                orientacion=OESTE;
                break;
            case OESTE:
                orientacion=NORTE;
                break;
        };
    }
    
    String toString(){
        System.println("Personaje = "+nombre+
                       "Orientacion = "+S+
                       "Posicion = ");
    }
}
