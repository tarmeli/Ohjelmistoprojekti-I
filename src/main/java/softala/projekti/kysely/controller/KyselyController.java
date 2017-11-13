package softala.projekti.kysely.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import softala.projekti.kysely.bean.Kysely;
import softala.projekti.kysely.repository.KyselyRepository;

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

    @RequestMapping(method = RequestMethod.GET, path = "/{id}")
    public Kysely haeId(@PathVariable int id) {
        return kyselyRepository.findOne(id);
    }

}
