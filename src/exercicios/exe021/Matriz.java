package exercicios.exe021;

public class Matriz {
    public static void main(String[] args) {
        int vetor[][] = new int[4][4];

        for (int i = 0; i < vetor.length; i++) {
            for (int j = 0; j < vetor.length; j++) {
                vetor[i][j] = (int)(Math.random() * vetor.length);
            }
        }


        for (int i = 0; i < vetor.length; i++) {
            for (int j = 0; j < vetor.length; j++) {
                if (j == i) {
                    System.out.print("["+vetor[i][j] + "]\t");
                }
            }
            
            System.out.println();
        }
    }
}
