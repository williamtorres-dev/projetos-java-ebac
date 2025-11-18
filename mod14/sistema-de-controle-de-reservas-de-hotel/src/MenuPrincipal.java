import java.util.*;

public class MenuPrincipal {

    Scanner scanner = new Scanner(System.in);
    Reserva[] reservas = new Reserva[10];
    int contadorReservas = 0;

    public static void main(String[] args) {
        new MenuPrincipal().exibirMenu();
    }

    public void exibirMenu() {
        while (true) {
            System.out.println();
            System.out.println("------------------------------------------- Menu -------------------------------------------");
            System.out.println("Selecione uma opção:");
            System.out.println("1 - Nova Reserva / 2 - Listar Reservas / 3 - Buscar Reserva / 4 - Ordenar Reservas / 5 - Sair");

            int opcao = scanner.nextInt();
            scanner.nextLine();
            
            switch(opcao) {
                case 1:
                    this.criarReserva();
                    break;
                case 2:
                    listarReservas();
                    break;
                case 3:
                    buscarReserva();
                    break;
                case 4:
                    ordenarReservas();
                    break;
                case 5:
                    System.out.println("Saindo do programa. Obrigado!");
                    return;
                default:
                    System.out.println("Opção inválida! Digite um número de 1 a 5.");
            }
        }
    }

    public void criarReserva() {
            if (contadorReservas < reservas.length) {
                System.out.println("Nome do hóspede:");
                String nomeHospede = scanner.nextLine();

                System.out.println("Tipo de quarto:");
                String tipoQuarto = scanner.nextLine();

                int numeroDias;
                do {
                    System.out.println("Número de dias (deve ser pelo menos 1):");
                    numeroDias = scanner.nextInt();
                    if (numeroDias < 1) {
                        System.out.println("Número de dias inválido! Deve ser pelo menos 1.");
                    }
                } while (numeroDias < 1);

                double valorDiaria;
                do {
                    System.out.println("Valor da diária (deve ser maior que 0):");
                    valorDiaria = scanner.nextDouble();
                    if (valorDiaria <= 0) {
                        System.out.println("Valor da diária inválido! Deve ser maior que zero.");
                    }
                } while (valorDiaria <= 0);

                scanner.nextLine();

                String resposta;
                do {
                    System.out.println("Confirmar reserva? (s/n)");
                    resposta = scanner.nextLine().toLowerCase();
                } while (!resposta.equals("s") && !resposta.equals("n"));

                if (resposta.equals("s")) {
                reservas[contadorReservas] = new Reserva(nomeHospede, tipoQuarto, numeroDias, valorDiaria);
                contadorReservas++;
                System.out.println("Reserva criada com sucesso!");
                }
            } else System.out.println("Não é possível adicionar mais reservas.");
    }

    public void listarReservas() {
        if (contadorReservas == 0) {
            System.out.println("Nenhuma reserva cadastrada.");
        } else {
            for (int i = 0; i < contadorReservas; i++) {
                System.out.println(reservas[i]);
            }
        }
    }

    public void buscarReserva() {
        System.out.println("Digite parte do nome do hóspede que deseja buscar: ");
        String nomeBusca = scanner.nextLine().toLowerCase();

        boolean encontrou = false;
        for (Reserva reserva : reservas) {
            if (reserva != null && reserva.nomeHospede.toLowerCase().contains(nomeBusca)) {
                System.out.println(reserva);
                encontrou = true;
            }
        }
        if (!encontrou) {
            System.out.println("Hóspede não encontrado");
        }
    }

    public void ordenarReservas() {

        Reserva[] reservasPreenchidas = Arrays.copyOf(reservas, contadorReservas);

        Arrays.sort(reservasPreenchidas, new Comparator<Reserva>() {
            @Override
            public int compare(Reserva r1, Reserva r2) {
                return Integer.compare(r2.numeroDias, r1.numeroDias);
            }
        });

        for (int i = 0; i < contadorReservas; i++) {
            reservas[i] = reservasPreenchidas[i];
        }

        System.out.println("Reservas ordenadas por número de dias (decrescente):");
        listarReservas();
    }
}
