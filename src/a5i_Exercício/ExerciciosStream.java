package a5i_Exercício;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ExerciciosStream {

  public static void main(String[] args) {
    System.out.println("--- INICIANDO EXERCÍCIOS DE STREAMS ---\n");

    // DADOS PARA TESTE
    List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
    List<String> palavras = Arrays.asList("java", "stream", "codigo", "spring", "api");

    // ---------------------------------------------------------
    // EXERCÍCIO 1: Filtrar números pares
    // ---------------------------------------------------------
    List<Integer> pares = numeros
        .stream()
        .filter(numero -> numero % 2 == 0)
        .toList();
    System.out.println("Ex 1 - Pares esperados: [2, 4, 6, 8, 10]");
    System.out.println("Ex 1 - Resultado obtido: " + pares);
    System.out.println("----------------------------------------");

    // ---------------------------------------------------------
    // EXERCÍCIO 2: Converter para Caixa Alta (Maiúsculas)
    // ---------------------------------------------------------
    List<String> maiusculas = palavras
        .stream()
        .map(String::toUpperCase)
//        .map(s -> s.toUpperCase())
        .toList();
    System.out.println("Ex 2 - Esperado: [JAVA, STREAM, CODIGO, SPRING, API]");
    System.out.println("Ex 2 - Resultado: " + maiusculas);
    System.out.println("----------------------------------------");

    // ---------------------------------------------------------
    // EXERCÍCIO 3: Somar todos os números
    // ---------------------------------------------------------
    int soma = numeros
        .stream()
        .mapToInt(Integer::intValue)
        .sum();
    System.out.println("Ex 3 - Soma esperada: 55");
    System.out.println("Ex 3 - Resultado: " + soma);
    System.out.println("----------------------------------------");

    // ---------------------------------------------------------
    // EXERCÍCIO 4: Filtrar por tamanho da String
    // ---------------------------------------------------------
    int tamanhoMinimo = 4;
    List<String> palavrasGrandes = palavras
        .stream()
        .filter(palavra -> palavra.length() > 4)
        .toList();
    System.out.println("Ex 4 - Palavras com mais de " + tamanhoMinimo
        + " letras esperadas: [stream, codigo, spring]");
    System.out.println("Ex 4 - Resultado: " + palavrasGrandes);
  }
  
}