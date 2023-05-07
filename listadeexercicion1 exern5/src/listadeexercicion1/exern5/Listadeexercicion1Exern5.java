
package listadeexercicion1.exern5;

import java.util.Scanner;

public class Listadeexercicion1Exern5 {

    public static void main(String[] args) {
  Scanner input = new Scanner (System.in);
  
  int base,altura,saida,perimetro;
  
        System.out.println("qual e a base do retangulo?");
  base= Integer.valueOf(input.nextLine());
  
        System.out.println("qual a altura do retangulo ?");
  
altura = Integer.valueOf(input.nextLine());
       
  
   saida=(base*altura);
  perimetro=((base+altura)*2);
        System.out.println("resultado da area"+saida);
        System.out.println("resultado do perimetro"+perimetro);
  
  
    }
    
}
