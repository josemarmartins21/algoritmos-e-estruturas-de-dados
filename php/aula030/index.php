<?php


for ($i=0; $i < 20; $i++) { 
    if ($i == 10) {
        continue; // passa para a proxima iteração do loop.
    }
    echo "$i \n";
}
echo "\n\n";
for ($i=0; $i < 20; $i++) { 
    if ($i == 10) {
        goto test;
    }

    echo "".$i . "\n";
}


test:
echo "Stop";

