package Java_basico.a0_fundamentos;

public class ContaBancaria {

    double saldo;

    public ContaBancaria(double saldo) {
        this.saldo = saldo;
    }

    void mostraMensagem() {
        System.out.println("Conta bancária acessada.");
    }

    void depositar(double valor) {
        this.saldo += valor;
        System.out.println(saldo);
    }

    double converteMoeda(float total, float cambio) {
        System.out.println(total * cambio);
        return total * cambio;
    }
}
