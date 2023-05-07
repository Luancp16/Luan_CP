/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package numeros_iguais;

import java.util.Scanner;

/**
 *
 * @author luanc
 */
public class NUMEROS_IGUAIS {
    
    static Scanner input = new Scanner(System.in);

    
    
    
    public static void main(String[] args) {
        
        int numA,numB;
        
        System.out.println("qual e o numero A: ");
        numA = Integer.valueOf(input.nextLine());
        
        System.out.println("qual e o numero B: ");
        numB = Integer.valueOf(input.nextLine());
        
        
        if (numA == numB )
        
            System.out.println("on numero sao iguais ");
        else 
            System.out.println("os 2 numeros sao diferentes ");
        
    }
    
}
