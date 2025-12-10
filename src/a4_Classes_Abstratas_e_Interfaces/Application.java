package a4_Classes_Abstratas_e_Interfaces;

public class Application {

  public static void main(String[] args) {
    Laptop laptop = new Laptop("Samsung", 100, 2022);
    Desktop desktop = new Desktop("Dell", 500);

    PowerBank powerBank = new PowerBank();

    plugDevice(laptop);

    plugDevice(powerBank);

    checkDevice(laptop);
    checkDevice(desktop);

  }

  public static void checkDevice(ComputerDevice device) {

    System.out.println("Verificando dispositivo de marca " + device.getBrand());

    device.bootUp();

  }

  public static void plugDevice(Chargeable chargeable) {

    System.out.println("A bateria atual é " + chargeable.getBatteryLevel());

    chargeable.charge();

  }


  /*
  public class Application {

  public static void main(String[] args) {
    ComputerDevice genericDevice = new Laptop("Apple", 256.0, 13.3);

    if (genericDevice instanceof Laptop) {
      Laptop specificLaptop = (Laptop) genericDevice; // downcasting seguro
    }
  }
}
   */
}
