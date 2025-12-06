package a4_Classes_Abstratas_e_Interfaces;

public abstract class QuantumComputer extends ComputerDevice {

  public QuantumComputer(String brand, double storageCapacity) {
    super(brand, storageCapacity);
  }

  public abstract void quantumComputation();
}