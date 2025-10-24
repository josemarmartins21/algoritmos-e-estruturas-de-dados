<?php
require_once __DIR__.'/UploadImagem.php';
require_once __DIR__.'/UploadVideo.php';
require_once __DIR__.'/UploadMusica.php';
require_once __DIR__.'/UploadPDF.php';
require_once __DIR__.'/Upload.php';

$um = new UploadMusica;
$uv = new UploadVideo;
$ui = new UploadImagem;
$up = new UploadPDF;

$u = new Upload();

echo $u->launch($um, 'numb') . PHP_EOL;
echo $u->launch($uv, 'cr7-driblando') . PHP_EOL;
echo $u->launch($ui, 'wallpaper') . PHP_EOL;
echo $u->launch($ui, 'wallpaper-2025') . PHP_EOL;
echo $u->launch($up, 'documento-2025');

