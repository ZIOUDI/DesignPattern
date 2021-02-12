package Singleton;
public class SingletonTechniqueHolder {

	private SingletonTechniqueHolder() {
		/** Constructeur privé */
	}

	private static class SingletonHolder {
		/** Holder */
		/** Instance unique non préinitialisée */
		private final static SingletonTechniqueHolder instance =

			new SingletonTechniqueHolder();
	}

	/** Point d'accès pour l'instance unique du singleton */
	public static SingletonTechniqueHolder getInstance() {
		return SingletonHolder.instance;
	}
}

/**
 * 
 * la classe interne ne sera chargée en mémoire lors du premier appel de "getInstance()" 
 *     sur la classe SingletonTechniqueHolder.
 * Lors de son chargement : 
 *    le Holder initialisera ses champs statiques et créera l'instance unique du Singleton.
 * 
 *******/
