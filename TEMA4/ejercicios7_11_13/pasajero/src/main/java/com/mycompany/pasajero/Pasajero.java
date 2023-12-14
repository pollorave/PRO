/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.pasajero;

/**
 *
 * @author Angel
 */
public class Pasajero {

    private String nombre;
    private int edad;
    
    public Pasajero(String queNombre){
        nombre = queNombre;
        edad = -1;
    }
    
    public Pasajero(String queNombre, int queEdad){
        nombre = queNombre;
        edad = queEdad;
    }
    
    public String getNombre(){
    return nombre;
    }
    
    public int getEdad(){
    return edad;
    }
    
    public void printDetalles(){
        if(edad <= 0){
           System.out.println("Nombre: "+nombre+"\nEdad sin especificar"); 
        }
        else System.out.println("Nombre: "+nombre+"\nEdad: "+edad);
    }
    
    public boolean esMasJovenQue(Pasajero otroPasajero){
        if (otroPasajero == null) {
            return false;
        }
        if (this.edad <= 0 || otroPasajero.edad <= 0){
            return false;
        }
        return this.edad < otroPasajero.edad;
    }
}
