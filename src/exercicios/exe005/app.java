package exercicios.exe005;

public class app {
    public static void main(String[] args) {
        int y[] = new int[10];
        int x[] = new int[10];

        System.out.println("Primeiro vetor");
        for (int i = 0; i < x.length; i++) {
            x[i] = (int)(Math.random() * x.length);
            System.out.println(x[i]);
        }

        System.out.println("Segundo vetor");
        for (int i = 0; i < x.length; i++) {
            y[i] = (int)(Math.random() * x.length);
            System.out.println(y[i]);
        }

        int soma = 0;
        for (int i = 0; i < x.length; i++) {
            soma = x[i] * y[i];
        }

        System.out.println("O produto dos vetores é: " + soma);
    }
}
