public class Principal{
    public static void main (String [] args){
        Calculadora nuevo1=new Calculadora();
        nuevo1.introducirNumero(20);
        nuevo1.introducirNumero(5);
        nuevo1.getCantidad();
        nuevo1.getSuma();
        nuevo1.getMinimo();
        nuevo1.getMaximo();
        nuevo1.getMedia();
        
        System.out.println("La cantidad de números que se están sumando es de: "+nuevo1.getCantidad());
        System.out.println("La suma de los números es: "+nuevo1.getSuma());
        System.out.println("El número mínimo es: "+nuevo1.getMinimo());
        System.out.println("El número máximo es: "+nuevo1.getMaximo());
        System.out.println("La media de los números es: "+nuevo1.getMedia());
    }
}
