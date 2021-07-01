package Classes;

import java.sql.ResultSet;
import java.sql.SQLException;
import DB.BDD;

public class attr_menu {
	
	private int R_ajout,R_modif,R_black,E_mois,E_jour,E_an,G_user_ajout,G_user_modif_supp;
	private int G_menu,G_acces,G_infos;
	private int user_num,L_clients,L_BV,L_dern_ech,L_PR,L_AV_exp,L_NC,L_black,L_AV;
	private String login;
	
	public attr_menu(int a,int b,int c,int d,int e,int f,int g,int h,int i,int j,int k,int l,int m,int n,int o,int p,int q,int r,int s,int t) 
	{
		this.R_ajout = a;
		this.R_modif = b;
		this.R_black = c;
		this.E_mois = d;
		this.E_jour = e;
		this.E_an = f;
		this.G_user_ajout = g;
		this.G_user_modif_supp = h;
		this.G_menu = i;
		this.G_acces = j;
		this.G_infos = k;
		this.L_clients = l;
		this.L_BV = m;
		this.L_dern_ech = n;
		this.L_PR = o;
		this.L_AV_exp = p;
		this.L_NC = r;
		this.L_black = s;
		this.L_AV = t;
		this.user_num = q;
	}
	public attr_menu(String n) {
		this.login = n;
	}
	
	public int getUser_num() {
		return this.user_num;
	}
	public int getR_ajout( ) {
		return this.R_ajout ;
	}
	public int getR_modif( ) {
		return this.R_modif ;
	}
	public int getR_black( ) {
		return this.R_black;
	}
	public int getE_mois( ) {
		return this.E_mois ;
	}
	public int getE_jour() {
		return this.E_jour ;
	}
	public int getE_an( ) {
		return this.E_an ;
	}
	public int getG_user_ajout() {
		return this.G_user_ajout ;
	}
	public int getG_user_modif_supp( ) {
		return this.G_user_modif_supp ;
	}
	public int getG_menu( ) {
		return this.G_menu;
	}
	public int getG_acces() {
		return this.G_acces ;
	}
	public int getG_infos() {
		return this.G_infos;
	}
	public int getL_clients() {
		return this.L_clients;
	}
	public int getL_BV() {
		return this.L_BV;
	}
	public int getL_dern_ech() {
		return this.L_dern_ech;
	}
	public int getL_PR(){
		return this.L_PR;
	}
	public int getL_AV_exp() {
		return this.L_AV_exp;
	}
	public int getL_NC() {
		return this.L_NC;
	}
	public int getL_black() {
		return this.L_black;
	}
	public int getL_AV() {
		return this.L_AV;
	}
	
	
	public void setR_ajout(int c ) {
		this.R_ajout = c;
	}
	public void setR_modif(int c ) {
		this.R_modif = c;
	}
	public void setR_black(int c ) {
		this.R_black = c;
	}
	public void setE_mois(int c ) {
		this.E_mois = c;
	}
	public void setE_jour(int c ) {
		this.E_jour = c;
	}
	public void setE_an(int c ) {
		this.E_an = c;
	}
	public void setG_user_ajout(int c ) {
		this.G_user_ajout = c;
	}
	public void setG_user_modif_supp(int c ) {
		this.G_user_modif_supp = c;
	}
	public void setG_menu(int c ) {
		this.G_menu = c;
	}
	public void setG_acces(int c ) {
		this.G_acces = c;
	}
	
	
	public attr_menu chercher_attr_menu() throws SQLException {
		BDD db = new BDD("jdbc:sqlserver:localhost:1433;user=abdou;password=adminbouddine");
		ResultSet rs = db.querySelectAll("attr_menu", "attr_menu.user_num = utilisateur.matricule and utilisateur.login.equals('"+this.login+"')");
		while(rs.next()) {
			attr_menu menu = new attr_menu(rs.getInt("R_ajout"),rs.getInt("R_modif"),rs.getInt("R_black"),rs.getInt("E_mois"),
					rs.getInt("E_jour"),rs.getInt("E_an"),rs.getInt("G_user_ajout"),rs.getInt("G_user_modif_supp"),rs.getInt("G_menu"),
					rs.getInt("G_acces"),rs.getInt("G_infos"),rs.getInt("L_clients"),rs.getInt("L_BV"),rs.getInt("L_dern_ech"),
					rs.getInt("L_PR"),rs.getInt("L_AV_exp"),rs.getInt("L_NC"),rs.getInt("L_black"),rs.getInt("L_AV"),0);
			return menu;
		}
		return null;
	}
}
