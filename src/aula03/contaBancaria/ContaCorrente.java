package aula03.contaBancaria;

public class ContaCorrente extends ContaBancaria {
    public void cobrarTarifaMensal(double tarifaMensal) {
        saldo -= tarifaMensal;
        System.out.println("Tarifa mensal cobrada: " + tarifaMensal);
    };
}
