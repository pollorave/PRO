import java.util.*;

/**
 * La clase LabClase representa una lista de alumnos
 * que se han matriculado en una clase laboratorio.
 * Almacena la hora, aula y participantes en el laboratorio,
 * as� como el nombre del profesor
 */

public class Laboratorio
{
    private String profesor;
    private String aula;
    private String horario;
    private List<Estudiante> estudiantes;
    private int capacidad;
    
    /**
     * crear un objeto de la clase Laboratorio con el m�ximo n� de 
     * alumnos que pueden matricularse. El resto de valores se inician 
     * con los valores por defecto
     */
    public Laboratorio(int maxNumeroEstudiantes)
    {
        profesor = "profesor desconocido";
        aula = "aula desconocida";
        horario = "desconocido";
        estudiantes = new ArrayList<Estudiante>();
        capacidad = 3;
    }

    /**
     * A�adir un estudiante a la lista de clase
     */
    public void matricularEstudiante(Estudiante nuevoEstudiante)
    {
        if(estudiantes.size() == capacidad) {
            System.out.println("La clase est� completa, no se puede matricular");
        }
        else {
            estudiantes.add(nuevoEstudiante);
        }
    }
    
    /**
     * Devolver el n� de estudianes actualmente matriculados
     */
    public int numeroEstudiantes()
    {
        return estudiantes.size();
    }
    
    /**
     * establecer el aula
     */
    public void setAula(String queAula)
    {
        aula = queAula;
    }
    
    /**
     * Establecer el horario para esta clase. El par�metro
     * define el d�a y la hora "Viernes, 10 a.m."
     */
    public void setHorario(String queHorario)
    {
        horario = queHorario;
    }
    
    /**
     * Establecer el profesor
     */
    public void setProfesor(String queProfesor)
    {
        profesor = queProfesor;
    }
    
    /**
     * Print out a class list with other LabClass details to the standard
     * terminal.
     */
    public void escribirLista()
    {
        System.out.println("Clase Laboratorio " + horario);
        System.out.println("Profesor: " + profesor + "   aula: " + aula);
        System.out.println("Lista de la clase:");
        Iterator i = estudiantes.iterator();
        while(i.hasNext()) {
            Estudiante estudiante = (Estudiante)i.next();
            estudiante.print();
        }
        System.out.println("N�mero of estudiantes: " + numeroEstudiantes());
    }
}
