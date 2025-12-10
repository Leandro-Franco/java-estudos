package a3i_Exercício.contapoupanca;

public class ContaPoupanca {

  private double saldo;
  private String titularConta;

  public ContaPoupanca(String titular, double saldoInicial) {
    saldo = saldoInicial;
    titularConta = titular;
  }

  /**
   * esse método é responsável por receber um valor do tipo double e somá-lo ao saldo da conta.
   */
  public void depositar(double deposito) {
    this.saldo += deposito;
  }

  /**
   * esse método é responsável por receber um valor do tipo double e subtraí-lo do saldo da conta.
   */
  public void sacar(double saque) {
    this.saldo -= saque;
  }

  /**
   * esse método deve retornar um valor do tipo double representando o saldo da conta.
   */
  public double mostrarSaldo() {
    return this.saldo;
  }

  /**
   * esse método deve retornar o nome da pessoa titular da conta.
   */
  public String mostrarTitularConta() {
    return this.titularConta;
  }

}
