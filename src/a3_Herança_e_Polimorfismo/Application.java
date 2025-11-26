package a3_Herança_e_Polimorfismo;

public class Application {

  public static void main(String[] args) {

    Warrior player1 = new Warrior();
    player1.setName("Aragorn");
    // A linha abaixo funcionará normalmente
    player1.setWeapon("Espada");

    PlayableCharacter player2 = new Warrior();
    player2.setName("Aragorn");

    player1.attack();

    // A linha abaixo dará erro se for descomentada
    // player2.setWeapon("Espada");
  }
}

