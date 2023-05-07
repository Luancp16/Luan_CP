package lista2exer51;

import java.util.Scanner;

public class LISTA_2_EXER5E6 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        float prova1, prova2, trabalho, frequencia;
        boolean media, medi;
        System.out.println("nota1 ?");
        prova1 = Float.valueOf(input.nextLine());
        System.out.println("nota2?");
        prova2 = Float.valueOf(input.nextLine());
        System.out.println("nota do trabalho");
        trabalho = Float.valueOf(input.nextLine());
        System.out.println("qual e a frequecia desse aluno ?");
        frequencia = Float.valueOf(input.nextLine());
        medi = trabalho == 6 && frequencia >= 90 == true;

        media = ((prova1 >= 6 || prova2 >= 6) && trabalho >= 7 && frequencia >= 75) || medi;

        System.out.println("o aluno esta aprovado" + media);

    }

}
