/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicio5_10;

/**
 *
 * @author Angel
 */
public class Ejercicio5_10 {

    public static int[] generarArray(){
        final int MAX = 12;
        int[] vPares = new int[MAX];
        int aux = 0;
        for (int i = 0; i < MAX;){
            aux = (int) (Math.random()*50)+i;
            if(aux%2 == 0){
                vPares[1] = aux;
                i++;
            }
        }
        return vPares;
    }
}