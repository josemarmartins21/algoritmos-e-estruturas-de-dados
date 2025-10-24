<?php

$a = function () {
    echo "Olá mundo";

};

/* echo $a(); */


$saudar = function($mensagem) {
    echo "Olá. $mensagem";
};

/* echo $saudar("Como foi o teu dia!"); */

$andar = function($metros) {
    return "Andei $metros metros";
};

/* echo $andar(100); */

$a = function() {
    return "Função A";
};

function falar($x) {
    echo $x;
}

falar($a());

