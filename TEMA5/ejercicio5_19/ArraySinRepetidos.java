import java.util.Arrays;
import java.util.Scanner;

class ArraySinRepetidos {
    private static final int MAX = 10;
    private int[] elementos;
    int siguiente;

    public ArraySinRepetidos() {
        elementos = new int[MAX];
        siguiente = 0;
    }

    public void insertar(int nuevoElemento) {
        if (!estaElemento(nuevoElemento) && !estaCompleto()) {
            elementos[siguiente++] = nuevoElemento;
        }
    }

    private boolean estaElemento(int numero) {
        for (int i = 0; i < siguiente; i++) {
            if (elementos[i] == numero) {
                return true;
            }
        }
        return false;
    }

    public boolean estaCompleto() {
        if (elementos[i] == MAX) {
            return true;
        }
        return false;
    }
}