package softala.projekti.kysely.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import softala.projekti.kysely.bean.Kysymys;
// repository vastaa tietokannasta hakemisesta
// samalla otetaan JpaRepositoryn metodit käyttöön
@Repository
public interface KysymysRepository extends JpaRepository<Kysymys, Integer> {

}
