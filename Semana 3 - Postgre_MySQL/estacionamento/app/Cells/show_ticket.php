<div class="row">
    <div class="col-md-6">
        <ul class="list-group">
            <li class="list-group-item">
                <strong>Modalidade: </strong><?php echo $ticket->choice; ?>
            </li>
            <li class="list-group-item">
                <strong>Tempo decorrido: </strong><?php echo $ticket->elapsed_time; ?>
            </li>
            <li class="list-group-item">
                <strong>Status: </strong><?php echo $ticket->status(); ?>
            </li>
            <li class="list-group-item">
                <strong>Entrada: </strong><?php echo $ticket->created_at; ?>
            </li>

            <?php if($ticket->isClosed()): ?>
                <li class="list-group-item">
                    <strong>Saida: </strong><?php echo $ticket->updated_at; ?>
                </li>
            <?php endif ?>

            <li class="list-group-item">
                    <strong>Veiculo: </strong><?php echo $ticket->car(); ?>
            </li>

            <li class="list-group-item">
                    <strong>Categoria: </strong><?php echo $ticket->category(); ?>
            </li>

            <li class="list-group-item">
                    <strong>Vaga ocupada: </strong><?php echo $ticket->spot; ?>
            </li>

            <?php if($ticket->hasCustomer()): ?>
                <li class="list-group-item">
                    <strong>Cliente: </strong><?php echo $ticket->customer?->name ?? 'Não encontrado'; ?>
                </li>
            <?php endif ?>

            <li class="list-group-item">
                    <strong>Tipo: </strong><?php echo $ticket->customer?->type; ?>
            </li>
        </ul>
    </div>
</div>