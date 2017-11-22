package softala.projekti.kysely.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import softala.projekti.kysely.bean.Kysymys;
import softala.projekti.kysely.bean.Vastaus;
import softala.projekti.kysely.repository.KysymysRepository;
import softala.projekti.kysely.repository.VastausRepository;

import java.util.List;

@CrossOrigin
@RestController
@RequestMapping(path = "/vastaukset")
public class VastausController {

    @Autowired
    private VastausRepository vastausRepository;

    @Autowired
    private KysymysRepository kysymysRepository;

    @RequestMapping(method = RequestMethod.GET)
    public List<Vastaus> haeKaikki() {
        return vastausRepository.findAll();
    }

    @RequestMapping(path = "/tallenna", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
    public void tallenna(@RequestBody List<Vastaus> vastaukset) {
        int i = 1;
        for (Vastaus vastaus : vastaukset) {
            Kysymys kysymys = kysymysRepository.findOne(i);
            vastaus.setKysymys(kysymys);
            vastausRepository.save(vastaus);
            i++;
        }
    }
}
