package matriz;

import java.util.Scanner;

public class BubleSort {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int []array = new int[1000];

        for (int i = 0; i < array.length; i++) {
            array[i] = (int)(Math.random() * 100);
        }

        int aux = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] > array[j]) {
                    aux = array[i];
                    array[i] = array[j];
                    array[j] = aux;
                }
            }
        }
        System.out.println("Array ordenado!");
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
        System.out.println("Qual valor voce busca? ");
        int chute = leitor.nextInt();

        int alto = array.length - 1;
        int baixo = 0;
        boolean achado = false;
        while (baixo <= alto) {
            int meio = (int)((alto + baixo) / 2);
            if (array[meio] == chute) {
                achado = true;
                break;

            } else if (array[meio] < chute) {
                baixo = meio + 1;

            } else if (array[meio] > chute) {
                alto = meio - 1;
            }
        }

        if (achado) {
            System.out.println("Valor " + chute + " encontrado");

        } else {
            System.out.println("Valor não achado");
        }   

        leitor.close();
    }
}
