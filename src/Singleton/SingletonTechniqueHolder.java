package Singleton;

 
 
public class SingletonTechniqueHolder {

	/** Constructeur priv� */
	private SingletonTechniqueHolder() {
	}
 
	/** Holder */
    private static class SingletonHolder
    {       
        /** Instance unique non pr�initialis�e */
        private final static SingletonTechniqueHolder instance = new SingletonTechniqueHolder();
    }

    /** Point d'acc�s pour l'instance unique du singleton */
    public static SingletonTechniqueHolder getInstance()
    {
        return SingletonHolder.instance;
    }
    
}

/**
 * 
 *  la classe interne ne sera charg�e en m�moire   lors du premier appel de "getInstance()" sur la classe SingletonTechniqueHolder.
 *   Lors de son chargement :
 *   le Holder initialisera ses champs statiques et cr�era donc l'instance unique du Singleton.
 * 
 *******/
