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
    public List<Kysely>haeKaikki() {
        return kyselyRepository.findAll();

    }



}
