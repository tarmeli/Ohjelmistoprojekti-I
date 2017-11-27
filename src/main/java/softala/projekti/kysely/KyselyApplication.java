package softala.projekti.kysely;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;

@SpringBootApplication
public class KyselyApplication extends SpringBootServletInitializer{

    public static void main(String[] args) {

        SpringApplication.run(KyselyApplication.class, args);
    }
    //palvelin yhteensopivuus
    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
        return builder.sources(KyselyApplication.class);
    }
}
