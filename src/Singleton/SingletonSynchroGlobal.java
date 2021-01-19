package Singleton;

 
 
public class SingletonSynchroGlobal {

	/** Constructeur priv� */
	private SingletonSynchroGlobal() {
	}

	/** Instance unique non pr�initialis�e */
	private static SingletonSynchroGlobal INSTANCE = null;

	/** Point d'acc�s pour l'instance unique du singleton */
    public static synchronized SingletonSynchroGlobal getInstance() // +++ synchronized
    {           
        if (INSTANCE == null)
        {   INSTANCE = new SingletonSynchroGlobal(); 
        }
        return INSTANCE;
    }
}

/**
 * 
 * 
 * Le probl�me est ainsi r�solu, mais au prix d'une p�nalit� sur les performances. Si le singleton est acc�d�
 *  souvent (syst�me de log...), le ralentissement de l'application peut �tre important.
 * 
 * 
 *******/
