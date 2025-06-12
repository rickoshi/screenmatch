package aula04.conversorTemperatura;

public class TesteConversorTemperatura {
    public static void main(String[] args) {
        ConversorTemperatura conversor = new ConversorTemperaturaPadrao();
        conversor.celsiusParaFahrenheit(25);
        conversor.fahrenheitParaCelsius(77);
    }
}
