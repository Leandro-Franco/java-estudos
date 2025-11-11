package a1_Regra_progressao;

import java.util.ArrayList;
import java.util.Scanner;

public class AppProgression {
  // commit

  /**
   * Metodo main.
   */
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    ArrayList<Atividade> atividades = new ArrayList<>();
    double somaPeso = 0.0;
    double somatorio = 0.0;
    double resultado = 0.0;

    //Definição do loop que repetirá nossa tentativa de acrescentar atividades
    System.out.println("Digite a quantidade de atividades para cadastrar: ");
    int quantidade = Integer.parseInt(scan.nextLine());
    for (int i = 1; i <= quantidade; i++) {
      Atividade atividade = new Atividade();
      //usar o molde de classe pra criar os objetos atividade um por um
      System.out.println("Digite o nome da atividade " + i + ":");
      atividade.nome = scan.nextLine();

      System.out.println("Digite o peso da atividade " + i + ":");
      atividade.peso = scan.nextDouble();
      scan.nextLine();

      System.out.println("Digite a nota obtida para " + atividade.nome + ":");
      atividade.nota = scan.nextDouble();
      scan.nextLine();

      atividades.add(atividade);
      somaPeso += atividade.peso;
    }
    if (somaPeso != 100) {
      System.out.println("A soma dos pesos é diferente de 100!");
    } else {
      for (Atividade atv : atividades) {
        somatorio += atv.nota * atv.peso;
        resultado = somatorio / somaPeso;
      }
      if (resultado >= 85) {
        System.out.println("Parabéns! Você alcançou "
            + resultado + "%! E temos o prazer de informar que você obteve aprovação! ");
      } else {
        System.out.println("Lamentamos informar que, com base na sua "
            + "pontuação alcançada neste período, "
            + resultado + "%, você não atingiu a pontuação mínima necessária para sua aprovação.");
      }
    }
  }

}
