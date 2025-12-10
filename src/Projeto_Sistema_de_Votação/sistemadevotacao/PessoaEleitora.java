package Projeto_Sistema_de_Votação.sistemadevotacao;

/**
 * The type Pessoa eleitora.
 */
public class PessoaEleitora extends Pessoa {

    private String cpf;

    /**
     * Instantiates a new Pessoa eleitora.
     *
     */
    public PessoaEleitora(String nome, String cpf) {
        this.nome = nome;
        this.cpf = cpf;
    }

    public String getCpf() {
        return this.cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
}
