package a4_Classes_Abstratas_e_Interfaces;

public abstract class ComputerDevice {

  final private String brand;
  private double capacity;

  public ComputerDevice(String brand, double capacity) {
    this.brand = brand;
    this.capacity = capacity;
  }

  public String getBrand() {
    return brand;
  }

  public double getCapacity() {
    return capacity;
  }

  public abstract void bootUp();

  public final void shutDown() {
    System.out.println("Desligando o dispositivo...");
  }
}
