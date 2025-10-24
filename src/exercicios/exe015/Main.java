package exercicios.exe015;

public class Main {
    public static void main(String[] args) {
        int numeros[] = {
            18, 5, 3, 4, 1
        };

        // trata caso de array vazio
        if (numeros.length == 0) {
            System.out.println("Array vazio");
            return;
        }

        int menor = numeros[0];
        int menor_indice = 0;

        for (int i = 1; i < numeros.length; i++) {
            if (numeros[i] < menor) {
                menor = numeros[i];
                menor_indice = i;
            }
        }

        System.out.println("Menor numero " + numeros[menor_indice]);
    }
}
