package Classes;

public enum feed_back {

	demande_du_d�lai,
	Bo�te_vocale,
	Pas_de_r�ponse;
	
	public String convert() {
		switch(this) {
		case demande_du_d�lai: return "demande d\"un d�lai";
		case Bo�te_vocale : return "Bo�te vocale";
		case Pas_de_r�ponse : return "Pas de r�ponse";
		}
		return null;
	}
}
