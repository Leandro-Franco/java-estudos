package Projeto_Sistema_de_Votação.sistemadevotacao;

/**
 * The type Pessoa candidata.
 */
public class PessoaCandidata extends Pessoa {

    int numero;
    int votos;

    /**
     * Constructor.
     */
    public PessoaCandidata(String nome, int numero) {
        this.nome = nome;
        this.numero = numero;
        this.votos = 0;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public int getVotos() {
        return votos;
    }

    public void receberVoto() {
        this.votos += 1;
    }
}
