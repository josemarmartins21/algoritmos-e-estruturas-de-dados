package exercicios.exe010;

public class App {
    public static void main(String[] args) {
        int i = 30;

        while (i > 0) {
            if (i % 4 == 0) {
                System.out.print("[" + i + "]");

            } else {
                System.out.print(" " +  i + " ");
            }

            i--;
        }
    }
}
