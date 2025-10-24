<?php
require_once __DIR__.'/UploadInterface.php';
class Upload {
    public function launch(UploadInterface $uploadType, $file) {
        return $uploadType->uploadFile($file);
    }
}
