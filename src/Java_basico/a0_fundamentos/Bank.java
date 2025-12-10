package Java_basico.a0_fundamentos;

public class Bank {

    public static void main(String[] args) {
        ContaBancaria conta = new ContaBancaria(100);
        conta.mostraMensagem();
        conta.depositar(500);
        double valorConvertido = conta.converteMoeda(30, 5);
    }
}

