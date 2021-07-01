package Interfaces;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;
import keeptoo.KGradientPanel;
import javax.swing.UIManager;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import keeptoo.KTextField;
import javax.swing.JToggleButton;
import javax.swing.JRadioButton;
import java.awt.Font;
import java.awt.Color;

public class Blacklistage extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_4;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Blacklistage frame = new Blacklistage();
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
	public Blacklistage() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1060, 604);
		setTitle("Blacklister des clients");
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		KGradientPanel gradientPanel = new KGradientPanel();
		gradientPanel.kStartColor = UIManager.getColor("Button.shadow");
		gradientPanel.kEndColor = UIManager.getColor("Button.darkShadow");
		gradientPanel.kGradientFocus = 1000;
		gradientPanel.setBounds(0, 0, 1046, 91);
		contentPane.add(gradientPanel);
		gradientPanel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("GESTION DES CLIENTS");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setForeground(new Color(255, 0, 0));
		lblNewLabel.setFont(new Font("Microsoft JhengHei UI", Font.BOLD | Font.ITALIC, 20));
		lblNewLabel.setBounds(196, 10, 665, 41);
		gradientPanel.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("LES G\u00C9ANTS DU REVETEMENT");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setForeground(new Color(128, 0, 128));
		lblNewLabel_1.setFont(new Font("Microsoft JhengHei UI", Font.BOLD | Font.ITALIC, 20));
		lblNewLabel_1.setBounds(165, 40, 728, 41);
		gradientPanel.add(lblNewLabel_1);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(20, 158, 282, 399);
		contentPane.add(scrollPane);
		
		JPanel panel = new JPanel();
		scrollPane.setViewportView(panel);
		panel.setLayout(null);
		
		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(20, 44, 237, 92);
		panel.add(scrollPane_1);
		
		JPanel panel_1 = new JPanel();
		scrollPane_1.setViewportView(panel_1);
		panel_1.setLayout(null);
		
		textField = new JTextField();
		textField.setBounds(42, 49, 96, 19);
		panel_1.add(textField);
		textField.setColumns(10);
		
		JButton btnNewButton = new JButton();
		btnNewButton.setIcon(new javax.swing.ImageIcon("rechercher.png"));
		btnNewButton.setBounds(172, 38, 53, 42);
		panel_1.add(btnNewButton);
		
		JLabel lblNewLabel_4 = new JLabel(" CIN :");
		lblNewLabel_4.setBounds(10, 10, 119, 28);
		panel_1.add(lblNewLabel_4);
		
		JScrollPane scrollPane_2 = new JScrollPane();
		scrollPane_2.setBounds(20, 208, 237, 179);
		panel.add(scrollPane_2);
		
		JPanel panel_2 = new JPanel();
		scrollPane_2.setViewportView(panel_2);
		panel_2.setLayout(null);
		
		JButton btnAj = new JButton("Ajouter");
		btnAj.setBounds(68, 30, 95, 21);
		panel_2.add(btnAj);
		
		JButton btnSupp = new JButton("Supprimer");
		btnSupp.setBounds(68, 82, 95, 21);
		panel_2.add(btnSupp);
		
		JButton btnClose = new JButton("Fermer");
		btnClose.setBounds(68, 135, 95, 21);
		panel_2.add(btnClose);
		
		KGradientPanel gradientPanel_1 = new KGradientPanel();
		gradientPanel_1.kStartColor = UIManager.getColor("ComboBox.buttonShadow");
		gradientPanel_1.kEndColor = UIManager.getColor("ComboBox.buttonShadow");
		gradientPanel_1.setBounds(0, 0, 280, 397);
		panel.add(gradientPanel_1);
		gradientPanel_1.setLayout(null);
		
		JLabel lblNewLabel_3 = new JLabel("Rechercher :");
		lblNewLabel_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3.setFont(new Font("Sitka Small", Font.ITALIC, 20));
		lblNewLabel_3.setBounds(10, 10, 188, 30);
		gradientPanel_1.add(lblNewLabel_3);
		
		JLabel lblNewLabel_3_1 = new JLabel("Commande :");
		lblNewLabel_3_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3_1.setFont(new Font("Sitka Small", Font.ITALIC, 20));
		lblNewLabel_3_1.setBounds(10, 175, 188, 30);
		gradientPanel_1.add(lblNewLabel_3_1);
		
		JScrollPane scrollPane_3 = new JScrollPane();
		scrollPane_3.setBounds(458, 158, 578, 399);
		contentPane.add(scrollPane_3);
		
		JPanel panel_3 = new JPanel();
		scrollPane_3.setViewportView(panel_3);
		panel_3.setLayout(null);
		
		JLabel lblNewLabel_6_1 = new JLabel("Nom :");
		lblNewLabel_6_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_6_1.setBounds(32, 37, 138, 25);
		panel_3.add(lblNewLabel_6_1);
		
		ButtonGroup btnGrp = new ButtonGroup();
		
		KGradientPanel gradientPanel_2 = new KGradientPanel();
		gradientPanel_2.kStartColor = UIManager.getColor("ComboBox.buttonShadow");
		gradientPanel_2.kEndColor = UIManager.getColor("ComboBox.buttonShadow");
		gradientPanel_2.setBounds(0, 0, 576, 397);
		panel_3.add(gradientPanel_2);
		gradientPanel_2.setLayout(null);
		
		JLabel num = new JLabel("Num dossier :");
		num.setBounds(41, 214, 138, 25);
		gradientPanel_2.add(num);
		num.setHorizontalAlignment(SwingConstants.CENTER);
		
		JLabel lblNewLabel_6_2 = new JLabel("Pr\u00E9nom :");
		lblNewLabel_6_2.setBounds(41, 120, 138, 25);
		gradientPanel_2.add(lblNewLabel_6_2);
		lblNewLabel_6_2.setHorizontalAlignment(SwingConstants.CENTER);
		
		textField_2 = new JTextField();
		textField_2.setBounds(256, 123, 182, 19);
		gradientPanel_2.add(textField_2);
		textField_2.setColumns(10);
		
		textField_4 = new JTextField();
		textField_4.setBounds(256, 217, 182, 19);
		gradientPanel_2.add(textField_4);
		textField_4.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(256, 39, 182, 19);
		gradientPanel_2.add(textField_1);
		textField_1.setColumns(10);
		
		JLabel blacklist = new JLabel("Blacklist\u00E9 :");
		blacklist.setBounds(41, 310, 138, 25);
		gradientPanel_2.add(blacklist);
		blacklist.setHorizontalAlignment(SwingConstants.CENTER);
		
		JRadioButton non = new JRadioButton("Non");
		non.setBounds(408, 312, 103, 21);
		gradientPanel_2.add(non);
		btnGrp.add(non);
		
		JRadioButton oui = new JRadioButton("Oui");
		oui.setBounds(231, 312, 103, 21);
		gradientPanel_2.add(oui);
		btnGrp.add(oui);
		
		JLabel lblNewLabel_2 = new JLabel("Action");
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setFont(new Font("Malgun Gothic", Font.PLAIN, 20));
		lblNewLabel_2.setBounds(0, 112, 160, 36);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_2_1 = new JLabel("Infos du contact");
		lblNewLabel_2_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2_1.setFont(new Font("Malgun Gothic", Font.PLAIN, 20));
		lblNewLabel_2_1.setBounds(475, 112, 160, 36);
		contentPane.add(lblNewLabel_2_1);
	}
}
