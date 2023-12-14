public class PintorFiguras{
    private static final char BLANCO = ' ';
    private static final char NEGRO = '*';

    public PintorFiguras(){
        // No se necesitan atributos en este caso
    }

    public void dibujarTableroAjedrez(){
        int filas = 8;
        int columnas = 8;

        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                char color = ((i + j) % 2 == 0) ? BLANCO : NEGRO;
                System.out.print(color + " ");
            }
            System.out.println();
        }
    }

    public void dibujarArbolNavidad(){
        int niveles = 9;

        for (int i = 1; i <= niveles; i++){
            for (int j = niveles - i; j > 0; j--){
                System.out.print(" ");
            }

            for (int k = i; k <= 2 * i - 1; k++){
                System.out.print(k % 10);
            }

            for (int l = 2 * i - 2; l >= i; l--){
                System.out.print(l % 10);
            }

            System.out.println();
        }
        System.out.println("       000");
        System.out.println("       000");
    }
}