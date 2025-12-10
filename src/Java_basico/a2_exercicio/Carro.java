package Java_basico.a2_exercicio;

public class Carro {

    String placa;
    String modelo;
    int km;

    public Carro(String placa, String modelo, int km) {
        this.placa = placa;
        this.modelo = modelo;
        this.km = km;
    }

    public String getPlaca() {
        return placa;
    }

    public String getModelo() {
        return modelo;
    }

    public int getKm() {
        return km;
    }

    @Override // Isso avisa que estamos mudando o comportamento padrão
    public String toString() {
        return "Carro{ Placa='" + this.placa + "', Modelo=" + this.modelo + " }";
    }
}

/**
 * public class Carro { // ... restante do código da classe Carro ...
 * <p>
 * private static int contador = 0;
 * <p>
 * public Carro(String marca, String modelo, int ano) { // ... construtor ... Carro.contador++; //
 * Incrementa o contador a cada carro criado }
 * <p>
 * public static int quantidadeDeCarros() { return contador; } }
 */

//Sendo possível referenciar a si mesmo sem o uso do "this", assim trabalhando "de modo independente"
