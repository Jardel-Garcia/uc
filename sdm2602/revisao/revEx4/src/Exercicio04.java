import java.util.Scanner;

public class Exercicio04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int totalNumeros = 0;
        int maiorNumero = Integer.MIN_VALUE;

        System.out.println("Digite números inteiros (digite -1 para encerrar):");

        while (true) {
            System.out.print("Número: ");
            int numero = scanner.nextInt();

            if (numero == -1) {
                break;
            }

            totalNumeros++;
            if (numero > maiorNumero) {
                maiorNumero = numero;
            }
        }

        System.out.println("\n--- Resumo ---");
        System.out.println("Total de números válidos inseridos: " + totalNumeros);

        if (totalNumeros > 0) {
            System.out.println("Maior número digitado: " + maiorNumero);
        } else {
            System.out.println("Nenhum número válido foi inserido antes da parada.");
        }

        scanner.close();
    }
}