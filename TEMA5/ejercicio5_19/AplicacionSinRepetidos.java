class AplicacionSinRepetidos {
    public static void main(String[] args) {
        InterfazUsuario interfaz = new InterfazUsuario();

        System.out.println("Ejecutando de forma normal:");
        interfaz.ejecutar();
        interfaz.imprimir();

        System.out.println("Ejecutando ordenadamente:");
        interfaz.ejecutarOrdenadamente();
        interfaz.imprimir();
    }
}