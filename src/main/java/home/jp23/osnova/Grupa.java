package home.jp23.osnova;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;


@Entity

public class Grupa extends Entitet {
    
    private String naziv;
    
    @ManyToOne
    private Smjer smjer;
    
    @ManyToOne
    private Predavac predavac;
    
    private Date datumPocetka;
    
    private Integer brojPolaznika;
    
    @ManyToMany
    @JoinTable(
        name = "Clan", 
        joinColumns = { @JoinColumn(name = "grupa_id") }, 
        inverseJoinColumns = { @JoinColumn(name = "polaznik_id") }
    )
    private Set<Polaznik> polaznici = new HashSet<>();

    public Set<Polaznik> getPolaznici() {
        return polaznici;
    }

    public void setPolaznici(Set<Polaznik> polaznici) {
        this.polaznici = polaznici;
    }

    public String getNaziv() {
        return naziv;
    }

    public void setNaziv(String naziv) {
        this.naziv = naziv;
    }

    public Smjer getSmjer() {
        return smjer;
    }

    public void setSmjer(Smjer smjer) {
        this.smjer = smjer;
    }

    public Predavac getPredavac() {
        return predavac;
    }

    public void setPredavac(Predavac predavac) {
        this.predavac = predavac;
    }

    public Date getDatumPocetka() {
        return datumPocetka;
    }

    public void setDatumPocetka(Date datumPocetka) {
        this.datumPocetka = datumPocetka;
    }

    public Integer getBrojPolaznika() {
        return brojPolaznika;
    }

    public void setBrojPolaznika(Integer brojPolaznika) {
        this.brojPolaznika = brojPolaznika;
    }
    
}
