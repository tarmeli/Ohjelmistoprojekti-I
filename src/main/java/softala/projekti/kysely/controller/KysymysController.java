package softala.projekti.kysely.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import softala.projekti.kysely.bean.Kysymys;
import softala.projekti.kysely.repository.KysymysRepository;

import java.util.List;

@CrossOrigin
@RestController
@RequestMapping(path= "/kysymykset")
public class KysymysController {
    @Autowired
    private KysymysRepository kysymysRepository;

    @RequestMapping(method = RequestMethod.GET)
    public List<Kysymys> haeKaikki() {
        return kysymysRepository.findAll();
    }

    @RequestMapping(method = RequestMethod.GET, path = "/{id}")
    public Kysymys haeId(@PathVariable int id) {
        return kysymysRepository.findOne(id);
    }
}
