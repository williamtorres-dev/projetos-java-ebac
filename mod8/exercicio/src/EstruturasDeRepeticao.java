import java.util.Scanner;

public class EstruturasDeRepeticao {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o nome de um usuário:");
        String nomeUsuario = scanner.nextLine();
        System.out.println();

        int n;
        do {
            System.out.println("Digite um número positivo, ou 0 para sair.");
            n = scanner.nextInt();
            System.out.println();

            if (n < 0) {
                System.out.println("Número inválido! Por favor, digite um valor positivo.\n");
            }

            if (n > 0) {
                System.out.println("-------------------");
                System.out.println("Contagem crescente:");
                for (int i = 0; i <= n; i++) {
                    System.out.println(" • " + i);
                }
                System.out.println();

                System.out.println("---------------------");
                System.out.println("Contagem decrescente:");
                for (int i = n; i >= 0; i--) {
                    System.out.println(" • " + i);
                }
                System.out.println();
                System.out.println("--------------------------------------------------------------------------------");
                System.out.println("Se o nome tiver mais do que 6 letras, o nome será exibido na quantidade de vezes\n" +
                        "de acordo com o número digitado, caso contrário, será exibido apenas uma única vez.");
                System.out.println();
                System.out.println("Exibição do nome:");
                if (nomeUsuario.length() > 6) {
                    for (int i = 0; i < n; i++) {
                        System.out.println(" • " + nomeUsuario + " - " + (i + 1) + "x");
                    }
                } else {
                    System.out.println(" • " + nomeUsuario);
                }
                System.out.println();
            }

        } while (n != 0);

        scanner.close();

        System.out.println("Programa encerrado!");
    }
}
