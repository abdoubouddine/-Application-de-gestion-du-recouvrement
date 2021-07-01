package Interfaces;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.SystemColor;
import javax.swing.border.MatteBorder;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JComboBox;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import keeptoo.KButton;
import keeptoo.KGradientPanel;
import javax.swing.UIManager;
import java.awt.Font;
import javax.swing.SwingConstants;

public class Recap_mensuel extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField autoVers;
	private JTextField CA;
	private JTextField vers;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Recap_mensuel frame = new Recap_mensuel();
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
	public Recap_mensuel() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 758, 732);
		setTitle("Récapitulatif mensuel");
		contentPane = new JPanel();
		contentPane.setForeground(SystemColor.infoText);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBorder(new MatteBorder(0, 0, 3, 0, (Color) new Color(255, 0, 0)));
		panel.setBackground(SystemColor.text);
		panel.setBounds(0, 0, 744, 84);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblRcapitulatif = new JLabel("R\u00E9capitulatif");
		lblRcapitulatif.setHorizontalAlignment(SwingConstants.CENTER);
		lblRcapitulatif.setForeground(Color.RED);
		lblRcapitulatif.setFont(new Font("Microsoft JhengHei UI", Font.BOLD | Font.ITALIC, 20));
		lblRcapitulatif.setBounds(36, 10, 665, 41);
		panel.add(lblRcapitulatif);
		
		JLabel lblNewLabel_1 = new JLabel("LES G\u00C9ANTS DU REVETEMENT");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setForeground(new Color(128, 0, 128));
		lblNewLabel_1.setFont(new Font("Microsoft JhengHei UI", Font.BOLD | Font.ITALIC, 20));
		lblNewLabel_1.setBounds(36, 43, 665, 41);
		panel.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Choisir le mois / l'ann\u00E9e :");
		lblNewLabel_2.setForeground(Color.GRAY);
		lblNewLabel_2.setFont(new Font("Microsoft YaHei UI", Font.ITALIC, 17));
		lblNewLabel_2.setBounds(10, 114, 226, 29);
		contentPane.add(lblNewLabel_2);
		
		JComboBox mois = new JComboBox();
		mois.setBounds(283, 114, 191, 29);
		contentPane.add(mois);
		
		JButton btnOK = new JButton("OK");
		btnOK.setBounds(559, 114, 54, 29);
		contentPane.add(btnOK);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 197, 346, 515);
		contentPane.add(scrollPane);
		
		JPanel panel_1 = new JPanel();
		scrollPane.setViewportView(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel_4 = new JLabel("Contacts \u00E9mis :");
		lblNewLabel_4.setForeground(Color.DARK_GRAY);
		lblNewLabel_4.setFont(new Font("Trebuchet MS", Font.ITALIC, 14));
		lblNewLabel_4.setBounds(10, 29, 113, 27);
		panel_1.add(lblNewLabel_4);
		
		textField = new JTextField();
		textField.setBounds(152, 33, 156, 27);
		panel_1.add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel_4_1 = new JLabel("Nombre :");
		lblNewLabel_4_1.setFont(new Font("Tempus Sans ITC", Font.BOLD | Font.ITALIC, 13));
		lblNewLabel_4_1.setForeground(Color.DARK_GRAY);
		lblNewLabel_4_1.setBounds(152, 0, 74, 27);
		panel_1.add(lblNewLabel_4_1);
		
		JScrollPane scrollPane_2 = new JScrollPane();
		scrollPane_2.setBounds(10, 135, 324, 328);
		panel_1.add(scrollPane_2);
		
		JPanel panel_2 = new JPanel();
		scrollPane_2.setViewportView(panel_2);
		panel_2.setLayout(null);
		
		JLabel lblNewLabel_4_2_1 = new JLabel("Visite pr\u00E9vue ");
		lblNewLabel_4_2_1.setBounds(21, 28, 82, 27);
		panel_2.add(lblNewLabel_4_2_1);
		
		JLabel lblNewLabel_4_2_2 = new JLabel("N\u00B0Erron\u00E9/Bo\u00EEte Vocale / \u00C9teint ");
		lblNewLabel_4_2_2.setBounds(10, 90, 181, 27);
		panel_2.add(lblNewLabel_4_2_2);
		
		JLabel lblNewLabel_4_2_3 = new JLabel("Pas de r\u00E9ponse");
		lblNewLabel_4_2_3.setBounds(21, 161, 82, 27);
		panel_2.add(lblNewLabel_4_2_3);
		
		JLabel lblNewLabel_4_2_4 = new JLabel("Autorisation de versement");
		lblNewLabel_4_2_4.setBounds(10, 236, 150, 27);
		panel_2.add(lblNewLabel_4_2_4);
		
		textField_1 = new JTextField();
		textField_1.setBounds(124, 32, 167, 27);
		panel_2.add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(191, 94, 121, 27);
		panel_2.add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(124, 165, 167, 27);
		panel_2.add(textField_3);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(170, 240, 142, 27);
		panel_2.add(textField_4);
		
		KGradientPanel gradientPanel = new KGradientPanel();
		gradientPanel.kStartColor = Color.ORANGE;
		gradientPanel.kEndColor = Color.YELLOW;
		gradientPanel.setBounds(0, 0, 344, 545);
		panel_1.add(gradientPanel);
		gradientPanel.setLayout(null);
		
		JLabel lblNewLabel_2_1_1 = new JLabel("Feedback");
		lblNewLabel_2_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2_1_1.setFont(new Font("Malgun Gothic", Font.BOLD, 23));
		lblNewLabel_2_1_1.setBounds(10, 92, 160, 36);
		gradientPanel.add(lblNewLabel_2_1_1);
		
		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(368, 198, 366, 407);
		contentPane.add(scrollPane_1);
		
		JPanel panel_3 = new JPanel();
		scrollPane_1.setViewportView(panel_3);
		panel_3.setLayout(null);
		
		KGradientPanel gradientPanel_1 = new KGradientPanel();
		gradientPanel_1.kStartColor = Color.ORANGE;
		gradientPanel_1.kEndColor = Color.YELLOW;
		gradientPanel_1.setBounds(0, 0, 364, 405);
		panel_3.add(gradientPanel_1);
		gradientPanel_1.setLayout(null);
		
		autoVers = new JTextField();
		autoVers.setBounds(187, 52, 167, 27);
		gradientPanel_1.add(autoVers);
		autoVers.setColumns(10);
		
		CA = new JTextField();
		CA.setBounds(187, 186, 167, 27);
		gradientPanel_1.add(CA);
		CA.setColumns(10);
		
		vers = new JTextField();
		vers.setBounds(187, 314, 167, 27);
		gradientPanel_1.add(vers);
		vers.setColumns(10);
		
		JLabel lblNewLabel_4_3 = new JLabel("Autorisation de versement :");
		lblNewLabel_4_3.setBounds(10, 52, 167, 27);
		gradientPanel_1.add(lblNewLabel_4_3);
		
		JLabel lblNewLabel_4_5 = new JLabel("Chiffre d'affaire :");
		lblNewLabel_4_5.setBounds(25, 186, 106, 27);
		gradientPanel_1.add(lblNewLabel_4_5);
		
		JLabel lblNewLabel_4_6 = new JLabel("Versement");
		lblNewLabel_4_6.setBounds(25, 314, 82, 27);
		gradientPanel_1.add(lblNewLabel_4_6);
		
		JButton btnImp = new JButton("Imprimer");
		btnImp.setBounds(408, 644, 85, 29);
		contentPane.add(btnImp);
		
		JButton btnClose = new JButton("Fermer");
		btnClose.setBounds(565, 644, 85, 29);
		contentPane.add(btnClose);
		
		JLabel lblNewLabel_2_1 = new JLabel("Contact :");
		lblNewLabel_2_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2_1.setFont(new Font("Malgun Gothic", Font.BOLD, 23));
		lblNewLabel_2_1.setBounds(20, 153, 160, 36);
		contentPane.add(lblNewLabel_2_1);
		
		JLabel lblNewLabel_2_1_2 = new JLabel("Montant :");
		lblNewLabel_2_1_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2_1_2.setFont(new Font("Malgun Gothic", Font.BOLD, 23));
		lblNewLabel_2_1_2.setBounds(391, 152, 160, 36);
		contentPane.add(lblNewLabel_2_1_2);
	}
}
