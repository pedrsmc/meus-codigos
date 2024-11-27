package junit;

import org.junit.jupiter.api.Test;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;

public class RemessaTest {

    @Test
    void enviarNotificacao() {
        // Preparação: criar remessa e lista de destinatários
        Remessa remessa = new Remessa(12345);
        List<String> destinatarios = Arrays.asList("email1@exemplo.com", "email2@exemplo.com", "email3@exemplo.com");

        // Ação: cancelar a remessa
        remessa.cancelarRemessa("2024-09-30", "Cliente solicitou cancelamento");

        // Validação: verificar se o status foi alterado para "cancelado"
        assertEquals("cancelado", remessa.status);

        // Ação: Simular envio de notificações
        boolean recebeuEmail = remessa.notificarDestinatarios(destinatarios);
        assertTrue(recebeuEmail);
    }

    @Test
    void naoEnviarNotificacao() {
        // Preparação: criar remessa e lista de destinatários
        Remessa remessa = new Remessa(12346);
        List<String> destinatarios = Arrays.asList("email1@exemplo.com", "email2@exemplo.com", "email3@exemplo.com");

        // Ação: tentar enviar notificações sem cancelar a remessa
        boolean recebeuEmail = remessa.notificarDestinatarios(destinatarios);

        // Validação: Não deve enviar notificações se a remessa não foi cancelada
        assertFalse(recebeuEmail);
    }
}
