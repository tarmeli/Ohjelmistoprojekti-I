package softala.projekti.kysely.bean;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;

@Entity
@Table(name = "vastaukset")
@JsonIgnoreProperties(ignoreUnknown = true)
public class Vastaus {
    @Id
    @Column(name = "vastaus_id")
    private int id;

    private String data;

    @ManyToOne
    @JoinColumn(name = "kysymys_id")
    @JsonBackReference
    private Kysymys kysymys;

    public Vastaus(int id, String data) {
        this.id = id;
        this.data = data;
    }

    public Vastaus() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public Kysymys getKysymys() {
        return kysymys;
    }

    public void setKysymys(Kysymys kysymys) {
        this.kysymys = kysymys;
    }
}
