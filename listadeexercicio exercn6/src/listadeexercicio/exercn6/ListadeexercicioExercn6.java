package listadeexercicio.exercn6;

import java.util.Scanner;

public class ListadeexercicioExercn6 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

       double celsius, fahrenheit,grota;

        System.out.println("qual a temperatura em celcius ?");
        celsius = Double.valueOf(input.nextLine());

        fahrenheit=((celsius *1.8) +32);
       
        System.out.println("temperatura em fahrenheit"+fahrenheit);
                
        
        

        
        
        
    }

}
