public class Libro{
    private String Autor;
    private String Titulo;
    private int Paginas;
    private String NumeroReferencia;
    private int VecesPrestado;
    
    public Libro (String queAutor,String queTitulo, int quePaginas){
        Autor=queAutor;
        Titulo=queTitulo;
        Paginas=quePaginas;
    }
    
    public void print(){
        System.out.println("El autor del libro es: "+Autor);
        System.out.println("El titulo del libro es: "+Titulo);
    }
    
    public String printAutor(){
        return Autor;
    }
    
    public String printTitulo(){
        return Titulo;
    }
    
    public int numeroPaginas(){
        return Paginas;
    }
    
    public void printDetalles(){
        System.out.println("Titulo: "+Titulo);
        System.out.println("Autor: "+Autor);
        System.out.println("Paginas: "+Paginas);
        System.out.println("Numero de referencia: "+NumeroReferencia);
    }
    
    public void setNumeroReferencia(String nr){
        NumeroReferencia=nr;
    }
    
    public String getNumeroReferencia(){
        return NumeroReferencia;
    }
    
    public void setVecesPrestado(int vp){
        VecesPrestado=vp;
    }
    
    public int getVecesPrestado(){
        return VecesPrestado;
    }
}