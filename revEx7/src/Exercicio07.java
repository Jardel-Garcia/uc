import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Exercicio07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<String> nomes = new ArrayList<>(Arrays.asList(
                "Ana", "Bruno", "Carlos", "Amanda", "Beatriz", "Daniel"
        ));

        System.out.print("Digite o termo ou letra para busca: ");
        String termo = scanner.nextLine().trim().toLowerCase();

        int encontrados = 0;
        System.out.println("\nResultados encontrados:");

        for (String nome : nomes) {
            if (nome.toLowerCase().contains(termo)) {
                System.out.println("- " + nome);
                encontrados++;
            }
        }

        System.out.println("\nTotal de correspondências: " + encontrados);

        scanner.close();
    }
}