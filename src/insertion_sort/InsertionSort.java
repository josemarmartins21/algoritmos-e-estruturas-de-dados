package insertion_sort;

public class InsertionSort {
    public static void main(String[] args) {
        int vetor[] = new int[1000000];

        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = (int)(Math.random() * vetor.length);
        } 
       // System.out.println("Vetor desordenado");
       /*  for (int i = 0; i < vetor.length; i++) {
            
        } */
       // Tempo total: 9192 - 100.000 || tempo total: 100 - 10.000 // InsertionSort. 1M não foi possivel, demorou muito.
        long inicio = System.currentTimeMillis();
        selectionSort(vetor);
        long fim = System.currentTimeMillis();
        // Tempo total: 8086 - 100.000 || tempo total: 91 - 10.000 // selectionSort. 1M não foi possivel, demorou muito.
        System.out.println("Tempo total: " + (fim - inicio));
      //  System.out.println("Vetor ordenado");
       /*  for (int i = 0; i < vetor.length; i++) {
            
        } */

    }

    // InsertionSort Sort
    public static void insertionSort(int vetor[]) {
        int j, aux;
        for (int i = 1; i < vetor.length; i++) {
            aux = vetor[i];
            j = i - 1;
            while (j >= 0 && vetor[j] > aux) {
                vetor[j+1] = vetor[j];
                j--;
            }  
            vetor[j+1] = aux;
        }
    }

    // Selection sort
    public static void selectionSort(int vetor[]) {
        int posicao_menor, aux;

        for (int i = 0; i < vetor.length; i++) {
            posicao_menor = i;
            for (int j = i + 1; j < vetor.length; j++) {
                if (vetor[posicao_menor] > vetor[j]) {
                    posicao_menor = j;
                }
            }
            aux = vetor[posicao_menor];
            vetor[posicao_menor] = vetor[i];
            vetor[i] = aux;
        }
    }
}
