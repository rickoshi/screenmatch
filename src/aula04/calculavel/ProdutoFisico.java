package aula04.calculavel;

public class ProdutoFisico implements Calculavel {
    private double preco;
    private double desconto;

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public double getDesconto() {
        return desconto;
    }

    public void setDesconto(double desconto) {
        this.desconto = desconto;
    }

    @Override
    public double calcularPrecoFinal() {
        return preco - desconto;
    }
}
