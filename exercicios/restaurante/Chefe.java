package restaurante;

public class Chefe {
    private ListaLigada pedidos;
    private String nome;
    
    public Chefe(ListaLigada pedidos, String nome) {
        this.pedidos = pedidos;
        this.nome = nome;
    }


    public void consultarLista() {
        if (pedidos.getTamanho() > 0) {
            System.out.println("Pedidos disponiveis");
            for (int i = 0; i < pedidos.getTamanho(); i++) {
                System.out.println("[" + i + "] " + pedidos.get(i).getValor());
            }
            
        } else {
            System.out.println("Sem pedidos ainda");
        }
        System.out.println("----------------------------------");
    }

    public void atenderPedido() {
        pedidos.remover(pedidos.getPrimeiro().getValor());
        if (pedidos.getTamanho() < 1) {
            System.out.println("Já não há pedidos");
            System.out.println("----------------------------------");

        } else {
            System.out.println("Restam " + pedidos.getTamanho() + " pedidos");
            System.out.println("----------------------------------");
        }
    }


    public ListaLigada getPedidos() {
        return pedidos;
    }


    public void setPedidos(ListaLigada pedidos) {
        this.pedidos = pedidos;
    }


    public String getNome() {
        return nome;
    }


    public void setNome(String nome) {
        this.nome = nome;
    }

    


}
