public class Vagon{
    private int identificador;
    private double[] asientos;
    private int asientoActual;
    private static int proximoIdentificador = 1;

    public Vagon(int capacidad) {
        identificador = proximoIdentificador;
        asientos = inicializarAsientos(capacidad);
        asientoActual = 0;
    }

    private double[] inicializarAsientos(int capacidad){
        double[] asientos = new double[capacidad];
        for(i = 0; i < capacidad; i++){
            asientos[i] = -1;
        }

        return asientos;
    }

    public int getCapacidad(){
        return asientos.length;
    }

    public void printDetalles(){
        System.out.println("Vagón "+identificador+" - Capacidad "+getCapacidad());
    }

    private void printTicket(int numeroAsiento){
        System.out.println("Vagón "+identificador+" - Capacidad "+getCapacidad());
        System.out.println("Nº asiento - "+numeroAsiento);
        System.out.println("Precio: "+asientos[numeroAsiento]);
    }

    public void reembolsarAsiento(int numeroAsiento){
        double reembolsar;
        if (asientos[numeroAsiento] ) {
            
        }
    }
}