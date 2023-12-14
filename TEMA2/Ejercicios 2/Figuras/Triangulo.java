import java.awt.*;
import java.awt.geom.*;

/**
 * Un triangulo que puede ser manipulado y que se 
 * dibuja a s� mismo en el canvas
 * 
 * @autor  Michael Kolling y David J. Barnes
 */

public class Triangulo
{
    private int altura;
    private int ancho;
    private int xPosicion;
    private int yPosicion;
    private String color;
    private boolean esVisible;
    
    /**
     * Crear un triangulo en la posici�n por defecto y
     * con el color por defecto
     */
    public Triangulo()
    {
        altura = 30;
        ancho = 40;
        xPosicion = 20;
        yPosicion = 60;
        color = "red";
        esVisible = false;
    }

    /**
     * Hacer el triangulo visible, si ya lo est� no pasa nada
     */
    public void hacerVisible()
    {
        esVisible = true;
        dibujar();
    }
    
    /**
     * Hacer el triangulo invisible, si ya lo est� no pasa nada
     */
    public void hacerInvisible()
    {
        borrar();
        esVisible = false;
    }
    
    /**
     * Mover el triangulo unos cuanto p�xeles a la derecha
     */
    public void moverDerecha()
    {
        moverHorizontal(20);
    }

    /**
     * Mover el triangulo unos cuanto p�xeles a la izquierda
     */
    public void moverIzquierda()
    {
        moverHorizontal(-20);
    }

    /**
     * Mover el triangulo unos cuanto p�xeles hacia arriba
     */
    public void moverArriba()
    {
        moverVertical(-20);
    }

    /**
     * Mover el triangulo unos cuanto p�xeles hacia abajo
     */
    public void moverAbajo()
    {
        moverVertical(20);
    }

    /**
     * Mover el triangulo horizontalmente
     */
    public void moverHorizontal(int distancia)
    {
        borrar();
        xPosicion += distancia;
        dibujar();
    }

    /**
     * Mover el triangulo verticalmente
     */
    public void moverVertical(int distancia)
    {
        borrar();
        yPosicion += distancia;
        dibujar();
    }

    /**
     * Mover el triangulo despacio horizontalmente
     */
    public void moverDespacioHorizontal(int distancia)
    {
        int delta;

        if(distancia < 0) 
        {
            delta = -1;
            distancia = -distancia;
        }
        else 
        {
            delta = 1;
        }

        for(int i = 0; i < distancia; i++)
        {
            xPosicion += delta;
            dibujar();
        }
    }

    /**
     * Mover el triangulo despacio verticalmente
     */
    public void moverDespacioVertical(int distancia)
    {
        int delta;

        if(distancia < 0) 
        {
            delta = -1;
            distancia = -distancia;
        }
        else 
        {
            delta = 1;
        }

        for(int i = 0; i < distancia; i++)
        {
            yPosicion += delta;
            dibujar();
        }
    }

    /**
     * Cambiar el tama�o al nuevo tama�o (en pixeles). Debe ser >= 0.
     */
    public void cambiarTamano(int nuevoAlto, int nuevoAncho)
    {
        borrar();
        altura = nuevoAlto;
        ancho = nuevoAncho;
        dibujar();
    }

    /**
     * Cambiar el color. Colores v�lidos son "red", "yellow", "blue", "green",
     * "magenta" and "black".
     */
    public void cambiarColor(String nuevoColor)
    {
        color = nuevoColor;
        dibujar();
    }

    /*
     * Dibujar el triangulo con las especificaciones actuales en la pantalla
     */
    
    private void dibujar()
    {
        if(esVisible) {
            Canvas canvas = Canvas.getCanvas();
            int [] xPuntos={ xPosicion, xPosicion + (ancho / 2), 
                                        xPosicion - (ancho / 2 )};
            int [] yPuntos={ yPosicion, yPosicion + altura, yPosicion + altura };                            
            canvas.dibujar(this, color, new Polygon(xPuntos, yPuntos,3));                                                    
            canvas.esperar(10);
        }
    }

    /*
     * Borra el Triangulo de la pantalla
     */
    private void borrar()
    {
        if(esVisible) {
            Canvas canvas = Canvas.getCanvas();
            canvas.borrar(this);
        }
    }
}
