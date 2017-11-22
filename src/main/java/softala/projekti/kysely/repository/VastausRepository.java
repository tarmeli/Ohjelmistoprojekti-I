package softala.projekti.kysely.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import softala.projekti.kysely.bean.Vastaus;

@Repository
public interface VastausRepository extends JpaRepository<Vastaus, Integer> {
}
