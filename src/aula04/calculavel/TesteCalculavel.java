package aula04.calculavel;

public class TesteCalculavel {
    public static void main(String[] args) {
        Livro livro = new Livro();
        livro.setPreco(39.99);
        livro.setTaxa(3.98);
        System.out.println(livro.calcularPrecoFinal());

        ProdutoFisico produto = new ProdutoFisico();
        produto.setPreco(189.99);
        produto.setDesconto(20.99);
        System.out.println(produto.calcularPrecoFinal());
    }
}
