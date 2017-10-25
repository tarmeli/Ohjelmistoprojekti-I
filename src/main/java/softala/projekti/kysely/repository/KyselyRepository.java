package softala.projekti.kysely.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import softala.projekti.kysely.bean.Kysely;


@Repository
public interface KyselyRepository extends CrudRepository<Kysely, Long> {

}
