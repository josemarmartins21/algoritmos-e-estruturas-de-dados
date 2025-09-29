package restaurante;

public class ListaLigada {
    private Elemento primeiro;
    private Elemento ultimo;
    private int tamanho;


    /**
     *  Metodo que perimite adicionar lementos a lista
     *  - Ele recebe uma string que é atribuida um  novo elemento
     *  - A lista verifica se já tem ao menos um elemento e caso não
     *   o elemento passa ser o primeiro & último da lista
     *  - Se ao menos já tiver um elemento este mesmo elemento passar a te
     *    um proximo que no caso é o elemento que pretendemos acrescentar
     *    e ele passa a ser considerado o último da lista
     *  - Quando um elemento é adicionado a lista cresce 
     * @since 2025-09-27
     * @author Josimar Martins 
     * @param novoValor
     */
    public void add(String novoValor) {
        Elemento novoElemento = new Elemento(novoValor);

        if (primeiro == null && ultimo == null) {
            primeiro = novoElemento;
            ultimo = novoElemento;

        } else {
            this.ultimo.setProximo(novoElemento);
            ultimo = novoElemento;
        }

        this.tamanho ++;
    }

    public void remover(String valorProcurado) {
        Elemento anterior = null;
        Elemento atual = this.primeiro;

        for (int i = 0; i < tamanho; i++) {
            if (atual.getValor().equalsIgnoreCase(valorProcurado)) {
                if (this.tamanho == 1) {
                    this.primeiro = null;
                    this.ultimo = null;
                    this.tamanho --;
                    break;

                } else if (this.primeiro == atual) {
                    this.setPrimeiro(atual.getProximo());
                    atual = null;
                    this.tamanho --;
                    break;

                } else if (this.ultimo == atual) {
                    this.setUltimo(anterior);
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

    /**
     * Este metódo serve para pegar um elemento da lista através
     * de seu valor
     * 
     * @return Elemento
     * @param posicao
     */
    public Elemento get(int posicao) {
        Elemento atual = primeiro;

        for (int i = 0; i < posicao; i++) {
            if (atual.getProximo() != null) {
                atual = atual.getProximo();
            }
        }
        return atual;
    }


    public ListaLigada() {
        this.tamanho = 0;
    }
    public Elemento getPrimeiro() {
        return primeiro;
    }
    public void setPrimeiro(Elemento primeiro) {
        this.primeiro = primeiro;
    }
    public Elemento getUltimo() {
        return ultimo;
    }
    public void setUltimo(Elemento ultimo) {
        this.ultimo = ultimo;
    }
    public int getTamanho() {
        return tamanho;
    }
    public void setTamanho(int tamanho) {
        this.tamanho = tamanho;
    }





}
