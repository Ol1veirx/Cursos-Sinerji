<!DOCTYPE html>
<html>
<head>
    <title>Customers</title>
</head>
<body>
    <h1>Mensalistas</h1>
    <a href="/customers/create">Adicionar Novo Mensalista</a>
    <ul>
        <?php foreach ($customers as $customer): ?>
            <li>
                <a href="/customers/show/<?= $customer->_id ?>"><?= $customer->nome ?></a>
                <a href="/customers/edit/<?= $customer->_id ?>">Editar</a>
                <form action="/customers/delete/<?= $customer->_id ?>" method="POST" style="display:inline;">
                    <button type="submit">Deletar</button>
                </form>
            </li>
        <?php endforeach; ?>
    </ul>
</body>
</html>
