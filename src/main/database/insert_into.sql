INSERT INTO kysely VALUES
(1, 'Testikysely'),
(2, 'Toinen kysely');

INSERT INTO kysymys VALUES
(1, 1, 'Ikä', 'number'),
(2, 1, 'Sukupuoli', 'radio'),
(3, 1, 'Koulu', 'radio');

INSERT INTO vaihtoehdot(kysymys_id, data) VALUES
(1, 0), -- ei vaihtoehtoja
(2, "Mies"),
(2, "Nainen"),
(2, "Muu"),
(3, "Ammattikorkeakoulu"),
(3, "Yliopisto"),
(4, " "), -- ei vaihtoehtoja
(5, "Kyllä"),
(5, "Ei"),
(6, "En koskaan"),
(6, "1-3"),
(6, "3-5"),
(6, "5-7"),
(6, "8+"),
(7, "1"), -- min
(7, "5"), -- max
(7, "3"), -- value
(8, "1"), -- min
(8, "5"), -- max
(8, "3"), -- value
(9, "1"), -- min
(9, "5"), -- max
(9, "3"), -- value
(10, "1"), -- min
(10, "5"), -- max
(10, "3"), -- value
(11, "Kyllä"),
(11, "Ei"),
(12, " "), -- ei vaihtoehtoja
(13, "Kyllä"),
(13, "En"),
(14, " "), -- ei vaihtoehtoja
(15, "Kyllä"),
(15, "En"),
(16, " "); -- ei vaihtoehtoja
