/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication3;

import java.util.Scanner;

/**
 *
 * @author luanc
 */
public class JavaApplication3 {

    /**
     * @param args the command line arguments
     * @param falta
     */
    public static void main(String[] args, Integer falta)
    {
      Scanner input = new Scanner (System.in);
      Float n1 , n2 , n3 , media; 
      boolean aprovado;
      System.out.println("digite a primeira nota:");
      n1 = Float.valueOf(input.nextLine());
      System.out.println("digite a egunda nota:");
      n2 = Float.valueOf(input.nextLine());
      System.out.println("digite a trceira nota:");
      n3 = Float.valueOf(input.nextLine());
      System.out.println("quantidade de faltas");
      
     
        
      media = (n1 + n2 + n3)/ 3;
      
      falta = Integer.valueOf(imput.nextLine());
       
      aprovado = media >= 6 && falta <= 25;
      System.out.println("media"+ media);
      System.out.println("o aluno foi aprovado:"+ aprovado);


    }
    
}
