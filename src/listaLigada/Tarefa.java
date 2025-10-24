package listaLigada;

import java.util.Date;

public class Tarefa<TIPO> {
    private TIPO tarefa;
    private TIPO descricao;
    private Date data;


    
    public Tarefa(TIPO tarefa, TIPO descricao, Date data) {
        this.tarefa = tarefa;
        this.descricao = descricao;
        this.data = data;
    }
    
    public TIPO getTarefa() {
        return tarefa;
    }
    public void setTarefa(TIPO tarefa) {
        this.tarefa = tarefa;
    }
    public TIPO getDescricao() {
        return descricao;
    }
    public void setDescricao(TIPO descricao) {
        this.descricao = descricao;
    }
    public Date getData() {
        return data;
    }
    public void setData(Date data) {
        this.data = data;
    }


    


}
