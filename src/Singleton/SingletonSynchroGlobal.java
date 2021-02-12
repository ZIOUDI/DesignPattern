package Singleton;
 
public class SingletonSynchroGlobal {
	/****************************************************************************************
	 *  Le problème est ainsi résolu, mais au prix d'une pénalité sur les performances. 
	 * Si le singleton est accédé
	 *  souvent (système de log...), le ralentissement de l'application peut être important.
	 * 
	 ***************************************************************************************/
	/** Constructeur privé */
	private SingletonSynchroGlobal() {
	}

	/** Instance unique non préinitialisée */
	private static SingletonSynchroGlobal INSTANCE = null;

	/** Point d'accès pour l'instance unique du singleton */
    public static synchronized SingletonSynchroGlobal getInstance() // +++ synchronized
    {           
        if (INSTANCE == null)
        {   INSTANCE = new SingletonSynchroGlobal(); 
        }
        return INSTANCE;
    }
}


