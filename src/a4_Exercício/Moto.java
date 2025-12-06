package a4_Exercício;

/**
 * Método principal.
 */
public class Moto extends VeiculoBase {

  /**
   * Atributos e Métodos.
   */
  String tipo;

  /**
   * Instantiates a new Moto.
   *
   * @param marca            the marca
   * @param modelo           the modelo
   * @param ano              the ano
   * @param tipoCombustivel  the tipo combustivel
   * @param capacidadeTanque the capacidade tanque
   * @param tipo             the numero passageiros
   */
  public Moto(String marca, String modelo, int ano, String tipoCombustivel,
      int capacidadeTanque, String tipo) {
    super(marca, modelo, ano, tipoCombustivel, capacidadeTanque);

    this.tipo = tipo;
  }

  @Override
  public double calcularConsumoCombustivel(double distancia) {
    return distancia / 18;
  }

  @Override
  public void exibirInformacoes() {
    System.out.printf("|Marca: %s\n|Modelo: %s\n|Ano: %d\n|Tipo de Combustível: %s\n"
            + "|Capacidade do Tanque: %d\n|Tipo da Moto: %s\n",
        this.getMarca(), this.getModelo(), this.getAno(),
        this.getTipoCombustivel(), this.getCapacidadeTanque(), this.tipo);
  }
}
