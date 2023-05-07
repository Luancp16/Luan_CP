package liist_2_exer_7;

import java.util.Scanner;

public class LIIST_2_EXER_7 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int altura, comprimento, largura;
        boolean arP,arM,arG;
        
        System.out.println("qual a altura da parede da sala :");
        altura = Integer.valueOf(input.nextLine());
        System.out.println("qual o comprimento da sala :");
        comprimento = Integer.valueOf(input.nextLine());
        System.out.println("qual e a largura da sala :");
        largura = Integer.valueOf(input.nextLine());

        
        int m3 = altura*comprimento*largura;
        int areaPiso = comprimento*largura;
        int parede1 = altura*comprimento*2;
        int parede2 =altura*largura*2; 
                int parede =parede1+parede2;
        arP = m3 <= 100;
        arM = m3 <=500 && m3 >=100;
        arG = m3 >500;
        
        
        
        
        System.out.println("o volume e de "+m3+" o area do piso "+areaPiso+" area da parede "+parede);
        System.out.println(" o ar que sera usado e o tamanho P "+arP); 
        System.out.println(" o ar que sera usado e o tamanho M "+arM); 
        System.out.println("  o ar que sera usado e o tamanho G "+arG);
    }

}
