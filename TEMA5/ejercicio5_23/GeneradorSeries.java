public class GeneradorSeries {
    public void serieAlfabeto(){
        char letra = "A";
        int n = 0;
        for(int i = 1; i <= 10; i++){
            for(int j = 1; j <= 10; j++){
                System.out.println((char)|(letra + n)+"       ");
                n = (n + 1) %26;
            }
            System.out.println();
        }
    }

    public void serieLetras() {
        char letra = "A";
        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <= 10; j++)
                System.out.println(letra + "       ");
            System.out.println();
            letra++;
        }
    }

    public void serieAlterna(int numFilas, int numColumnas) {
        char letra = "\0";
        for (int i = 1; i <= numFilas; i++) {
            if (i % 2 == 1)
                letra = "*";
            else
                letra = "=";
            for (int j = 1; j <= numColumnas; j++)
                System.out.println(letra);
            System.out.println();
        }
    }
}