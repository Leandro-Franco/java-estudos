package Java_basico.a4_Exercício;

/**
 * Método principal de classe.
 */
public class Caminhao extends VeiculoBase {

    /**
     * The Numero passageiros.
     */
    int numeroPassageiros;

    /**
     * Constructor.
     *
     * @param marca             the marca
     * @param modelo            the modelo
     * @param ano               the ano
     * @param tipoCombustivel   the tipo combustivel
     * @param capacidadeTanque  the capacidade tanque
     * @param numeroPassageiros the numero passageiros
     */
    public Caminhao(String marca, String modelo, int ano, String tipoCombustivel,
                    int capacidadeTanque, int numeroPassageiros) {

        super(marca, modelo, ano, tipoCombustivel, capacidadeTanque);
        this.numeroPassageiros = numeroPassageiros;
    }

    @Override
    public double calcularConsumoCombustivel(double distancia) {
        return distancia / 6;
    }

    @Override
    public void exibirInformacoes() {
        System.out.printf("|Marca: %s\n|Modelo: %s\n|Ano: %d\n|Tipo de Combustível: %s\n"
                        + "|Capacidade do Tanque: %d\n|Número de Passageiros: %d\n",
                this.getMarca(), this.getModelo(), this.getAno(),
                this.getTipoCombustivel(), this.getCapacidadeTanque(), this.numeroPassageiros);
    }
}
