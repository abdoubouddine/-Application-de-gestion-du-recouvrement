package Interfaces;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.border.MatteBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.HeadlessException;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.SwingConstants;
import javax.swing.JScrollPane;
import javax.swing.ButtonGroup;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import com.toedter.calendar.JDateChooser;

import Classes.Client;
import Classes.Dossier;
import Classes.Echéance;
import DB.BDD;

import javax.swing.JCheckBox;
import javax.swing.JRadioButton;

public class Add_Clients extends JFrame {

	private JPanel contentPane;
	private ButtonGroup btnGrp;
	private JTextField doss;
	private JTextField cin;
	private JTextField name;
	private JTextField mail;
	private JTextField tel;
	private JTextField vers;
	private JTextField AV;
	private JRadioButton yes,no;
	private JDateChooser dateChooser,dateChooser_1;
	private JComboBox  type,fb;
	private JCheckBox car,pav,bord;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Add_Clients frame = new Add_Clients();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Add_Clients() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1019, 646);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setLayout(null);
		panel.setBorder(new MatteBorder(0, 0, 2, 0, (Color) Color.RED));
		panel.setBackground(Color.WHITE);
		panel.setBounds(0, 0, 1005, 81);
		contentPane.add(panel);
		
		JLabel lblNewLabel = new JLabel("GESTION DES CLIENTS");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setForeground(Color.RED);
		lblNewLabel.setFont(new Font("Microsoft JhengHei UI", Font.BOLD | Font.ITALIC, 20));
		lblNewLabel.setBounds(174, 0, 665, 41);
		panel.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("LES G\u00C9ANTS DU REVETEMENT");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setForeground(new Color(128, 0, 128));
		lblNewLabel_1.setFont(new Font("Microsoft JhengHei UI", Font.BOLD | Font.ITALIC, 20));
		lblNewLabel_1.setBounds(174, 32, 665, 41);
		panel.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Action");
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setFont(new Font("Malgun Gothic", Font.PLAIN, 20));
		lblNewLabel_2.setBounds(10, 135, 160, 36);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_5 = new JLabel("Formulaire d'inscription");
		lblNewLabel_5.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_5.setFont(new Font("Malgun Gothic", Font.PLAIN, 20));
		lblNewLabel_5.setBounds(377, 135, 310, 36);
		contentPane.add(lblNewLabel_5);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 192, 225, 328);
		contentPane.add(scrollPane);
		
		JPanel panel_1 = new JPanel();
		scrollPane.setViewportView(panel_1);
		panel_1.setLayout(null);
		
		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(24, 71, 171, 231);
		panel_1.add(scrollPane_1);
		
		JPanel panel_2 = new JPanel();
		scrollPane_1.setViewportView(panel_2);
		panel_2.setLayout(null);
		
		JButton btnAj = new JButton("Ajouter");
		btnAj.setBounds(39, 34, 85, 21);
		panel_2.add(btnAj);
		
		JButton btnClr = new JButton("Effacer");
		btnClr.setBounds(39, 105, 85, 21);
		panel_2.add(btnClr);
		
		JButton btnClose = new JButton("Fermer");
		btnClose.setBounds(39, 179, 85, 21);
		panel_2.add(btnClose);
		
		JLabel lblNewLabel_2_1 = new JLabel("Commande");
		lblNewLabel_2_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2_1.setFont(new Font("Malgun Gothic", Font.PLAIN, 20));
		lblNewLabel_2_1.setBounds(10, 25, 160, 36);
		panel_1.add(lblNewLabel_2_1);
		
		JScrollPane scrollPane_2 = new JScrollPane();
		scrollPane_2.setBounds(354, 192, 641, 374);
		contentPane.add(scrollPane_2);
		
		JPanel panel_3 = new JPanel();
		scrollPane_2.setViewportView(panel_3);
		panel_3.setLayout(null);
		
		JLabel lblNewLabel_3 = new JLabel("Num dossier :");
		lblNewLabel_3.setBounds(24, 10, 93, 13);
		panel_3.add(lblNewLabel_3);
		
		JLabel lblNewLabel_3_2 = new JLabel("Nom :");
		lblNewLabel_3_2.setBounds(24, 128, 64, 13);
		panel_3.add(lblNewLabel_3_2);
		
		JLabel lblNewLabel_3_3 = new JLabel("Date du contact :");
		lblNewLabel_3_3.setBounds(24, 188, 93, 13);
		panel_3.add(lblNewLabel_3_3);
		
		JLabel lblNewLabel_3_4 = new JLabel("Type du contact :");
		lblNewLabel_3_4.setBounds(24, 245, 93, 13);
		panel_3.add(lblNewLabel_3_4);
		
		JLabel lblNewLabel_3_5 = new JLabel("Mail :");
		lblNewLabel_3_5.setBounds(346, 10, 45, 13);
		panel_3.add(lblNewLabel_3_5);
		
		JLabel lblNewLabel_3_6 = new JLabel("Num tel :");
		lblNewLabel_3_6.setBounds(346, 65, 45, 13);
		panel_3.add(lblNewLabel_3_6);
		
		JLabel lblNewLabel_3_7 = new JLabel("Type du produit :");
		lblNewLabel_3_7.setBounds(303, 128, 88, 13);
		panel_3.add(lblNewLabel_3_7);
		
		JLabel lblNewLabel_3_8 = new JLabel("Versement :");
		lblNewLabel_3_8.setBounds(346, 191, 88, 13);
		panel_3.add(lblNewLabel_3_8);
		
		JLabel lblNewLabel_3_9 = new JLabel("Auto de versement :");
		lblNewLabel_3_9.setBounds(346, 259, 101, 13);
		panel_3.add(lblNewLabel_3_9);
		
		JLabel lblNewLabel_3_10 = new JLabel("Blacklister :");
		lblNewLabel_3_10.setBounds(346, 325, 71, 13);
		panel_3.add(lblNewLabel_3_10);
		
		JLabel lblNewLabel_3_11 = new JLabel("Date pr\u00E9vue :");
		lblNewLabel_3_11.setBounds(24, 297, 93, 13);
		panel_3.add(lblNewLabel_3_11);
		
		doss = new JTextField();
		doss.setBounds(127, 7, 117, 19);
		panel_3.add(doss);
		doss.setColumns(10);
		
		cin = new JTextField();
		cin.setColumns(10);
		cin.setBounds(127, 62, 117, 19);
		panel_3.add(cin);
		
		name = new JTextField();
		name.setColumns(10);
		name.setBounds(127, 125, 117, 19);
		panel_3.add(name);
		
		mail = new JTextField();
		mail.setColumns(10);
		mail.setBounds(457, 7, 117, 19);
		panel_3.add(mail);
		
		tel = new JTextField();
		tel.setColumns(10);
		tel.setBounds(457, 62, 117, 19);
		panel_3.add(tel);
		
		vers = new JTextField();
		vers.setColumns(10);
		vers.setBounds(457, 188, 117, 19);
		panel_3.add(vers);
		
		AV = new JTextField();
		AV.setColumns(10);
		AV.setBounds(457, 256, 117, 19);
		panel_3.add(AV);
		
		yes = new JRadioButton("YES");
		yes.setBounds(430, 321, 88, 21);
		panel_3.add(yes);
		btnGrp.add(yes);
		
		no = new JRadioButton("NO");
		no.setBounds(535, 321, 88, 21);
		panel_3.add(no);
		btnGrp.add(no);
		
		dateChooser = new JDateChooser();
		dateChooser.setBounds(127, 180, 121, 21);
		panel_3.add(dateChooser);
		
		dateChooser_1 = new JDateChooser();
		dateChooser_1.setBounds(127, 289, 121, 21);
		panel_3.add(dateChooser_1);
		
		JLabel lblNewLabel_3_11_1 = new JLabel("Feed back");
		lblNewLabel_3_11_1.setBounds(24, 349, 93, 13);
		panel_3.add(lblNewLabel_3_11_1);
		
		type = new JComboBox();
		type.setBounds(124, 241, 120, 17);
		panel_3.add(type);
		type.setModel(new DefaultComboBoxModel<>(new String[] {
				"telephone","mail","courrier"
		}));
		
		fb = new JComboBox();
		fb.setBounds(124, 345, 120, 17);
		panel_3.add(fb);
		fb.setModel(new DefaultComboBoxModel<>(new String[] {
				"demande_du_délai","Boîte_vocale","Pas_de_réponse"
		}));
		
		car = new JCheckBox("Careaux");
		car.setBounds(415, 124, 93, 21);
		panel_3.add(car);
		
		pav = new JCheckBox("Pav\u00E9s");
		pav.setBounds(530, 124, 93, 21);
		panel_3.add(pav);
		
		bord = new JCheckBox("Bordures_Agglos_Hourdis");
		bord.setBounds(436, 147, 169, 21);
		panel_3.add(bord);
		
		JLabel lblNewLabel_3_1 = new JLabel("CIN :");
		lblNewLabel_3_1.setBounds(24, 65, 93, 13);
		panel_3.add(lblNewLabel_3_1);
	}

	public void effacer() {
		cin.setText("");
		doss.setText("");
		mail.setText("");
		tel.setText("");
		vers.setText("");
		AV.setText("");
		name.setText("");
		btnGrp.clearSelection();	
	}
	
	public void ajouterClient() throws HeadlessException, SQLException {
		BDD db = new BDD("jdbc:sqlserver://localhost/Stage");
		ResultSet rs = db.querySelectAll("client");
		while(rs.next()) {
			if(rs.getString("cin").equals(cin.getText())) {
				JOptionPane.showMessageDialog(this,"Ce client est présent","Erreur", JOptionPane.ERROR_MESSAGE);
			}
		}
		ResultSet rs1 = db.fbSelectCommand(new String[] {"R_black"},new String[] {"utilisateur u","attr_menu a"},new Object[] 
				{"a.user_num=u.matricule","u.login like '" + Authentification.log +"'"});
		if(rs1.next()) {
			if(rs1.getInt("R_black") == 1) {
				if(yes.isSelected()) {
					Client c = new Client(cin.getText(),mail.getText(),name.getText(),Long.parseLong(tel.getText()),1);
					if(c.ajout_client()) JOptionPane.showMessageDialog(this,"CLIENT AJOUTÉ !!","Succès",
							JOptionPane.INFORMATION_MESSAGE);
					else JOptionPane.showMessageDialog(this,"Client n'est pas ajouté !!","Erreur", JOptionPane.ERROR_MESSAGE);
				}
				else if(no.isSelected()) {
					Client c = new Client(cin.getText(),mail.getText(),name.getText(),Long.parseLong(tel.getText()),0);
					if(c.ajout_client()) JOptionPane.showMessageDialog(this,"CLIENT AJOUTÉ !!","Succès",
							JOptionPane.INFORMATION_MESSAGE);
					else JOptionPane.showMessageDialog(this,"Client n'est pas ajouté !!","Erreur", JOptionPane.ERROR_MESSAGE);
				}
			}
		}
	}
	
	public int rechercher_UserNum() throws SQLException {
		BDD db = new BDD("jdbc:sqlserver://localhost/Stage");
		ResultSet rs = db.querySelectAll("utilisateur", "login like '" + Authentification.log +"'" );
		if(rs.next()) return rs.getInt("matricule");
		return 0;
	}
	
	public int rechercher_code_produit() throws SQLException {
		BDD db = new BDD("jdbc:sqlserver://localhost/Stage");
		ResultSet rs = null;
		if(car.isSelected()) {rs = db.querySelectAll("produit", "nom like 'Careaux'");}
		if(pav.isSelected()) {rs = db.querySelectAll("produit", "nom like 'Pavés'");}
		if(bord.isSelected()) {rs = db.querySelectAll("produit", "nom like 'Bordures_Agglos_Hourdis'");}
		if(car.isSelected() && pav.isSelected()) {rs = db.querySelectAll("produit", "nom like 'Careaux_Pavés'");}
		if(car.isSelected() && bord.isSelected()) {rs = db.querySelectAll("produit", "nom like 'Careaux_Bordures_Agglos_Hourdis'");}
		if(pav.isSelected() && bord.isSelected()) {rs = db.querySelectAll("produit", "nom like 'Pavés_Bordures_Agglos_Hourdis'");}
		if(car.isSelected() && pav.isSelected() && bord.isSelected()) {rs = db.querySelectAll("produit", "nom like 'Careaux_Pavés_Bordures_Agglos_Hourdis'");}
		if(rs.next()) return rs.getInt("produit_id");
		return 0;
	}
	
	public void ajouterEcheance() {
		Echéance e = new Echéance(Float.parseFloat(AV.getText()),doss.getText(),dateChooser_1.getDate());
		e.ajouterEcheance();
	}
	
	public void ajouterDossier() throws NumberFormatException, SQLException {
		Dossier d = new Dossier(doss.getText(),rechercher_code_produit(),Float.parseFloat(vers.getText()));
		d.ajoutDossier();
	}
}
