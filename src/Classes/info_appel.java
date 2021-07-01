package Classes;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.ArrayList;

import DB.BDD;

public class info_appel {

	private String num_client;
	private type type_contact;
	private feed_back fb;
	private Date date_contact;
	private long num_ech;
	private int num_user;
	
	public info_appel(String n,type t,feed_back f,Date d,long nE,int nU) {
		this.num_client = n;
		this.type_contact = t;
		this.fb = f;
		this.date_contact = d;
		this.num_ech = nE;
		this.num_user = nU;
	}
	
	public String getNumClient() {
		return this.num_client;
	}
	public type getType() {
		return this.type_contact;
	}
	public feed_back getFeedBack() {
		return this.fb;
	}
	public Date getDate() {
		return this.date_contact;
	}
	public long getNumEch() {
		return this.num_ech;
	}
	public int getNumUser() {
		return this.num_user;
	}
	
	public String setType(type t) {
		return t.convert();
	}
	public String setFeedBack(feed_back f) {
		return f.convert();
	}
	
	public boolean ajoutContact() {
		BDD db = new BDD("jdbc:sqlserver://localhost/Stage");
		ResultSet rs = db.querySelectAll("client", "cin like "+this.num_client);
		ResultSet rs1 = db.querySelectAll("utilisateur", "matricule = "+this.num_user);
		ResultSet rs2 = db.querySelectAll("echeance", "echeance_id = "+this.num_ech);
		try {
			if(rs.next() && rs1.next() && rs2.next()) {
				String t = this.setType(this.type_contact);
				String f = this.setFeedBack(this.fb);
			    SimpleDateFormat ft = new SimpleDateFormat ("yyyy-MM-dd");
			    @SuppressWarnings("unused")
				String rs3 = db.queryInsert("info_appel", new String[] {"num_client","type_contact","feed_back","date_appel","num_ech",
						"user_num"},new Object[] {this.num_client,t,f,ft.format(this.date_contact),this.num_ech,this.num_user});
			    
			}
		return true;
		}
		catch(Exception e) {
			e.printStackTrace();
			return false;
		}
	}
	
	public int mois(String month) {  
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
	
	public ArrayList<Integer> calcul_nbr_feedback(String m) throws SQLException{
		ArrayList<Integer> list = new ArrayList<Integer>();
		BDD db = new BDD("jdbc:sqlserver://localhost/Stage");
		ResultSet rs3 = db.fbSelectCommand(new String[] {"count(*) as CE"}, new String[] {"info_appel"},new Object[] {"month(date_appel) = "+ mois(m)});
		while(rs3.next()) list.add(rs3.getInt("CE"));
		ResultSet rs4 = db.fbSelectCommand(new String[] {"count(*) as VP"}, new String[] {"echeance"},new Object[] {"month(date_ech) = " +mois(m)});
		while(rs4.next()) list.add(rs4.getInt("VP"));
		ResultSet rs = db.fbSelectCommand(new String[] {"count(*) as BV"}, new String[] {"info_appel"},new Object[] {"month(date_appel) = "+ mois(m),
				 " feed_back.equals('"+ this.setFeedBack(feed_back.Boîte_vocale)+"')"});
		while(rs.next()) list.add(rs.getInt("BV"));
		ResultSet rs1 = db.fbSelectCommand(new String[] {"count(*) as PR"},new String[] {"info_appel"},new Object[] {"month(date_appel) = "+ mois(m),
				 " feed_back.equals('"+ this.setFeedBack(feed_back.Pas_de_réponse)+"')"});
		while(rs1.next()) list.add(rs.getInt("PR"));
		ResultSet rs2 = db.fbSelectCommand(new String[] {"count(*) as AV"},new String[] {"info_appel"},new Object[] {"month(date_appel) = "+ mois(m),
				 " feed_back.equals('"+ this.setFeedBack(feed_back.demande_du_délai)+"')"});
		while(rs2.next()) list.add(rs2.getInt("AV"));
		return list;
	}
	
	
}
