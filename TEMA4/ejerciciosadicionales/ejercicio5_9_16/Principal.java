public class Principal{
    public static void main(String[] args){
        Fraccion fraccion1 = new Fraccion(1, 2);
        Fraccion fraccion2 = new Fraccion(3, 4);
        Fraccion suma = fraccion1.sumar(fraccion2);
        Fraccion resta = fraccion1.restar(fraccion2);
        Fraccion multiplicacion = fraccion1.multiplicar(fraccion2);
        Fraccion division = fraccion1.dividir(fraccion2);

        System.out.println("Suma: " + suma);
        System.out.println("Resta: " + resta);
        System.out.println("Multiplicación: " + multiplicacion);
        System.out.println("División: " + division);
        System.out.println("Igual que: " + fraccion1.igualQue(fraccion2));
        System.out.println("Menor que: " + fraccion1.menorQue(fraccion2));
        
        Fraccion clon = fraccion1.clonar();
        System.out.println("Clon: " + clon);
    }
}