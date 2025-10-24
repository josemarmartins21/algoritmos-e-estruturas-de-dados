package exercicios.exe012;

public class app {
    public static void main(String[] args) {
        int numeros[][] = {
            {12, 34, 54},
            {13, 100, 43},
            {19, 30, 25}
        };

        for (int i = 0; i < numeros.length; i++) {
            for (int j = 0; j < numeros.length; j++) {
                System.out.print(numeros[i][j] + " \t");
            }
            System.out.println();
        }

        int soma = 0;
        for (int i = 0; i < numeros.length; i++) {
            for (int j = 0; j < numeros.length; j++) {
                soma += numeros[i][j];
            }
            System.out.println();
        }

        System.out.println("A soma é: " + soma);



    }
}
