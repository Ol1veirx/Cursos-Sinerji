<?= $this->extend('Layouts/main') ?>

<?= $this->section('title') ?>
    <?php echo $title ?? ''; ?>
<?=  $this->endSection() ?>

<?= $this->section('css') ?>
<?=  $this->endSection() ?>

<?= $this->section('content') ?>
<?=  $this->endSection() ?>

<?= $this->section('js') ?>
<?=  $this->endSection() ?>


