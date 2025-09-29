package exercicios.binary_search;

import java.util.Scanner;

public class app {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int array[] = new int[100000];

        for (int i = 0; i < array.length; i++) {
            array[i] = i + 1;
        }
      
        

        System.out.println("Qual é o valor procurado?");
        int chute = leitor.nextInt();

        long inicio = System.currentTimeMillis();
        int valorAchado = buscarBinaria(array, chute);
        long fim = System.currentTimeMillis();

        System.out.println("Valor encontrado: " + valorAchado);
        System.out.println("Valor buscado em " + (fim - inicio));


        leitor.close();


    }

    public static int buscarBinaria(int array [], int chute) {
        int baixo = 0;
        int alto = array.length - 1;

        while (baixo <= alto) {
            int meio = (int)((baixo + alto) / 2);

            if (array[meio] == chute) {
                return array[meio];

            } else if (array[meio] < chute) {
                baixo = meio + 1;

            } else if (array[meio] > chute) {
                alto = meio - 1;
            }

        }

        return -1;
    }
}
