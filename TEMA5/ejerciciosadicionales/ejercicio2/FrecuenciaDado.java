import java.util.Random;

class Dado {
    private Random random;

    public Dado() {
        random = new Random();
    }

    public int lanzarDado() {
        return random.nextInt(6) + 1;
    }
}

public class FrecuenciaDado {
    private Dado dado;
    private int[] frecuencia;

    public FrecuenciaDado() {
        dado = new Dado();
        frecuencia = new int[6];
    }

    public void tirarDado(int veces) {
        for (int i = 0; i < veces; i++) {
            int caraDado = dado.lanzarDado();
            frecuencia[caraDado - 1]++;
        }
    }

    public void escribirFrecuencia() {
        System.out.println("Cara\tFrecuencia");
        for (int i = 0; i < frecuencia.length; i++) {
            System.out.println((i + 1) + "\t" + frecuencia[i]);
        }
    }

    public static void main(String[] args) {
        FrecuenciaDado frecuenciaDado = new FrecuenciaDado();
        frecuenciaDado.tirarDado(7);
        frecuenciaDado.tirarDado(7);
        frecuenciaDado.tirarDado(9);
        frecuenciaDado.tirarDado(10);
        frecuenciaDado.tirarDado(7);
        frecuenciaDado.tirarDado(10);
        frecuenciaDado.escribirFrecuencia();
    }
}
