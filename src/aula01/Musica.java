package aula01;

public class Musica {
    String titulo;
    String artista;
    int anoDeLancamento;
    double somaDasAvaliacoes;
    int numDeAvaliacoes;

    void exibeFichaTecnica() {
        System.out.println(titulo);
        System.out.println(artista);
        System.out.println(anoDeLancamento);
    }

    void avaliaMusica(double avalicao) {
        somaDasAvaliacoes += avalicao;
        numDeAvaliacoes++;
    }

    double retornaMedia() {
        return (somaDasAvaliacoes / numDeAvaliacoes);
    }
}
