
package nota_vestibular;

import java.util.Scanner;

public class Nota_VESTIBULAR {
  static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
      
        float portugues,matematica,conheGerais,media;
        String nome;
        
        System.out.println("qual o nom do candidato? ");
        nome = String.valueOf(input.nextLine());
        
        System.out.println("qual a sua nota em portugues? "); 
        portugues = Float.valueOf(input.nextLine());
        
        
        System.out.println("qual a sua nota em matematica? "); 
        matematica = Float.valueOf(input.nextLine());
        
        
        System.out.println("qual a sua nota em conhecimentos Gerais? "); 
        conheGerais = Float.valueOf(input.nextLine());
        
          
        
        media =  (portugues + matematica + conheGerais)/3;
        
        
        if(media>=7 && portugues >=5 && matematica >=5 && conheGerais >=5)
        {
          
        System.out.println("o aluno"+nome+"foi aprovado")}
        
        else  {
          
        System.out.println("o aluno"+nome+"nao foi aprovado");
     
       
   
    }
             
    }