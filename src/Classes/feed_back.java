package Classes;

public enum feed_back {

	demande_du_délai,
	Boîte_vocale,
	Pas_de_réponse;
	
	public String convert() {
		switch(this) {
		case demande_du_délai: return "demande d\"un délai";
		case Boîte_vocale : return "Boîte vocale";
		case Pas_de_réponse : return "Pas de réponse";
		}
		return null;
	}
}
