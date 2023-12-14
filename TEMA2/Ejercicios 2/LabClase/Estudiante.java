
/**
 * La clase Estudiante representa a un estudiante.
 * Mantiene informaci�n relevante sobre un estudiante.
 */

public class Estudiante
{
    // nombre completo del estudiante
    private String nombre;
    // ID del estudiante
    private String id;
    // cantidad de cr�ditos por estudio obtenidos hasta ahora
    private int creditos;

    /**
     * Crear un nuevo estudiante con un nombre e ID dado
     */
    public Estudiante(String queNombre, String queID)
    {
        nombre = queNombre;
        id = queID;
        creditos = 0;
    }

    /**
     * Devuelve el nombre completo del estudiante
     */
    public String getNombre()
    {
        return nombre;
    }

    /**
     * Establece un nuevo nombre para el estudiante
     */
    public void cambiarNombre(String queNombre)
    {
        nombre = queNombre;
    }

    /**
     * Devueleve el ID del estudiante
     */
    public String getID()
    {
        return id;
    }

    /**
     * A�adir algunos puntos de cr�dito a los ya obtenidos
     */
    public void aniadirCreditos(int puntosAdicionales)
    {
        creditos += puntosAdicionales;
    }

    /**
     * devuelve el n� de cr�ditos acumulados hasta el momento
     */
    public int getCreditos()
    {
        return creditos;
    }

    /**
     * Devuelve el login (nombre login) del estudiante. El login
     * es una combinaci�n de los cuatro primeros caracteres del nombre
     * del estudiante y los tres primeros caracteres de su ID
     */
    
    public String getLogin()
    {
        return nombre.substring(0,4) + id.substring(0,3);
    }
    
    /**
     * Escribir el nombre del estudiante en la consola
     */
    public void print()
    {
        System.out.println(nombre + " (" + id + ")");
    }
}
