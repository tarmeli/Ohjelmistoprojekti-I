package softala.projekti.bean;

public class Kysely {
    private int id;
    private String nimi;
    private String kysymys;

    public Kysely() {
        this.id = id;
        this.nimi = nimi;
        this.kysymys = kysymys;
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

    public String getKysymys() {
        return kysymys;
    }

    public void setKysymys(String kysymys) {
        this.kysymys = kysymys;
    }
}
