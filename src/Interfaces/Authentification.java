package Interfaces;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.UIManager;

import Classes.*;

import javax.swing.SwingConstants;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import keeptoo.KGradientPanel;
import keeptoo.KButton;
import javax.swing.JPasswordField;
import java.awt.SystemColor;
import javax.swing.JRadioButton;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.awt.event.ActionEvent;

public class Authentification extends JFrame {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JTextField username;
	private JPasswordField pwd;
	private JRadioButton rdbtnAdmin, rdbtnUser;
	private ButtonGroup btnGrp;
	public static String log = ""; 

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Authentification frame = new Authentification();
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
	public Authentification() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 595, 390);
		getContentPane().setLayout(null);
		
		KGradientPanel gradientPanel = new KGradientPanel();
		gradientPanel.kGradientFocus = 1000;
		gradientPanel.kStartColor = SystemColor.activeCaption;
		gradientPanel.kEndColor = SystemColor.menu;
		gradientPanel.setBounds(105, 77, 349, 266);
		getContentPane().add(gradientPanel);
		gradientPanel.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("Username");
		lblNewLabel_1.setForeground(UIManager.getColor("RadioButton.highlight"));
		lblNewLabel_1.setFont(new Font("Cambria", Font.BOLD, 15));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setBounds(25, 36, 85, 19);
		gradientPanel.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("Password");
		lblNewLabel_1_1.setForeground(UIManager.getColor("RadioButton.highlight"));
		lblNewLabel_1_1.setFont(new Font("Cambria", Font.BOLD, 15));
		lblNewLabel_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_1.setBounds(25, 101, 85, 19);
		gradientPanel.add(lblNewLabel_1_1);
		
		username = new JTextField();
		username.setBounds(182, 38, 125, 19);
		gradientPanel.add(username);
		username.setColumns(10);
		
		pwd = new JPasswordField();
		pwd.setBounds(182, 103, 125, 19);
		gradientPanel.add(pwd);
		
		btnGrp = new ButtonGroup();
		
		rdbtnAdmin = new JRadioButton("Admin");
		rdbtnAdmin.setFont(new Font("Tahoma", Font.PLAIN, 13));
		rdbtnAdmin.setBounds(142, 168, 85, 25);
		gradientPanel.add(rdbtnAdmin);
		btnGrp.add(rdbtnAdmin);
		
		rdbtnUser = new JRadioButton("User");
		rdbtnUser.setFont(new Font("Tahoma", Font.PLAIN, 13));
		rdbtnUser.setBounds(244, 169, 85, 25);
		gradientPanel.add(rdbtnUser);
		btnGrp.add(rdbtnUser);
		
		JButton btnLgn = new JButton("LOGIN");
		btnLgn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					jButtonActionPerformed(e);
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				log = username.getText();
			}
		});
		
		btnLgn.setForeground(new Color(255, 255, 255));
		btnLgn.setBackground(new Color(0, 128, 0));
		btnLgn.setBounds(46, 222, 85, 21);
		gradientPanel.add(btnLgn);
		
		JButton btnClr = new JButton("CLEAR");
		btnClr.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				jButtonClear(e);
			}
		});
		
		btnClr.setForeground(new Color(255, 255, 255));
		btnClr.setBackground(new Color(255, 0, 0));
		btnClr.setBounds(208, 222, 85, 21);
		gradientPanel.add(btnClr);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("Type :");
		lblNewLabel_1_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_1_1.setForeground(Color.WHITE);
		lblNewLabel_1_1_1.setFont(new Font("Cambria", Font.BOLD, 15));
		lblNewLabel_1_1_1.setBounds(25, 168, 85, 19);
		gradientPanel.add(lblNewLabel_1_1_1);
		
		KGradientPanel gradientPanel_1 = new KGradientPanel();
		gradientPanel_1.kGradientFocus = 1000;
		gradientPanel_1.kStartColor = SystemColor.activeCaption;
		gradientPanel_1.kEndColor = SystemColor.menu;
		gradientPanel_1.setBounds(0, 0, 581, 77);
		getContentPane().add(gradientPanel_1);
		gradientPanel_1.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Authentification");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setFont(new Font("Arial", Font.BOLD, 49));
		lblNewLabel.setBounds(97, 10, 397, 47);
		gradientPanel_1.add(lblNewLabel);
	}
	
	public void jButtonClear(ActionEvent e) {
		username.setText("");
		pwd.setText("");
		btnGrp.clearSelection();
	}
	
	public void jButtonActionPerformed( ActionEvent e) throws SQLException {
		if(username.getText().equals("") || pwd.getPassword().toString().equals("")) {
			JOptionPane.showMessageDialog(this,"Saisir les informations demandées"," Erreur d'authentification", JOptionPane.ERROR_MESSAGE);
		}
		else if(rdbtnAdmin.isSelected()) {
			Admin a = new Admin(username.getText(),pwd.getPassword().toString());
			if(!a.authentificate()) {
				JOptionPane.showMessageDialog(this,"Cet administrateur n'est pas présent"," Erreur d'authentification", 
						JOptionPane.ERROR_MESSAGE);
				jButtonClear(e);
			}
			else {
				Home h = new Home();
				h.setVisible(true);
				setVisible(false);
			}	
		}
		else if(rdbtnUser.isSelected()) {
			User u = new User(username.getText(),pwd.getPassword().toString());
			if(!u.authentificate()) {
				JOptionPane.showMessageDialog(this,"Cet utilisateur n'est pas présent"," Erreur d'authentification", 
						JOptionPane.ERROR_MESSAGE);
				jButtonClear(e);
			}
			else {
				Home h = new Home();
				h.setVisible(true);
				setVisible(false);
			}	
		}
		else {
			JOptionPane.showMessageDialog(this,"Veuillez choisir votre type de profil"," Erreur d'authentification", JOptionPane.ERROR_MESSAGE);
		}
	}
}
