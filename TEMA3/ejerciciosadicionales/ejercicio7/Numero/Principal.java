public class Principal{
    public static void main (String [] args){
        Numero nuevo=new Numero();
        nuevo.setX(347);
        System.out.println("El número es: "+nuevo.getX());
        System.out.println("¿El número es par? ");
        if (nuevo.esPar()) System.out.println("Sí");
        else System.out.println("No");
        System.out.println("Su primera cifra es: "+nuevo.getPrimeraCifra());
        System.out.println("Su primera cifra es: "+nuevo.getSegundaCifra());
        System.out.println("Su primera cifra es: "+nuevo.getUltimaCifra());
        System.out.println("La suma de sus cifras es: "+nuevo.sumaCifras());
    }
}
