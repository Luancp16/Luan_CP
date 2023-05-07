
package teste.pkg1;

import java.util.Scanner;


public class Teste1 {

    public static void main(String[] args) {
   Scanner input = new Scanner (System.in); 
   
int base,altura,resultado1,resultado2;
    
System.out.println("digite a base");
base = Integer.valueOf(input.nextLine());

System.out.println("digite a altura");
altura = Integer.valueOf(input.nextLine());
    
resultado1= (altura*base);
   System.out.println("o resultado da area é"+resultado1);
   

   resultado2=  (base*2) + (altura*2);
  
   System.out.println("o resultado da area é"+resultado2);
   
   
    }
    
}
