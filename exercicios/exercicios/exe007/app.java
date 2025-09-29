package exercicios.exe007;

import java.util.Scanner;

public class app {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);    
        
        System.out.println("Type the car price");
        int precoDoCarro = leitor.nextInt();

        int procentualDistribuidor = (int)((precoDoCarro * 28) / 100); 

        int porcentualImposto = (int)((precoDoCarro * 45) / 100);

        precoDoCarro = procentualDistribuidor + porcentualImposto + precoDoCarro;

        System.out.println("O preço final do carro é: " + precoDoCarro);
        leitor.close();

    }
} // 711 +  1143


