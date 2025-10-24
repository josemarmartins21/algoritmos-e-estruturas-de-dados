<?php

interface Ladrar {
    public function ladrar();
}

interface Miar {
    public function miar();
}

interface Saltar {
    public function saltar();
}

class Cao implements Ladrar, Saltar {
    public function ladrar()
    {
        echo "O cão Ladrou" . PHP_EOL;
    }

    public function saltar()
    {
        echo "O cão saltou" . PHP_EOL;
    }
}

class Gato implements Miar, Saltar {
    public function miar()
    {
        echo "O gato miou" . PHP_EOL;
    }

    public function saltar()
    {
        echo "O gato saltou" . PHP_EOL;
    }
}

$cao = new Cao;
$cao->saltar();
$cao->ladrar();
$gato = new Gato;

$gato->miar();
$gato->saltar();