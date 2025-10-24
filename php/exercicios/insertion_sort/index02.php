<?php
$vetor = [
    14, 25, 0, 10,
];

foreach ($vetor as $n) {
    echo $n . PHP_EOL;
}

$aux = 0;
$j = 0; 
for ($i=0; $i < count($vetor); $i++) { 
    $aux = $vetor[$i];
    $j = $i - 1;

    while ($j >= 0 && $vetor[$j] > $aux) {
        $vetor[$j+1] = $vetor[$j];
        $j--;
    }

    $vetor[$j+1] = $aux;
}
echo "\n\n";

foreach ($vetor as $n) {
    echo $n . PHP_EOL;
}