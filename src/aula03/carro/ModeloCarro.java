package aula03.carro;

public class ModeloCarro extends Carro {
    private int anoModelo;

    public int getAnoModelo() {
        return anoModelo;
    }

    public void setAnoModelo(int anoModelo) {
        this.anoModelo = anoModelo;
    }

    @Override
    public void exibirInformacoes() {
        super.exibirInformacoes();
        System.out.println("Ano do modelo: " + anoModelo);
    }
}
