package aula04.vendavel;

public class TesteVendavel {
    public static void main(String[] args) {
        Produto produto = new Produto();
        produto.setPreco(50);
        produto.aplicarDesconto(10);
        System.out.println(produto.calcularPrecoTotal(3));

        Servico servico = new Servico();
        servico.setPrecoHora(30);
        servico.aplicarDesconto(5);
        System.out.println(servico.calcularPrecoTotal(10));
    }
}
