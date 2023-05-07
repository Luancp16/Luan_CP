/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exercicioslidesaula;

import java.util.Scanner;

//FAZER UM PROGRAMA QUE LEIA O NOME E A IDADE DA PESSOA E MOSTRAR QUE IDADE ELA TERA DAQUI 5 ANOS
public class ExercicioSlidesAula {

    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int idade;
        String nome;

        System.out.println("qual seu nome ?");

        nome = String.valueOf(input.nextLine());

        System.out.println("qual sua idade ?");
        idade = Integer.valueOf(input.nextLine());

        while (idade<0 || idade>100){
           System.out.println("qual sua idade ?");
        idade = Integer.valueOf(input.nextLine());
        }

         int a = idade + 5;
        
            System.out.println("sua idade sera daqui 5 anos sera: " + a);  
    }
}
