package Singleton;

 
 
public class SingletonLazyLoading {

	/** Constructeur priv� */
	private SingletonLazyLoading() {
	}

	/** Instance unique non pr�initialis�e */
	private static SingletonLazyLoading INSTANCE = null;

	/** Point d'acc�s pour l'instance unique du singleton */
	    public static SingletonLazyLoading getInstance()
	    {           
	        if (INSTANCE == null)
	        {   INSTANCE = new SingletonLazyLoading(); // +++++++++
	        }
	        return INSTANCE;
	    }
}

/**
 * 
 * 
 * elle est extr�mement dangereuse en environnement multithread�, deux threads
 * peuvent ex�cuter le test simultan�ment et cr�er ainsi chacun une instance du
 * singleton. Elle doit donc �tre absolument proscrite.
 * 
 * 
 * 
 *******/
