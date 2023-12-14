/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicio5_9;

/**
 *
 * @author Angel
 */
public class Ejercicio5_9 {

    public static void rotarDerecha(int[] numeros){
        int tam = numeros.length;
        int aux = numeros[tam-1];
        for(int i = tam-1; i>0; i--) numeros[i] = numeros[i-1];
        numeros[0]=aux;
    }
    
    public static void rotarIzquierda(int[] numeros, int n){
        int tam=numeros.length;
        if(n>tam) n=tam;
        for(int j=0; j<n; j++) rotarDerecha(numeros);
    }
}
