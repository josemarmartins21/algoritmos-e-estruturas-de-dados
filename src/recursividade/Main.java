package recursividade;

public class Main {
    public static void main(String[] args) {
        int [] vetor = new int[5];

        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = (int)(Math.random() * vetor.length);
        }

        for (int i = 0; i < vetor.length; i++) {
            System.out.println(vetor[i]);
        }

        System.out.println("\n\n"+somar(0, 0, vetor));
    
    }

    public static int somar(int soma, int posicao, int vetor[]) {
        if (posicao < vetor.length) {
            soma = soma + vetor[posicao];
            return somar(soma, posicao + 1, vetor);
            
        } else {
            return soma;
        }
    }
}

