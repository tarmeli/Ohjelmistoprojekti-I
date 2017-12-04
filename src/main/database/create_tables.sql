/*CREATE TABLE user (
  u_id      INTEGER NOT NULL PRIMARY KEY AUTO_INCREMENT,
  sukupuoli VARCHAR(10),
  koulu     VARCHAR(50),
  ikä       INTEGER
)
  ENGINE = InnoDB
  DEFAULT CHARSET = utf8; */

CREATE TABLE kysely (
  kysely_id INTEGER      NOT NULL PRIMARY KEY,
  nimi      VARCHAR(100) NOT NULL
)
  ENGINE = InnoDB
  DEFAULT CHARSET = utf8;

CREATE TABLE kysymys (
  kysymys_id INTEGER      NOT NULL  PRIMARY KEY,
  kysely_id  INTEGER      NOT NULL REFERENCES kysely (kysely_id),
  data       VARCHAR(500) NOT NULL,
  tyyppi     VARCHAR(30)
)
  ENGINE = InnoDB
  DEFAULT CHARSET = utf8;

CREATE TABLE vaihtoehdot (
  value_id   INTEGER NOT NULL PRIMARY KEY AUTO_INCREMENT,
  kysymys_id INTEGER NOT NULL REFERENCES kysymys (kysymys_id),
  data       VARCHAR(50)
)
  ENGINE = InnoDB
  DEFAULT CHARSET = utf8;

CREATE TABLE vastaukset (
  vastaus_id INTEGER NOT NULL PRIMARY KEY AUTO_INCREMENT,
  kysymys_id INTEGER NOT NULL REFERENCES kysymys (kysymys_id),
  data       VARCHAR(100)
)
  ENGINE = InnoDB
  DEFAULT CHARSET = utf8;


