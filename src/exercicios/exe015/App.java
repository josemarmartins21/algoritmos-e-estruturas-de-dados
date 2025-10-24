package exercicios.exe015;

// import java.util.ArrayList;

public class App {
    public static void main(String[] args) {
        int array[] = {12, 32,  1, 50, 2, 9};
        int i = buscarMenor(array);
        System.out.println(array[i]);
    }

    public static int buscarMenor(int vetor[]) {
        int menor = vetor[0];
        int menor_indice = 0;

        for (int i = 1; i < vetor.length; i++) {
            if (vetor[i] < menor) {
                menor = vetor[i];
                menor_indice = i;

            }
        }

        return menor_indice;
    }

    public static void ordenacaoPorSelecao(int vetor[]) {
        /* ArrayList<Integer> novo_array = new ArrayList<Integer>();

        for (int i = 0; i < vetor.length; i++) {
            int menor = buscarMenor(vetor);
            novo_array.a
        } */
    }
}
