package exercicios.exe019.insertion_sort;

public class App {
    public static void main(String[] args) {
        int vetor[] = new int[1000000]; // O(n^2)

        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = (int)(Math.random() * vetor.length);
        }

        int j, aux;
        for (int i = 1; i < vetor.length; i++) {
            aux = vetor[i];
            j = i - 1;
            while (j >= 0 && vetor[j] > aux) {
                vetor[j + 1] = vetor[j];
                j--;
            }

            vetor[j + 1] = aux;
        }
    }
}
