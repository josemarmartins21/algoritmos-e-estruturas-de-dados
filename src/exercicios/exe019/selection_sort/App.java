package exercicios.exe019.selection_sort;

public class App {
    public static void main(String[] args) {
        int vetor[] = new int[10];

        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = (int)(Math.random() * 10);
        }

        int aux, posicao_menor;
        for (int i = 0; i < vetor.length; i++) {
            posicao_menor = i;
            for (int j = i + 1; j < vetor.length; j++) {
                if (vetor[j] < vetor[posicao_menor]) {
                    posicao_menor = j;
                }
            }

            aux = vetor[posicao_menor];
            vetor[posicao_menor] = vetor[i];
            vetor[i] = aux;


        }

        for (int i = 0; i < vetor.length; i++) {
            System.out.println(vetor[i]);
        }
    }
}
