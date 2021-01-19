package Singleton;

/**
 * 
 *  
 */
public class Singleton {
	/**
	 * Constructeur priv� Il faut donc interdire � tout code ext�rieur d'utiliser
	 * l'op�rateur "new" et de cr�er des instances suppl�mentaires.
	 */
	private Singleton() {
	}

	/**
	 * Instance unique pr�-initialis�e statique, car � cet instant, le code appelant
	 * ne dispose encore d'aucune r�f�rence sur l'instance du singleton,
	 **/
	private static Singleton INSTANCE = new Singleton();

	/** Point d'acc�s pour l'instance unique du singleton */
	public static Singleton getInstance() {
		return INSTANCE;
	}
}