/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ferry;

/**
 *
 * @author Angel
 */
public class Ferry {

    private String asiento1;
    private String asiento2;
    private String asiento3;
    private int numPasajeros;
    
    public Ferry(){
        asiento1 = null;
        asiento2 = null;
        asiento3 = null;
        numPasajeros = 0;
    }
    
    public int getNumeroPasajeros(){
        return numPasajeros;
    }
    
    public void printDetallesPasajeros(){
        if (numPasajeros == 0){
            System.out.println("No hay pasajeros.");
        }
        else{
            System.out.println("Los pasajeros son:");
            if (asiento1 != null) {
                asiento1.printDetalles();
            }
            if (asiento2 != null) {
                asiento2.printDetalles();
            }
            if (asiento3 != null) {
                asiento3.printDetalles();
            }
        }
    }
    
    public boolean añadirPasajero(Pasajero nuevoPasajero) {
        if (numPasajeros == 0) {
            asiento1 = nuevoPasajero;
        } else if (numPasajeros == 1) {
            asiento2 = nuevoPasajero;
        } else if (numPasajeros == 2) {
            asiento3 = nuevoPasajero;
        }
        numPasajeros++;
        
        return pasajero.getEdad() >= 0;
    }
    
    public boolean añadirPasajeroPorNombre(String nombre) {
        if (numPasajeros >= 3){
            return false;
        }
        else{
            Pasajero nuevoPasajero = new Pasajero(nombre);
            añadirPasajero(nuevoPasajero);
            return true;
        }
    }
    
    public Pasajero borrarPasajero() {
        if (numPasajeros == 0){
            return null;
        }
        else{
            Pasajero pasajeroBorrado = asiento1;
            asiento1 = asiento2;
            asiento2 = asiento3;
            asiento3 = null;
            numPasajeros--;

            return pasajeroBorrado;
        }
    }
}
