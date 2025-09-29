package exercicios.exe008;

import java.util.Scanner;

public class app {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int comissao = 100;


        System.out.println("Número de carro vendido");
        int numeroDeCarros = leitor.nextInt();

        
        System.out.println("Valor total de vendas");
        int totValor = leitor.nextInt();

        System.out.println("Digite o salário fixo");
        int salario = leitor.nextInt();

        int porcTotVenda = (totValor * 5) / 100;

        int valComissao = comissao * numeroDeCarros;

        int finalSalario = porcTotVenda + valComissao + salario;

        System.out.println("O salário final é de : "  + finalSalario);





    }
}


/* Os funcionários tem salario fixo
 * para cada carro vendido recebem um comissão fixa + 5% do         valor   de cada venda
 * * 
 * O algoritmo deve ler o número de carros vendidos por funionário
 * o valor total da sua venda + 5% o  salário fixo e o valor que ele recebe por carro vendido
 * Retorna o salário final
 */