package a5_Coleções;

import java.util.HashSet;

public class ApplicationSet {

  public static void main(String[] args) {
    //O set não permite elementos repetidos, então dá para checar a adição de elementos já existentes
    HashSet<String> estudantes = new HashSet<>();

    boolean adicionouJoao = estudantes.add("João");
    boolean adicionouJoaoDeNovo = estudantes.add("João");
    boolean adicionouMaria = estudantes.add("Maria");

    System.out.printf("adicionouJoao: %b%n", adicionouJoao);
    System.out.printf("adicionouJoaoDeNovo: %b%n", adicionouJoaoDeNovo);
    System.out.printf("adicionouMaria: %b%n", adicionouMaria);
  }
}
