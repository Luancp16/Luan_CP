
package lista.de.exercicios.teste.pkgif.pkgelse;

import java.util.Scanner;


public class ListaDeExerciciosTesteIfElse {

    public static void main(String[] args) {
        
        Scanner input=new Scanner(System.in);
     double peso,altura,IMC;
   
        System.out.print("qual seu peso ?");
peso = Double.valueOf(input.nextLine()); 
        System.out.print("qual sua altura ?");
    altura = Double.valueOf(input.nextLine());
    
    IMC = peso/(altura*altura);
    System.out.println("seu percentual de gordura e "+IMC);
    
    boolean verdadeiro=IMC>=25;
 
    
        System.out.println("voce ta acima do peso, VAI FAZER ATIVIDADE FISICA POHHA");
    }
    
}
