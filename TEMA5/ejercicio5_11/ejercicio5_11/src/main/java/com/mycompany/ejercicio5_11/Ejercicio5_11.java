/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicio5_11;

/**
 *
 * @author Angel
 */
public class Ejercicio5_11 {

    public static int[] calcularFrecuencias(){
        final int cuantos = 100;
        int[] aux = new int[cuantos];
        for(int i=0; i < cuantos; i++){
            int valores = (int)(Math.random()*9)+1;
            aux[valores-1]++;
        }
        return aux;
    }
}
