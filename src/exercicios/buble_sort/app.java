package exercicios.buble_sort;

public class app {
    public static void main(String[] args) {
        int array [] = new int[1000000];

        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * array.length);
        }

        int aux;
        long tempoInicial = System.currentTimeMillis(); // tempo que inicial antes do vetor estar ordenado
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] > array[j]) {
                    aux = array[i];
                    array[i] = array[j];
                    array[j] = aux;

                }
            }
        }
        long tempoFinal = System.currentTimeMillis(); // tempo após o vetor estar ordenado

        System.out.println("Tempo " + (tempoFinal - tempoInicial)); // tempo demorado

            
    }
}
