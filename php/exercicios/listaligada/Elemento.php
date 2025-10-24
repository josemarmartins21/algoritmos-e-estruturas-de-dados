<?php

class Elemento {
    private $valor;
    private Elemento $proximo;

    public function __cosntruct($valor)
    {
        $this->valor = $valor;
    }

    public function __getProximo(): Elemento
    {
        return $this->proximo;
    }

    public function __setProximo($proximo): void
    {
        $this->proximo = $proximo;
    }
    public function __getValor()
    {
        return $this->valor;
    }

    public function __setValor($valor): void
    {
        $this->valor = $valor;
    }
}