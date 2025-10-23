package menu;

import java.util.Scanner;

public class MenuDeOpcoes {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int opcao;
        do {
            System.out.println("Escolha uma opção: ");
            System.out.println("Opção 1: Continuar.");
            System.out.println("Opção 2: Sair.");
            opcao = scanner.nextInt();
            scanner.nextLine();
            System.out.println();

            if (opcao == 1) {
                System.out.println("Escreva uma palavra ou uma frase: ");
                String texto = scanner.nextLine();
                System.out.println();
                System.out.println("Você digitou o seguinte texto: ");
                System.out.println(texto);
                System.out.println();
            } else if (opcao == 2) {
                System.out.println("Obrigado por utilizar o nosso sistema, espero que tenha gostado.");
            } else {
                System.out.println("Opção inválida. Tente novamente.");
                System.out.println();
            }

        } while (opcao != 2);

        scanner.close();
    }

}
