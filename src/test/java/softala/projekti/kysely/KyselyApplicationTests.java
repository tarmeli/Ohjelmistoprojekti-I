package softala.projekti.kysely;

import static org.assertj.core.api.Java6Assertions.assertThat;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import softala.projekti.kysely.bean.Kysely;
import softala.projekti.kysely.repository.KyselyRepository;


@RunWith(SpringRunner.class)
@SpringBootTest
public class KyselyApplicationTests {

    @Autowired
    private KyselyRepository kyselyRepository;
    //testaa nimen hakemista
    @Test
    public void getKyselynNimi() throws Exception {
        Kysely kysely = new Kysely();
        kysely.setNimi("Liikuntakysely");
        String nimi = kyselyRepository.findOne(1).getNimi();
        assertThat(kysely.getNimi().equals(nimi));
    }
}
