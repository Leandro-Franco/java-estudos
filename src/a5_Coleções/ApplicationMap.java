package a5_Coleções;

import java.util.HashMap;

public class ApplicationMap {

  public static void main(String[] args) {
    HashMap<String, String> estudantes = new HashMap<String, String>();
    estudantes.put("x038702", "João");
    estudantes.put("x784244", "Maria");
    estudantes.put("x105852", "Joana");
    String valorAnterior = estudantes.put("x038702",
        "José"); // Mesma matricula usada no mapeamento com João
    // ele substitui o mapeamento e retorna o valor anterior. Veja isso na prática:
    System.out.println("Valor anterior de x038702: " + valorAnterior);
    System.out.println("Estudantes: " + estudantes);
    System.out.println(estudantes.get("x105852")); // Matrícula da Maria

    //remove(Object), passando a chave como parâmetro:
    estudantes.remove("x038702");
    System.out.println(estudantes); // sem o José, que era joão
    System.out.println(
        "está vazio? " + estudantes.isEmpty() + "\nQual o tamanho? " + estudantes.size());
  }
}
