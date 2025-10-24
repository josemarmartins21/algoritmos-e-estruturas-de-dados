package exercicios.shell_sort;

public class App {
    public static void main(String[] args) {
        int vetor[] = new int[100000000]; 
    
        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = (int)(Math.random() * vetor.length);
        }

        /* System.out.println("Vetor desordenado");
        for (int i = 0; i < vetor.length; i++) {
            System.out.println(vetor[i]);
        } */

        int h = 1;
        int n = vetor.length;

        while (h < n) {
            h = h * 3 + 1;
        }

        h = (int)(Math.floor(h / 3));

        int elemento, j;
        long inicio = System.currentTimeMillis();
        while (h > 0) {
            for (int i = h; i < n; i++) {
                elemento = vetor[i];
                j = i;
                while (j >= h && vetor[j-h] > elemento) {
                    vetor[j] = vetor[j-h];
                    j = j - h;
                }

                vetor[j] = elemento;

            }
            h = h / 2;
        }
        long fim = System.currentTimeMillis();
        /* System.out.println("Vetor ordenado"); */
       /*  for (int i = 0; i < vetor.length; i++) {
            System.out.println(vetor[i]);
        } */
        System.out.println(fim - inicio);
        
    }
}
