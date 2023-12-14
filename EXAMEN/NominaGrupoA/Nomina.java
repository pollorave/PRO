public class Nomina{
    private int COMPLEMENTO_DESTINO=650;
    private int COMPLEMENTO_ESPECIFICO=630;
    private int VALOR_TRIENIO=25;
    private double IRPF=0.18;
    private String nombre;
    private int edad, numTrienios, sueldoBase;

    public Nomina(String n, int e){
        nombre=n;
        edad=e;
        numTrienios=0;
        sueldoBase=0;
    }
    
    public int getComDes(){
        return COMPLEMENTO_DESTINO;
    }
    
    public int getComEsp(){
        return COMPLEMENTO_ESPECIFICO;
    }
    
    public int getValTri(){
        return VALOR_TRIENIO;
    }
    
    public double getIrpf(){
        return IRPF;
    }
    
    public String getNombre(){
        return nombre;
    }
    
    public int getEdad(){
        return edad;
    }
    
    public int getNumTri(){
        return numTrienios;
    }
    
    public int getSueldo(){
        return sueldoBase;
    }
    
    public void setNombre(String queNombre){
        nombre=queNombre;
    }
    
    public void setEdad(int queEdad){
        edad=queEdad;
    }
    
    public void setNumTri(int queTrienios){
        numTrienios=queTrienios;
    }
    
    public void setSueldo(int queSueldo){
        sueldoBase=queSueldo;
    }
    
    public boolean esMenorDe25(){
        if (edad<25) return true;
        else return false;
    }
    
    public int getComplementos(){
        return COMPLEMENTO_DESTINO+COMPLEMENTO_ESPECIFICO;
    }
    
    public double getImporteIRPF(){
        int trienios=VALOR_TRIENIO*numTrienios;
        int complementos=COMPLEMENTO_DESTINO+COMPLEMENTO_ESPECIFICO;
        
        if(edad>=25) return (sueldoBase+trienios+complementos)*IRPF;
        else return 0;
    }
    
    public int importePorTrienio(){
        return VALOR_TRIENIO*numTrienios;
    }
    
    public double getSueldoTotal(){
        int trienios=VALOR_TRIENIO*numTrienios;
        int complementos=COMPLEMENTO_DESTINO+COMPLEMENTO_ESPECIFICO;
        int sueldo_bruto=sueldoBase+trienios+complementos;
        
        return sueldo_bruto-(sueldo_bruto*IRPF);
    }
    
    public String toString(){
        int trienios=VALOR_TRIENIO*numTrienios;
        int complementos=COMPLEMENTO_DESTINO+COMPLEMENTO_ESPECIFICO;
        int sueldo_bruto=sueldoBase+trienios+complementos;
        double sueldo_neto=sueldo_bruto-(sueldo_bruto*IRPF);
        
        return "Nombre: "+nombre+
        "\nEdad: "+edad+
        "\nSueldo base: "+sueldoBase+
        "\nImporte por trienios: ("+numTrienios+") - "+trienios+
        "\nComplementos (Destino y especificos): "+complementos+
        "\nSueldo bruto: "+sueldo_bruto+
        "\nSueldo neto: "+sueldo_neto;
    }
    
    public void imprimir(){
        System.out.println(toString());
    }
}
