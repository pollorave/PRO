import java.util.Random;

public class Histograma {
    private static final int MAX = 10;
    private int[] valores;

    public Histograma() {
        valores = new int[MAX];
        inicializar();
    }

    private void inicializar() {
        for (int i = 0; i < MAX; i++) {
            valores[i] = generarAleatorio();
        }
    }

    private int generarAleatorio() {
        Random rand = new Random();
        return rand.nextInt(46) + 5;
    }

    public void escribirHistograma() {
        for (int i = 0; i < MAX; i++) {
            for (int j = 0; j < valores[i]; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
