package exercicios.exe013;

public class app {
    public static void main(String[] args) {
        int numeros[][] = {
            {12, 20, 15, 19},
            {17, 15, 20, 34},
            {17, 15, 10, 21},
            {17, 14, 60, 15}
        };

        for (int i = 0; i < numeros.length; i++) {
            for (int j = 0; j < numeros.length; j++) {
               // System.out.print(numeros[i][j] + "\t");
            }
            System.out.println();
        }

        int soma = 0;
        for (int i = 0; i < numeros.length; i++) {
            for (int j = 0; j < numeros.length; j++) {
                if (j == i) {
                    soma += numeros[i][j];
                    
                }


            }
            System.out.println();
        }

        System.out.println("A soma da diagona l principal é: " + soma);
    }
}
