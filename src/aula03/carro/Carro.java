package aula03.carro;

public class Carro {
    private String nomeModelo;
    private double precoMedioAno1;
    private double precoMedioAno2;
    private double precoMedioAno3;

    public void setNomeModelo(String nomeModelo) {
        this.nomeModelo = nomeModelo;
    }

    public void setPrecos(double precoMedioAno1, double precoMedioAno2, double precoMedioAno3) {
        this.precoMedioAno1 = precoMedioAno1;
        this.precoMedioAno2 = precoMedioAno2;
        this.precoMedioAno3 = precoMedioAno3;
    }

    public void exibirInformacoes() {
        System.out.println("Informações do modelo");
        System.out.println("Nome do modelo: " + nomeModelo);
        System.out.println("Preço médio do ano 1: " + precoMedioAno1);
        System.out.println("Preço médio do ano 2: " + precoMedioAno2);
        System.out.println("Preço médio do ano 3: " + precoMedioAno3);
        System.out.println("Menor preço: " + calcularMenorPreco());
        System.out.println("Maior preço: " + calcularMaiorPreco());
    }

    public double calcularMenorPreco() {
        double menorPreco = precoMedioAno1;
        if (precoMedioAno2 < menorPreco) {
            menorPreco = precoMedioAno2;
        }
        if (precoMedioAno3 <menorPreco) {
            menorPreco = precoMedioAno3;
        }
        return menorPreco;
    }

    public double calcularMaiorPreco() {
        double maiorPreco = precoMedioAno1;
        if (precoMedioAno2 > maiorPreco) {
            maiorPreco = precoMedioAno2;
        }
        if (precoMedioAno3 > maiorPreco) {
            maiorPreco = precoMedioAno3;
        }
        return maiorPreco;
    }
}
