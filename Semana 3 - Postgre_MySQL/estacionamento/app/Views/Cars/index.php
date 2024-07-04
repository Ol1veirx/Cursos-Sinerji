<!DOCTYPE html>
<html>
<head>
    <title>Cars</title>
</head>
<body>
    <h1>Veículos</h1>
    <a href="/cars/create">Adicionar Novo Veículo</a>
    <ul>
        <?php foreach ($cars as $car): ?>
            <li>
                <a href="/cars/show/<?= $car->_id ?>"><?= $car->placa ?></a>
                <a href="/cars/edit/<?= $car->_id ?>">Editar</a>
                <form action="/cars/delete/<?= $car->_id ?>" method="POST" style="display:inline;">
                    <button type="submit">Deletar</button>
                </form>
            </li>
        <?php endforeach; ?>
    </ul>
</body>
</html>
