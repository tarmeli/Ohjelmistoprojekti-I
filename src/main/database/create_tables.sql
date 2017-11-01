CREATE TABLE kysely (
  kysely_id INTEGER      NOT NULL PRIMARY KEY,
  nimi      VARCHAR(100) NOT NULL
)
  ENGINE = InnoDB
  DEFAULT CHARSET = utf8;

CREATE TABLE kysymys (
  id INTEGER      NOT NULL  PRIMARY KEY,
  kysely_id INTEGER NOT NULL REFERENCES kysely(kysely_id),
  kysymys    VARCHAR(500) NOT NULL,
  tyyppi     VARCHAR(100)
)
  ENGINE = InnoDB
  DEFAULT CHARSET = utf8;
