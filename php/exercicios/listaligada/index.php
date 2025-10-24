<?php
require_once __DIR__."/Elemento.php";
require_once __DIR__."/ListaLigada.php";

$lista = new ListaLigada();

$lista->add("121");
$lista->add("Angola");
$lista->add(200);
$lista->add("EUA");
$lista->add(1975);

echo $lista->__getTamanho();