package softala.projekti.kysely.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import softala.projekti.kysely.bean.Vastaus;

@RestController
@RequestMapping(path = "/vastaukset")
public class VastausController {

    @RequestMapping(path = "/tallenna", method = RequestMethod.POST)
    public void tallenna() {
        
    }
}
