package softala.projekti.kysely.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import softala.projekti.kysely.bean.Kysely;
import softala.projekti.kysely.bean.Kysymys;
import softala.projekti.kysely.repository.KyselyRepository;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping(path="/kyselyt")
public class KyselyController {

    @Autowired
    private KyselyRepository kyselyRepository;

    @RequestMapping(method = RequestMethod.GET)
    public ResponseEntity<Kysely>haeKaikki() {
        Kysely kysely = new Kysely();
        List<Kysymys> kysymykset = new ArrayList<Kysymys>();
        kysely.setId(1);
        kysely.setNimi("Testikysely");
        Kysymys kysymys = new Kysymys();
        kysymys.setId(1);
        kysymys.setTyyppi("monivalinta");
        kysymys.setTeksti("Mitä kuuluu Marja-Leena?");
        kysymykset.add(kysymys);
        Kysymys kysymys2 = new Kysymys();
        kysymys2.setId(2);
        kysymys2.setTyyppi("textarea");
        kysymys2.setTeksti("Ainii hä olih Hommi?");
        kysymykset.add(kysymys2);
        kysely.setKysymys(kysymykset);

        return new ResponseEntity<>(kysely, HttpStatus.OK);
    }



}
