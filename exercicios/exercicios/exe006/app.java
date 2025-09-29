package exercicios.exe006;

public class app {
    public static void main(String[] args) {
        int a = 10, b = 20;
        int aux = 0;
        aux = a;
        a = b;
        b = aux;
        System.out.println("O novo valor de A " + a + " & o novo valor de B " + b + " ");
    }
}
