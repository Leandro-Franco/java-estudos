package Java_basico.a3i_Exercício.recursoshumanos;

/**
 * Classe que representa uma pessoa funcionária no sistema de recursos humanos.
 */
public class PessoaFuncionaria {

    private String nomeCompleto;
    private String cpf;
    private String endereco;
    private double salario;

    /**
     * Construtor pessoa funcionaria.
     */
    public PessoaFuncionaria(String nomeEntrada, String cpfEntrada, String enderecoEntrada,
                             double salarioEntrada) {

        nomeCompleto = nomeEntrada;
        cpf = cpfEntrada;
        endereco = enderecoEntrada;
        salario = salarioEntrada;

    }


    public String getCpf() {
        return cpf;
    }

    public Double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getNomeCompleto() {
        return nomeCompleto;
    }

    public void setNomeCompleto(String nomeCompleto) {
        this.nomeCompleto = nomeCompleto;
    }
}
