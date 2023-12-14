public class Principal{
    public static void main (String[] agrs){
        Fecha hoy=new Fecha();
        Fecha fecha2=new Fecha(14,5,2009);
        Fecha fecha3=new Fecha(30,7,2004);
        System.out.println("La fecha es "+hoy.getdia()+"-"+hoy.getmes()+"-"+hoy.getanio());
        System.out.println("La fecha es "+fecha2.getdia()+"-"+fecha2.getmes()+"-"+fecha2.getanio());
        System.out.println("La fecha es "+fecha3.getdia()+"-"+fecha3.getmes()+"-"+fecha3.getanio());
    }
}