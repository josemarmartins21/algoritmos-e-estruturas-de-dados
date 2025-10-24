<?php

/* function fibonacci($p) {
    if ($p == 1) {
        return 0;
    } else if ($p == 2) {
        return 1;
    }

    return fibonacci($p - 1) + fibonacci($p - 2);
} */
function regressiva($i) {
    echo $i;
    if ($i <= 1) {
        return;
    }
    regressiva($i - 1);
}

regressiva(10);