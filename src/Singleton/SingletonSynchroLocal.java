package Singleton;

 
 
public class SingletonSynchroLocal  {

	/** Constructeur privé  SingletonSynchroLocal*/
	private SingletonSynchroLocal() {
	}

	/** Instance unique non préinitialisée */
	private static SingletonSynchroLocal INSTANCE = null;

	/** Point d'accès pour l'instance unique du singleton */
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
 * supprimer la synchronisation globale sur la méthode,   et ne l'appliquer que dans le cas où l'instance doit être créée 
 *  
 *  ==============>  cette solution, appelée "double-checked locking"  ======>  NE FONCTIONNE PAS ============
 * 
 *******/
