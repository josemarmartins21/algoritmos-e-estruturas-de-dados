<?php

$array = [
    23, 44, 12, 10, 98, 32
];

/* echo strtoupper("Array desordenado");
for ($i=0; $i < count($array); $i++) { 
    echo $array[$i] . PHP_EOL;
} */


/* echo  strtoupper("Array ordenado") . PHP_EOL;
for ($i=0; $i < count($array); $i++) { 
    echo $array[$i] . PHP_EOL;
}
 */

/* sort($array); */


/* if (binarySearch($array, 32)) {
   echo "Valor achado na posição " . binarySearch($array, 32) . PHP_EOL;
} else {
    echo "Valor não achado posição ";
} */

sort($array);

for ($i=0; $i < count($array); $i++) { 
    echo $array[$i] . PHP_EOL;
}

$arr = array_reverse($array);
echo "\n\n";
for ($i=0; $i < count($arr); $i++) { 
    echo $arr[$i] . PHP_EOL;
}

function binarySearch($array, $chute) {
    $inicio = 0;
    $fim = count($array) - 1;

    while ($inicio <= $fim) {
        $meio = floor(($inicio + $fim) / 2);

        if ($array[$meio] == $chute) {
            return $meio;

        } else if ($array[$meio] > $chute) {
            $fim = $meio - 1;
        } else {
            $inicio = $meio + 1;
        }
    }

    return false;
}
