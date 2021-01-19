package Singleton;

 
 
public class SingletonLazyLoading {

	/** Constructeur privé */
	private SingletonLazyLoading() {
	}

	/** Instance unique non préinitialisée */
	private static SingletonLazyLoading INSTANCE = null;

	/** Point d'accès pour l'instance unique du singleton */
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
 * elle est extrêmement dangereuse en environnement multithreadé, deux threads
 * peuvent exécuter le test simultanément et créer ainsi chacun une instance du
 * singleton. Elle doit donc être absolument proscrite.
 * 
 * 
 * 
 *******/
