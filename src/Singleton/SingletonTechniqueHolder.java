package Singleton;

 
 
public class SingletonTechniqueHolder {

	/** Constructeur privé */
	private SingletonTechniqueHolder() {
	}
 
	/** Holder */
    private static class SingletonHolder
    {       
        /** Instance unique non préinitialisée */
        private final static SingletonTechniqueHolder instance = new SingletonTechniqueHolder();
    }

    /** Point d'accès pour l'instance unique du singleton */
    public static SingletonTechniqueHolder getInstance()
    {
        return SingletonHolder.instance;
    }
    
}

/**
 * 
 *  la classe interne ne sera chargée en mémoire   lors du premier appel de "getInstance()" sur la classe SingletonTechniqueHolder.
 *   Lors de son chargement :
 *   le Holder initialisera ses champs statiques et créera donc l'instance unique du Singleton.
 * 
 *******/
