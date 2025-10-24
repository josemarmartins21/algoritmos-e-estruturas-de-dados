package exercicios.exe001;

import java.util.Scanner;

public class app {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int array[] = new int[5];
        int soma = 0;

        for (int i = 0; i < array.length; i++) {
            System.out.println("Type a number:" );
            array[i] = leitor.nextInt();
        }

        for (int i = 0; i < array.length; i++) {
            soma += array[i];
        }

        System.out.println("Soma de todos os valores: " + soma);
        leitor.close();



    }
}
