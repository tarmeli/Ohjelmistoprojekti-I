package softala.projekti.kysely.bean;

import com.fasterxml.jackson.annotation.JsonManagedReference;

import javax.persistence.*;
import java.util.List;

// tehdään Kysely-luokasta JPA entity ja kerrotaan, mitä taulua luokka vastaa tietokannassa
@Entity
@Table(name = "kysely")
public class Kysely {

    @Id
    @Column(name = "kysely_id") // @Column tarvitaan, jos attribuutin nimi ei vastaa kannassa olevaa nimeä
    private int id;
    private String nimi;

    // annotaatio, jolla yhdistetään kysely-taulu kysymys-tauluun -> saadaan kyselyn kysymykset listana
    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "kysely")
    @JsonManagedReference
    private List<Kysymys> kysymykset;

    public Kysely(int id, String nimi, List<Kysymys> kysymykset) {
        this.id = id;
        this.nimi = nimi;
        this.kysymykset = kysymykset;
    }

    public Kysely() {
    }

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
