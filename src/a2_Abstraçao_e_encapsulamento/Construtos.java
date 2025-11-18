package a2_Abstraçao_e_encapsulamento;

public class Construtos {

  public static void main(String[] args) {
    //Instanciando o objeto a ser construido
    log("Iniciando...");
    Television tv = new Television("Phillips", "LCD", 32);

    //representação recursiva com uso de getters do "tv.info()"
    log("Marca: %s \nModelo: %s \nTamanho: %d".formatted(tv.getBrand(), tv.getModel(),
        tv.getSize()));

    tv.turnOn();

    log("A televisão está ligada?");
    System.out.println(tv.isOn());

    log("O volume atual é:");
    System.out.println(tv.getVolume());

    log("O tamanho da televisão em centímetros é: %.2f".formatted(
        Television.convertToCentimeters(tv.getSize())));

    tv.turnOff();
    log("Encerrado.");
  }

  //Economizando System.out.println();
  public static void log(String text) {
    System.out.println(text);
  }
}
