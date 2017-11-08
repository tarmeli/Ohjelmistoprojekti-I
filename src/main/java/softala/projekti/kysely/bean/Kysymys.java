package softala.projekti.kysely.bean;

import com.fasterxml.jackson.annotation.JsonBackReference;

import javax.persistence.*;

@Entity
@Table(name = "kysymys")
public class Kysymys {
    @Id
    private int id;
    private String tyyppi;

    private int maara;

    @Column(name = "kysymys")
    private String teksti;

    @ManyToOne
    @JoinColumn(name = "kysely_id")
    @JsonBackReference
    private Kysely kysely;


    public Kysymys(String teksti) {
        this.id = id;
        this.tyyppi = tyyppi;
        this.teksti = teksti;
        this.maara = maara;
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

    public int getMaara() {
        return maara;
    }

    public void setMaara(int maara) {
        this.maara = maara;
    }

}
