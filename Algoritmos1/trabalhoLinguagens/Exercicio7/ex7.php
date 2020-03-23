<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <link rel="stylesheet" href="_css/estilo.css">
    <title>Exercicio7</title>
</head>
<body>
    <div>
        <?php

            $salario = $_GET["a"]; 
            $plLiquido;
            $plBruto;
            $impostoRenda;

            echo "Digite o salario de um dos empregados da empresa: $salario<br>";

            if ($salario <= 300) {
                
                $plBruto = 500 + $salario * 0.7;

            }elseif ($salario > 300 && $salario <= 1000) {

                $plBruto = 200 + $salario * 0.5;

            }else {

                $plBruto = $salario * 0.3;
            }

            $impostoRenda = 0.25 * $plBruto;
            $plLiquido = $plBruto - $impostoRenda;

            echo "O PL Liquido é de: $plLiquido";

        ?>
        <br> <a href="index.html">Voltar</a>
    </div>
</body>
</html>