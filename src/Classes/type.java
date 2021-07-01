package Classes;

public enum type {

	telephone,
	mail,
	courrier;
	
	public String convert() {
		switch(this) {
		case telephone : return "telephone";
		case mail : return "mail";
		case courrier : return "courrier";
		}
		return null;
	}
}
