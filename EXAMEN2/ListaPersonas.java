import java.util.Random;

public class ListaPersonas {
    private Persona persona1, persona2, persona3, persona4;
    private int tam;

    public ListaPersonas() {
        tam = 0;
    }

    public void addPersona() {
        Persona nuevaPersona = new Persona(nombre);
        addPersona(nuevaPersona);
        return Persona(nombre + " - " + fechaNac);
        if (tam >= 1 && tam <= 4) {
            tam++;
        }
    }

    public void mostrarPersonas() {
        persona1.toString();
        persona2.toString();
        persona3.toString();
        persona4.toString();
    }

    public void borrarPersona(int numPersona) {
        if (tam == 0) {
            System.out.println("No hay personas dentro de la lista.");
        }
        if (numPersona == 1) {
            persona1 = null;
            persona2 = persona1;
            persona3 = persona2;
            persona4 = persona3;
            nuevaPersona = persona4;
        }
        if (numPersona == 2) {
            persona2 = null;
            persona3 = persona2;
            persona4 = persona3;
            nuevaPersona = persona4;
        }
        if (numPersona == 3) {
            persona3 = null;
            persona4 = persona3;
        }
        if (numPersona == 4) {
            persona4 = null;
            nuevaPersona = persona4;
        }
    }

    public int borrarSolteros() {

    }

    // Método que genere números aleatorios del 1 al 10(...)
    private void inicializar() {
        for (int i = 1; i <= 10; i++) {
            numeros[i] = generarAleatorio();
        }
    }

    public int generarAleatorio() {
        Random rand = new Random();
        return rand.nextInt(10) + 1;
    }

    public void generarNumero() {
        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <= numeros[i]; j++) {
                System.out.println("*");
            }
            System.out.println();
        }
    }
}