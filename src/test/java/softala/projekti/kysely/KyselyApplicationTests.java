/*
package softala.projekti.kysely;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.TestPropertySource;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.StandaloneMockMvcBuilder;
import softala.projekti.kysely.controller.KyselyController;
import softala.projekti.kysely.repository.KyselyRepository;
import static org.assertj.core.api.Assertions.assertThat;
import static org.springframework.test.web.client.match.MockRestRequestMatchers.content;
import static org.springframework.test.web.servlet.setup.MockMvcBuilders.standaloneSetup;

@RunWith(SpringRunner.class)
@SpringBootTest(
		webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT ,
		classes = KyselyApplication.class
)
@AutoConfigureMockMvc
@TestPropertySource(
		locations = "classpath:application-integrationtest.properties"
)

//testit tulee tähän
public class KyselyApplicationTests {

    @Autowired
    private MockMvc mockMvc;

    @Autowired
    private KyselyRepository repository;

    @Autowired
    private KyselyController controllerToTest;

    @Before
    public void setup() {
        this.mockMvc = standaloneSetup(new KyselyApplication()).build();
    }

    @Test
    public void kyselyTesti()
            throws Exception {


    }

}
*/