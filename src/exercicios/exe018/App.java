package exercicios.exe018;

public class App {
    public static void main(String[] args) {
        int matriz[][] = new int[4][4];

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                matriz[i][j] = (int)(Math.random() * 80);
                System.out.print("[" + i  + " " + j + "] " + matriz[i][j] + "   ");
                
            }
            System.out.println();
        }

        int sDP = 0, p2L = 1;

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                if (i == j) {
                    sDP += matriz[i][j];
                }
            }
        }

        for (int i = 0; i < matriz.length; i++) {
            p2L *= matriz[1][i];

        }

        int maior = 0;
        for (int i = 0; i < matriz.length; i++) {
            if (matriz[2][i] > maior) {
                maior = matriz[i][2];
            }
        }

        System.out.println("A soma dos valores da diagonal principal é " + sDP);
        System.out.println("O produto dos valores da 2ª linha é " + p2L);
        System.out.println("O maior valor da terceira coluna é " + maior);

     /*    for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                if (j == i) {
                    System.out.println(matriz[i][j] + "\t");
                    
                } 
            }
            System.out.println();
        } */
    }
}
