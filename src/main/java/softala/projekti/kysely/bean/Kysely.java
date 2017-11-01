package softala.projekti.kysely.bean;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.List;

@Entity
public class Kysely {

    @Id
    private int id;
    private String nimi;
    @OneToMany(targetEntity = Kysymys.class)
    private List<Kysymys> kysymykset;

    public Kysely(int id, String nimi, List<Kysymys> kysymykset) {
        this.id = id;
        this.nimi = nimi;
        this.kysymykset = kysymykset;
    }

    public Kysely() {}

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNimi() {
        return nimi;
    }

    public void setNimi(String nimi) {
        this.nimi = nimi;
    }

    public List<Kysymys> getKysymykset() {
        return kysymykset;
    }

    public void setKysymys(List<Kysymys> kysymykset) {
        this.kysymykset = kysymykset;
    }
}
