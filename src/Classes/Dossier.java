package Classes;

import java.sql.ResultSet;
import java.sql.SQLException;

import DB.BDD;

public class Dossier {

	private long code_produit;
	private float versement;
	private String id;
	
	public Dossier(String id,long code,float vers) {
		this.id = id;
		this.code_produit = code;
		this.versement = vers;
	}
	
	public String getId() {
		return this.id;
	}
	public long getCode() {
		return this.code_produit;
	}
	public float getVersement() {
		return this.versement;
	}

	public void setId(String id) {
		this.id = id;
	}
	public void setCode(long code) {
		this.code_produit = code;
	}
	public void setVersement(float vers) {
		this.versement = vers;
	}
	
	public boolean ajoutDossier() {
		BDD db = new BDD("jdbc:sqlserver://localhost/Stage");
		try {
			ResultSet rs1 = db.querySelectAll("echeance", "num_dossier like " + this.id);
			while(rs1.next()) {
			@SuppressWarnings("unused")
			String rs = db.queryInsert("dossier", new Object[] {this.id,this.code_produit,this.versement,rs1.getFloat("auto_versement")+
					this.versement});
			}
			return true;
		}
		catch(Exception e) {
			e.printStackTrace();
			return false;
		}
	}
	
	public boolean majDossier(String i) {
		BDD db = new BDD("jdbc:sqlserver://localhost/Stage");
		try {
			@SuppressWarnings("unused")
			String rs = db.queryUpdate("client",new String[] {"dossier_id","code_produit","versement"},
					new Object[] {this.id,this.code_produit,this.versement},"dossier_id like " + i+"')");
			return true;
		}
		catch(Exception e) {
			e.printStackTrace();
			return false;
		}
	}
	
	public boolean majDossier_1(String c) {
		BDD db = new BDD("jdbc:sqlserver://localhost/Stage");
		try {
			ResultSet rs1 = db.fcSelectCommand(new String[] {"num_dossier"},"attr_client", "num_client like "+ c);
			if(rs1.next()) {
				@SuppressWarnings("unused")
				String rs = db.queryUpdate("client",new String[] {"dossier_id","code_produit","versement"},
						new Object[] {this.id,this.code_produit,this.versement},"dossier_id like " + rs1.getString("num_dossier"));	
			}
			return true;
		}
		catch(Exception e) {
			e.printStackTrace();
			return false;
		}
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
	
	public ResultSet calcul_CA_mois(String month) {
		BDD db = new BDD("jdbc:sqlserver://localhost/Stage");
		ResultSet rs = db.ijSelectCommand(new String[] {"sum(d.montant) as 'CA' "},new String[] {"dossier d, attr_client a"}, 
				new Object[] {"d.dossier_id=a.num_dossier","month(a.date_attr) = "+ String.valueOf(mois(month))});
		return rs;
	}
	
	public ResultSet calcul_CA_year(String annee) {
		BDD db = new BDD("jdbc:sqlserver://localhost/Stage");
		ResultSet rs = db.ijSelectCommand(new String[] {"sum(d.montant) as 'CA' "},new String[] {"dossier d, attr_client a"}, 
				new Object[] {"d.dossier_id like a.num_dossier","year(a.date_attr) = "+ String.valueOf(annee)});
		return rs;
	}
	
	public static ResultSet calcul_V_M(String m) throws SQLException {
		BDD db = new BDD("jdbc:sqlserver://localhost/Stage");	
		ResultSet rs = db.querySelectAll("echeance","date_ech = "+ String.valueOf(mois(m)));
		String e = "";
		while(rs.next()) {
			e += rs.getString("num_dossier");
			if(!rs.isLast()) e+=",";
		}
		ResultSet rs1 = db.fbSelectCommand(new String[] {"sum(a.versement) as 'V' ","sum(a.montant) as 'M' "},new String[] {"dossier d","attr_client a"}, 
					new Object[] {"d.dossier_id in (" + e + ")"});
		return rs1;
	}
}
