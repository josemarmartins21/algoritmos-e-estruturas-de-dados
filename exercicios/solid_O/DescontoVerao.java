package solid_O;

public class DescontoVerao implements Desconto {

    @Override
    public double calcular(double valor) {
        return valor * 0.75;
    }
    
}
