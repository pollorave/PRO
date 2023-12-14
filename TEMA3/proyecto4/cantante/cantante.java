public class cantante{
    private boolean feliz;
    
    public cantante (){
        feliz=true;
    }
    
    public void cantar(){
        if (feliz==true){
            System.out.println("Cantando bajo la lluvia");
        }
        else System.out.println("No tiene animos para cantar");
    }
    
    public boolean estaTriste1(){
        if (feliz==false){
            return true;
        }
        else return false;
    }
    
    public boolean estaTriste2(){
        return (feliz==false);
    }
    
    public void cambiarEstadoAnimo(){
        feliz=!feliz;
    }
}