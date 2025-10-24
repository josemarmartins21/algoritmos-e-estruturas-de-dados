<?php

echo fatorialRecursivo(5);

function fatorial($v) {
  $resultado = 1;
  for ($i=1; $i <= $v  ; $i++) { 
   $resultado *= $i;

  }
  return $resultado;
} 

function fatorialRecursivo($n) {
    if ($n == 0 || $n == 1) {
        return 1;
    }

    return $n * fatorialRecursivo($n - 1);
}