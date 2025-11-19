package a2_exercicio;

public class Carro {

  String placa;
  String modelo;
  int km;

  public Carro(String placa, String modelo, int km) {
    this.placa = placa;
    this.modelo = modelo;
    this.km = km;
  }

  public String getPlaca() {
    return placa;
  }

  public String getModelo() {
    return modelo;
  }

  public int getKm() {
    return km;
  }


}
