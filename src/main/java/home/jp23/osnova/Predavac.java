package home.jp23.osnova;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;

@Entity
public class Predavac extends Entitet {
    
    @ManyToOne
    private Osoba osoba;
    
    private String iban;

    public Osoba getOsoba() {
        return osoba;
    }

    public void setOsoba(Osoba osoba) {
        this.osoba = osoba;
    }
    
    public String getIban() {
        return iban;
    }

    public void setIban(String iban) {
        this.iban = iban;
    }
       
}
