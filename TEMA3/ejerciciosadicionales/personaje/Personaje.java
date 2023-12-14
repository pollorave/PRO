

public class Personaje
{
    //Se pone final porque son variables que nunca cambian
    private final char NORTE = 'N';
    private final char SUR = 'S';
    private final char ESTE = 'E';
    private final char OESTE = 'O';
    private String Nombre;
    private int X;
    private int Y;
    private char orientacion;
    
    public Personaje (String Nom){
        Nombre=Nom;
        X=0;
        Y=0;
        orientacion=NORTE;
    }
    
    public void avanzar(int distancia){
        switch (orientacion){
         case NORTE:
         Y-=distancia;
         break;
         case SUR:
         Y+=distancia;
         break;
         case ESTE:
         X+=distancia;
         break;
         case OESTE:
         X-=distancia;
         break;
        }
    }
    
    public void girar(){
        switch (orientacion){
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
    }
}

public String toString(){
return "Personaje = "+Nombre+
"Orientación = "+orientacion+
"Posición = "+X+" , "+Y ;
}    
}
