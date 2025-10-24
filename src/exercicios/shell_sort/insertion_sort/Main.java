package exercicios.shell_sort.insertion_sort;

// algoritmos.que.auxiliam.o.shell.sort

public class Main {
    public static void main(String[] args) {
        int vetor[] = {
            10, 9, 6, 12
        };


        System.out.println("Vetor desordenado!");
        for (int i = 0; i < vetor.length; i++) {
            System.out.println(vetor[i]);
        }

        int j, aux;
        for (int i = 1; i < vetor.length; i++) {
            aux = vetor[i];
            j = i - 1;

            while (j >= 0 && vetor[j] > aux) {
                vetor[j + 1] = vetor[j];
                j --;
            }

            vetor[j + 1] = aux;

        }

        System.out.println("Vetor ordenado!");
        for (int i = 0; i < vetor.length; i++) {
            System.out.println(vetor[i]);
        }
      

    }
}
