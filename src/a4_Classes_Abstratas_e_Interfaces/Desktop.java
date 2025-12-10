package a4_Classes_Abstratas_e_Interfaces;

public class Desktop extends ComputerDevice {

  public Desktop(String brand, double capacity) {
    super(brand, capacity);
  }

  @Override
  public void bootUp() {
    System.out.println("incializando o Desktop");
  }
}
