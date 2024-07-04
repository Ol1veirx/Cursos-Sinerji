<!DOCTYPE html>
<html>
<head>
    <title>Adicionar Mensalista</title>
</head>
<body>
    <h1>Adicionar Mensalista</h1>
    <form action="/customers/store" method="POST">
        <label>Nome:</label>
        <input type="text" name="nome"><br>
        <label>CPF:</label>
        <input type="text" name="cpf"><br>
        <label>Telefone:</label>
        <input type="text" name="telefone"><br>
        <button type="submit">Adicionar</button>
    </form>
</body>
</html>
