package insertion_sort;

public class Main {
    public static void main(String[] args) {
        int [] vetor = new int[100];
        
        // preenche o vetor com nª aleatorios
        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = (int)(Math.random() * vetor.length);
        
        }

      
       int aux, j;
       for (int i = 1; i < vetor.length; i++) {
            aux = vetor[i];
            j = i - 1;
            while (j >= 0 && vetor[j] > aux) {
                vetor[j + 1] = vetor[j];
                j--;
            }
            vetor[j + 1] = aux;
       }

        for (int i = 0; i < vetor.length; i++) {
            
        }
        
    }  
}
