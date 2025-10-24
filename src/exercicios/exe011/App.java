package exercicios.exe011;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int i = 0; 

        System.out.print("Digite o inicio: ");
        int inicio = leitor.nextInt();

        System.out.print("Digite o final: ");
        int fim = leitor.nextInt();

        System.out.print("Digite o incremento: ");
        int incremento = leitor.nextInt();

        System.out.print("Contagem:");
        while (i < fim) {
            System.out.print(" " + i + " ");
            i += incremento;
        }
        System.out.print("Acabou");
        leitor.close();
    }
}
