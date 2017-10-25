package softala.projekti.dao;

import org.springframework.data.repository.CrudRepository;
import softala.projekti.bean.Kysely;

import java.util.List;

public interface KyselyRepository extends CrudRepository {
    List<Kysely> findByName(String nimi);
}
