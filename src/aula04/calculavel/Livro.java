package aula04.calculavel;

public class Livro implements Calculavel {
    private double preco;
    private double taxa;

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public double getTaxa() {
        return taxa;
    }

    public void setTaxa(double taxa) {
        this.taxa = taxa;
    }

    @Override
    public double calcularPrecoFinal() {
        return preco + taxa;
    }
}
