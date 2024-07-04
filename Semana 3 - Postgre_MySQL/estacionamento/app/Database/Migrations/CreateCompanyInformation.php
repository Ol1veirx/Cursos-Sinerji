<?php
namespace Codeigniter\Database\Migrations;

use Codeigniter\Database\Migrations;

class CreateCompanyInformation extends Migration{

    protected $DBGroup = 'company';

    // Para criar a tabela
    public function up() {
        $this->forge->addField([
            'id' => [
                'type' =>'INT',
                'constraint' => 5,
                'unsigned' => true,
                'auto_increment' => true,
            ],
            'name' => [
                'type' => 'VARCHAR',
                'constraint' => 100,
            ],
            'phone' => [
                'type' => 'VARCHAR',
                'constraint' => 20,
            ],
            'address' => [
                'type' => 'VARCHAR',
                'constraint' => 128,
            ],
            'message' => [
                'type' => 'TEXT',
                'null' => true,
                'default' => null
            ],
        ]);

        $this->forge->addKey('id', true);

        $this->forge->createTable('information');
    }

    // Para fazer o rollback
    public function down() {
        $this->forge->dropTable('information');
    }
}