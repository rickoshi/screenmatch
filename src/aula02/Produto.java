package aula02;

public class Produto {
    private String nome;
    private double preco;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public void aplicarDesconto(double desconto) {
        if (desconto <= 0 || desconto > 100) {
            System.out.println("Desconto inválido");
        } else {
            preco -= (preco * (desconto / 100));
        }
    }
}
