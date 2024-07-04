<!DOCTYPE html>
<html>
<head>
    <title>Editar Veículo</title>
</head>
<body>
    <h1>Editar Veículo</h1>
    <form action="/cars/update/<?= $car->_id ?>" method="POST">
        <label>Placa:</label>
        <input type="text" name="placa" value="<?= $car->placa ?>"><br>
        <label>Descrição:</label>
        <input type="text" name="descricao" value="<?= $car->descricao ?>"><br>
        <button type="submit">Atualizar</button>
    </form>
</body>
</html>
