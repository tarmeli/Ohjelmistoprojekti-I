INSERT INTO kysely VALUES
(1, 'Liikuntakysely');

INSERT INTO kysymys VALUES
(1, 1, 'Ikä', 'number'),
(2, 1, 'Sukupuoli', 'radio'),
(3, 1, 'Koulu', 'radio'),
(4, 1, 'Harrastukset', 'textarea'),
(5, 1, 'Kilpaurheiletko?', 'radio'),
(6, 1, 'Monta kertaa viikossa harrastat fyysistä liikuntaa?', 'select'),
(7, 1, 'Nautin fyysisestä rasituksesta', 'range'),
(8, 1, 'Liikunta auttaa minua stressin poistossa ja jaksamisessa', 'range'),
(9, 1, 'Kouluni liikuntamahdollisuudet vastaavat tarpeitani', 'range'),
(10, 1, 'Mielestäni opiskelijat liikkuvat riittävästi', 'range'),
(11, 1, 'Oletko tietoinen koulusi liikuntamahdollisuuksista?', 'radio'),
(12, 1, 'Jos vastasit edelliseen kysymykseen ei, kerro omin sanoin miksi?', 'textarea'),
(13, 1, 'Käytätkö koulusi järjestämiä liikuntamahdollisuuksia hyödyksesi?', 'radio'),
(14, 1, 'Jos vastasit edelliseen kysymykseen kyllä, kerro omin sanoin mitä olet käyttänyt?', 'textarea'),
(15, 1, 'Parantaisitko/lisäisitkö koulusi liikuntamahdollisuuksia?', 'radio'),
(16, 1, 'Jos vastasit kyllä, kerro vielä omin sanoin miten ja miksi?', 'textarea');
(17, 1, 'Valitse seuraavista kohdista yksi tai useampi, joka kuvaa kyselyä parhaiten', 'checkbox');

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
(17, "Kysymykset olivat selkeitä"),
(17, "Vastaaminen kyselyyn oli vaivatonta"),
(17, "Kyselyn ulkoasu oli miellyttävä"),
(17, "Aihe oli ajankohtainen");
