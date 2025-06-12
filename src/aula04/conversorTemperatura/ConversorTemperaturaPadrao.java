package aula04.conversorTemperatura;

public class ConversorTemperaturaPadrao implements ConversorTemperatura {

    @Override
    public void celsiusParaFahrenheit(double temperaturaCelsius) {
        System.out.println(((temperaturaCelsius * 9 / 5) + 32));
    }

    @Override
    public void fahrenheitParaCelsius(double temperaturaFahrenheit) {
        System.out.println(((temperaturaFahrenheit - 32) * 5 / 9));
    }
}
