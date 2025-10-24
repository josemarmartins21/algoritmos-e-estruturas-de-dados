package exercicios.exe004;

import java.util.Scanner;

public class app {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int numbers[] = new int[10];
        
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Write the " + (i + 1) + "ª: ");
            numbers[i] = leitor.nextInt();
        }

        System.out.print("Type a reference value: ");
        int referenceValue = leitor.nextInt();

        int numbersLower = 0;
        int referenceAppears = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > referenceValue) {
                System.out.println(numbers[i]);
            }

            if (numbers[i] < referenceValue) {
                numbersLower ++;
            }

            if (referenceValue == numbers[i]) {
                referenceAppears ++;
            }
        }

        System.out.println("Number of time that reference number appear in the array: " + referenceAppears);
        System.out.println("Numbers more lower that number of reference: " + numbersLower);
        leitor.close();


        
    }
}
