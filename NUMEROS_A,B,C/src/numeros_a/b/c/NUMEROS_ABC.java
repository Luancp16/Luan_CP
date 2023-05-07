
package numeros_a.b.c;

import java.util.Scanner;

public class NUMEROS_ABC {
 static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
      //Faça um programa que leia os valores A, B e C e informe se a soma de A com B é
//menor ou igual a C.  
         
       int numa,numb,numc;

        System.out.println("qual e o  numero a");
        numa = Integer.valueOf(input.nextLine());

        System.out.println("qual e o  numero b");
        numb = Integer.valueOf(input.nextLine());


        System.out.println("qual e o  numero c");
        numc = Integer.valueOf(input.nextLine());

   int guardar = numa +numb;
        
   if (guardar<numc){
      
            System.out.println("numero c e menor que a soma de a + b");
   } else {
            System.out.println("numero c e menor que a soma de a + b");
    }  }
    
}
