<?php

abstract class Forma {
    public function area(): float {
        return 0;
    }
}

class Retangulo extends Forma {
    public function __construct(private float $largura, private float $altura){}

    public function area(): float
    {
        return $this->largura * $this->altura;
    }
}
class Circulo extends Forma {
    public function __construct(private float $raio){}

    public function area(): float
    {
        return pi() * pow($this->raio, 2);
    }
}


function imprimirArea(Forma $forma) {
    echo "Area " . $forma->area() . PHP_EOL;
}

echo imprimirArea(new Retangulo(10, 5));
echo PHP_EOL;
echo imprimirArea(new Circulo(7.5));
/* $a = new Retangulo(4.5, 2.8) */
