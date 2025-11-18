package a2_Abstraçao_e_encapsulamento;

//Abstração e construção
//Class
public class Television {

  //Atributos
  private boolean isOn = true;

  private String brand;
  private String model;
  private int size;

  private int MAX_VOLUME = 30;
  private int volume = 0;


  //Construtor que recebera valores atribuídos na instância
  public Television(String brand, String model, int size) {
    // autor recursão, valores definidos na instanciação
    this.brand = brand;
    this.model = model;
    this.size = size;
    // o "this" assume como referência o valor da classe, e o sem o "this", indica o parâmetro
  }

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

  public void setModel(String model) {
    this.model = model;
  }

  public void setBrand(String brand) {
    this.brand = brand;
  }

  public void setSize(int size) {
    this.size = size;
  }

  public int getVolume() {
    return volume;
  }

  public int getSize() {
    return size;
  }

  public String getModel() {
    return model;
  }

  public String getBrand() {
    return brand;
  }

  public boolean isOn() {
    return isOn;
  }

  public static double convertToCentimeters(double inches) {
    final double INCH_TO_CM = 2.54;
    return inches * INCH_TO_CM;
  }
}
