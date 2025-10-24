package exercicios.exe016;

public class App {
    public static void main(String[] args) {
        int notas[] = new int[10];

        for (int i = 0; i < notas.length; i++) {
            notas[i] = (int)(Math.random() * notas.length);
            System.out.println(notas[i]);
        }

        System.out.println("\n\n" + buscarMaior(notas));
        System.out.println("\n\n" + buscarMenor(notas));
        System.out.println("\n\n" + somarVetor(notas));
        System.out.println("\n\n" + media(notas, somarVetor(notas)));
        
        
       
    }

    /**
     * Busca o maior valor do vetor
     * 
     * @param vetor
     * @return Integer
     */
    public static int buscarMaior(int vetor[]) {
        int maior = 0;
        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] > maior) {
                maior = vetor[i];
            }
        }

        return maior;
    }

    /*
     * Busca o menor valor do vetor
     * @author Josimar Martins
     * @param array
     * @return Integer
     */
    public static int buscarMenor(int vetor[]) {
        int menor = vetor[0];
        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] < menor) {
                menor = vetor[i];
            }
        }
        return menor;
    }

    /**
     * Faz o somatório de todo vetor
     * @param vetor
     * @return Integer
     */
    public static int somarVetor(int vetor[]) {
        int soma = 0;
        for (int i = 0; i < vetor.length; i++) {
            soma += vetor[i];
        }
        return soma;
    }

    /**
     * Calcula a média dos números no vetor
     * @param vetor
     * @param somaDoVetor
     * @return double
     */
    public static double media(int vetor[], int somaDoVetor) {
        return (double) somaDoVetor / vetor.length;
    }
}
