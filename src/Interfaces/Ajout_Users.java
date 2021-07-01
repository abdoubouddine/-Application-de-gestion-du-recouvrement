package Interfaces;

import java.awt.BorderLayout;
import Classes.*;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import keeptoo.KGradientPanel;
import java.awt.SystemColor;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JPasswordField;
import java.awt.Font;
import java.awt.Color;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.awt.event.ActionEvent;

public class Ajout_Users extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField lgn;
	private JTextField matricule;
	private JTextField nom;
	private JTextField prenom;
	private JTextField mail;
	private JTextField login;
	private JPasswordField pwd;
	private JPasswordField Cpwd;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ajout_Users frame = new Ajout_Users();
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
	public Ajout_Users() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1057, 599);
		setTitle("Ajouter des utilisateurs");
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		KGradientPanel gradientPanel = new KGradientPanel();
		gradientPanel.kGradientFocus = 1000;
		gradientPanel.kStartColor = SystemColor.activeCaptionBorder;
		gradientPanel.kEndColor = SystemColor.windowBorder;
		gradientPanel.setBounds(0, 0, 1043, 84);
		contentPane.add(gradientPanel);
		gradientPanel.setLayout(null);
		
		JLabel lblGestionDesUtilisateurs = new JLabel("GESTION DES UTILISATEURS");
		lblGestionDesUtilisateurs.setHorizontalAlignment(SwingConstants.CENTER);
		lblGestionDesUtilisateurs.setForeground(Color.RED);
		lblGestionDesUtilisateurs.setFont(new Font("Microsoft JhengHei UI", Font.BOLD | Font.ITALIC, 20));
		lblGestionDesUtilisateurs.setBounds(195, 10, 665, 41);
		gradientPanel.add(lblGestionDesUtilisateurs);
		
		JLabel lblNewLabel_1_2 = new JLabel("LES G\u00C9ANTS DU REVETEMENT");
		lblNewLabel_1_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_2.setForeground(new Color(128, 0, 128));
		lblNewLabel_1_2.setFont(new Font("Microsoft JhengHei UI", Font.BOLD | Font.ITALIC, 20));
		lblNewLabel_1_2.setBounds(155, 43, 728, 41);
		gradientPanel.add(lblNewLabel_1_2);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(38, 181, 335, 371);
		contentPane.add(scrollPane);
		
		JPanel panel = new JPanel();
		scrollPane.setViewportView(panel);
		panel.setLayout(null);
		
		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(38, 62, 269, 95);
		panel.add(scrollPane_1);
		
		JPanel panel_1 = new JPanel();
		scrollPane_1.setViewportView(panel_1);
		panel_1.setLayout(null);
		
		JLabel labelL = new JLabel("Nom :");
		labelL.setBounds(10, 41, 62, 19);
		panel_1.add(labelL);
		
		lgn = new JTextField();
		lgn.setBounds(79, 41, 123, 19);
		panel_1.add(lgn);
		lgn.setColumns(10);
		
		
		
		JScrollPane scrollPane_2 = new JScrollPane();
		scrollPane_2.setBounds(38, 215, 269, 144);
		panel.add(scrollPane_2);
		
		JPanel panel_2 = new JPanel();
		scrollPane_2.setViewportView(panel_2);
		panel_2.setLayout(null);
		
		JButton btnV = new JButton("Valider");
		btnV.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ajouter();
			}
		});
		btnV.setBounds(89, 23, 85, 21);
		panel_2.add(btnV);
		
		JButton btnClr = new JButton("Effacer");
		btnClr.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				effacer();
			}
		});
		btnClr.setBounds(89, 67, 85, 21);
		panel_2.add(btnClr);
		
		JButton btnClose = new JButton("Fermer");
		btnClose.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
			}
		});
		btnClose.setBounds(89, 111, 85, 21);
		panel_2.add(btnClose);
		
		KGradientPanel gradientPanel_1 = new KGradientPanel();
		gradientPanel_1.kGradientFocus = 1000;
		gradientPanel_1.kStartColor = SystemColor.activeCaptionBorder;
		gradientPanel_1.kEndColor = SystemColor.windowBorder;
		gradientPanel_1.setBounds(0, 0, 333, 369);
		panel.add(gradientPanel_1);
		gradientPanel_1.setLayout(null);
		
		JLabel lblNewLabel_3_1 = new JLabel("Rechercher :");
		lblNewLabel_3_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3_1.setFont(new Font("Sitka Small", Font.ITALIC, 20));
		lblNewLabel_3_1.setBounds(10, 23, 188, 30);
		gradientPanel_1.add(lblNewLabel_3_1);
		
		JLabel lblNewLabel_3_1_1 = new JLabel("Commande :");
		lblNewLabel_3_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3_1_1.setFont(new Font("Sitka Small", Font.ITALIC, 20));
		lblNewLabel_3_1_1.setBounds(10, 173, 188, 30);
		gradientPanel_1.add(lblNewLabel_3_1_1);
		
		JScrollPane scrollPane_3 = new JScrollPane();
		scrollPane_3.setBounds(440, 181, 566, 371);
		contentPane.add(scrollPane_3);
		
		JPanel panel_3 = new JPanel();
		scrollPane_3.setViewportView(panel_3);
		panel_3.setLayout(null);
		
		JLabel lblNewLabel_4 = new JLabel("Matricule :");
		lblNewLabel_4.setBounds(23, 40, 93, 20);
		panel_3.add(lblNewLabel_4);
		
		JLabel lblNewLabel_4_1 = new JLabel("Nom :");
		lblNewLabel_4_1.setBounds(23, 120, 93, 20);
		panel_3.add(lblNewLabel_4_1);
		
		JLabel lblNewLabel_4_2 = new JLabel("Pr\u00E9nom :");
		lblNewLabel_4_2.setBounds(23, 199, 93, 20);
		panel_3.add(lblNewLabel_4_2);
		
		JLabel lblNewLabel_4_3 = new JLabel("Mail :");
		lblNewLabel_4_3.setBounds(23, 285, 93, 20);
		panel_3.add(lblNewLabel_4_3);
		
		JLabel lblNewLabel_4_4 = new JLabel("Login :");
		lblNewLabel_4_4.setBounds(302, 81, 93, 20);
		panel_3.add(lblNewLabel_4_4);
		
		JLabel lblNewLabel_4_5 = new JLabel("Password :");
		lblNewLabel_4_5.setBounds(291, 159, 104, 20);
		panel_3.add(lblNewLabel_4_5);
		
		JLabel lblNewLabel_4_6 = new JLabel("Confirm the password :");
		lblNewLabel_4_6.setBounds(264, 241, 131, 20);
		panel_3.add(lblNewLabel_4_6);
		
		matricule = new JTextField();
		matricule.setBounds(127, 41, 96, 19);
		panel_3.add(matricule);
		matricule.setColumns(10);
		
		nom = new JTextField();
		nom.setColumns(10);
		nom.setBounds(127, 121, 96, 19);
		panel_3.add(nom);
		
		prenom = new JTextField();
		prenom.setColumns(10);
		prenom.setBounds(127, 200, 96, 19);
		panel_3.add(prenom);
		
		mail = new JTextField();
		mail.setColumns(10);
		mail.setBounds(126, 286, 96, 19);
		panel_3.add(mail);
		
		login = new JTextField();
		login.setColumns(10);
		login.setBounds(409, 82, 96, 19);
		panel_3.add(login);
		
		pwd = new JPasswordField();
		pwd.setBounds(407, 160, 98, 20);
		panel_3.add(pwd);
		
		Cpwd = new JPasswordField();
		Cpwd.setBounds(407, 242, 98, 20);
		panel_3.add(Cpwd);
		
		setTextField(false);
		
		JButton btnRech = new JButton();
		btnRech.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				rechercher();
			}
		});
		btnRech.setIcon(new javax.swing.ImageIcon("rechercher.png"));
		btnRech.setBounds(212, 31, 45, 40);
		panel_1.add(btnRech);
		
		KGradientPanel gradientPanel_2 = new KGradientPanel();
		gradientPanel_2.kGradientFocus = 1000;
		gradientPanel_2.kStartColor = SystemColor.activeCaptionBorder;
		gradientPanel_2.kEndColor = SystemColor.windowBorder;
		gradientPanel_2.setBounds(0, 0, 564, 369);
		panel_3.add(gradientPanel_2);
		gradientPanel_2.setLayout(null);
		
		JLabel lblNewLabel_2_1 = new JLabel("Action");
		lblNewLabel_2_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2_1.setFont(new Font("Malgun Gothic", Font.BOLD, 23));
		lblNewLabel_2_1.setBounds(21, 135, 160, 36);
		contentPane.add(lblNewLabel_2_1);
		
		JLabel lblNewLabel_2_1_1 = new JLabel("Informations de l'utilisateur :");
		lblNewLabel_2_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2_1_1.setFont(new Font("Malgun Gothic", Font.BOLD, 23));
		lblNewLabel_2_1_1.setBounds(462, 135, 383, 36);
		contentPane.add(lblNewLabel_2_1_1);
		
	}
	
	public void setTextField(boolean b) {
		matricule.setEditable(b);
		nom.setEditable(b);
		prenom.setEditable(b);
		mail.setEditable(b);
		login.setEditable(b);
		pwd.setEditable(b);
		Cpwd.setEditable(b);
	}
	
	public void effacer() {
		matricule.setText("");
		nom.setText("");
		prenom.setText("");
		mail.setText("");
		login.setText("");
		pwd.setText("");
		Cpwd.setText("");
	}
	
	public void rechercher() {
		User u = new User();
		try {
			if(!u.rechercher_user(lgn.getText())){
				setTextField(true);
			}
			else {
				JOptionPane.showMessageDialog(this,"Cet utilisateur est présent"," Erreur", 
						JOptionPane.ERROR_MESSAGE);
			}
		} catch (SQLException e1) {
			e1.printStackTrace();
		}
	}
	
	public void ajouter() {
		if(!matricule.getText().equals("") && !nom.getText().equals("") && !prenom.getText().equals("") && !mail.getText().equals("") && 
				!login.getText().equals("") && !pwd.getPassword().toString().equals("") && !Cpwd.getPassword().toString().equals("")) {
			if(!pwd.getPassword().toString().equals(Cpwd.getPassword().toString())) {
				JOptionPane.showMessageDialog(this,"Attention !! Il y a une différence entre le mot de passe et sa confirmation",
						" Warning ",JOptionPane.WARNING_MESSAGE);
				Cpwd.setText("");
			}
			else {
				User u = new User(matricule.getText(),login.getText(),pwd.getPassword().toString(),nom.getText(),
						prenom.getText(),mail.getText());
				if(u.ajout_user()) JOptionPane.showMessageDialog(this,"Utilisateur ajouté","Succès",JOptionPane.INFORMATION_MESSAGE);
				else JOptionPane.showMessageDialog(this,"L'utilisateur n'est pas ajouté","Erreur",JOptionPane.ERROR_MESSAGE);
			}
		}
		else {
			JOptionPane.showMessageDialog(this,"Remplissez tous les champs !","Erreur",JOptionPane.ERROR_MESSAGE);
		}
	}
}
