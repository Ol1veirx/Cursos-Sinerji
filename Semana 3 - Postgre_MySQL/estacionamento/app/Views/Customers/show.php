<!DOCTYPE html>
<html>
<head>
    <title>Detalhes do Mensalista</title>
</head>
<body>
    <h1>Detalhes do Mensalista</h1>
    <p>Nome: <?= $customer->nome ?></p>
    <p>CPF: <?= $customer->cpf ?></p>
    <p>Telefone: <?= $customer->telefone ?></p>
    <a href="/customers">Voltar para Mensalistas</a>
</body>
</html>
