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
      try {
        //DESCOMENTAR PARA TESTE
//        gerenciamento.cadastrarPessoaCandidata("joaquim", 1);
//        gerenciamento.cadastrarPessoaCandidata("antonia", 2);
        option = scan.nextInt();
        scan.nextLine();
      } catch (Exception e) {
        option = -1;
        scan.nextLine();
      }
      if (option == 1) {
        System.out.println("Entre com o nome da pessoa candidata:");
        String nome = scan.nextLine();
        System.out.println("Entre com o numero da pessoa candidata:");
        int numero = scan.nextInt();
        gerenciamento.cadastrarPessoaCandidata(nome, numero);
      } else if (option != 2) {
        System.out.println("Insira um valor válido");
      }

    } while (option != 2);
    do {
      System.out.println("Cadastrar pessoa eleitora?\n"
          + "1 - Sim\n"
          + "2 - Não\n"
          + "Entre com o número correspondente à opção desejada:");
      try {
        //DESCOMENTAR PARA TESTE
//        gerenciamento.cadastrarPessoaEleitora("pedro", "1");
//        gerenciamento.cadastrarPessoaEleitora("pedro", "12");
//        gerenciamento.cadastrarPessoaEleitora("pedro", "123");
//        gerenciamento.cadastrarPessoaEleitora("pedro", "1234");
//        gerenciamento.cadastrarPessoaEleitora("pedro", "12345");
//        gerenciamento.cadastrarPessoaEleitora("pedro", "123456");
        option = scan.nextInt();
        scan.nextLine();
      } catch (Exception e) {
        option = -1;
        scan.nextLine();
      }
      if (option == 1) {
        System.out.println("Entre com o nome da pessoa eleitora:");
        String nome = scan.nextLine();
        System.out.println("Entre com o cpf da pessoa eleitora:");
        String cpf = scan.nextLine();
        gerenciamento.cadastrarPessoaEleitora(nome, cpf);
      } else if (option != 2) {
        System.out.println("Insira um valor válido");
      }

    } while (option != 2);
    do {
      System.out.println("Entre com o número correspondente à opção desejada:\n"
          + "1 - Votar\n"
          + "2 - Resultado Parcial\n"
          + "3 - Finalizar Votação");
      //DESCOMENTAR PARA TESTE
//      gerenciamento.votar("1", 1);
//      gerenciamento.votar("12", 1);
//      gerenciamento.votar("123", 1);
//      gerenciamento.votar("1234", 2);
//      gerenciamento.votar("12345", 2);
//      gerenciamento.votar("123456", 2);

      try {
        option = scan.nextInt();
        scan.nextLine();
      } catch (Exception e) {
        scan.nextLine();
        option = -1;
      }
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
          System.out.println("Valor inserido é inválido");
          break;
      }

    } while (true);
  }
}
