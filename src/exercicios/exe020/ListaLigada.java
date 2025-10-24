package exercicios.exe020;

public class ListaLigada {
    private Elemento primeiro;
    private Elemento ultimo;
    private int tamanho;

    
    public ListaLigada() {
        this.tamanho = 0;
    }

    public void add(String novoValor) {
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

    public Elemento get(int posicao) {
        Elemento atual = this.primeiro;

        for (int i = 0; i < posicao; i++) {
            if (atual.getProximo() != null) {
                atual = atual.getProximo();
            }
        }

        return atual;
    }

    public void remove(String valorProcurado) {
        Elemento anterior = null;
        Elemento atual = this.primeiro;

        for (int i = 0; i < tamanho; i++) {
            if (atual.getValor().equalsIgnoreCase(valorProcurado)) {
                if (tamanho == 1) {
                    this.primeiro = null;
                    this.ultimo = null;
                    tamanho --;
                    break;

                } else if (atual == this.primeiro) {
                    this.setPrimeiro(atual.getProximo());
                    atual = null;
                    tamanho --;
                    break;

                } else if (atual == this.ultimo) {
                    this.setUltimo(anterior);
                    atual = null;
                    tamanho --;
                    break;

                } else {
                    anterior.setProximo(atual.getProximo());
                    atual = null;
                    tamanho --;
                    break;
                }

                anterior = atual;
                atual = atual.getProximo();
            }
        }
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
