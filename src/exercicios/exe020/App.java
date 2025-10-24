package exercicios.exe020;

public class App {
    public static void main(String[] args) {
        ListaLigada lista = new ListaLigada();

        lista.add("Luanda");
        lista.add("Epic Sana");
        lista.add("Barcelona");
        lista.add("Juventus");
        lista.add("Man City");

        System.out.println(lista.getTamanho());

        System.out.println(lista.getPrimeiro().getProximo().getValor());

        lista.remove("Juventus");

        for (int i = 0; i < lista.getTamanho(); i++) {
            System.out.println(lista.get(i).getValor());
        }


    }
}
