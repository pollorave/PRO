public class FacturaLuz{
    private double Consumo;
    private double VALOR_KW=0.086;
    private double IVA=0.16;
    private double ImporteTotal;
    
    private int ConsumoActual;
    private int ConsumoAnterior;
    public FacturaLuz(int Actual){
        ConsumoAnterior=0;
        ConsumoActual=Actual;
    }
    
    public double getConsumo(){
        return Consumo*VALOR_KW;
    }
    
    public double getImporteTotal(){
        return (Consumo*VALOR_KW)*IVA;
    }
}
