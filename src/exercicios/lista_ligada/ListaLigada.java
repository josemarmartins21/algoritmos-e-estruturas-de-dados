package exercicios.lista_ligada;

import javax.swing.text.html.parser.Element;

public class ListaLigada {
    private Elemento ultimo;
    private Elemento primeiro;
    private int tamanho;


    
    public ListaLigada() {
        this.tamanho = 0;
    }

    public void adicionar(String novoValor) {
        Elemento novoElemento = new Elemento(novoValor);

        if (this.primeiro == null && this.ultimo == null) {
            this.primeiro = novoElemento;
            this.ultimo = novoElemento;

        } else {
            this.ultimo.setProximo(novoElemento);
            this.setUltimo(novoElemento);
        }

        this.tamanho ++;
    }

    public Elemento buscar(int posicao) {
        Elemento atual = this.primeiro;

        for (int i = 0; i < posicao; i++) {
            if (atual.getProximo() != null) {
                atual = atual.getProximo();
            }
        }
        return atual;
    }

    public void remover(String valorProcurado) {
        Elemento anterior = null;
        Elemento atual = this.primeiro;

        for (int i = 0; i < this.tamanho; i++) {
            if (atual.getValor().equalsIgnoreCase(valorProcurado)) {
                if (tamanho == 1) {
                    this.primeiro = null;
                    this.ultimo = null;
                    this.tamanho --;
                    break;

                } else if (atual == this.ultimo) {
                    this.setUltimo(anterior);
                    atual.setProximo(null);
                    this.tamanho --;
                    break;

                } else if (atual == this.primeiro) {
                    this.setPrimeiro(atual.getProximo());
                    atual = null;
                    this.tamanho --;
                    break;

                } else {
                    anterior.setProximo(atual.getProximo());
                    atual = null;
                    this.tamanho --;
                    break;
                }
            }

            anterior = atual;
            atual = atual.getProximo();
        }
    }


    public Elemento getUltimo() {
        return ultimo;
    }
    public void setUltimo(Elemento ultimo) {
        this.ultimo = ultimo;
    }
    public Elemento getPrimeiro() {
        return primeiro;
    }
    public void setPrimeiro(Elemento primeiro) {
        this.primeiro = primeiro;
    }
    public int getTamanho() {
        return tamanho;
    }
    public void setTamanho(int tamanho) {
        this.tamanho = tamanho;
    }

    
}
