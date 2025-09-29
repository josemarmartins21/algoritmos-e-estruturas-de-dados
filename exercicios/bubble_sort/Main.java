package bubble_sort;

public class Main {
    public static void main(String[] args) {
        int [] vetor = new int[100000];

        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = (int) (Math.random() * vetor.length);
            
        }

        long inicio = System.currentTimeMillis();
        int aux; // O(N^2)
        for (int i = 0; i < vetor.length; i++) { // complexidade O(N)
            for (int j = i + 1; j < vetor.length; j++) {
                if (vetor[i] > vetor[j]) {
                    aux = vetor[j];
                    vetor[j] = vetor[i];
                    vetor[i] = aux;
                }
            }
        }
        long fim = System.currentTimeMillis();
        System.out.println("Tempo:  " +  (fim - inicio));
       


    }
}
