<div class="row">

    <div class="form-group col-md-12 mb-4">
        <label for="name">Nome</label>
        <input type="text" name="name" placeholder="Nome da categoria" value="<?php echo old('name', $category['name'] ?? null) ?>">
        <?php validation_show_error('name') ?>
    </div>

    <div class="form-group col-md-12 mb-4">
        <label for="name">Preço</label>
        <input type="number" name="price_hour" placeholder="Preço por hora" value="<?php echo old('price_hour', $category['price_hour'] ?? null) ?>">
        <?php validation_show_error('price_hour') ?>
    </div>

    <div class="form-group col-md-12 mb-4">
        <label for="name">Preço</label>
        <input type="number" name="price_day" placeholder="Preço por hora" value="<?php echo old('price_day', $category['price_day'] ?? null) ?>">
        <?php validation_show_error('price_day') ?>
    </div>

</div>

<button type="submit" class="btn btn-primary btn-sm me-2">Salvar</button>

<a href="<?php echo route_to('categories') ?>" class="btn btn-info"></a>