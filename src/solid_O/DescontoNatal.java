package solid_O;

public class DescontoNatal implements Desconto {
    public double calcular(double valor) {
        return valor * 0.9;
    }
}
