package restaurante;

public class Garcom {

    private int numeroDePedidosAdicionados;
    private String nome;

    public void anotarPedido(String pedido, ListaLigada lista) {
        int tamanhoInicial = lista.getTamanho();
        lista.add(pedido);
        int tamanhoFinal = lista.getTamanho();

        if (tamanhoFinal > tamanhoInicial) {
            System.out.println("Pedido atendido por " + this.nome);
            this.numeroDePedidosAdicionados ++;
        }
    }

    public Garcom(String nome) {
        this.numeroDePedidosAdicionados = 0;
        this.nome = nome;
    }

    public int getNumeroDePedidosAdicionados() {
        return numeroDePedidosAdicionados;
    }

    public void setNumeroDePedidosAdicionados(int numeroDePedidosAdicionados) {
        this.numeroDePedidosAdicionados = numeroDePedidosAdicionados;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }


    public void adicionarPedido() {

    }
}
