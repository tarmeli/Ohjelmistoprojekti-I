package softala.projekti.kysely.bean;

import com.fasterxml.jackson.annotation.JsonBackReference;

import javax.persistence.*;

@Entity
@Table(name = "vaihtoehdot")
public class Vaihtoehto {
    @Id
    @Column(name = "value_id")
    private int id;

    private String data;

    @ManyToOne
    @JoinColumn(name = "kysymys_id")
    @JsonBackReference
    private Kysymys kysymys;

    public Vaihtoehto(int id, String data) {
        this.id = id;
        this.data = data;
    }

    public Vaihtoehto() {
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
