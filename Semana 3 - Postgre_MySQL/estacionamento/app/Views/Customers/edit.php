<!DOCTYPE html>
<html>
<head>
    <title>Editar Mensalista</title>
</head>
<body>
    <h1>Editar Mensalista</h1>
    <form action="/customers/update/<?= $customer->_id ?>" method="POST">
        <label>Nome:</label>
        <input type="text" name="nome" value="<?= $customer->nome ?>"><br>
        <label>CPF:</label>
        <input type="text" name="cpf" value="<?= $customer->cpf ?>"><br>
        <label>Telefone:</label>
        <input type="text" name="telefone" value="<?= $customer->telefone ?>"><br>
        <button type="submit">Atualizar</button>
    </form>
</body>
</html>
