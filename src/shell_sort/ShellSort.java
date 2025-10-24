package shell_sort;

public class ShellSort {
    public static void main(String[] args) {
        int vetor[] = new int[10];

        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = (int)(Math.random() * vetor.length);
        }

        System.out.println("Vetor desordenado");
        for (int i = 0; i < vetor.length; i++) {
            System.out.println(vetor[i]);
        }

        int h = 1;
        int n = vetor.length;
        // Encotra o numero que vai ser divido para obtermos qtd de pulo
        while (h < n) {
            h = h * 3 + 1;
        }
        
        // encontrar a quantidade de pulos necessaria
        h = (int)(Math.floor(h / 3));

        int elemento, j;

        // Verifica se o h é maior que 0 enqunto for divide o h por 2
        while (h > 0) {
            for (int i = h; i < n; i++) { // Insertion Sort
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

        //System.out.println("Tempo total: " + (f - inicio));
        System.out.println("\n\nVetor ordenado");
        for (int i = 0; i < vetor.length; i++) {
            System.out.println(vetor[i]);
        }
    }
}
