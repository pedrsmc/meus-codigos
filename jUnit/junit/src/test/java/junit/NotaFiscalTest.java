package junit;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class NotaFiscalTest {

    NotaFiscal notaFiscal = new NotaFiscal();

    @Test
    // Cenário: Testando a leitura do código de barras
    void lerCodigoDeBarras() {
        String codigoDeBarras = "12345678901234";

        // Ação: Execute o método que será testado
        notaFiscal.lerCodigoDeBarras(codigoDeBarras);

        // Validação: Verifique se o código de barras foi lido corretamente
        assertEquals(codigoDeBarras, notaFiscal.codigoDeBarras);
    }

    @Test
    void validandoCampos() {
        notaFiscal.nomeCliente = "João Pedro";
        notaFiscal.dataEmissao = "2024-09-03";

        // Ação: Validação dos campos
        boolean validacao = notaFiscal.validarCampos();

        // Validação: Verifique se os campos estão válidos
        assertTrue(validacao, "Ocorreu um problema em algum dos campos");
    }

    // Cenário: Campo nulo deve retornar erro
    @Test
    void deveRetornarErroSeCampoEstiverNulo() {
        // Ação: Recebendo um valor nulo no codigo de barras
        Exception exception = assertThrows(RuntimeException.class, () -> {
            notaFiscal.lerCodigoDeBarras(null);
        });

        // Validação: Verifique se a mensagem de erro está correta
        assertEquals("ERRO CAMPO INVÁLIDO", exception.getMessage());
    }

}
