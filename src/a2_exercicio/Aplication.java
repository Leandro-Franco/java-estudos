package a2_exercicio;

import java.util.ArrayList;
import java.util.Scanner;

public class Aplication {

  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.println("cadastro de carros:");
    int quantidade = 0;
    scan.nextLine();
    Carro carro1 = new Carro("QVDE1", "ford", 23);
    Carro carro2 = new Carro("QVDE1", "ford", 24);
    Carro carro3 = new Carro("QVDE1", "ford", 25);
    Carro carro4 = new Carro("QVDE1", "ford", 26);

    ArrayList<Carro> carros = new ArrayList<>();
    carros.add(carro1);
    carros.add(carro2);
    carros.add(carro3);
    carros.add(carro4);

    for (Carro carro : carros) {
      quantidade++;
      System.out.println(
          "Quilometragem: " + carro.getPlaca() +
              "\nModelo: " + carro.getModelo() +
              "\nPlaca: " + carro.getKm() +
              "\n");
    }
    System.out.println("quantidade de carros " + quantidade);

    scan.close();
  }
}
