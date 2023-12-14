public class numero{
    private int numero;
    
    public numero(int queNumero){
        numero=queNumero;
    }
    
    //public boolean esMayorQue(int otroNumero){
    //    if(numero>otroNumero){
    //        return true;
    //    }
    //    else return false;
    //}
    
    //public boolean esMenorQue(int otroNumero){
    //    if(numero<otroNumero){
    //        return true;
    //    }
    //    else return false;
    //}
    
    //public boolean esIgualQue(int otroNumero){
    //    if(numero==otroNumero){
    //        return true;
    //    }
    //    else return false;
    //}
    
    public boolean esMayorQue(int otroNumero){
        return numero>otroNumero;
        }
    
    public boolean esMenorQue(int otroNumero){
        return numero<otroNumero;
        }
    
    public boolean esIgualQue(int otroNumero){
        return numero==otroNumero;
        }
    
    public String comprobar(int otroNumero){
        if (numero>otroNumero){
            return "Mas grande";
        }
        else if (numero<otroNumero){
            return "Es menor";
        }
        else return "Es igual";
    }
}