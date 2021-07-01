package Classes;

import java.sql.ResultSet;
import java.sql.SQLException;

import DB.BDD;

public class User extends Personne {

	private String login,pwd;
	
	public User(String c,String m,String n,String p,String l,String mdp) {
		super(c,m,n,p);
		this.login = l;
		this.pwd = mdp;
	}
	public User(String l,String mdp) {
		this.login = l;
		this.pwd = mdp;
	}
	public User() {
		
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
		BDD db = new BDD("jdbc:sqlserver://localhost/Stage");
		ResultSet rs= db.querySelectAll("utilisateur");
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
	
	public boolean ajout_user() {
		BDD db = new BDD("jdbc:sqlserver:localhost\\sqlexpress;user=abdou;password=adminbouddine");
		try {
			@SuppressWarnings("unused")
			String rs = db.queryInsert("utilisateur", new String[] {this.getMatricule(),this.getLogin(),this.getPwd(),this.getNom(),this.getPrenom(),
					this.getMail()});
			return true;
		}
		catch(Exception e) {
			e.printStackTrace();
			return false;
		}
	}
	
	public boolean modif_user(int c) {
		BDD db = new BDD("jdbc:sqlserver:localhost\\sqlexpress;user=abdou;password=adminbouddine");
		try {
			@SuppressWarnings("unused")
			String rs = db.queryUpdate("utilisateur",new String[] {"matricule","login","mdp","nom","prenom","mail"},
					new String[] {this.getMatricule(),this.getLogin(),this.getPwd(),this.getNom(),this.getPrenom(),this.getMail()},"matricule =" + c);
			return true;
		}
		catch(Exception e) {
			e.printStackTrace();
			return false;
		}
	}
	
	public boolean rechercher_user(String n) throws SQLException {
		BDD db = new BDD("jdbc:sqlserver:localhost\\sqlexpress;user=abdou;password=adminbouddine");
		ResultSet rs = db.querySelectAll("utilisateur");
		while (rs.next()){
			if(rs.getString("nom").equals(n)) return true;
		}
		return false;
	}
}

