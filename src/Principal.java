public class Principal {
    public static void main(String[] args) {
        Filme meuFilme = new Filme();
        meuFilme.nome = "O poderoso chefão";
        meuFilme.anoDeLancamento = 1972;
        meuFilme.duracaoEmMinutos = 175;

        meuFilme.exibeFichaTecnica();
        meuFilme.avalia(8);
        meuFilme.avalia(5);
        meuFilme.avalia(10);

        System.out.println("Soma das avaliações: " + meuFilme.somaDasAvaliacoes);
        System.out.println("Total de avaliações: " + meuFilme.totalDeAvaliacoes);
        System.out.println("Média de avaliações: " + meuFilme.retornaMedia());
    }
}
