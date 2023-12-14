
public class Principal{
    
    public static void main(String[] args){
        Punto ejes=new Punto (28, 15, 36);
        Punto ejes2=new Punto ();
        Punto ejes3=new Punto (ejes);
        Punto ejes4=ejes2;
        Punto ejes5=new Punto (347);
        ejes.setX(10);
        ejes.setY(3);
        ejes.setZ(40);
        System.out.println("El valor de ejes es: ("+ejes.getX()+","+ejes.getY()+","+ejes.getZ()+")");
        System.out.println("El valor de ejes2 es: ("+ejes2.getX()+","+ejes2.getY()+","+ejes2.getZ()+")");
        System.out.println("El valor de ejes3 es: ("+ejes3.getX()+","+ejes3.getY()+","+ejes3.getZ()+")");
        System.out.println("El valor de ejes4 es: ("+ejes4.getX()+","+ejes4.getY()+","+ejes4.getZ()+")");
        System.out.println("El valor de ejes5 es: ("+ejes5.getX()+","+ejes5.getY()+","+ejes5.getZ()+")");
    }
}
