package exercicios.exe019.buble_sort;

public class App {
    public static void main(String[] args) {
        int vetor[] = new int[100000]; // O(n^2)


        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = (int)(Math.random() * vetor.length);
        }

        long inicio = System.currentTimeMillis();
        int aux;
        for (int i = 1; i < vetor.length; i++) {
            for (int j = 0; j < vetor.length; j++) {
                if (vetor[j] > vetor[i]) {
                    aux = vetor[i];
                    vetor[i] = vetor[j];
                    vetor[j] = aux;
                }
            }
        }

        long fim = System.currentTimeMillis();

        System.out.println("Demorou " + (fim - inicio) + ".");

       /*  for (int i = 0; i < vetor.length; i++) {
            System.out.println(vetor[i]);
        } */
    }
}
