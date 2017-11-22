package softala.projekti.kysely.bean;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;

import javax.persistence.*;
import java.util.List;

import static javax.persistence.CascadeType.MERGE;
import static javax.persistence.CascadeType.PERSIST;

// tehdään Kysymys-luokasta JPA entity
@Entity
@Table(name = "kysymys")
public class Kysymys {
    @Id
    @Column(name = "kysymys_id")
    private int id;

    private String data;
    private String tyyppi;

    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "kysymys")
    @JsonManagedReference
    private List<Vaihtoehto> vaihtoehdot;

    // yhdistetään kysymykset kysely-tauluun
    @ManyToOne
    @JoinColumn(name = "kysely_id")
    @JsonBackReference
    private Kysely kysely;

    @OneToMany(cascade = {PERSIST, MERGE}, fetch = FetchType.LAZY, mappedBy = "kysymys")
    @JsonManagedReference
    private List<Vastaus> vastaukset;


    public Kysymys(int id, String data, String tyyppi, List<Vaihtoehto> vaihtoehdot) {
        this.id = id;
        this.data = data;
        this.tyyppi = tyyppi;
        this.vaihtoehdot = vaihtoehdot;
    }

    public Kysymys() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTyyppi() {
        return tyyppi;
    }

    public void setTyyppi(String tyyppi) {
        this.tyyppi = tyyppi;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public Kysely getKysely() {
        return kysely;
    }

    public void setKysely(Kysely kysely) {
        this.kysely = kysely;
    }

    public List<Vaihtoehto> getVaihtoehdot() {
        return vaihtoehdot;
    }

    public void setVaihtoehdot(List<Vaihtoehto> vaihtoehdot) {
        this.vaihtoehdot = vaihtoehdot;
    }

    public List<Vastaus> getVastaukset() {
        return vastaukset;
    }

    public void setVastaukset(List<Vastaus> vastaukset) {
        this.vastaukset = vastaukset;
    }

}
