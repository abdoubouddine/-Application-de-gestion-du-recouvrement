package Interfaces;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import keeptoo.KGradientPanel;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.SwingConstants;
import java.awt.Font;

public class Infos_perso extends JFrame {

	private JPanel contentPane;
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
					Infos_perso frame = new Infos_perso();
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
	public Infos_perso() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1004, 592);
		setTitle("Informations personnelles");
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		KGradientPanel gradientPanel = new KGradientPanel();
		gradientPanel.kGradientFocus = 1000;
		gradientPanel.kStartColor = new Color(107, 142, 35);
		gradientPanel.kEndColor = new Color(0, 100, 0);
		gradientPanel.setBounds(0, 0, 990, 96);
		contentPane.add(gradientPanel);
		gradientPanel.setLayout(null);
		
		JLabel lblGestionDesInfos = new JLabel("GESTION DES INFOS PERSONNELLES");
		lblGestionDesInfos.setHorizontalAlignment(SwingConstants.CENTER);
		lblGestionDesInfos.setForeground(Color.RED);
		lblGestionDesInfos.setFont(new Font("Microsoft JhengHei UI", Font.BOLD | Font.ITALIC, 20));
		lblGestionDesInfos.setBounds(163, 10, 665, 41);
		gradientPanel.add(lblGestionDesInfos);
		
		JLabel lblNewLabel_1 = new JLabel("LES G\u00C9ANTS DU REVETEMENT");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setForeground(Color.WHITE);
		lblNewLabel_1.setFont(new Font("Microsoft JhengHei UI", Font.BOLD | Font.ITALIC, 20));
		lblNewLabel_1.setBounds(129, 45, 728, 41);
		gradientPanel.add(lblNewLabel_1);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(20, 173, 280, 354);
		contentPane.add(scrollPane);
		
		JPanel panel = new JPanel();
		scrollPane.setViewportView(panel);
		panel.setLayout(null);
		
		JScrollPane scrollPane_2 = new JScrollPane();
		scrollPane_2.setBounds(44, 119, 184, 172);
		panel.add(scrollPane_2);
		
		JPanel panel_1 = new JPanel();
		scrollPane_2.setViewportView(panel_1);
		panel_1.setLayout(null);
		
		JButton btnClr = new JButton("Vider");
		btnClr.setForeground(Color.WHITE);
		btnClr.setBackground(Color.BLUE);
		btnClr.setBounds(45, 35, 85, 21);
		panel_1.add(btnClr);
		
		JButton btnClose = new JButton("Fermer");
		btnClose.setForeground(Color.WHITE);
		btnClose.setBackground(Color.RED);
		btnClose.setBounds(45, 113, 85, 21);
		panel_1.add(btnClose);
		
		KGradientPanel gradientPanel_1 = new KGradientPanel();
		gradientPanel_1.kStartColor = new Color(127, 255, 0);
		gradientPanel_1.kEndColor = new Color(255, 228, 181);
		gradientPanel_1.setBounds(0, 0, 278, 352);
		panel.add(gradientPanel_1);
		gradientPanel_1.setLayout(null);
		
		JLabel lblNewLabel_3_1 = new JLabel("Commande :");
		lblNewLabel_3_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3_1.setFont(new Font("Sitka Small", Font.ITALIC, 20));
		lblNewLabel_3_1.setBounds(42, 53, 188, 30);
		gradientPanel_1.add(lblNewLabel_3_1);
		
		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(379, 172, 565, 354);
		contentPane.add(scrollPane_1);
		
		JPanel panel_2 = new JPanel();
		scrollPane_1.setViewportView(panel_2);
		panel_2.setLayout(null);
		
		JScrollPane scrollPane_3 = new JScrollPane();
		scrollPane_3.setBounds(61, 75, 469, 249);
		panel_2.add(scrollPane_3);
		
		JPanel panel_3 = new JPanel();
		scrollPane_3.setViewportView(panel_3);
		panel_3.setLayout(null);
		
		JLabel lblNewLabel_5 = new JLabel("Mail :");
		lblNewLabel_5.setBounds(26, 28, 84, 26);
		panel_3.add(lblNewLabel_5);
		
		JLabel lblNewLabel_5_1 = new JLabel("Login :");
		lblNewLabel_5_1.setBounds(26, 86, 84, 26);
		panel_3.add(lblNewLabel_5_1);
		
		JLabel lblNewLabel_5_2 = new JLabel("Password :");
		lblNewLabel_5_2.setBounds(26, 142, 84, 26);
		panel_3.add(lblNewLabel_5_2);
		
		JLabel lblNewLabel_5_3 = new JLabel("Confirm the password :");
		lblNewLabel_5_3.setBounds(26, 200, 133, 26);
		panel_3.add(lblNewLabel_5_3);
		
		mail = new JTextField();
		mail.setBounds(169, 32, 124, 19);
		panel_3.add(mail);
		mail.setColumns(10);
		
		login = new JTextField();
		login.setColumns(10);
		login.setBounds(169, 90, 124, 19);
		panel_3.add(login);
		
		pwd = new JPasswordField();
		pwd.setBounds(169, 146, 124, 19);
		panel_3.add(pwd);
		
		Cpwd = new JPasswordField();
		Cpwd.setBounds(169, 204, 124, 19);
		panel_3.add(Cpwd);
		
		JButton mod1 = new JButton();
		mod1.setIcon(new javax.swing.ImageIcon("modifier.png"));
		mod1.setBounds(346, 26, 53, 28);
		panel_3.add(mod1);
		
		JButton mod2 = new JButton();
		mod2.setIcon(new javax.swing.ImageIcon("modifier.png"));
		mod2.setBounds(346, 86, 53, 26);
		panel_3.add(mod2);
		
		JButton mod3 = new JButton();
		mod3.setIcon(new javax.swing.ImageIcon("modifier.png"));
		mod3.setBounds(346, 142, 53, 26);
		panel_3.add(mod3);
		
		KGradientPanel gradientPanel_2 = new KGradientPanel();
		gradientPanel_2.kEndColor = new Color(255, 228, 196);
		gradientPanel_2.kStartColor = new Color(127, 255, 0);
		gradientPanel_2.setBounds(0, 0, 563, 352);
		panel_2.add(gradientPanel_2);
		gradientPanel_2.setLayout(null);
		
		JLabel lblNewLabel_3_1_1 = new JLabel("Donn\u00E9es personnelles :");
		lblNewLabel_3_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3_1_1.setFont(new Font("Sitka Small", Font.ITALIC, 20));
		lblNewLabel_3_1_1.setBounds(60, 30, 263, 30);
		gradientPanel_2.add(lblNewLabel_3_1_1);
		
		JLabel lblNewLabel_2 = new JLabel("Action");
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setFont(new Font("Malgun Gothic", Font.PLAIN, 20));
		lblNewLabel_2.setBounds(10, 125, 160, 36);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_2_1 = new JLabel("Param\u00E8tres");
		lblNewLabel_2_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2_1.setFont(new Font("Malgun Gothic", Font.PLAIN, 20));
		lblNewLabel_2_1.setBounds(395, 125, 160, 36);
		contentPane.add(lblNewLabel_2_1);
	}
}
