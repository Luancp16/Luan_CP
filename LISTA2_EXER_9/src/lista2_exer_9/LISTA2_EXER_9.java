
package lista2_exer_9;

import java.util.Scanner;

public class LISTA2_EXER_9 {
    static Scanner input = new Scanner (System.in); 
    public static void main(String[] args) {
        
        double valordaCompra,valorPago,troco1,troco2,troco3,troco,nota100,nota10,nota1,g;
        System.out.println("valor total das compras ");
        valordaCompra = Double.valueOf(input.nextLine());
        System.out.println("vai pagar com quantos reais: ");
        valorPago =  Double.valueOf(input.nextLine());
        
        troco = valorPago - valordaCompra;
    
        int notas100 = (int) (troco / 100);
        troco = troco % 100;

        // Calcula a quantidade de notas de 10 necessárias para formar o troco
        int notas10 = (int) (troco / 10);
        troco = troco % 10;

        // Calcula a quantidade de notas de 1 necessárias para formar o troco
        int notas1 = (int) troco;

        // Imprime os resultados
        System.out.printf("Valor da compra: R$ %.2f%n", valordaCompra);
        System.out.printf("Valor pago pelo cliente: R$ %.2f%n", valorPago);
        System.out.printf("Troco: R$ %.2f%n", valorPago - valordaCompra);
        System.out.printf("Notas de 100: %d%n", notas100);
        System.out.printf("Notas de 10: %d%n", notas10);
        System.out.printf("Notas de 1: %d%n", notas1);

        input.close();
    }
    
}
