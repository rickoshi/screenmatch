package aula01;

public class Main {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa();
        pessoa.exibeMensagem();

        Calculadora calculadora = new Calculadora();
        System.out.println(calculadora.dobraNumero(4));
        System.out.println();

        Musica musica = new Musica();
        musica.titulo = "Die With a Smile";
        musica.artista = "Bruno Mars and Lady Gaga";
        musica.anoDeLancamento = 2025;
        musica.exibeFichaTecnica();
        musica.avaliaMusica(9);
        musica.avaliaMusica(7);
        musica.avaliaMusica(6);
        System.out.printf("%.2f\n", musica.retornaMedia());
        System.out.println();

        Carro carro = new Carro();
        carro.modelo = "Honda Civic";
        carro.ano = 2022;
        carro.cor = "Cinza";
        carro.exibeFichaTecnica();
        System.out.println(carro.calculaIdade());
        System.out.println();

        Aluno aluno = new Aluno();
        aluno.nome = "Luna";
        aluno.idade = 20;
        aluno.exibeInformacoes();
    }
}
