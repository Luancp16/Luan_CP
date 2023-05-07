
package exercicio.pkg3;

import java.util.Scanner;

public class Exercicio3 {

    public static void main(String[] args) {
  Scanner input = new Scanner (System.in);
  
  float nota,falta;
 
  boolean aprovado;
  boolean atestado;
  
  System.out.println("nota do aluno:");
  nota = Float.valueOf(input.nextLine());
   
       
   System.out.println("quantas faltas o aluno possui :");
    falta = Float.valueOf(input.nextLine());
  
  System.out.println("o aluno possui atestado?");
 atestado= Boolean.valueOf(input.nextLine());

 aprovado = nota >= 6 && (falta <=25||atestado);
  System.out.println("aproovado"+ aprovado);

  
 
 
    }
    
}
