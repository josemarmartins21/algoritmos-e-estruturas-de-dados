package exercicios.exe003;

import java.util.Scanner;

public class app {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        float numbers[] = new float[10];

        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Type any number");
            numbers[i] = leitor.nextFloat();
        }

        for (int i = 10 - 1; i > 0; i--) {
            System.out.println(numbers[i]);
        }

        leitor.close();


    }
}
