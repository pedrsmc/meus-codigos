package junit;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class CaminhaoTest {

    Caminhao caminhao = new Caminhao();

    @Test
    void verificandoStatus() {
        // Preparação: Inserindo as informações
        caminhao.placa = "7CX6X4VYDG";
        caminhao.nomeMotorista = "Juliano";

        // Ação: Mudando o status do caminhão
        caminhao.mudarStatus();

        // Validação: Verificando se o status novo, é o esperado
        assertEquals("doca de entrada", caminhao.status);
    }
}
