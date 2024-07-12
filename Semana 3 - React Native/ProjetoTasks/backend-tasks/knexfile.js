// Update with your config settings.

const { connection } = require("mongoose");

/**
 * @type { Object.<string, import("knex").Knex.Config> }
 */
module.exports = {
  client: 'postgresql',
  connection: {
    database: 'tasks',
    user: 'postgres',
    password: 'vasco2020'
  },
  pool: {
    min: 2,
    max: 10
  },
  migrations: {
    tableName: 'knex_migrations'
  }

};
