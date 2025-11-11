import java.util.Scanner;

public class Aluno {

    private final String nome;
    private final double[] notas;

    public Aluno(String nome, int n) {
        this.nome = nome;
        this.notas = new double[n];
    }

    public boolean setNota(int indice, double nota) {
        if(nota < 0 || nota > 10) {
            return false;
        }
        this.notas[indice] = nota;
        return true;
    }

    public double calcularMedia() {
        double soma = 0;
        for(double nota : notas) {
            soma += nota;
        }
        return soma / notas.length;
    }

    public void exibirDados() {
        System.out.println("Nome do aluno: " + nome);
        System.out.print("Notas: ");
        for(double nota : notas) {
            System.out.print(nota + " / ");
        }
        System.out.println("\nMédia: " + String.format("%.2f", calcularMedia()));
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Quantos alunos deseja cadastrar? ");
        int nAlunos = scanner.nextInt();
        System.out.print("Quantas provas cada aluno fez? ");
        int nProvas = scanner.nextInt();

        Aluno[] alunos = new Aluno[nAlunos];

        scanner.nextLine();

        for(int i = 0; i < nAlunos; i++) {
            System.out.print("Digite o nome do aluno " + (i + 1) + ": ");
            String nome = scanner.nextLine();
            alunos[i] = new Aluno(nome, nProvas);

            for(int j = 0; j < nProvas; j++) {
                while(true) {
                    System.out.print("Digite a nota " + (j + 1) + " do aluno " + nome + " (0 a 10): ");
                    double nota = scanner.nextDouble();
                    if(alunos[i].setNota(j, nota)) {
                        break;
                    } else {
                        System.out.println("Nota inválida. Por favor, digite uma nota entre 0 e 10.");
                    }
                }
            }
            scanner.nextLine();
        }

        System.out.println("\n--- Dados dos Alunos ---");
        for(Aluno aluno : alunos) {
            aluno.exibirDados();
            System.out.println();
        }

        scanner.close();
    }
}
