import java.util.Scanner;

public class SistemaDeSaque {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o valor que desseja sacar, de R$2 a R$1.000: ");
        int valorDoSaque = scanner.nextInt();

        if(valorDoSaque < 2 || valorDoSaque > 1000){
            System.out.println("Valor de saque inválido!");
        }

        int nota = 100;

        System.out.println("Quantidade de notas entregues: ");

        for (int i = 0; i < 6; i++) {
            int quatidadeDeCedulas = valorDoSaque / nota;
            if (quatidadeDeCedulas > 0) {
                System.out.println(quatidadeDeCedulas + " nota(s) de R$" + nota);
                valorDoSaque = valorDoSaque % nota;
            }

            if (nota == 100) {
                nota = 50;
            } else if (nota == 50) {
                nota = 20;
            } else if (nota == 20) {
                nota = 10;
            } else if (nota == 10) {
                nota = 5;
            } else if (nota == 5) {
                nota = 2;
            }

        }

        scanner.close();

    }

}
