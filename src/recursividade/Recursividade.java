package recursividade;

public class Recursividade {
    public static void main(String[] args) {
        int vetor[] = {
            12, 
            34, 
            10,
            5,
            6
        };

        int index = -1;
        procure_pelo_numero(index, vetor, 5);
    }

    private static void procure_pelo_numero(int i, int array[], int buscado) {
        for (i += 1; i < array.length; i++) {
            if (array[i] != buscado) {
                procure_pelo_numero(i, array, buscado);

            } else {
                System.out.println("Achei o valor");
                break;
            }
        }
    }
}
