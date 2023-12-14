import java.util.Arrays;

public class Calculadora{
    private static int MAX;
    private int[] numeros;
    private int total;

    public Calculadora(){
        this.numeros = new int[MAX];
        this.total = 0;
    }

    public Calculadora(int[] numeros){
        if (numeros.length > MAX) {
            System.out.println("Error: El tamaño del parámetro es mayor del permitido.");
        }

        this.numeros = Arrays.copyOf(numeros, MAX);
        this.total = numeros.length;
    }

    public void introducirNumero (int numero){
        if (numeros.length < MAX) {
            numeros[total] = numero;
        }
        else System.out.println("Error");
    }

    public int contarMayoresQue(int valor){
        int contador = 0;
        for (int i = 0; i < total; i++) {
            if (numeros[i] > valor) {
                contador++;
            }
        }
        return contador;
    }

    public void escribirNumeros(){
        for (int i = 0; i < total; i++) {
            System.out.println("Posición: " + i + ", Valor: " + numeros[i]);
        }
    }

    public int getTotal(){
        return total;
    }

    public void intercambiar(int posicion1, int posicion2){
        
    }

    private boolean hayNumeros(){
        if (total > 0) {
            return true;
        }
        else return false;
    }

    public void borrarUltimoElemento() {
        if (hayNumeros()) {
            total--;
        }
    }

    public void borrarPares() {
        for (int i = 0; i < total; i++) {
            if (esPar(numeros[i])) {
                borrarUnPar(i);
                i--;
            }
        }
    }

    private boolean esPar(int numero) {
        return numero % 2 == 0;
    }

    private void borrarUnPar(int posicion) {
        for (int i = posicion; i < total - 1; i++) {
            numeros[i] = numeros[i + 1];
        }
        total--;
    }
}
