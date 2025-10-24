package listaLigada;

public class ListaLigada<TIPO> {
    private int tamanho;
    private Elemento<TIPO> primeiro;
    private Elemento<TIPO> ultimo;
    
    public ListaLigada(){
        this.tamanho = 0;
    }

    public void add(TIPO valor) {
        Elemento<TIPO> novoElemento = new Elemento<TIPO>(valor);
        
        if (this.getPrimeiro() == null && this.getUltimo() == null) {
            this.setPrimeiro(novoElemento);
            this.setUltimo(novoElemento);
        } else {
            this.getUltimo().setProximo(novoElemento);
            this.setUltimo(novoElemento);
        }

        this.setTamanho(tamanho + 1);
    }

    public Elemento<TIPO> get(int posicao) {
        Elemento<TIPO> atual = this.getPrimeiro();

        for (int i = 0; i < posicao; i++) {
            if (atual.getProximo() != null) {
                atual = atual.getProximo();
            }
        }
        return atual;
    }

    public void remover(TIPO valorProcurado) {
        Elemento<TIPO> atual = this.primeiro;
        Elemento<TIPO> anterior = null;

        for (int i = 0; i < this.getTamanho(); i++) {
            if (atual.getValor().equals(valorProcurado)) {
                if (atual == primeiro && atual == ultimo) {
                    this.ultimo = null;
                    this.primeiro = null;
                    tamanho--;
                    break;

                } else if (atual == ultimo) {
                    this.setUltimo(anterior);
                    atual = null;
                    tamanho--;
                    break;

                } else if (atual == primeiro) {
                    this.setPrimeiro(atual.getProximo());
                    atual.setProximo(null);
                    tamanho--;
                    break;

                } else {
                    anterior.setProximo(atual.getProximo());
                    atual = null;
                    tamanho--;
                    break;
                }

            }

            anterior = atual;
            atual = atual.getProximo();
           
        }

        
    }
    public int getTamanho() {
        return tamanho;
    }
    public void setTamanho(int tamanho) {
        this.tamanho = tamanho;
    }
    public Elemento<TIPO> getPrimeiro() {
        return primeiro;
    }
    public void setPrimeiro(Elemento<TIPO> primeiro) {
        this.primeiro = primeiro;
    }
    public Elemento<TIPO> getUltimo() {
        return ultimo;
    }
    public void setUltimo(Elemento<TIPO> ultimo) {
        this.ultimo = ultimo;
    }

    


}
