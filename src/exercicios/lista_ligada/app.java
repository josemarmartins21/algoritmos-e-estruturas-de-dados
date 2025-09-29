package exercicios.lista_ligada;


public class app {    
    public static void main(String[] args) {
        ListaLigada lista = new ListaLigada();
        lista.adicionar("ANG");
        lista.adicionar("EUA");
        lista.adicionar("BR");
        lista.adicionar("MX");

        lista.remover("ANG");
        lista.remover("EUA");
        lista.remover("BR");
        lista.remover("MX");

        for (int i = 0; i < lista.getTamanho(); i++) {
            System.out.println((i + 1) +  " " + lista.buscar(i).getValor());
        }

        System.out.println(lista.getTamanho());

        
        
    }
}
