
package teste3;

import java.util.Scanner;

public class custoDeCombustivel {

      
 static Scanner input = new Scanner(System.in); 
 
    public static void main(String[] args) {              
        
        float distancia,media,precogasosa,guardar;
        
        System.out.println("quantos KM ate seu detino? ");
        distancia = Float.valueOf(input.nextLine());
        
        System.out.println("qual a media do seu carro por litro? ");
        media = Float.valueOf(input.nextLine());
        
        System.out.println("qual e o preço da gasolina? ");
        precogasosa = Float.valueOf(input.nextLine());
        
        
        guardar = (distancia / media) *precogasosa;
        
        System.out.println("voce ira gastar( "+guardar+" )para chegar no seu destino");
        
    }
    
}
