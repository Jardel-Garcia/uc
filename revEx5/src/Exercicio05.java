import java.util.Scanner;

public class Exercicio05 {

    public static double calcularDesconto(double valorOriginal, double porcentagem) {
        return valorOriginal - (valorOriginal * (porcentagem / 100.0));
    }

    public static boolean isPrecoValido(double valor) {
        return valor > 0;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe o preço do produto: R$ ");
        double preco = scanner.nextDouble();

        if (!isPrecoValido(preco)) {
            System.out.println("Erro: O preço informado deve ser maior que zero.");
        } else {
            System.out.print("Informe a porcentagem de desconto (%): ");
            double desconto = scanner.nextDouble();

            double precoFinal = calcularDesconto(preco, desconto);
            System.out.printf("Preço final com desconto: R$ %.2f%n", precoFinal);
        }

        scanner.close();
    }
}
