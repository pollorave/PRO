public class Persona {
    private String nombre;
    int estadoCivil;
    private int fechaNac;

    public Persona(String n, int queEstado, int f) {
        nombre = n;
        estadoCivil = queEstado;
        switch (estadoCivil) {
            case 1:
                int SOLTERO = 1;
                break;
            case 2:
                int CASADO = 2;
                break;
            case 3:
                int VIUDO = 3;
                break;
            case 4:
                int DIVORCIADO = 4;
                break;
            default:
                break;
        }
        if (estadoCivil < 1 || estadoCivil > 4) {
            estadoCivil = 1;
        }
        fechaNac = f;
    }

    public Persona(String n, int f) {
        nombre = n;
        estadoCivil = 1;
        fechaNac = f;
    }

    public void setFecha(int d, int m, int a) {
        if (d < 1 && d > 31 || m < 1 && m > 12 || a < 1900 && a > 2024) {
            return;
        }
    }

    public String getNombre(String nombre) {
        return nombre;
    }

    public static int getEstadoCivil(int estadoCivil) {
        return estadoCivil;
    }

    public String toString(int d, int m, int a) {
        System.out.println("Nombre: " + nombre);
        System.out.println("Estado civil: " + estadoCivil);
        if (d >= 1 && d <= 9 && m >= 10 && m <= 12) {
            System.out.println("Fecha de nacimiento: 0" + d + "/" + m + "/" + a);
        }
        if (d >= 10 && d <= 31 && m >= 1 && m <= 9) {
            System.out.println("Fecha de nacimiento: " + d + "/0" + m + "/" + a);
        }
        if (d >= 1 && d <= 9 && m >= 1 && m <= 9) {
            System.out.println("Fecha de nacimiento: 0" + d + "/0" + m + "/" + a);
        } else
            System.out.println("Fecha de nacimiento: " + d + "/" + m + "/" + a);

        return toString();
    }
}