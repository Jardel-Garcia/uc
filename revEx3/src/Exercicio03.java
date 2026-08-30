import java.util.Scanner;

public class Exercicio03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número inteiro positivo N: ");
        int n = scanner.nextInt();

        if (n <= 0) {
            System.out.println("O número deve ser maior que zero.");
        } else {
            int quantidadePares = 0;
            int somaPares = 0;

            System.out.print("Números pares encontrados: ");
            for (int i = 1; i <= n; i++) {
                if (i % 2 == 0) {
                    System.out.print(i + " ");
                    quantidadePares++;
                    somaPares += i;
                }
            }

            System.out.println();
            System.out.println("Quantidade total de pares: " + quantidadePares);
            System.out.println("Soma de todos os pares: " + somaPares);
        }

        scanner.close();
    }
}