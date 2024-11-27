package junit;

public class Caminhao {
    String placa;
    String nomeMotorista;
    String status;
    String estacionamento;
    String recebimento;

    Caminhao() {
        this.status = "aberto";
    }

    void mudarStatus() {
        if (!this.placa.equals(null) && !this.nomeMotorista.equals(null)) {
            this.status = "doca de entrada";
        }
    }

    void mudarRecebimento() {
        if (this.status.equals("doca de entrada")) {
            this.recebimento = "liberado";
        }
    }
}
