package Classes;

import java.sql.ResultSet;
import java.util.ArrayList;

import DB.BDD;

public class Client extends Personne{
	
	private long tel;
	private int L_black;
	
	public Client(String mat,String m,String n,long t,int l) {
		super(mat,m,n);
		this.tel = t;
		this.L_black = l;
	}
	
	public long getTel() {
		return this.tel;
	}
	public long getL_black() {
		return this.L_black;
	}
	
	public void setTel(long t) {
		this.tel = t;
	}
	public void setL_black(int l) {
		this.L_black = l;
	}
	
	public boolean ajout_client() {
		BDD db = new BDD("jdbc:sqlserver://localhost/Stage");
		try {
			@SuppressWarnings("unused")
			String rs = db.queryInsert("client", new Object[] {this.getMatricule(),this.getNom(),this.getTel(),this.getMail(),this.getL_black()});
			return true;
		}
		catch(Exception e) {
			e.printStackTrace();
			return false;
		}
	}
	
	public boolean modif_client(String c) {
		BDD db = new BDD("jdbc:sqlserver://localhost/Stage");
		try {
				@SuppressWarnings("unused")
				String rs = db.queryUpdate("client",new String[] {"dossier_id","nom","tel"},
						new Object[] {this.getMatricule(),this.getNom(),this.getTel()},
						"dossier_id = " + c);
			return true;
		}
		catch(Exception e) {
			e.printStackTrace();
			return false;
		}
	}
	
	public boolean supp_client(String c) {
		BDD db = new BDD("jdbc:sqlserver://localhost/Stage");
		try {
			@SuppressWarnings("unused")
			String rs = db.queryDelete("client","matricule = " + c);
			return true;
		}
		catch(Exception e) {
			e.printStackTrace();
			return false;
		}
	}
	
	public static boolean blacklister(int l,String c) {
		BDD db = new BDD("jdbc:sqlserver://localhost/Stage");
		try {
			@SuppressWarnings("unused")
			String rs = db.queryUpdate("client",new String[] {"L_black"},new Object[] {l},"cin = " + c);
			return true;
		}
		catch(Exception e) {
			e.printStackTrace();
			return false;
		}
	}
	
	public ArrayList<ResultSet> rechercher(boolean c1,boolean c2,boolean c3,boolean c4,boolean c5,boolean c6) {
		BDD db = new BDD("jdbc:sqlserver://localhost/Stage");
		ArrayList<ResultSet> rs = new ArrayList<ResultSet>();
		String[] cols = new String[] {"c.cin","c.nom","c.tel","c.mail","a.num_dossier","a.date_attr","e.echeance_id"};
		String[] tabs = new String[] {"client c","attr_client a","echeance e","dossier d","info_appel i"};
		String[] �tat_1 = new String[] {"c.L_black=0", "a.num_client=c.cin", "a.num_dossier=d.dossier_id",
				 " d.dossier_id=e.num_dossier", "i.num_client=c.cin"};
		String[] �tat_2 = new String[] {"c.L_black=0", "a.num_client=c.cin", "a.num_dossier=d.dossier_id",
				 " d.dossier_id=e.num_dossier","i.date_appel is null" };
		String[] �tat_3 = new String[] {"c.L_black=0", "a.num_client=c.cin", "a.num_dossier=d.dossier_id",
				 " d.dossier_id=e.num_dossier"};
		
		if(c1) {
			�tat_1[5] = " i.feed_back like 'Bo�te vocale'";
			ResultSet rs1 = db.fbSelectCommand(cols, tabs, �tat_1);
			rs.add(rs1);
		}
		if(c2) {
			�tat_3[5] = "e.date_fin_ech = (select convert(varchar,GETDATE(),3) as [YYYY-MM-DD]) ";
			ResultSet rs2 = db.fbSelectCommand(cols, tabs, �tat_3);
			rs.add(rs2);
		}
		if(c3) {
			�tat_1[5] = " i.feed_back like 'Pas de r�ponse'";
			ResultSet rs3 = db.fbSelectCommand(cols, tabs, �tat_1);
			rs.add(rs3);
		}
		if(c4) {
			�tat_3[5] = "e.date_fin_ech > (select convert(varchar,GETDATE(),3) as [YYYY-MM-DD]) ";
			ResultSet rs3 = db.fbSelectCommand(cols, tabs, �tat_3);
			rs.add(rs3);
		}
		if(c5) {
			ResultSet rs4 = db.fbSelectCommand(cols, tabs, �tat_2);
			rs.add(rs4);
		}
		if(c6) {
			�tat_1[5] = " i.feed_back like 'demande d\"un d�lai'";
			ResultSet rs5 = db.fbSelectCommand(cols, tabs, �tat_1);
			rs.add(rs5);
		}
		return rs;
	}
}
