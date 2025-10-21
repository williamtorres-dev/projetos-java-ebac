import java.util.Scanner;

public class MaiorNumero {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println();
        System.out.println("Insira dois números inteiros.");
        System.out.println("Primeiro Número: ");
        int num1 = scanner.nextInt();
        System.out.println();
        System.out.println("Segundo Número: ");
        int num2 = scanner.nextInt();
        System.out.println();

        if (num1 > num2) {
            System.out.println("O maior número é: " + num1);
        } else if (num2 > num1) {
            System.out.println("O maior número é: " + num2);
        } else {
            System.out.println("Os números são iguais!");
        }
    }

}
