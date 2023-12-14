/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package planetas;

import java.util.Scanner;
import static planetas.Planeta.TIERRA;

/**
 *
 * @author MiguelHernandez
 */
public class Planetas {

    /** como todo es static por defecto, no hay problema de usarlo aquí en el main,
     * que es static. Me refiero a que en un metodo estatico solo podemos usar los
     * atributos y métodos static de la clase. Pues bien, todos lo son.
     * Meto el main en el propio enum, para demostrar que se puede y así
     * puedo declarar los métodos 'private'.
     */ 
    public static void main(String[] args){
        Scanner teclado=new Scanner(System.in);
        System.out.print("\nIntroduzca su peso en kilogramos: ");
        double pesoTierra = teclado.nextDouble();
        double masa = pesoTierra/TIERRA.gravedad();
    
        for (Planeta p : Planeta.values())
           System.out.println("Tu peso en " + p + " es " + p.peso(masa));
    }    
}
