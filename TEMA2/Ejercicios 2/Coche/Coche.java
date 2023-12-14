/**
 * Una clase que representa automóviles.
 * 
 * @author 
 * @version 
 */
public class Coche
{
    private String modelo; // Ford Focus, Citrone X-Sara, ...
    private String color;
    private int anio;
    private int numeroPuertas;
    
    /**
     * Constructor para los objetos de la clase Coche.
     * 
     */
   
    
     public Coche(String queModelo, String queColor, int queAnio,
     int quePuertas)
    {
        modelo = queModelo;
        color = queColor;
        anio = queAnio;
        numeroPuertas = quePuertas;
    }
    
    
    /**
     * cambiar el modelo del coche
     */
    public void setModelo(String mod) {
        modelo = mod;
    }   
 
    /**
     * cambiar el color del coche
     */
    public void setColor(String col) {
        color = col;
    }     
  
    /**
     * cambiar el año del coche
     */
    public void setAnio(int an) {
        anio = an;
    } 
    
     /**
     * visualizar la información del coche
     */
    public void print() {
        System.out.println("Modelo " + modelo + "\nAño " + anio + 
                           "\nColor " + color + "." +
                           "\nNumeroPuertas " + numeroPuertas);
    }    
   
    /**
     * devolver el modelo del coche
     */
    public String getModelo() { 
        return modelo;
    }
  
    /**
     * devolver el color del coche
     */
    public String getColor() { 
        return color;
    }
  
    /**
     * devolver el año del coche
     */
    public int getAnio() { 
        return anio;
    }
    
    /**
     * devolver las puertas del coche
     */
    public int getNumeroPuertas() { 
        return numeroPuertas;
    }
    
     /**
     * 
     *
     * @param  unCoche el coche a comparar con el actual
     * @return true si los coches que se comparan son iguales    
     */
    public boolean igualQue(Coche unCoche)
    {
        
        return (this.modelo.equals(unCoche.getModelo()) &&
               this.color.equals(unCoche.getColor()) &&
               this.anio == unCoche.getAnio());
    }
    
    

}
