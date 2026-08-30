import java.util.ArrayList;
import java.util.Scanner;

public class Exercicio06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Double> salarios = new ArrayList<>();

        System.out.println("Digite 5 salários:");
        for (int i = 0; i < 5; i++) {
            System.out.print("Salário " + (i + 1) + ": R$ ");
            salarios.add(scanner.nextDouble());
        }

        double soma = 0;
        for (double salario : salarios) {
            soma += salario;
        }
        double media = soma / salarios.size();

        System.out.printf("%nMédia salarial: R$ %.2f%n", media);
        System.out.println("Salários acima da média:");

        for (double salario : salarios) {
            if (salario > media) {
                System.out.printf("- R$ %.2f%n", salario);
            }
        }

        scanner.close();
    }
}