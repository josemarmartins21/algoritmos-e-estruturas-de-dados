package exercicios.exe01;
import java.util.ArrayList;

public class app {
    public static void main(String[] args) {
        int[] arrayComDuplicatas = {1, 2, 2, 3, 4, 4, 4, 5};

        // Chame o método para remover as duplicatas
        int[] arraySemDuplicatas = removerDuplicatas(arrayComDuplicatas);

        // Imprima o novo array
        System.out.println("Array original: ");
        imprimirArray(arrayComDuplicatas);

        System.out.println("-------------------------");
        System.out.println("Novo array sem duplicatas: ");
        imprimirArray(arraySemDuplicatas);
    }

    public static int[] removerDuplicatas(int[] array) {
        // 1. Crie um ArrayList para armazenar os elementos únicos
        ArrayList<Integer> elementosUnicos = new ArrayList<>();

        // 2. Itere pelo array original
        for (int elemento : array) {
            // 3. Verifique se o elemento já existe
            if (!elementosUnicos.contains(elemento)) {
                // 4. Se não existir, adicione
                elementosUnicos.add(elemento);
            }
        }
        
        // 5. Converta o ArrayList para um array de inteiros e retorne
        int[] novoArray = new int[elementosUnicos.size()];
        for (int i = 0; i < elementosUnicos.size(); i++) {
            novoArray[i] = elementosUnicos.get(i);
        }

        return novoArray;
    }
    
    // Método auxiliar para imprimir o array
    public static void imprimirArray(int[] array) {
        System.out.print("[");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
            if (i < array.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }
}