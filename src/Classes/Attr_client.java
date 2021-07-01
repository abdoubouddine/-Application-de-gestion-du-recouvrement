package Classes;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.*;

import DB.BDD;

public class Attr_client {

	private String num_client;
	private String num_dossier;
	private Date dat;
	
	public Attr_client(String c,String n,Date d) {
		this.num_client = c;
		this.num_dossier = n;
		this.dat = d;
	}
	public Attr_client(String c,String n) {
		this.num_client = c;
		this.num_dossier = n;
	}
	public Attr_client(String n) {
		this.num_dossier = n;
	}
	public String getCin() {
		return this.num_client;
	}
	public String getDossier() {
		return this.num_dossier;
	}
	public Date getDate() {
		return this.dat;
	}
	
	public void setCin(String c) {
		this.num_client = c;
	}
	public void setDossier(String n) {
		this.num_dossier = n;
	}
	public void setDate(Date d) {
		this.dat = d;
	}
	
	public boolean ajouterNvAttr() {
		BDD db = new BDD("jdbc:sqlserver://localhost/Stage");
		ResultSet rs = db.querySelectAll("client", "cin like "+this.num_client);
		ResultSet rs1 = db.querySelectAll("dossier", "dossier_id = "+this.num_dossier);
		try {
			if(rs.next() && rs1.next()) {
				Date dNow = new Date( );
			    SimpleDateFormat ft = new SimpleDateFormat ("yyyy-MM-dd");
				@SuppressWarnings("unused")
				String rs2 = db.queryInsert("attr_client", new String[] {"num_client","date_attr","num_dossier"},new Object[] {this.num_client,
						ft.format(dNow),this.num_dossier});
			}
			return true;
		} catch (SQLException e) {
			e.printStackTrace();
			return false;
		}
	}
	
	public boolean modifaAttr(String n) {
		BDD db = new BDD("jdbc:sqlserver://localhost/Stage");
		try {
			@SuppressWarnings("unused")
			String rs = db.queryUpdate("attr_client", new String[] {"num_dossier"}, new String[] {this.num_dossier}, "num_dossier = " + n);
			return true;
		}
		catch(Exception e) {
			e.printStackTrace();
			return false;
		}
	}
	
	public boolean suppAttr() {
		BDD db = new BDD("jdbc:sqlserver://localhost/Stage");
		try {
			@SuppressWarnings("unused")
			String rs = db.queryDelete("attr_client", "num_client like "+this.num_client);
			return true;
		}
		catch(Exception e) {
			e.printStackTrace();
			return false;
		}
	}

}
