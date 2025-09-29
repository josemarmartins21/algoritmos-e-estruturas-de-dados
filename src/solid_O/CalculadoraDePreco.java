package solid_O;

public class CalculadoraDePreco {
    public double calcularDesconto(Desconto tipo_desconto, double valor) {
        return tipo_desconto.calcular(valor);
    }
}
