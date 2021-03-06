package miage.bd;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Iterator;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.Transaction;


/**
 * Hibernate.
 */
public class TestHibernate
{
    public static SimpleDateFormat df = new SimpleDateFormat("dd-MM-yyyy");
    
    
    
    
    
	/**
	 * Programme de test.
	 */
	public static void main(String[] args) throws ParseException
		{
		/*----- Format de date -----*/
		SimpleDateFormat df = new SimpleDateFormat("dd-MM-yyyy");

		/*----- Ouverture de la session -----*/
		try (Session session = HibernateUtil.getSessionFactory().getCurrentSession())
			{
			/*----- enregistrement des employés -----*/
                            //enregistrerEmployes();
                            
                            
                        /*----- information des employés -----*/
                            //infoEmploye(1);
                            
                        /*----- enregistrer des demandes -----*/
                            //enregDemande();   
                            
                        /*----- enregistrer des demandes -----*/    
                            //enregistrerServices();
                            
                            
                        /*----- enregistrer des demandes -----*/
                            //infoDemandes(1);
                            //infoDemandes(2);
                        
			/**
			 * ...
			 */

                        //System.out.println("Bonjour !");
			}

		/*----- Exit -----*/
		System.exit(0);
		}


	/**
	 * Affichage d'une liste de tableaux d'objets.
	 */
	private static void affichage (List l)
		{
		Iterator e = l.iterator();
		while (e.hasNext())
			{
			Object[] tab_obj = ((Object[]) e.next());

			for (Object obj : tab_obj)
				System.out.print(obj + " ");

			System.out.println("");
			}
		}

} /*----- Fin de la classe TestHibernate -----*/
