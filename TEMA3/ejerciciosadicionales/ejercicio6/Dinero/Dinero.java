public class Dinero{
    private int euros;
    private final int BILLETE_10=10;
    private final int BILLETE_5=5;
    private final int MONEDA_2=2;
    private final int MONEDA_1=1;
    
    public Dinero(int cuantosEuros){
        euros=cuantosEuros;
    }
    
    public void setEuros(int cuantosEuros){
        euros=cuantosEuros;
    }
    
    public int getEuros(){
        return euros;
    }
    
    public void printDescomposicionMonedas(){
        int total=euros;
        int num_b10 = total / BILLETE_10;
        total %= BILLETE_10;
        
        int num_b5 = total / BILLETE_5;
        total %= BILLETE_5;
        
        int num_m2 = total / MONEDA_2;
        total %= MONEDA_2;
        
        int num_m1 = total / MONEDA_1;
        total %= MONEDA_1;
        
        System.out.println(+euros+"€ son:");
        if(num_b10 > 0){
            System.out.println("Billetes de 10 = "+num_b10);
        }
        if(num_b5 > 0){
            System.out.println("Billetes de 5 = "+num_b5);
        }
        if(num_m2 > 0){
            System.out.println("Monedas de 2 = "+num_m2);
        }
        if(num_m1 > 0){
            System.out.println("Monedas de 1 = "+num_m1);
        }
    }
}
