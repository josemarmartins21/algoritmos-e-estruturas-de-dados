package solid_O;

public class app {
    public static void main(String[] args) {
        CalculadoraDePreco calculadora = new CalculadoraDePreco();
        

       double desconto =  calculadora.calcularDesconto(new DescontoNatal(), 100);
       System.out.printf("O desconot de nata: %f", 2.f,  desconto);
       desconto = calculadora.calcularDesconto(new DescontoBlackFriday(), 100);
       System.out.printf("O desconot de nata: %f", 2.f,  desconto);

       desconto = calculadora.calcularDesconto(new DescontoVerao(), 100);

       System.out.println("\n" + desconto);
    }
}
