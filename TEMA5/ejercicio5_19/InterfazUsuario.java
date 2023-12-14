class InterfazUsuario {
    private ArraySinRepetidos unArray;
    private Scanner teclado;

    public InterfazUsuario() {
        this.unArray = new ArraySinRepetidos();
        this.teclado = new Scanner(System.in);
    }

    public void ejecutar() {
        int nuevoElemento;
        do {
            System.out.println("Introduce un número (o 0 para salir): ");
            nuevoElemento = teclado.nextInt();
            if (nuevoElemento != 0) {
                unArray.insertar(nuevoElemento);
            }
        } while (nuevoElemento != 0 && !unArray.estaCompleto());
    }

    public void ejecutarOrdenadamente() {
        int nuevoElemento;
        do {
            System.out.println("Introduce un número (o 0 para salir): ");
            nuevoElemento = teclado.nextInt();
            if (nuevoElemento != 0) {
                insertarOrdenadamente(nuevoElemento);
            }
        } while (nuevoElemento != 0 && !unArray.estaCompleto());
    }

    private void insertarOrdenadamente(int nuevoElemento) {
        int i = 0;
        while (i < unArray.siguiente && nuevoElemento < unArray.elementos[i]) {
            i++;
        }
        if (i < ArraySinRepetidos.MAX) {
            // Desplazar los elementos mayores a la derecha
            for (int j = unArray.siguiente; j > i; j--) {
                unArray.elementos[j] = unArray.elementos[j - 1];
            }
            // Insertar el nuevo elemento en la posición correcta
            unArray.elementos[i] = nuevoElemento;
            unArray.siguiente++;
        }
    }

    public void imprimir() {
        System.out.println(Arrays.toString(unArray.elementos));
    }
}
