import java.util.Scanner;

public class dadosUsuario {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println(" ");
        System.out.println("-------------------------------");
        System.out.println(" ");
        System.out.println("Seja bem-vindo querido usuário!");
        System.out.println("Informe os seus seguintes dados:");
        System.out.println(" ");

        System.out.println("Nome completo: ");
        String nomeCompleto = scanner.nextLine();
        System.out.println(" ");

        System.out.println("CPF: ");
        String cpf = scanner.nextLine();
        System.out.println(" ");

        System.out.println("Idade: ");
        int idade = scanner.nextInt();
        System.out.println(" ");

        System.out.println("Peso (kg): ");
        double peso = scanner.nextDouble();
        System.out.println(" ");

        System.out.println("Altura (m): ");
        double altura = scanner.nextDouble();
        System.out.println(" ");

        System.out.println("Sexo (F ou M): ");
        char sexo = scanner.next().charAt(0);
        scanner.nextLine();
        System.out.println(" ");

        System.out.println("Estado civil: ");
        String estadoCivil = scanner.nextLine();
        System.out.println(" ");
        System.out.println("-------------------------------");
        System.out.println(" ");

        System.out.println("Seus dados apresentados foram: ");
        System.out.println("• Nome completo: " + nomeCompleto + '\n' + "• CPF: " + cpf + '\n' + "• Idade: " + idade +
                '\n' + "• Peso: " + String.format("%.2f", peso) + " kg" + '\n' + "• Altura: " +
                String.format("%.2f", altura) + " m" + '\n' + "• Sexo: " + sexo + '\n' +
                "• Estado civil: " + estadoCivil);
        System.out.println(" ");
        System.out.println("-------------------------------");
        System.out.println(" ");

        scanner.close();
    }

}
