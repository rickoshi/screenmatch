package aula03.contaBancaria;

public class TesteContaBancaria {
    public static void main(String[] args) {
        ContaCorrente conta = new ContaCorrente();
        conta.depositar(2000);
        conta.consultarSaldo();
        conta.sacar(500);
        conta.consultarSaldo();
        conta.cobrarTarifaMensal(50);
        conta.consultarSaldo();
    }
}
