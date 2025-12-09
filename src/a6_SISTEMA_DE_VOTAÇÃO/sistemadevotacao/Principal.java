package a6_SISTEMA_DE_VOTAÇÃO.sistemadevotacao;

import java.util.Scanner;

/**
 * The type Principal.
 */
public class Principal {

  /**
   * The entry point of application.
   */
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    GerenciamentoVotacao gerenciamento = new GerenciamentoVotacao();

    int option = 0;

    do {
      System.out.println("Cadastrar pessoa candidata?\n"
          + "1 - Sim\n"
          + "2 - Não\n"
          + "Entre com o número correspondente à opção desejada:");
      option = scan.nextInt();
      scan.nextLine();
      if (option == 1) {
        System.out.println("Entre com o nome da pessoa candidata:");
        String nome = scan.nextLine();
        System.out.println("Entre com o nome da pessoa candidata:");
        int numero = scan.nextInt();
        gerenciamento.cadastrarPessoaCandidata(nome, numero);
      }

    } while (option == 1);
    do {
      System.out.println("Cadastrar pessoa eleitora?\n"
          + "1 - Sim\n"
          + "2 - Não\n"
          + "Entre com o número correspondente à opção desejada:");
      option = scan.nextInt();
      scan.nextLine();
      if (option == 1) {
        System.out.println("Entre com o nome da pessoa eleitora:");
        String nome = scan.nextLine();
        System.out.println("Entre com o cpf da pessoa eleitora:");
        String cpf = scan.nextLine();
        gerenciamento.cadastrarPessoaEleitora(nome, cpf);
      }

    } while (option == 1);
    do {
      System.out.println("Entre com o número correspondente à opção desejada:\n"
          + "1 - Votar\n"
          + "2 - Resultado Parcial\n"
          + "3 - Finalizar Votação");
      option = scan.nextInt();
      scan.nextLine();
      switch (option) {
        case 1:
          System.out.println("Entre com o cpf da pessoa eleitora:");
          String cpf = scan.nextLine();
          System.out.println("Entre com o número da pessoa candidata:");
          int numero = scan.nextInt();
          gerenciamento.votar(cpf, numero);
          break;
        case 2:
          gerenciamento.mostrarResultado();
          break;
        case 3:
          gerenciamento.mostrarResultado();
          System.exit(0);
          break;
        default:
          break;
      }

    } while (option != 0);
    scan.close();
  }
}
