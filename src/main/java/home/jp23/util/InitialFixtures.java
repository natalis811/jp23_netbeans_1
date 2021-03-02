/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package home.jp23.util;

import home.jp23.osnova.Osoba;
import home.jp23.osnova.Smjer;
import java.math.BigDecimal;
import javax.persistence.ManyToMany;
import org.hibernate.Session;

/**
 *
 * @author natalis
 */
public class InitialFixtures {
    
    public static void start(){
        Session s = HibernateUtill.getSession();
        s.beginTransaction();
        
        Smjer java = new Smjer();
        java.setNaziv("Racunalni operater");
        java.setCijena(new BigDecimal(5900.09));
        java.setTrajanje(130);
        java.setVerificiran(Boolean.TRUE);
        
        s.save(java);
        
               
       
        
    }
    
}
