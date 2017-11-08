package softala.projekti.kysely;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.TestPropertySource;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import softala.projekti.kysely.repository.KyselyRepository;

@RunWith(SpringRunner.class)
@SpringBootTest(
		webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT ,
		classes = KyselyApplication.class
)
@AutoConfigureMockMvc
@TestPropertySource(
		locations = "classpath:application-integrationtest.properties"
)

public class KyselyApplicationTests {

	@Autowired
	private MockMvc mvc;

	@Autowired
	private KyselyRepository repository;

	@Test
	public void kyselytTesti()
		throws Exception{

	}

	@Test
	public void contextLoads() {

	}

}
