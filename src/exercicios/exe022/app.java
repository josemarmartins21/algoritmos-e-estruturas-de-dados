package exercicios.exe022;

public class app {
    public static void main(String[] args) {
        int vetor[] = new int[10];

        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = (int)(Math.random() * vetor.length);
        }

        System.out.println("Vetor desordenado");
        for (int i : vetor) {
            System.out.println(vetor[i]);
        }

        // insertioSort
     /*    int aux, j;
        for (int i = 1; i < vetor.length; i++) {
            j = i - 1;
            aux = vetor[i];
            while (j >= 0 && vetor[j] > aux) {
                vetor[j+1] = vetor[j];
                j--;
            }

            vetor[j+1] = aux;
        } */
       
        selectionSort(vetor);
        
        System.out.println("Vetor ordenado");
        for (int  i : vetor) {
            System.out.println(vetor[i]);
        }


    }   
    
    
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
