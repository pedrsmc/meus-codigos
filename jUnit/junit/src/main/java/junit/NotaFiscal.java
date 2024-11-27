package junit;

public class NotaFiscal {
    public String codigoDeBarras;
    public String nomeCliente;
    public String dataEmissao;

    // Método para ler o código de barras
    public void lerCodigoDeBarras(String codigoDeBarras) {
        if (codigoDeBarras == null || codigoDeBarras.length() != 14) {
            throw new RuntimeException("ERRO CAMPO INVÁLIDO");
        }

        this.codigoDeBarras = codigoDeBarras;
    }

    // Método para validar os campos da NF
    public boolean validarCampos() {
        if (nomeCliente == null || nomeCliente.length() < 3 || !nomeCliente.matches("[a-zA-ZÀ-ÿ\\s]+")) {
            throw new RuntimeException("ERRO: NOME DO CLIENTE INVÁLIDO");
        }

        if (dataEmissao == null || !dataEmissao.matches("\\d{4}-\\d{2}-\\d{2}")) {
            throw new RuntimeException("ERRO: DATA DE EMISSÃO INVÁLIDA");
        }

        return true;
    }
}
