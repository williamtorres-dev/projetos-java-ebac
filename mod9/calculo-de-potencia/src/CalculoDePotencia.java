import java.util.Scanner;

public class CalculoDePotencia {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int base, expoente, resultado;

        do {
            System.out.println("Informe o valor da base, tem que ser maior do que zero: ");
            base = scanner.nextInt();
        } while (base < 0);

        do {
            System.out.println("Informe o valor do expoente, tem que ser maior do que zero: ");
            expoente = scanner.nextInt();
        } while (expoente < 0);

        resultado = 1;

        while (expoente >= 1) {
            resultado = base * resultado;
            expoente--;
        }

        System.out.println("Resultado: " + resultado);

        scanner.close();

    }

}
