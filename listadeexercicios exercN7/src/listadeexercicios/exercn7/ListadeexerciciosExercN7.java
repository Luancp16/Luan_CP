
package listadeexercicios.exercn7;

import java.util.Scanner;


public class ListadeexerciciosExercN7 {

  
    public static void main(String[] args) {
   Scanner input=new Scanner(System.in);
    
   double n, v ,r, sabor,precototal,quantidade,tipo1=1.50,tipo2=2.00,tipo3=0.75;
   
        System.out.println("quantos picoles tipo 1 vc quer? ");
  tipo1 =Double.valueOf(input.nextLine());
   
        System.out.println("quantos picoles tipo 2 vc quer?");
 tipo2=Double.valueOf(input.nextLine());
   
    
        System.out.println("quantos picoles tipo 3 vc quer?");
 tipo3=Double.valueOf(input.nextLine());
   
 
 
 
 
   precototal = tipo1*1.50  ;
   r=tipo2*2.00;
   v=tipo3*0.75;
  
   n=r+v+precototal;
   
        System.out.println("preco total e"+n);
   
    }
    
}
