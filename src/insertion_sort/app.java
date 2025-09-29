package insertion_sort;

public class app {
    public static void main(String[] args) {
        int numeros[] = new int[5];

        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = (int)(Math.random() * numeros.length);
        }

        int aux, j;
        for (int i = 1; i < numeros.length; i++) {
            aux = numeros[i];
            j = i - 1;
            while (j >= 0 && numeros[j] > aux) {
                numeros[j + 1] = numeros[j];
                j--;

            }
            numeros[j + 1] = aux;
        }

        for (int i = 0; i < numeros.length; i++) {
            System.out.println(numeros[i]);
        }
    }
}
