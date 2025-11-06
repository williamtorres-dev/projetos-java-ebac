import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Locale;
import java.util.Scanner;

public class CadastroCarros {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Carro[] carros = new Carro[50];
        int quantidade = 0;

        while (true) {
            System.out.print("Defina quantos carros deseja cadastrar (1-50): ");
            if (scanner.hasNextInt()) {
                quantidade = scanner.nextInt();
                if (quantidade >= 1 && quantidade <= 50) {
                    break;
                } else {
                    System.out.println();
                    System.out.println("Erro: o número deve ser entre 1 e 50. Tente novamente.");
                }
            } else {
                System.out.println();
                System.out.println("Erro: entrada inválida! Por favor, digite um número inteiro.");
                scanner.next();
            }
        }

        scanner.nextLine();
        for (int i = 0; i < quantidade; i++) {
            System.out.println();
            System.out.println("Carro " + (i + 1) + ":");
            System.out.print("Marca: ");
            String marca = scanner.nextLine();
            System.out.print("Modelo: ");
            String modelo = scanner.nextLine();
            System.out.print("Preço: ");
            double preco = scanner.nextDouble();
            System.out.println();
            scanner.nextLine();
            carros[i] = new Carro(marca, modelo, preco);
        }

        double somaPreco = 0;
        System.out.println("Lista dos carros cadastrados:");
        for (int i = 0; i < quantidade; i++) {
            System.out.println(" • " + carros[i].marca + " / " + carros[i].modelo);
            somaPreco += carros[i].preco;
        }
        System.out.println();
        System.out.println("Quantidade de carros criados: " + quantidade);

        DecimalFormatSymbols symbols = new DecimalFormatSymbols(Locale.forLanguageTag("pt-BR")
        );
        symbols.setGroupingSeparator('.');
        symbols.setDecimalSeparator(',');
        DecimalFormat formatter = new DecimalFormat("#,##0.00", symbols);

        System.out.println("Soma total dos preços: R$ " + formatter.format(somaPreco));

        scanner.close();
    }
}
