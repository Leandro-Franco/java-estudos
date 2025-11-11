package a2_Abstraçao_e_encapsulamento;

public class Construtos {

  public static void main(String[] args) {
    //Instanciando o objeto a ser construido
    log("Iniciando...");
    Television tv = new Television("Phillips", "LCD", 32);

    tv.turnOn();
    tv.turnOff();
    log(tv.info());
    log("Encerrado.");
  }

  //Economizando System.out.println();
  public static void log(String text) {
    System.out.println(text);
  }
}
