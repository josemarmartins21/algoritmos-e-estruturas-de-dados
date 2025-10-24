<?php
require_once __DIR__.'/UploadInterface.php';
class UploadImagem implements UploadInterface {
    public function uploadFile($file)
    {
        if (!is_string($file)) {
            return "É o nome od ficheiro tem que ser do tipo caracter";
        }

        return $file . ".jpg";
    }
}