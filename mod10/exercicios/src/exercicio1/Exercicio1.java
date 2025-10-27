package exercicio1;

import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o tamanho do vetor: ");
        int n = sc.nextInt();

        int[] vetor = new int[n];

        System.out.println("Digite " + n + " números inteiros:");
        for (int i = 0; i < n; i++) {
            vetor[i] = sc.nextInt();
        }

        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - 1 - i; j++) {
                if (vetor[j] > vetor[j + 1]) {
                    int temp = vetor[j];
                    vetor[j] = vetor[j + 1];
                    vetor[j + 1] = temp;
                }
            }
        }

        System.out.print("Vetor ordenado: ");
        for (int num : vetor) {
            System.out.print(num + " ");
        }
        System.out.println();

        System.out.print("Digite um nome: ");
        sc.nextLine();
        String nome = sc.nextLine();

        int contadorVogais = 0;
        char[] letras = nome.toLowerCase().toCharArray();

        for (char c : letras) {
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                contadorVogais++;
            }
        }

        System.out.println("Quantidade de vogais no nome: " + contadorVogais);

        sc.close();
    }
}
