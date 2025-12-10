package a5_Coleções;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ApplicationList {

  public static void main(String[] args) {
    ArrayList<Integer> numeros = new ArrayList<Integer>();
    numeros.add(7);
    numeros.add(2);
    numeros.add(1);
    numeros.add(9);
    System.out.println(numeros);
    Collections.sort(numeros);
    System.out.println(numeros);

    // Arrays as list declara um tamanho fixo de elementos
    List<String> estudantes = Arrays.asList("João", "Maria", "Pedro", "Rosa");
    System.out.println(estudantes);
    String estudanteDoIndice2 = estudantes.get(3);
    System.out.println(estudanteDoIndice2);
    estudantes.set(0, "Leandro");
    System.out.println(estudantes);

    // Para adicionarmos um novo elemento numa lista, precisaríamos convertê-lo em ArrayList
    ArrayList<String> NewEstudantes = new ArrayList<String>(
        Arrays.asList("João", "Maria", "Pedro", "Rosa"));
    System.out.println(NewEstudantes);
    System.out.println("tamanho " + NewEstudantes.size());
    NewEstudantes.add("Leandro");
    System.out.println("tamanho " + NewEstudantes.size());
    System.out.println("o nome array contem 'leandro' ? "
        + NewEstudantes.contains("Leandro"));

    // "list of" traduz um cenário que define o array como imutável

//    List<String> estudantesImutavel = List.of("João", "Maria", "Pedro", "Rosa");
//    System.out.println(estudantesImutavel);
//    estudantesImutavel.add("leandro"); //produz um erro
  }
}
