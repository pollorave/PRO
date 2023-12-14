public class DemoFraccion {
    private Fraccion fraccion1;
    private Fraccion fraccion2;

    public DemoFraccion() {
        this.fraccion1 = null;
        this.fraccion2 = null;
    }

    public void demo1() {
        fraccion1 = new Fraccion();

        fraccion1.setNumerador(-4);
        fraccion1.setDenominador(7);

        fraccion2 = new Fraccion(13, 2);

        Fraccion suma = fraccion1.sumar(fraccion2);
        Fraccion resta = fraccion1.restar(fraccion2);
        Fraccion producto = fraccion1.multiplicar(fraccion2);
        Fraccion division = fraccion1.dividir(fraccion2);

        escribirFraccion("Fracción 1: ", fraccion1);
        escribirFraccion("Fracción 2: ", fraccion2);
        escribirFraccion("La suma es: ", suma);
        escribirFraccion("La resta es: ", resta);
        escribirFraccion("El producto es: ", producto);
        escribirFraccion("La división es: ", division);
    }

    public void demo2() {
        fraccion1.setNumerador(17);
        fraccion1.setDenominador(25);

        fraccion2.setNumerador(16);
        fraccion2.setDenominador(11);

        if (fraccion1.menorQue(fraccion2)) {
            System.out.println("Fracción 1 es menor que Fracción 2.");
        } else if (fraccion1.igualQue(fraccion2)) {
            System.out.println("Fracción 1 es igual a Fracción 2.");
        } else {
            System.out.println("Fracción 1 es mayor que Fracción 2.");
        }

        Fraccion copiaFraccion1 = fraccion1.clonar();
        escribirFraccion("Copia de Fracción 1: ", copiaFraccion1);
    }

    private void escribirFraccion(String mensaje, Fraccion fraccion) {
        System.out.println(mensaje + fraccion);
    }
}
