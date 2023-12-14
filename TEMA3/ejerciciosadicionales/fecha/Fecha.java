

public class Fecha
{
   private int dia;
   private int mes;
   private int año;
   
   public Fecha (int d, int m, int a){
       dia=d;
       mes=m;
       año=a;
    }
    
    public boolean esBisiesto(){
        return (año%4==0 && año%100!=0 || año%400==0);}
    
    public int diaMes(){
            switch (mes){
                case 1: 
                case 3:
                case 5:
                case 7:
                case 9:
                case 11: dia=30;
                break;
                case 4:
                case 6:
                case 8:
                case 10:
                case 12: dia=31;
                break;
                case 2:if (esBisiesto() == true) dia=29;
                else dia=28;
                break;
            }
            return diaMes();
        }
            
            public void printCorta(){
                System.out.print (+dia+"-"+mes+"-"+año+"");
            }
            
            public void printLarga(){
                switch (mes){
                case 1: System.out.print (+dia+ "de Enero de "+año+"");
                break;
                case 3: System.out.print (+dia+ "de Marzo de " +año+"");
                break;
                case 5:System.out.print (+dia+ "de Mayo de " +año+"");
                break;
                case 7:System.out.print (+dia+ "de Julio de " +año+"");
                break;
                case 9:System.out.print (+dia+ "de Septiembre de " +año+"");
                break;
                case 11: System.out.print (+dia+ "de Noviembre de " +año+"");
                break;
                case 4:System.out.print (+dia+ "de Abril de " +año+"");
                break;
                case 6:System.out.print (+dia+ "de Junio de " +año+"");
                break;
                case 8:System.out.print (+dia+ "de Agosto de " +año+"");
                break;
                case 10:System.out.print (+dia+ "de Octubre de " +año+"");
                break;
                case 12: System.out.print (+dia+ "de Diciembre de " +año+"");
                break;
                case 2:System.out.print (+dia+ "de Febrero de " +año+"");
                break;
            }
                }
                
                public boolean esCorrecta(){
                if (1<=mes && mes<=12 )
                if (mes == 2){
                    if(esBisiesto()){
                        return 1<=dia && dia<=29;
                    }else{
                    return 1<=dia && dia<=28;}}
                else if(mes==1||mes==3||mes==5||mes==7||mes==9||mes==11){
                return 1<=dia && dia<=30;}
                else{return 1<=dia && dia<=31;}
                return true;}
                    
}
