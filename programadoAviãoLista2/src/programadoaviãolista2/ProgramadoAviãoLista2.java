
package programadoaviãolista2;

import java.util.Scanner;

public class ProgramadoAviãoLista2 {
    
 static Scanner input = new Scanner(System.in); 
 
    public static void main(String[] args) {
        
    float pista,peso,visibilidade,chuva,passageiros; 
    boolean sistemaDeDecolagem,decolar=false;
        
        System.out.println("qual e o tamanho da pista: ");
        pista = Float.valueOf(input.nextLine());
        
        System.out.println("qual o peso do aviao: ");
        peso = Float.valueOf(input.nextLine());
        
        System.out.println("qual a visibilidade dessa pista: ");
        visibilidade =  Float.valueOf(input.nextLine());
        
        System.out.println("se nao estiver chovendo digite 0: ");
        chuva =  Float.valueOf(input.nextLine());
        
        System.out.println("tem quantos passageiros no aviao");
        passageiros = Float.valueOf(input.nextLine());
         
        System.out.println("tem sistema de decolagem: ");
        sistemaDeDecolagem =  Boolean.valueOf(input.nextLine());
        
       if (pista < 1.5) {
            if (peso < 40) {
                decolar = true;
            }
     } else if (pista >= 1.5 && pista <= 2) {
            if (peso<= 60) {
                decolar = true;
            }{
      
     
 
        
     
    
    
    
    }
}
