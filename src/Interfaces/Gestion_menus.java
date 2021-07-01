package Interfaces;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import keeptoo.KGradientPanel;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import keeptoo.KButton;
import java.awt.Font;

public class Gestion_menus extends JFrame {

	private JPanel contentPane;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Gestion_menus frame = new Gestion_menus();
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
	public Gestion_menus() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 958, 706);
		setTitle("Gestion des menus");
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		KGradientPanel gradientPanel = new KGradientPanel();
		gradientPanel.setBounds(0, 0, 221, 669);
		gradientPanel.kStartColor = new Color(211, 211, 211);
		gradientPanel.kEndColor = new Color(255, 255, 224);
		contentPane.add(gradientPanel);
		gradientPanel.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("LES G\u00C9ANTS DU REVETEMENT");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setForeground(new Color(128, 0, 128));
		lblNewLabel_1.setFont(new Font("Microsoft JhengHei UI", Font.BOLD | Font.ITALIC, 14));
		lblNewLabel_1.setBounds(0, 374, 221, 103);
		gradientPanel.add(lblNewLabel_1);
		
		JLabel lblNewLabel = new JLabel("GESTION DES USERS");
		lblNewLabel.setBounds(10, 112, 211, 79);
		gradientPanel.add(lblNewLabel);
		lblNewLabel.setForeground(new Color(255, 0, 0));
		lblNewLabel.setFont(new Font("Microsoft JhengHei UI", Font.BOLD | Font.ITALIC, 18));
		
		JLabel lblNewLabel_2 = new JLabel("Choisir un utilisateur :");
		lblNewLabel_2.setForeground(new Color(0, 0, 0));
		lblNewLabel_2.setFont(new Font("Book Antiqua", Font.ITALIC, 20));
		lblNewLabel_2.setBounds(231, 22, 203, 27);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Matricule :");
		lblNewLabel_3.setForeground(Color.GRAY);
		lblNewLabel_3.setFont(new Font("Georgia", Font.ITALIC, 16));
		lblNewLabel_3.setBounds(329, 71, 150, 27);
		contentPane.add(lblNewLabel_3);
		
		textField = new JTextField();
		textField.setBounds(489, 75, 136, 23);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JButton btnNewButton = new JButton("");
		btnNewButton.setBounds(658, 59, 52, 48);
		btnNewButton.setIcon(new javax.swing.ImageIcon("rechercher.png"));
		contentPane.add(btnNewButton);
		
		JCheckBox chckbxNewCheckBox = new JCheckBox("Ajout des infos du contact");
		chckbxNewCheckBox.setBounds(270, 199, 176, 21);
		contentPane.add(chckbxNewCheckBox);
		
		JCheckBox chckbxNewCheckBox_1 = new JCheckBox("Modification des infos du contact");
		chckbxNewCheckBox_1.setBounds(270, 222, 209, 26);
		contentPane.add(chckbxNewCheckBox_1);
		
		JCheckBox chckbxNewCheckBox_2 = new JCheckBox("BlackLister des clients");
		chckbxNewCheckBox_2.setBounds(270, 250, 164, 21);
		contentPane.add(chckbxNewCheckBox_2);
		
		JCheckBox chckbxNewCheckBox_3 = new JCheckBox("Listage des clients  du jour :");
		chckbxNewCheckBox_3.setFont(new Font("Papyrus", Font.BOLD, 13));
		chckbxNewCheckBox_3.setForeground(Color.DARK_GRAY);
		chckbxNewCheckBox_3.setBounds(635, 227, 189, 21);
		contentPane.add(chckbxNewCheckBox_3);
		
		JCheckBox chckbxNewCheckBox_3_1 = new JCheckBox("Bo\u00EEte vocale");
		chckbxNewCheckBox_3_1.setForeground(new Color(0, 0, 0));
		chckbxNewCheckBox_3_1.setBounds(659, 261, 165, 21);
		contentPane.add(chckbxNewCheckBox_3_1);
		
		JCheckBox chckbxNewCheckBox_3_2 = new JCheckBox("Client \u00E0 produit pr\u00EAt avec derni\u00E8re \u00E9cheance");
		chckbxNewCheckBox_3_2.setBounds(659, 284, 251, 21);
		contentPane.add(chckbxNewCheckBox_3_2);
		
		JCheckBox chckbxNewCheckBox_3_3 = new JCheckBox("Pas de r\u00E9ponse");
		chckbxNewCheckBox_3_3.setBounds(659, 307, 103, 21);
		contentPane.add(chckbxNewCheckBox_3_3);
		
		JCheckBox chckbxNewCheckBox_3_4 = new JCheckBox("Clients \u00E0 autorisation de versement expir\u00E9 ");
		chckbxNewCheckBox_3_4.setBounds(658, 330, 239, 21);
		contentPane.add(chckbxNewCheckBox_3_4);
		
		JCheckBox chckbxNewCheckBox_3_5 = new JCheckBox("Listage des clients non contact\u00E9s");
		chckbxNewCheckBox_3_5.setBounds(627, 366, 270, 21);
		contentPane.add(chckbxNewCheckBox_3_5);
		
		JCheckBox chckbxNewCheckBox_3_6 = new JCheckBox("Liste des clients blacklist\u00E9s");
		chckbxNewCheckBox_3_6.setBounds(627, 399, 166, 21);
		contentPane.add(chckbxNewCheckBox_3_6);
		
		JCheckBox chckbxNewCheckBox_3_7 = new JCheckBox("Liste des clients en instance");
		chckbxNewCheckBox_3_7.setBounds(627, 432, 166, 21);
		contentPane.add(chckbxNewCheckBox_3_7);
		
		JCheckBox chckbxNewCheckBox_2_1 = new JCheckBox("R\u00E9cap quotidien");
		chckbxNewCheckBox_2_1.setBounds(270, 336, 138, 21);
		contentPane.add(chckbxNewCheckBox_2_1);
		
		JCheckBox chckbxNewCheckBox_2_2 = new JCheckBox("R\u00E9cap mensuel");
		chckbxNewCheckBox_2_2.setBounds(270, 366, 138, 21);
		contentPane.add(chckbxNewCheckBox_2_2);
		
		JCheckBox chckbxNewCheckBox_2_3 = new JCheckBox("R\u00E9cap annuel");
		chckbxNewCheckBox_2_3.setBounds(270, 399, 138, 21);
		contentPane.add(chckbxNewCheckBox_2_3);
		
		JLabel lblNewLabel_2_2_3 = new JLabel("Gestion des utilisateurs :");
		lblNewLabel_2_2_3.setForeground(Color.DARK_GRAY);
		lblNewLabel_2_2_3.setFont(new Font("Papyrus", Font.BOLD, 13));
		lblNewLabel_2_2_3.setBounds(278, 503, 145, 27);
		contentPane.add(lblNewLabel_2_2_3);
		
		JCheckBox chckbxNewCheckBox_2_1_1 = new JCheckBox("Ajouter un utilisateur");
		chckbxNewCheckBox_2_1_1.setBounds(310, 536, 136, 21);
		contentPane.add(chckbxNewCheckBox_2_1_1);
		
		JCheckBox chckbxNewCheckBox_2_1_1_1 = new JCheckBox("Modifier/Supprimer un utilisateur");
		chckbxNewCheckBox_2_1_1_1.setBounds(310, 559, 189, 21);
		contentPane.add(chckbxNewCheckBox_2_1_1_1);
		
		JCheckBox chckbxNewCheckBox_2_1_1_2 = new JCheckBox("Gestion du menu");
		chckbxNewCheckBox_2_1_1_2.setBounds(266, 583, 130, 21);
		contentPane.add(chckbxNewCheckBox_2_1_1_2);
		
		JCheckBox chckbxNewCheckBox_2_1_1_3 = new JCheckBox("Gestion d'acc\u00E8s des utilisateurs");
		chckbxNewCheckBox_2_1_1_3.setBounds(266, 606, 168, 21);
		contentPane.add(chckbxNewCheckBox_2_1_1_3);
		
		JCheckBox chckbxNewCheckBox_3_8_1 = new JCheckBox("New check box");
		chckbxNewCheckBox_3_8_1.setBounds(627, 536, 113, 21);
		contentPane.add(chckbxNewCheckBox_3_8_1);
		
		JCheckBox chckbxNewCheckBox_3_8_2 = new JCheckBox("New check box");
		chckbxNewCheckBox_3_8_2.setBounds(627, 559, 101, 21);
		contentPane.add(chckbxNewCheckBox_3_8_2);
		
		JLabel lblNewLabel_2_1 = new JLabel("Choisir le menu \u00E0 visualiser :");
		lblNewLabel_2_1.setForeground(Color.BLACK);
		lblNewLabel_2_1.setFont(new Font("Book Antiqua", Font.ITALIC, 20));
		lblNewLabel_2_1.setBounds(231, 129, 251, 27);
		contentPane.add(lblNewLabel_2_1);
		
		JLabel lblNewLabel_3_1 = new JLabel("Recouvrement :");
		lblNewLabel_3_1.setForeground(Color.GRAY);
		lblNewLabel_3_1.setFont(new Font("Georgia", Font.ITALIC, 16));
		lblNewLabel_3_1.setBounds(246, 166, 162, 27);
		contentPane.add(lblNewLabel_3_1);
		
		JLabel lblNewLabel_3_1_1 = new JLabel("\u00C9tat de sortie :");
		lblNewLabel_3_1_1.setForeground(Color.GRAY);
		lblNewLabel_3_1_1.setFont(new Font("Georgia", Font.ITALIC, 16));
		lblNewLabel_3_1_1.setBounds(246, 301, 150, 27);
		contentPane.add(lblNewLabel_3_1_1);
		
		JLabel lblNewLabel_3_1_2 = new JLabel("Gestion des r\u00F4les :");
		lblNewLabel_3_1_2.setForeground(Color.GRAY);
		lblNewLabel_3_1_2.setFont(new Font("Georgia", Font.ITALIC, 16));
		lblNewLabel_3_1_2.setBounds(246, 457, 150, 27);
		contentPane.add(lblNewLabel_3_1_2);
		
		JLabel lblNewLabel_3_1_1_1 = new JLabel("\u00C9dition :");
		lblNewLabel_3_1_1_1.setForeground(Color.GRAY);
		lblNewLabel_3_1_1_1.setFont(new Font("Georgia", Font.ITALIC, 16));
		lblNewLabel_3_1_1_1.setBounds(601, 193, 150, 27);
		contentPane.add(lblNewLabel_3_1_1_1);
		
		JLabel lblNewLabel_3_1_1_2 = new JLabel("Base de donn\u00E9es :");
		lblNewLabel_3_1_1_2.setForeground(Color.GRAY);
		lblNewLabel_3_1_1_2.setFont(new Font("Georgia", Font.ITALIC, 16));
		lblNewLabel_3_1_1_2.setBounds(601, 498, 150, 27);
		contentPane.add(lblNewLabel_3_1_1_2);
		
		JButton btnInit = new JButton("Initialiser");
		btnInit.setForeground(new Color(255, 255, 255));
		btnInit.setBackground(new Color(0, 0, 255));
		btnInit.setBounds(523, 606, 130, 27);
		contentPane.add(btnInit);
		
		JButton btnV = new JButton("Valider");
		btnV.setForeground(new Color(255, 255, 255));
		btnV.setBackground(new Color(0, 128, 0));
		btnV.setBounds(663, 606, 130, 27);
		contentPane.add(btnV);
		
		JButton btnClose = new JButton("Fermer");
		btnClose.setForeground(new Color(255, 255, 255));
		btnClose.setBackground(new Color(255, 0, 0));
		btnClose.setBounds(803, 606, 130, 27);
		contentPane.add(btnClose);
		
	}
}
