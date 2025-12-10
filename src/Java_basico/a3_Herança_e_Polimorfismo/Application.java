package Java_basico.a3_Herança_e_Polimorfismo;

public class Application {

    public static void main(String[] args) {

        Warrior player1 = new Warrior();
        player1.setName("Aragorn");
        // A linha abaixo funcionará normalmente
        player1.setWeapon("Espada");
        player1.attack();

        Cleric player2 = new Cleric();

        player2.heal();                       // Cura básica
        player2.heal("Poção de Vida");        // Cura com a Poção de Vida
        player2.heal("Feitiço de Luz", 7);    // Cura com Feitiço de Luz e poder 7

    }

    // A linha abaixo dará erro se for descomentada
    // player2.setWeapon("Espada");
}


