package softala.projekti.kysely.bean;

import com.fasterxml.jackson.annotation.JsonBackReference;

import javax.persistence.*;

// tehdään Kysymys-luokasta JPA entity
@Entity
@Table(name = "kysymys")
public class Kysymys {
    @Id
    private int id;

    @Column(name = "kysymys") // attribuutti eri nimellä tietokannassa
    private String teksti;

    private String tyyppi;

    // esim. radio-buttonien ja checkboxien määrä
    private int tyypin_maara;

    // yhdistetään kysymykset kysely-tauluun
    @ManyToOne
    @JoinColumn(name = "kysely_id")
    @JsonBackReference
    private Kysely kysely;


    public Kysymys(int id, String teksti, String tyyppi, int tyypin_maara) {
        this.id = id;
        this.teksti = teksti;
        this.tyyppi = tyyppi;
        this.tyypin_maara = tyypin_maara;
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

    public String getTeksti() {
        return teksti;
    }

    public void setTeksti(String teksti) {
        this.teksti = teksti;
    }

    public Kysely getKysely() {
        return kysely;
    }

    public void setKysely(Kysely kysely) {
        this.kysely = kysely;
    }

    public int getTyypin_maara() {
        return tyypin_maara;
    }

    public void setTyypin_maara(int tyypin_maara) {
        this.tyypin_maara = tyypin_maara;
    }
}
