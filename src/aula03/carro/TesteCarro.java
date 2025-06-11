package aula03.carro;

public class TesteCarro {
    public static void main(String[] args) {
        ModeloCarro meuCarro = new ModeloCarro();
        meuCarro.setNomeModelo("Sedan");            // method declared in superclass
        meuCarro.setPrecos(30000, 32000, 35000);    // method declared in superclass
        meuCarro.setAnoModelo(2023);                // method declared in subclass
        meuCarro.exibirInformacoes();               // method overridden in subclass
    }
}
