<!DOCTYPE html>
<html>
<head>
    <title>Adicionar Veículo</title>
</head>
<body>
    <h1>Adicionar Veículo</h1>
    <form action="/cars/store" method="POST">
        <label>Placa:</label>
        <input type="text" name="placa"><br>
        <label>Descrição:</label>
        <input type="text" name="descricao"><br>
        <button type="submit">Adicionar</button>
    </form>
</body>
</html>
