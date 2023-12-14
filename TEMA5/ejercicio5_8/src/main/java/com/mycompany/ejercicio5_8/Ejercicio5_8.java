/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicio5_8;

/**
 *
 * @author Angel
 */
public class Ejercicio5_8 {

    public int[] obtenerPares(int[] array){
        int pares = 0;
        for (int i = 0; i<array.length; i++){
            if (array[i] % 2 == 0) pares++;
        }
        int[] vPares = new int[pares];
        int j = 0;
        for (int i = 0; i<array.length; i++){
            if (array[i] % 2 == 0){
                vPares[j] = array[i];
                j++;
            }
        }
        return vPares;
    }
}
