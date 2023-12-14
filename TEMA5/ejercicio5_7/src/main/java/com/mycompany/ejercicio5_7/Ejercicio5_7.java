/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicio5_7;

/**
 *
 * @author Angel
 */
public class Ejercicio5_7 {

    public static int valorMaximo (int [] maximo) {
        int max = maximo[0];
        for (int i = 1; i < maximo.length; i++) {
            if (i == 0) max = maximo[1];
            else if(max < maximo[1]) max = maximo[i];
        }
        return max;
    }
}