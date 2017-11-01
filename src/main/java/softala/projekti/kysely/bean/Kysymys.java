package softala.projekti.kysely.bean;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Kysymys {
    @Id
    private int id;
    private String tyyppi;
    private String teksti;


    public Kysymys(int id, String tyyppi, String teksti) {
        this.id = id;
        this.tyyppi = tyyppi;
        this.teksti = teksti;
    }

    public Kysymys() {}

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

    @Override
    public String toString() {
        return this.getTeksti();
    }
}
