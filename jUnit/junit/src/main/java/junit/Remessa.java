package junit;

import java.util.List;

public class Remessa {
    int numero;
    String status;
    String dataDoCancelamento;
    String motivoCancelamento;

    Remessa(int numero) {
        this.numero = numero;
        this.status = "ativo";
    }

    // Método para cancelar a remessa com detalhes
    void cancelarRemessa(String data, String motivo) {
        this.status = "cancelado";
        this.dataDoCancelamento = data;
        this.motivoCancelamento = motivo;
    }

    // Simular notificação de e-mail para múltiplos destinatários
    boolean notificarDestinatarios(List<String> destinatarios) {
        if (this.status.equals("cancelado")) {
            String conteudoEmail = String.format(
                    "Remessa %d cancelada.\nData do cancelamento: %s\nMotivo: %s",
                    this.numero, this.dataDoCancelamento, this.motivoCancelamento);
            for (String destinatario : destinatarios) {
                System.out.println("Notificação de cancelamento enviada para: " + destinatario);
                System.out.println("Conteúdo do e-mail: " + conteudoEmail);
            }
            return true;
        } else {
            System.out.println("Remessa não está cancelada, e-mails não foram enviados.");
            return false;
        }
    }
}
