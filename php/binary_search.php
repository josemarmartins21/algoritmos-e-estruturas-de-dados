<?php

$numeros = [
    10,
    20,
    24,
    25,
    28,
    29,
];

$chute = 10;

$encontrado = false;
$alto = count($numeros) - 1;
$baixo = 0;
       
while ($alto >= $baixo) {
    $meio = floor(($baixo + $alto) / 2);

    if ($numeros[$meio] == $chute) {
        $encontrado = true;
        break;

    } else if ($numeros[$meio] > $chute) {
        $alto = $meio - 1;

    } else {
        $baixo = $meio + 1; 
    }
}


if ($encontrado) {
    echo "Valor " . $chute ." encontrado!";

} else {
    echo "Valor não encontrado!";
}

$aux = 0;
$j = 0;

for ($i=1; $i < count($numeros); $i++) { 
    $aux = $numeros[$i];
    $j = $i - 1;
    while ($j >= 0 && $numeros[$j] > $aux) {
        $numeros[$j+1] = $numeros[$j];
        $j--;
    }
    $numeros[$j+1] = $aux;

}

for ($i=0; $i < count($numeros); $i++) { 
    echo $numeros[$i] . PHP_EOL;
}
