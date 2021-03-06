package Singleton;

 
 
public class SingletonSynchroLocal  {

	/** Constructeur priv�  SingletonSynchroLocal*/
	private SingletonSynchroLocal() {
	}

	/** Instance unique non pr�initialis�e */
	private static SingletonSynchroLocal INSTANCE = null;

	/** Point d'acc�s pour l'instance unique du singleton */
    public static SingletonSynchroLocal getInstance() 
    {           
        if (INSTANCE == null)
        {   
            synchronized(Singleton.class)   // ++++++++++++++++++
            {
                if (INSTANCE == null)
                {   INSTANCE = new SingletonSynchroLocal();
                }
            }
        }
        return INSTANCE;
    }
}

/**
 * 
 * supprimer la synchronisation globale sur la m�thode,   et ne l'appliquer que dans le cas o� l'instance doit �tre cr��e 
 *  
 *  ==============>  cette solution, appel�e "double-checked locking"  ======>  NE FONCTIONNE PAS ============
 * 
 *******/
