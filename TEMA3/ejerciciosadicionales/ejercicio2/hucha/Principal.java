public class Principal{
    public static void main (String [] args){
        Hucha mio=new Hucha();
        System.out.println("Hucha recien creada: ");
        mio.printDetalles();
        System.out.println();
        
        mio.insertarDinero(47.36);
        mio.insertarDinero(10);
        System.out.println("Ingreso 47.36 y luego 10: ");
        mio.printDetalles();
        System.out.println();
        
        mio.sacarDinero(15.98);
        System.out.println("Saco 15.98: ");
        mio.printDetalles();
        System.out.println();
        
        mio.sacarDinero(100);
        System.out.println("Saco 100: ");
        mio.printDetalles();
        System.out.println();
    }
}
