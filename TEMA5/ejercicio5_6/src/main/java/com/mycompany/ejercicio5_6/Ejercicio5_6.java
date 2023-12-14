/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicio5_6;

/**
 *
 * @author Angel
 */
public class Ejercicio5_6 {

    public static double calcularMedia (double [] notas) {
        double media, sum = 0;
        int tam = notas.length;
        for(int i = 0; i<tam;i++) sum += notas[i];
        media = sum/tam;
        return media;
    }
}
