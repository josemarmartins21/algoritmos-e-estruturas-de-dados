package exercicios.selection_sort;

public class MaiorMenor {
    public static void main(String[] args) {
        int vetor[] = {10, 200, 30, 70, 90};
        int posicao_maior, aux;
        
        for (int i = 0; i < vetor.length; i++) {
            posicao_maior = i;

            for (int j = i + 1; j < vetor.length; j++) {
                if (vetor[posicao_maior] < vetor[j]) {
                    posicao_maior = j;
                }
            }
            aux = vetor[posicao_maior];
            vetor[posicao_maior] = vetor[i];
            vetor[i] = aux;
        }
 
        System.out.println("\n\nVetor decrescente");
        for (int i = 0; i < vetor.length; i++) {
            System.out.println((i +1) + "} " + vetor[i]);
        }
    }
}
