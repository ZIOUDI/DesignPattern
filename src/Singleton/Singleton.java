package Singleton;

/**
 * 
 *  
 */
public class Singleton {
	/**
	 * Constructeur privé Il faut donc interdire à tout code extérieur d'utiliser
	 * l'opérateur "new" et de créer des instances supplémentaires.
	 */
	private Singleton() {
	}

	/**
	 * Instance unique pré-initialisée statique, car à cet instant, le code appelant
	 * ne dispose encore d'aucune référence sur l'instance du singleton,
	 **/
	private static Singleton INSTANCE = new Singleton();

	/** Point d'accès pour l'instance unique du singleton */
	public static Singleton getInstance() {
		return INSTANCE;
	}
}