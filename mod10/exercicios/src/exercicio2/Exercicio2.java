package exercicio2;

import java.util.Scanner;

public class Exercicio2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Informe o tamanho do vetor: ");
        int n = sc.nextInt();

        int[] vetor = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Digite o elemento " + (i + 1) + ": ");
            vetor[i] = sc.nextInt();
        }

        for (int i = 0; i < n; i++) {
            if (vetor[i] % 2 == 0) {
                vetor[i] *= 2;
            } else {
                vetor[i] = (int)Math.pow(vetor[i], 2);
            }
        }

        System.out.println("Vetor resultante:");
        for (int i = 0; i < n; i++) {
            System.out.print(vetor[i] + " ");
        }

        sc.close();
    }

}
