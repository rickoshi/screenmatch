package aula01;

public class Carro {
    String modelo;
    int ano;
    String cor;

    void exibeFichaTecnica() {
        System.out.println(modelo);
        System.out.println(ano);
        System.out.println(cor);
    }

    int calculaIdade() {
        return 2025 - ano;
    }
}
