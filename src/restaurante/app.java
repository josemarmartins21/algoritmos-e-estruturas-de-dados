package restaurante;

import java.util.Scanner;

public class app {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        String pedidos[] = {"Sacamadesso", "Fumbua", "Muteta", "Catato"};
        ListaLigada lista = new ListaLigada();

        System.out.println("Nosso cardápio");
        for (int i = 0; i < pedidos.length; i++) {
            System.out.println("[" + i +"] " + pedidos[i]);
        }
        
        System.out.println("Escolha um prato");
        int numeroPedido = leitor.nextInt();
        
        Cliente cliente = new Cliente(numeroPedido);

        Garcom garcom = new Garcom("Daniel Avelino");

        garcom.anotarPedido(pedidos[cliente.getNumeroPedido()], lista);

        Chefe chefe = new Chefe(lista, "Mana Linda");

        chefe.consultarLista();
        chefe.atenderPedido();
        chefe.consultarLista();
        
        
        

        leitor.close();

    }
}
