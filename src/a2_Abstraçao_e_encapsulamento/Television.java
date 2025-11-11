package a2_Abstraçao_e_encapsulamento;

//Abstração e construção
//Class
public class Television {

  private boolean isOn = true;
  //Atributos
  private String brand;
  private String model;
  private int size;

  //Construtor que recebera valores atribuídos na instância
  public Television(String brand, String model, int size) {
    // autor recursão, valores definidos na instanciação
    this.brand = brand;
    this.model = model;
    this.size = size;
    // o "this" assume como referência o valor da classe, e o sem o "this", indica o parâmetro
  }

  private int MAX_VOLUME = 30;
  private int volume = 0;

  void increaseVolume() {
    if (volume < MAX_VOLUME) {
      volume++;
      System.out.println(volume);
    }
  }

  void decreaseVolume() {
    if (volume > 0) {
      volume--;
      System.out.println(volume);
    }
  }


  //métodos inerentes a classe.
  public void turnOn() {
    System.out.println("Ligando televisão...");
    this.isOn = true;
  }

  public void turnOff() {
    System.out.println("Desligando televisão...");
    this.isOn = false;
  }

  public String info() {
    return "Marca: %s, Modelo: %s, Tamanho: %d, Ligada: %b".formatted(
        brand, model, size, isOn
    );
  }
}
