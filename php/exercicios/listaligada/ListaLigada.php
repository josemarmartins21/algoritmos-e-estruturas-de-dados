<?php
require_once __DIR__."/Elemento.php";
class ListaLigada {
    private Elemento $primeiro;
    private Elemento $ultimo;
    private int $tamanho;

    public function __construct()
    {
        $this->tamanho = 0;
    
    }

    public function add($valor)
    {
        $novoElemento = new Elemento($valor);
        
        if (!$this->primeiro  && !$this->ultimo) {
            $this->primeiro = $novoElemento;
            $this->ultimo = $novoElemento;

        } else {
            $this->ultimo->__setProximo($novoElemento);
            $this->__setUltimo($novoElemento);
        }

        $this->tamanho ++;
    }

    public function __getTamanho()
    {
        return $this->tamanho;
    }

    public function __getPrimeiro()
    {
        return $this->primeiro;
    }
    public function __setPrimeiro($primeiro)
    {
        $this->primeiro = $primeiro;
    }

    public function __setUltimo($ultimo)
    {
        $this->ultimo = $ultimo;
    }

    public function __getUltimo()
    {
        return $this->ultimo;
    }



}