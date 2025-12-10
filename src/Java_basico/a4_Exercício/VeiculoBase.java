package Java_basico.a4_Exercício;

/**
 * Método principal.
 */
public abstract class VeiculoBase implements Veiculo {

    /**
     * Atributos e Métodos.
     */
    private String marca;
    private String modelo;
    private int ano;
    private String tipoCombustivel;
    private int capacidadeTanque;

    /**
     * Veiculo base.
     *
     * @param marca            the marca
     * @param modelo           the modelo
     * @param ano              the ano
     * @param tipoCombustivel  the tipo combustivel
     * @param capacidadeTanque the capacidade tanque
     */

    public VeiculoBase(String marca, String modelo,
                       int ano, String tipoCombustivel, int capacidadeTanque) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
        this.tipoCombustivel = tipoCombustivel;
        this.capacidadeTanque = capacidadeTanque;
    }

    /**
     * Gets marca.
     *
     * @return the marca
     */
    public String getMarca() {
        return marca;
    }

    /**
     * Gets modelo.
     *
     * @return the modelo
     */
    public String getModelo() {
        return modelo;
    }

    /**
     * Gets ano.
     *
     * @return the ano
     */
    public int getAno() {
        return ano;
    }

    /**
     * Gets tipo combustivel.
     *
     * @return the tipo combustivel
     */
    public String getTipoCombustivel() {
        return tipoCombustivel;
    }

    /**
     * Gets capacidade tanque.
     *
     * @return the capacidade tanque
     */
    public int getCapacidadeTanque() {
        return capacidadeTanque;
    }
}
