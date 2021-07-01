package Interfaces;

import java.awt.EventQueue;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Classes.*;

import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import keeptoo.KGradientPanel;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.awt.event.ActionEvent;

public class Home extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JMenuItem users_1,clts_1,perso,users,clients,suivi,clts;
	private JMenu ajouter,editer,blacklist,afficher;
	private JMenuItem acces;
	private JMenu mntat;
	private JMenuItem recap;
	private JMenuItem recap1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Home frame = new Home();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 * @throws SQLException 
	 */
	public Home() throws SQLException {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1056, 546);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		java.awt.Image panel1 = new ImageIcon("GR.png").getImage();
		java.awt.Image panel1_1 = panel1.getScaledInstance(986,432,java.awt.Image.SCALE_SMOOTH);
		ImageIcon panel1_2 = new ImageIcon(panel1_1);
		
		JMenuBar menuBar = new JMenuBar();
		menuBar.setBounds(0, 0, 1042, 36);
		contentPane.add(menuBar);
		
		ajouter = new JMenu("Ajouter");
		ajouter.setHorizontalAlignment(SwingConstants.CENTER);
		menuBar.add(ajouter);
		
		users_1 = new JMenuItem("Utilisateurs");
		users_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Ajout_Users User = new Ajout_Users();
				User.setVisible(true);
			}
		});
		ajouter.add(users_1);
		
		clts_1 = new JMenuItem("Clients");
		clts_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Add_Clients Clt = new Add_Clients();
				Clt.setVisible(true);
			}
		});
		ajouter.add(clts_1);
		
		editer = new JMenu("\u00C9diter");
		menuBar.add(editer);
		
		perso = new JMenuItem("Infos personnelles");
		perso.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Infos_perso info = new Infos_perso();
				info.setVisible(true);
			}
		});
		editer.add(perso);
		
		users = new JMenuItem("Utilisateurs");
		users.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Modif_Users User_1 = new Modif_Users();
				User_1.setVisible(true);
			}
		});
		editer.add(users);
		
		clients = new JMenuItem("Clients");
		clients.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Modif_Supp_Clients Clt_1 = new Modif_Supp_Clients();
				Clt_1.setVisible(true);
			}
		});
		editer.add(clients);
		
		acces = new JMenuItem("Acc\u00E8s des users");
		editer.add(acces);
		
		blacklist = new JMenu("Blacklister");
		blacklist.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Blacklistage black_list = new Blacklistage();
				black_list.setVisible(true);
			}
		});
		menuBar.add(blacklist);
		
		afficher = new JMenu("Afficher");
		menuBar.add(afficher);
		
		suivi = new JMenuItem("Suivi des users");
		suivi.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Suivi_users suivi = new Suivi_users();
				suivi.setVisible(true);
			}
		});
		afficher.add(suivi);
		
		clts = new JMenuItem("Clients");
		clts.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Affich_Clients clts_3 = new Affich_Clients();
				clts_3.setVisible(true);
			}
		});
		afficher.add(clts);
		
		mntat = new JMenu("\u00C9tat");
		menuBar.add(mntat);
		
		recap = new JMenuItem("R\u00E9cap mensuel");
		recap.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Recap_mensuel r = new Recap_mensuel();
				r.setVisible(true);
			}
		});
		mntat.add(recap);
		
		recap1 = new JMenuItem("R\u00E9cap annuel ");
		recap1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Affich_Clients clts_3 = new Affich_Clients();
				clts_3.setVisible(true);
			}
		});
		mntat.add(recap1);
		
		JMenu deco = new JMenu("D\u00E9connexion");
		deco.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Authentification a = new Authentification(); 
				a.setVisible(true);
				setVisible(false);
			}
		});
		menuBar.add(deco);
		
		JLabel lblNewLabel = new JLabel("Gestion du Recouvrement");
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setFont(new Font("Comic Sans MS", Font.BOLD | Font.ITALIC, 30));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(128, 66, 764, 73);
		contentPane.add(lblNewLabel);
		
		KGradientPanel gradientPanel = new KGradientPanel();
		gradientPanel.kGradientFocus = 1000;
		gradientPanel.kStartColor = new Color(153, 50, 204);
		gradientPanel.kEndColor = new Color(139, 0, 139);
		gradientPanel.setBounds(128, 56, 764, 96);
		contentPane.add(gradientPanel);
		
		JLabel lblNewLabel_1 = new JLabel("",panel1_2,JLabel.CENTER);
		lblNewLabel_1.setBounds(42, 184, 963, 304);
		contentPane.add(lblNewLabel_1);
		
		this.attribuer_menu();
	}
	
	public void attribuer_menu() throws SQLException {
		if(!Authentification.log.equals("")) {
			attr_menu m = new attr_menu(Authentification.log);
			attr_menu m_1 = m.chercher_attr_menu();
			if(m_1.getR_ajout() == 0) {
				ajouter.setEnabled(false);
			}
			if(m_1.getR_modif() == 0) {
				editer.setEnabled(false);
			}
			if(m_1.getR_black() == 0) {
				blacklist.setEnabled(false);
			}
			if(m_1.getE_mois() == 0) {
				recap.setEnabled(false);
			}
			if(m_1.getE_an() == 0) {
				recap1.setEnabled(false);
			}
			if(m_1.getG_user_ajout() == 0) {
				users_1.setEnabled(false);
			}
			if(m_1.getG_user_modif_supp() == 0) {
				users.setEnabled(false);
			}
			if(m_1.getG_acces() == 0) {
				acces.setEnabled(false);
			}
			if(m_1.getG_menu() == 0) {
				suivi.setEnabled(false);
			}
			if(m_1.getG_infos() == 0) {
				perso.setEnabled(false);
			}
			if(m_1.getL_clients() == 0) {
				clts.setEnabled(false);
			}
		}
	}
}
