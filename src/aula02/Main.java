package aula02;

public class Main {
    public static void main(String[] args) {
        ContaBancaria contaBancaria = new ContaBancaria();
        contaBancaria.setNumeroConta(78);
        contaBancaria.setSaldo(500);
        contaBancaria.titular = "Maria";
        System.out.println("Número da conta: " + contaBancaria.getNumeroConta());
        System.out.println("Saldo: " + contaBancaria.getSaldo());
        System.out.println("Títular: " + contaBancaria.titular);
        System.out.println();

        IdadePessoa pessoa = new IdadePessoa();
        pessoa.setNome("Lucas");
        pessoa.setIdade(22);
        pessoa.verificarIdade();
        pessoa.setIdade(16);
        pessoa.verificarIdade();
        System.out.println();

        Produto produto = new Produto();
        produto.setNome("AirFryer");
        produto.setPreco(300);
        System.out.println("Produto: " + produto.getNome());
        System.out.println("Preço: " + produto.getPreco());
        produto.aplicarDesconto(-2);
        produto.aplicarDesconto(20);
        System.out.println("Com desconto de 20%: " + produto.getPreco());
        System.out.println();

        Aluno aluno = new Aluno();
        aluno.setNome("João");
        aluno.setNota1(8.2);
        aluno.setNota2(4.0);
        aluno.setNota3(7.9);
        System.out.println("Aluno: " + aluno.getNome());
        System.out.println("Média: " + aluno.calcularMedia());
        System.out.println();

        Livro livro = new Livro();
        livro.setTitulo("Dom Quixote");
        livro.setAutor("Miguel de Cervantes");
        livro.exibirDetalhes();
    }
}
