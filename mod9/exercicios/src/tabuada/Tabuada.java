package tabuada;

import java.util.Scanner;

public class Tabuada {

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um número: ");
        int num = scanner.nextInt();
        System.out.println();

        System.out.println("Tabuada de " + num + ": ");
        int multiplicador = 1;

        while(multiplicador <= 10) {
            int resultado = num * multiplicador;
            System.out.println(resultado);
            multiplicador++;
        }

    }

}
