package metodosnumericos;
import java.util.Scanner;
/**
 *
 * @author Ricardo
 */
public class MetodosNumericos {

    public static void main(String[] args) {
       Scanner teclado=new Scanner (System.in);
       int elec, var = 0, lims = 0;
       boolean salir2=false;
       
       do{
           System.out.println("Menu de opciones");
           System.out.println("1.e^x");
           System.out.println("2.e^-x");
           System.out.println("3.Ecuación cuadrática.");
           System.out.println("4.Varianza");
           System.out.println("5.Salir");
           System.out.println("Ingrese el numero correspondiente a la operacion a realizar");
           elec=teclado.nextInt();
           System.out.println();
           
           if (elec==1 || elec==2){
               System.out.println("Ingrese el valor de la variable x");
                   var=teclado.nextInt();
                   System.out.println("Ingrese el valor del limite superior");
                   lims=teclado.nextInt();
                   System.out.println();
           }
           switch (elec){
               case 1:
                   double suma=0;
                   
                   for(int x=0; x<lims+1; x++)
                       suma=suma+Math.pow(var,x)/(fac(x));
                   System.out.println("El resultado es:"+suma);
                   break;
               
               case 2:
                   double suma2=0;
                   for(int x=0;x<lims+1;x++)
                       suma2=suma2+1/(Math.pow(var,x)/(fac(x)));
                   System.out.println("El resultado es:"+suma2);
                   break;
               
               case 3:
                   boolean salir=false;
                   do{
                       double ter1 = 0, ter2 = 0, ter3 = 0, x1, x2;
                       int metodo = 0;
                       System.out.println("1. Formula General");
                       System.out.println("2.Racionalizar un numerador");
                       System.out.println("3.A la inversa");
                       System.out.println("4.Salir");
                       System.out.println("Elija el metodo por el cual desea resolver la ecuacion:");
                       metodo=teclado.nextInt();
                       
                       if (metodo==1 || metodo==2 || metodo==3){
                           System.out.println("Ingrese el valor del primer termino");
                           ter1=teclado.nextDouble();
                           System.out.println("Ingrese el valor del segundo termino");
                           ter2=teclado.nextDouble();
                           System.out.println("Ingrese el valor del segundo termnino");
                           ter3=teclado.nextDouble();
                       }
                       switch (metodo){
                           case 1:
                               double numero= (ter2*ter2)-(4*ter1*ter3);
                               if(numero>0){
                                   x1=(-ter2+Math.sqrt(numero))/(2*ter1);
                                   x2=(-ter2-Math.sqrt(numero))/(2*ter1);
                                   System.out.println("La ecuación tiene dos soluciones");
                                   System.out.println("X1;"+x1);
                                   System.out.println("X2;"+x2);
                               }else{
                                   if(numero==0){
                                       x1=(-ter2+Math.sqrt(numero))/(2*ter1);
                                       System.out.println("La ecuación tiene una solución");
                                       System.out.println("X1;"+x1);
                                   }else
                                       System.out.println("La ecuación no tiene solución");
                                   }
                               break;
                           
                           case 2:
                               double num= (ter2*ter2)-(4*ter1*ter3);
                               if(num>0){
                                   x1=((-2)*(ter3))/(ter2+Math.sqrt(num));
                                   x2=((-2)*(ter3))/(ter2-Math.sqrt(num));
                                   System.out.println("La ecuación tiene dos soluciones");
                                   System.out.println("X1;"+x1);
                                   System.out.println("X2;"+x2);
                               }else{
                                   if(num==0){
                                       x1=((-2)*(ter3))/(ter2+Math.sqrt(num));
                                       System.out.println("La ecuación tiene una solución");
                                       System.out.println("X1;"+x1);
                                   }else
                                       System.out.println("La ecuación no tiene solución");
                               }
                               break;
                           case 3:
                               double num2= Math.pow(ter2,2)-(4*ter1*ter3);
                               if(num2>0){
                                   x1=(-2*ter3)/(ter2+(Math.sqrt(Math.pow(ter2,2)-(4*ter1*ter3))));
                                   x2=(-2*ter3)/(ter2-(Math.sqrt(Math.pow(ter2,2)-(4*ter1*ter3))));
                                   System.out.println("La ecuación tiene dos soluciones");
                                   System.out.println("X1;"+x1);
                                   System.out.println("X2;"+x2);
                               }else{
                                   if(num2==0){
                                       x1=(-2*ter3)/(ter2+(Math.sqrt(Math.pow(ter2,2)-(4*ter1*ter3))));
                                       System.out.println("La ecuación tiene una solución");
                                       System.out.println("X1;"+x1);
                                   }else
                                       System.out.println("La ecuación no tiene solución");
                               }
                               break;
                           case 4:
                               salir=true;
                               break;
                       }
                   }while(salir==false);
                   break;
               
               case 4: 
                   double Media = 0, Media2 = 0;
                   double x;
                   int n = 0;
                   System.out.println("Escriba una serie de números, pulse 0 para terminar");
                   x =teclado.nextDouble();
                   while (x != 0) {
                       Media = Media + x;
                       Media2 = Media2 + x * x;
                       n++;
                       x=teclado.nextDouble();
                   }
                   double varianza = Media2 / (n - 1) - (Media * Media) / (n * (n - 1));
                   System.out.println("La varianza es: " + varianza);
                   break;
               
               case 5:
                   salir2=true;
                   break;
           }
           System.out.println("---------------------------------------------------------------------------------------");
       }while(salir2==false);
       System.out.println("Gracias por usar el programa");
    }
    public static double fac(int num){
        double fac;
        if(num==0)
            return 1;
        else
            return num*fac(num-1);
    }
    
}
