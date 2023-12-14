import java.util.Arrays;

public class Tren {
    private static final int MAX_VAGONES = 10;

    private Vagon[] vagones;
    private int siguienteVagon;

    public Tren() {
        this.vagones = new Vagon[MAX_VAGONES];
        this.siguienteVagon = -1;
    }

    public int getNumeroVagones() {
        return siguienteVagon + 1;
    }

    public boolean añadirVagon(Vagon vagon) {
        if (vagon != null && siguienteVagon < MAX_VAGONES - 1) {
            vagones[++siguienteVagon] = vagon;
            return true;
        }
        return false;
    }

    public Vagon borrarVagon(int posicion) {
        if (posicion >= 0 && posicion <= siguienteVagon) {
            Vagon vagonBorrado = vagones[posicion];
            for (int i = posicion; i < siguienteVagon; i++) {
                vagones[i] = vagones[i + 1];
            }
            vagones[siguienteVagon--] = null;
            return vagonBorrado;
        }
        return null;
    }

    public void printListaVagones() {
        if (siguienteVagon == -1) {
            System.out.println("El tren no tiene ningún vagón");
        } else {
            for (int i = 0; i <= siguienteVagon; i++) {
                vagones[i].printDetalles();
            }
        }
    }

    public boolean emitirTicket() {
        for (int i = 0; i <= siguienteVagon; i++) {
            if (vagones[i].reservarSiguienteAsiento()) {
                return true;
            }
        }
        return false;
    }

    public void ordenarVagones() {
        for (int i = 0; i < siguienteVagon; i++) {
            int maxIndex = i;
            for (int j = i + 1; j <= siguienteVagon; j++) {
                if (vagones[j].getCapacidad() > vagones[maxIndex].getCapacidad()) {
                    maxIndex = j;
                }
            }
            Vagon temp = vagones[i];
            vagones[i] = vagones[maxIndex];
            vagones[maxIndex] = temp;
        }
    }
}
