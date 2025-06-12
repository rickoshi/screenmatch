package aula04.calculoGeometrico;

public class CalculadoraSalaRetangular implements CalculoGeometrico {

    @Override
    public void calcularArea(double altura, double largura) {
        System.out.println("Área: " + altura * largura);
    }

    @Override
    public void calcularPerimetro(double altura, double largura) {
        System.out.println("Perímetro: " + (2 * (altura + largura)));
    }
}
