/*
package softala.projekti.kysely;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import softala.projekti.kysely.bean.Kysely;
import softala.projekti.kysely.controller.KyselyController;
import softala.projekti.kysely.controller.KysymysController;

import java.util.List;

import static java.util.Collections.singletonList;
import static org.mockito.BDDMockito.given;


@RunWith(SpringRunner.class)
@WebMvcTest(KyselyController.class)
public class KyselyControllerTest {

    @Autowired
    private MockMvc mvc;

    @MockBean
    private KyselyController kyselyController;

    @MockBean
    private KysymysController kysymysController;

    @Test
    public void getKysely() throws Exception {
        Kysely kysely = new Kysely();
        kysely.setId(1);
        kysely.setNimi("testauskysely");
        kysely.setKysymys();

        List<Kysely> allKyselyt = singletonList(kysely);

    }
}
*/