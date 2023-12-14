
/**
 * Write a description of class Principal here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Principal
{
    public static void main(String[] args){
        numero nuevo=new numero(20);
        numero otro=new numero(10);
        String resultado=nuevo.comprobar(20);
        nuevo.esMayorQue(10);
        
        System.out.println(nuevo+" es mayor que "+otro);
    }
}
