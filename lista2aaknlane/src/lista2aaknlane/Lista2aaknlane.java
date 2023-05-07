package lista2aaknlane;

import java.util.Scanner;

public class Lista2aaknlane {

    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        double  veloSom = 340, tempo,distancia;
        System.out.println("qual foi o tempo: ");
        tempo = Double.valueOf(input.nextLine());

        distancia = tempo * veloSom;
        System.out.println("a distancia do raio foi de:"+distancia);
        if (distancia < 200) {
            System.out.println("o raio apresentou perigo para as pessoas ");}
        else{System.out.println("o raio nao apresentou perigo para as pessoas");
        }
    }

}
