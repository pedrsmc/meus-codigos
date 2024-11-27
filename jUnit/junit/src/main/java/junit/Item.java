package junit;

public class Item {
    public String codigo;
    public String status;
    public boolean cadastro;

    public Item() {
        this.status = "Fechado";
    }

    // Simulando uma pesquisa ao banco
    public boolean verificarCadastro() {
        return cadastro;
    }

    public void mudarStatus() {
        this.status = "Aberto";
    }

    public void mostrarErro() {
        if (this.status.equals("Fechado")) {
            throw new RuntimeException("O ITEM DO CÓDIGO: " + codigo + " ESTÁ PENDENTE DE CADASTRO");
        }
    }
}
