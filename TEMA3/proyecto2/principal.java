public class principal{
    public static void main (String [] args){
        Cuenta bancaria=new Cuenta();
        Cuenta bancaria2=new Cuenta("Jimmy", 156416, 41.28);
        System.out.println("El titular de la cuenta es: "+bancaria.getnombre()+
                           ", el numero de la cuenta es: "+bancaria.getnumcuenta()+
                           ", el saldo de la cuenta es: "+bancaria.getsaldo());
        System.out.println("El titular de la cuenta es: "+bancaria2.getnombre()+
                           ", el numero de la cuenta es: "+bancaria2.getnumcuenta()+
                           ", el saldo de la cuenta es: "+bancaria2.getsaldo());
    }
}