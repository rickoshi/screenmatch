package aula04.vendavel;

public class Produto implements Vendavel {
    private double preco;

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    @Override
    public double calcularPrecoTotal(int quantidade) {
        return preco * quantidade;
    }

    @Override
    public void aplicarDesconto(double percentualDesconto) {
        preco -= preco * (percentualDesconto / 100.0);
    }
}
