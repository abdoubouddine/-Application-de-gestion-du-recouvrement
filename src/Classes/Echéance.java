package Classes;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;

import DB.BDD;

public class Echéance {

	private float AV;
	private String num_dossier;
	public static Date date_ech;
	
	public Echéance(float a,String n,Date d1) {
		this.AV = a;
		this.num_dossier = n;
		date_ech = d1;
	}
	
	public Date getDate() {
		return date_ech;
	}
	public float getAV() {
		return this.AV;
	}
	public String getDossier() {
		return this.num_dossier;
	}

	public static int mois(String month) {  
	    if(month.equals("Janvier"))  return 1;
	    if(month.equals("Février")) return 2;
	    if(month.equals("Mars")) return 3;
	    if(month.equals("Avril")) return 4;
	    if(month.equals("Mai")) return 5;
	    if(month.equals("Juin")) return 6;
	    if(month.equals("Juillet")) return 7;
	    if(month.equals("Août")) return 8;
	    if(month.equals("Septembre")) return 9;
	    if(month.equals("Octobre")) return 10;
	    if(month.equals("Novembre")) return 11;
	    if(month.equals("Décembre")) return 12;
		return 0;
    }
	
	public boolean ajouterEcheance() {
		BDD db = new BDD("jdbc:sqlserver://localhost/Stage");
		try{
			@SuppressWarnings("unused")
			String rs = db.queryInsert("echeance", new String[] {"num_dossier","auto_versement","date_ech"}, new Object[] {
					this.num_dossier,this.AV,date_ech});
		return true;
		}
		catch(Exception e) {
			e.printStackTrace();
			return false;
		}
	}
	
	public boolean modifEcheance(String n) {
		BDD db = new BDD("jdbc:sqlserver://localhost/Stage");
		try {
			String rs = db.queryUpdate("echeance", new String[] {"num_dossier","auto_versement","date_ech"}, new Object[] {
					this.num_dossier,this.AV,date_ech},"num_dossier like "+ n );
			return true;
		}
		catch(Exception e) {
			e.printStackTrace();
			return false;
		}
	}
	
	public static ResultSet calcul_AV(String m) throws SQLException {
		BDD db = new BDD("jdbc:sqlserver://localhost/Stage");	
		try (ResultSet rs = db.fbSelectCommand(new String[] {"sum(e.auto_versement) as 'AV' "},new String[] {"echeance e"}, 
					new Object[] {"month(e.date_ech) = "+ String.valueOf(mois(m)),"year(e.date_ech) = "+ date_ech.getYear()})) {
			return rs;
		}
	}
	
	
}
