package listadeexercicion1.exern2;

import java.util.Scanner;

public class Listadeexercicion1Exern2 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n1, n2,resul1,resul2;
        System.out.println("qual o pimeiro numero ?");
        n1 = Integer.valueOf(input.nextLine());
        System.out.println("qual o segundo numero?");
        n2 = Integer.valueOf(input.nextLine());

        resul1=(n1+n2);
        resul2=(resul1*resul1);
        System.out.println("seu reultado e "+resul2 );
        
        
        
    }

}
