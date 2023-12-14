
public class Punto{
    private int x;
    private int y;
    private int z;
    
    /** Constructor de punto */
    public Punto(){ //constructor por defecto.
        x=1;
        y=1;
        z=1;
    }
    
    public Punto(Punto p){ //constructor de copia.
        x=p.x;
        y=p.y;
        z=p.z;
    }
    
    public Punto(int num){ //constructor de conversion..
        x=num;
        y=num;
        z=num;
    }
    
    public Punto (int queX, int queY, int queZ){
        x=queX;
        y=queY;
        z=queZ;
    }
    
    /** con SET agregamos valores a la X al tratarse de un private */
    public void setX(int valorX){
        x=valorX;
    }
    
    /** con el GET recibimos el valor de X */
    public int getX(){
        return x;
    }
    
    public void setY(int valorY){
        y=valorY;
    }
    
    public int getY(){
        return y;
    }
    
    public void setZ(int valorZ){
        z=valorZ;
    }
    
    public int getZ(){
        return z;
    }
}