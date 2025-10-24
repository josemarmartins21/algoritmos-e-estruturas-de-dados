<?php
$vetor = [12, 14, 20, 10, 8, 14];

for ($i=0; $i < count($vetor); $i++) { 
    echo $vetor[$i] . "\n";
}
$aux = 0;
$j = 0;
// Insertion sort
for ($i=1; $i < count($vetor); $i++) { 
    $aux = $vetor[$i];
    $j = $i - 1;
    while ($j >= 0 && $vetor[$j] > $aux) {
        $vetor[$j+1] = $vetor[$j];
        $j--;
    }

    $vetor[$j+1] = $aux;
}

echo "\n Vector ordenado!" . PHP_EOL;
for ($i=0; $i < count($vetor); $i++) { 
    echo $vetor[$i] . "\n";
}


