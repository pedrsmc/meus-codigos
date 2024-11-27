package junit;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ItemTest {

    Item item = new Item();

    @Test
    // Verifica o status quando o item está cadastrado"
    void AlterarStatusSeAberto() {
        item.cadastro = true; // Simula que o item está cadastrado

        // Ação: Verifica o cadastro e altera o status
        if (item.verificarCadastro()) {
            item.mudarStatus();
        }

        // Validação: O status deve ser "Aberto"
        assertEquals("Aberto", item.status);
    }

    @Test
    // Verifica o status quando o item não está cadastrado"
    void AlterarStatusSeFechado() {
        item.cadastro = false; // Simula que o item não está cadastrado

        // Ação: Verifica o cadastro e altera o status
        if (item.verificarCadastro()) {
            item.mudarStatus();
        }

        // Validação: O status deve ser "Fechado"
        assertEquals("Fechado", item.status);
    }

    @Test
    void erroCasoFechado() {
        item.cadastro = false; // Simula que o item está cadastrado
        item.codigo = "13212312312"; // codigo do item

        // Ação: Verifica o cadastro e lança uma exceção se o status estiver
        // fechado
        Exception exception = assertThrows(RuntimeException.class, () -> {
            if (!item.verificarCadastro()) {
                item.mostrarErro();
            }
        });

        // Validação: A mensagem de erro deve conter o código do item
        assertTrue(exception.getMessage().contains(item.codigo));
    }

    @Test
    void semErroCasoAberto() {
        // Preparação: Item está cadastrado e status é "Aberto"
        item.cadastro = true;
        item.mudarStatus();

        // Ação e Validação: Verifica se o status é "Aberto"
        assertDoesNotThrow(() -> {
            item.mostrarErro(); // Não deve lançar exceção porque o status é "Aberto"
        });
    }

}
