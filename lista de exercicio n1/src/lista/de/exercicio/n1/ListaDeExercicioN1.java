package lista.de.exercicio.n1;

import java.util.Scanner;

public class ListaDeExercicioN1 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n1, n2,resul1;
        System.out.println("qual o primeiro numero");
        n1 = Integer.valueOf(input.nextLine());

        System.out.println("qual o segundo numero");
        n2 = Integer.valueOf(input.nextLine());
        
        
        
resul1 = (n1*n1)+(n2*n2);
        System.out.println("seu resultado e"+resul1);   
    
    
    
    }

}
