import java.util.Scanner;

public class VerificadorDeSenha {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String senhaCorreta = "Java@54321";
        String senhaDigitada;
        int tentativasRestantes = 3;


        while (tentativasRestantes > 0) {
            System.out.println("Digite a senha: ");
            senhaDigitada = scanner.nextLine();

            if (senhaDigitada.equals(senhaCorreta)) {
                System.out.println("Senha correta, acesso liberado!");
                break;
            } else {
                tentativasRestantes--;
                System.out.println("Senha incorreta! Tentativa(s) restante(s): " + tentativasRestantes);
            }
        }

        if (tentativasRestantes == 0) {
            System.out.println("Conta bloqueada!");
        }

        scanner.close();

    }

}
