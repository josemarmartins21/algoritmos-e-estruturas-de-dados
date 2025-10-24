<?php

// sauda("Josimar martins");

/* function sauda($nome) {
    echo "Olá, " . ucwords($nome). PHP_EOL;
    sauda2($nome);
    echo "Preparando-se para dizer tchau...\n";
    tchau($nome);
}

function sauda2($nome)  {
    echo "Como está sendo o seu dia? " . ucwords($nome) . PHP_EOL; 
}

function tchau($nome) {
    echo "Adeus " . ucwords($nome) .  " foi um prazer"; 
} */
/***** Pilha de chamada recursiva */
echo fatorial(8);
function fatorial($x) {
    if ($x == 1) {
        return 1;
    } 

    return $x * fatorial($x - 1);
}

