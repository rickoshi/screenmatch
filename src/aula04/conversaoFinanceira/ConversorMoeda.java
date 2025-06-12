package aula04.conversaoFinanceira;

public class ConversorMoeda implements ConversaoFinanceira {

    @Override
    public void converterDolarParaReal(double valorDolar) {
        double valorReal = valorDolar * 5.5;
        System.out.println("Valor em reais: R$" + valorReal);
    }
}
