import java.util.Arrays;

public class Vagon {
    private static int contadorVagones = 0;

    private int identificador;
    private double[] asientos;
    private int asientoActual;

    public Vagon(int capacidad) {
        this.identificador = ++contadorVagones;
        this.asientos = new double[capacidad];
        inicializarAsientos();
        this.asientoActual = 0;
    }

    private void inicializarAsientos() {
        Arrays.fill(asientos, -1.0);
    }

    public int getCapacidad() {
        return asientos.length;
    }

    public void printDetalles() {
        System.out.println("Vagón " + identificador + " – Capacidad " + getCapacidad());
    }

    private void printTicket(int numeroAsiento) {
        System.out.println("Vagón " + identificador + " – Capacidad " + getCapacidad());
        System.out.println("Nº asiento – " + numeroAsiento);
        System.out.println("Precio: " + asientos[numeroAsiento]);
    }

    public double reembolsarAsiento(int numeroAsiento) {
        if (numeroAsiento >= 0 && numeroAsiento < asientos.length && asientos[numeroAsiento] >= 0) {
            double precio = asientos[numeroAsiento];
            asientos[numeroAsiento] = -1.0;
            return precio;
        }
        return 0;
    }

    public boolean reservarSiguienteAsiento() {
        if (asientoActual < getCapacidad()) {
            int numeroAsiento = asientoActual++;
            asientos[numeroAsiento] = (2.5 * numeroAsiento) + 1;
            printTicket(numeroAsiento);
            return true;
        }
        return false;
    }

    public double getPrecioMedio() {
        int count = 0;
        double sum = 0;
        for (double precio : asientos) {
            if (precio >= 0) {
                sum += precio;
                count++;
            }
        }
        return (count > 0) ? (sum / count) : 0;
    }
}
