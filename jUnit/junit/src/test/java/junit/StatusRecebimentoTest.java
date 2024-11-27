package junit;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class StatusRecebimentoTest {

    Caminhao caminhao = new Caminhao();

    @Test
    void verificandoStatus() {
        // Preparação: Inserindo as informações
        caminhao.placa = "XYZ5678";
        caminhao.nomeMotorista = "Maria Oliveira";
        caminhao.estacionamento = "Doca 8";

        // Ação: Mudando o status do caminhão
        caminhao.mudarStatus();
        caminhao.mudarRecebimento();

        // Validação: Verificando se o status do recebimento novo, é o esperado
        assertEquals("liberado", caminhao.recebimento);
    }
}
