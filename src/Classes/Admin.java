package Classes;

import java.sql.ResultSet;

import DB.BDD;

public class Admin extends Personne{

	private String login,pwd;
	
	public Admin(String c,String m,String n,String p,String l,String mdp) {
		super(c,m,n,p);
		this.login = l;
		this.pwd = mdp;
	}
	public Admin(String l,String mdp) {
		this.login = l;
		this.pwd = mdp;
	}
	
	public String getLogin() {
		return this.login;
	}
	public String getPwd() {
		return this.pwd;
	}
	
	public void setLogin(String lgn) {
		this.login = lgn;
	}
	public void setPwd(String mdp) {
		this.pwd = mdp;
	}
	
	public boolean authentificate() {
		BDD db = new BDD("jdbc:sqlserver:localhost\\sqlexpress;user=abdou;password=adminbouddine");
		ResultSet rs= db.querySelectAll("admin");
		try {
			while(rs.next()) {
				if(this.login.equals(rs.getString("login")) && this.pwd.equals(rs.getString("mdp"))) return true;
			}
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		return false;
	}
	
	
	public boolean affecter_menu(attr_menu menu) {
		BDD db = new BDD("jdbc:sqlserver:localhost\\sqlexpress;user=abdou;password=adminbouddine");
		try {
			@SuppressWarnings("unused")
			String rs = db.queryUpdate("attr_menu", new String[] {"R_ajout","R_modif","R_black","E_mois","E_jour",
					"E_an","G_user_ajout","G_user_modif_supp","G_menu","G_acces","L_ech_parvenue","L_dern_ech",
					"L_pas_rep","L_AV_exp","L_AV","L_black"}, new double[] {menu.getR_ajout(),menu.getR_modif(),menu.getR_black(),
							menu.getE_mois(),menu.getE_jour(),menu.getE_an(),menu.getG_user_ajout(),menu.getG_user_modif_supp(),
							menu.getG_menu(),menu.getG_acces(),menu.getG_infos(),menu.getL_clients(),menu.getL_BV(),menu.getL_dern_ech(),
							menu.getL_PR(),menu.getL_AV_exp(),menu.getL_NC(),menu.getL_black(),menu.getL_AV()}, "user_num = " + menu.getUser_num());
			return true;
		}
		catch(Exception e) {
			e.printStackTrace();
			return false;
		}
	}
	
	

}
