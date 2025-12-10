package a5_Coleções;

import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import java.util.Set;

public class ApiStream {

  public static Collection<Estudante> obterEntrada() {
    return Set.of(
        new Estudante("2001", "Maria", "Computação"),
        new Estudante("2002", "João", "Computação"),
        new Estudante("2003", "José", "Pedagogia"),
        new Estudante("2004", "Ana", "Computação"),
        new Estudante("2004", "Ana", "Computação"),
        new Estudante("2004", "Ana", "Computação"),
        new Estudante("2005", "Bernardo", "Engenharia"),
        new Estudante("2006", "Antônia", "Computação"));
  }

  public static void main(String[] args) {
    Collection<Estudante> entrada = obterEntrada();
    List<String> matriculas = entrada.stream()
        .filter(e -> "Computação".equals(e.getCurso()))
        .sorted(Comparator.comparing(Estudante::getMatricula))
        .map(Estudante::getMatricula)
        .distinct()
        .toList();
    System.out.println(matriculas);
  }

}

class Estudante {

  private String matricula;

  private String nome;

  public Estudante(String matricula, String nome, String curso) {
    this.matricula = matricula;
    this.nome = nome;
    this.curso = curso;
  }

  public void setMatricula(String matricula) {
    this.matricula = matricula;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public void setCurso(String curso) {
    this.curso = curso;
  }

  public String getMatricula() {
    return matricula;
  }

  public String getNome() {
    return nome;
  }

  public String getCurso() {
    return curso;
  }

  private String curso;

  public Estudante() {
  }

}


