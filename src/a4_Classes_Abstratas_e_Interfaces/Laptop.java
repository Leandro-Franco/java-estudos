package a4_Classes_Abstratas_e_Interfaces;

public class Laptop extends ComputerDevice implements Chargeable {

  private int ano;

  public Laptop(String brand, double capacity, int ano) {
    super(brand, capacity);

    this.ano = ano;
  }

  @Override
  public void bootUp() {
    System.out.println("bootUp on " + ano);
  }

  @Override
  public void charge() {
    System.out.println("Charging");
  }

  @Override
  public int getBatteryLevel() {
    return 85;
  }
}
