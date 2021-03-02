
package home.jp23;

import home.jp23.util.HibernateUtill;
import home.jp23.util.InitialFixtures;
import org.hibernate.Hibernate;
import org.hibernate.Session;

/**
 *
 * @author natalis
 */
public class Start {
    public static void main(String[] args) {
        Session s=HibernateUtill.getSession();
        //InitialFixtures.start();
    }
    
}
