 /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package planetas;

import java.util.Scanner;

/**
 *
 * @author MiguelHernandez
 */
public enum Planeta {
    MERCURIO (3.303e+23, 2.4397e6), //al crear los nombres se les pone
    VENUS   (4.869e+24, 6.0518e6), //los valores que necesita el constructor
    TIERRA   (5.976e+24, 6.37814e6),//en el mismo orden que estan los parámetros
    MARTE    (6.421e+23, 3.3972e6),
    JUPITER (1.9e+27,   7.1492e7),
    SATURNO  (5.688e+26, 6.0268e7),
    URANO  (8.686e+25, 2.5559e7),
    NEPTUNO (1.024e+26, 2.4746e7);

    private final double masa;   // en kilogramos
    private final double radio; // en metros
    public  final double G=6.67300E-11;// constante gravitatoria universal
    
    /** el constructor es obligatoriamente private, pero entonces,
     * ¿quién lo llama? nadie; cada constante tiene los parámetros 
     * para asignarle a sus atributos masa y radio.
     */
    private Planeta(double queMasa, double queRadio){
        masa = queMasa;
        radio = queRadio;
    }
    
    /** puede haber métodos privados o públicos que van a servir para lo 
     * que sea.
     * no se crean objetos de un enum, para usar sus métodos, al ser
     * static, se pone el nombre de una de las constantes seguido de 
     * punto y del método: VENUS.getMasa(); significa que se te devuelve
     * la masa de Venus y no otra.
     */
    private double getMasa(){ 
        return masa; 
    }
    
    private double getRadio(){ 
        return radio; 
    }
    
    /** 
     * gravedad dependiendo de la masa y el radio del planeta
     */
    public double gravedad(){
        return G * masa / (radio * radio);
    }
    
    /**
     * peso en el planeta cuya gravedad se usa para el cálculo
     */
    public double peso(double nuevaMasa){
        return nuevaMasa * gravedad();
    }
}
