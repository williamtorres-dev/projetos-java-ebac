public class Reserva {

    String nomeHospede;
    String tipoQuarto;
    int numeroDias;
    double valorDiaria;

    public Reserva(String nomeHospede, String tipoQuarto, int numeroDias, double valorDiaria) {
        this.nomeHospede = nomeHospede;
        this.tipoQuarto = tipoQuarto;
        this.numeroDias = numeroDias;
        this.valorDiaria = valorDiaria;
    }

    public double calcularValorTotal() {
        return numeroDias * valorDiaria;
    }

    @Override
    public String toString() {
        return "\nReserva do Hóspede " + nomeHospede + ":" +
                "\n • Tipo do quarto: " + tipoQuarto + ";" +
                "\n • Número de dias de estadia: " + numeroDias + ";" +
                "\n • Valor da diária: " + valorDiaria + ";" +
                "\n Valor total: " + calcularValorTotal() + ";";
    }

}
