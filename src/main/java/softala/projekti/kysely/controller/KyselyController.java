package softala.projekti.kysely.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import softala.projekti.kysely.bean.Kysely;
import softala.projekti.kysely.repository.KyselyRepository;

@RestController
@RequestMapping(path="/kyselyt")
public class KyselyController {

    @Autowired
    private KyselyRepository kyselyRepository;

    @RequestMapping(method = RequestMethod.GET)
    public ResponseEntity<Kysely>haeKaikki() {
        Kysely kysely = new Kysely();
        kysely.setId(1);
        kysely.setNimi("Testikysely");
        kysely.setKysymys("Mitä kuuluu Marja-Leena?");
        return new ResponseEntity<>(kysely, HttpStatus.OK);
    }



}
