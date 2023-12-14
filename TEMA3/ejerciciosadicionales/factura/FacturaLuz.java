
/**
 * Escriba la descripción de la clase FacturaLuz aquí.
 * La clase guarada inforamción acerca del consumo de luz efectuado 
 * @author (su nombre) 
 * @version (nº versión o fecha)
 */
public class FacturaLuz
{
    private double valor_KW=0.86;
    private double iva=0.16;
    // consumo en el inicio del período a facturar
    private int lecturaAnterior;
    // consumo al final del período a facturar
    private int lecturaActual;

    /**
     * Constructor de la clase FacturaLuz
     */
    public FacturaLuz()
    {
        lecturaAnterior=0;
        lecturaActual=0;

    }   
    
    public FacturaLuz(int lecturaAnt, int lecturaAct){
        lecturaAnt=lecturaAnterior;
        lecturaAct=lecturaActual;
        
    }
    
    public int getLecturaAnt(){
        return lecturaAnterior;
    }
    
    public void setLecturaAnt(int facturaant){
        lecturaAnterior=facturaant;
    }
    
    public int getLecturaAnct(){
        return lecturaActual;
    }
    
    public void setLecturaAct(int facturaact){
        lecturaActual=facturaact;
    }
    
    public int getConsumo(){
        return lecturaActual-lecturaAnterior;
        
    }
    
    public double getImporteTotal(){
        int Consumo=lecturaActual-lecturaAnterior;
        return (Consumo*valor_KW)*iva;
        
    }
}
