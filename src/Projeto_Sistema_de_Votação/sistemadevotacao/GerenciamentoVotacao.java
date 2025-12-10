package Projeto_Sistema_de_Votação.sistemadevotacao;

import java.util.ArrayList;

/**
 * The type Gerenciamento votacao.
 */
public class GerenciamentoVotacao implements GerenciamentoVotacaoInterface {

    private ArrayList<PessoaCandidata> pessoasCandidatas = new ArrayList<>();
    private ArrayList<PessoaEleitora> pessoasEleitoras = new ArrayList<>();
    private ArrayList<String> cpfsComputados = new ArrayList<>();


    @Override
    public void cadastrarPessoaCandidata(String nome, int numero) {
        for (PessoaCandidata pessoaC : pessoasCandidatas) {
            if (pessoaC.getNumero() == numero) {
                System.out.println("Número da pessoa candidata já utilizado!");
            }
        }
        this.pessoasCandidatas.add(new PessoaCandidata(nome, numero));
    }

    @Override
    public void cadastrarPessoaEleitora(String nome, String cpf) {
        for (PessoaEleitora pessoa : pessoasEleitoras) {
            if (pessoa.getCpf().equals(cpf)) {
                System.out.println("Pessoa eleitora já cadastrada!");
            }
        }
        this.pessoasEleitoras.add(new PessoaEleitora(nome, cpf));
    }

    @Override
    public void votar(String cpfPessoaEleitora, int numeroPessoaCandidata) {
        for (String cpf : cpfsComputados) {
            if (cpf.equals(cpfPessoaEleitora)) {
                System.out.println("Pessoa eleitora já votou!");
            }
        }
        for (PessoaCandidata candidato : pessoasCandidatas) {
            if (candidato.getNumero() == numeroPessoaCandidata) {
                candidato.receberVoto();
            }
        }
        cpfsComputados.add(cpfPessoaEleitora);
    }

    @Override
    public void mostrarResultado() {
        int total = pessoasCandidatas
                .stream()
                .map(PessoaCandidata::getVotos)
                .mapToInt(Integer::intValue)
                .sum();
        if (cpfsComputados.isEmpty()) {
            System.out.println("É preciso ter pelo menos um voto para mostrar o resultado.");
        }
//    for (PessoaCandidata candidato : pessoasCandidatas) {
//      total = total + candidato.getVotos();
//    }

        for (PessoaCandidata candidato : pessoasCandidatas) {
            float porcentagem = (float) candidato.getVotos() / total;
            System.out.printf("Nome: %s - %d votos totais ( %d%% ) \n", candidato.getNome(),
                    candidato.getVotos(), Math.round(porcentagem * 100));
        }
        System.out.printf("Total de votos: %d \n", total);
    }
}
