package exercicio3;

import java.util.Scanner;

public class Ecercicio3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um nome: ");
        String nome = sc.nextLine();

        char[] vetor = nome.toCharArray();

        int n = vetor.length;
        for (int i = 0; i < n / 2; i++) {
            char temp = vetor[i];
            vetor[i] = vetor[n - 1 - i];
            vetor[n - 1 - i] = temp;
        }

        System.out.println("Nome invertido: " + new String(vetor));

        sc.close();
    }

}
