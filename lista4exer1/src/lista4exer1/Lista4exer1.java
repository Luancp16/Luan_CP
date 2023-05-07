
package lista4exer1;

import java.util.Scanner;


public class Lista4exer1 {
    
    
    static Scanner input = new Scanner (System.in);
    
    
    public static void main(String[] args) {
   
        float base,altura,recebePerimetro,recebeArea;
        
        
        
        System.out.println("qual e a base ");
        base = Float.valueOf(input.nextLine());
        System.out.println("qual e a altura");
        altura = Float.valueOf(input.nextLine());
        
        
        recebePerimetro = perimetro(base,altura);
        System.out.println("Perimtro:"+recebePerimetro);
        
        recebeArea = area(base,altura);
        System.out.println("Area:"+recebeArea);
    }
    public static float perimetro(float x, float y){
    
        float soma = x + x + y + y;
        return  soma; 
    }
      public static float area(float x, float y){
          
          float multiplicacao = x * y;
          return multiplicacao;
      }
}
