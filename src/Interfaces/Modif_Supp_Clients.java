package Interfaces;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;

import java.awt.Color;
import javax.swing.JLabel;
import keeptoo.KGradientPanel;
import javax.swing.SwingConstants;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JTextArea;
import javax.swing.JComboBox;
import javax.swing.JTable;
import java.awt.Font;
import com.toedter.calendar.JDateChooser;
import javax.swing.JCheckBox;

public class Modif_Supp_Clients extends JFrame {

	private JPanel contentPane;
	private JTextField dossier;
	private JTextField num;
	private JTable table;
	private JTextField textField_2;
	private JTextField textField;
	private JTextField textField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Modif_Supp_Clients frame = new Modif_Supp_Clients();
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
	@SuppressWarnings("rawtypes")
	public Modif_Supp_Clients() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1130, 595);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		KGradientPanel gradientPanel = new KGradientPanel();
		gradientPanel.kStartColor = new Color(186, 85, 211);
		gradientPanel.kEndColor = new Color(75, 0, 130);
		gradientPanel.kGradientFocus = 1000;
		gradientPanel.setBounds(0, 0, 1133, 105);
		contentPane.add(gradientPanel);
		gradientPanel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("GESTION DES CLIENTS");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setFont(new Font("Microsoft JhengHei UI", Font.BOLD | Font.ITALIC, 20));
		lblNewLabel.setBounds(231, 10, 665, 41);
		gradientPanel.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("LES G\u00C9ANTS DU REVETEMENT");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setForeground(Color.WHITE);
		lblNewLabel_1.setFont(new Font("Microsoft JhengHei UI", Font.BOLD | Font.ITALIC, 20));
		lblNewLabel_1.setBounds(197, 54, 728, 41);
		gradientPanel.add(lblNewLabel_1);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 157, 249, 386);
		contentPane.add(scrollPane);
		
		JPanel panel = new JPanel();
		scrollPane.setViewportView(panel);
		panel.setLayout(null);
		
		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(10, 42, 227, 121);
		panel.add(scrollPane_1);
		
		JPanel panel_1 = new JPanel();
		scrollPane_1.setViewportView(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel_4 = new JLabel("Dossier  :");
		lblNewLabel_4.setBounds(10, 10, 119, 28);
		panel_1.add(lblNewLabel_4);
		
		dossier = new JTextField();
		dossier.setBounds(54, 67, 96, 19);
		panel_1.add(dossier);
		dossier.setColumns(10);
		
		JButton btnRech = new JButton();
		btnRech.setIcon(new javax.swing.ImageIcon("rechercher.png"));
		btnRech.setBounds(162, 58, 40, 38);
		panel_1.add(btnRech);
		
		JScrollPane scrollPane_2 = new JScrollPane();
		scrollPane_2.setBounds(10, 234, 227, 129);
		panel.add(scrollPane_2);
		
		JPanel panel_2 = new JPanel();
		scrollPane_2.setViewportView(panel_2);
		panel_2.setLayout(null);
		
		JButton btnUpdate = new JButton("Modifier");
		btnUpdate.setBounds(70, 20, 85, 21);
		panel_2.add(btnUpdate);
		
		JButton btnSupp = new JButton("Supprimer");
		btnSupp.setBounds(70, 54, 85, 21);
		panel_2.add(btnSupp);
		
		JButton btnClose = new JButton("Fermer");
		btnClose.setBounds(70, 85, 85, 21);
		panel_2.add(btnClose);
		
		KGradientPanel gradientPanel_1 = new KGradientPanel();
		gradientPanel_1.kStartColor = new Color(230, 230, 250);
		gradientPanel_1.kEndColor = new Color(230, 230, 250);
		gradientPanel_1.setBounds(0, 0, 247, 374);
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
		lblNewLabel_3_1.setBounds(10, 193, 188, 30);
		gradientPanel_1.add(lblNewLabel_3_1);
		
		JScrollPane scrollPane_3 = new JScrollPane();
		scrollPane_3.setBounds(292, 157, 293, 391);
		contentPane.add(scrollPane_3);
		
		JPanel panel_3 = new JPanel();
		scrollPane_3.setViewportView(panel_3);
		panel_3.setLayout(null);
		
		JLabel lblNewLabel_7 = new JLabel("Num Dossier :");
		lblNewLabel_7.setBounds(10, 10, 90, 23);
		panel_3.add(lblNewLabel_7);
		
		JLabel tel = new JLabel("Num d'appel :");
		tel.setBounds(10, 43, 90, 23);
		panel_3.add(tel);
		
		num = new JTextField();
		num.setBounds(132, 12, 135, 19);
		panel_3.add(num);
		num.setColumns(10);
		
		KGradientPanel gradientPanel_2 = new KGradientPanel();
		gradientPanel_2.kEndColor = new Color(238, 232, 170);
		gradientPanel_2.kStartColor = new Color(238, 232, 170);
		gradientPanel_2.setBounds(0, 0, 291, 389);
		panel_3.add(gradientPanel_2);
		gradientPanel_2.setLayout(null);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(132, 45, 135, 19);
		gradientPanel_2.add(textField_2);
		
		JLabel lblNewLabel_7_3 = new JLabel("Feed Back :");
		lblNewLabel_7_3.setBounds(10, 79, 90, 23);
		gradientPanel_2.add(lblNewLabel_7_3);
		
		JComboBox fb = new JComboBox();
		fb.setBounds(132, 74, 135, 23);
		gradientPanel_2.add(fb);
		
		JLabel lblNewLabel_7_4 = new JLabel("Date du contact :");
		lblNewLabel_7_4.setBounds(10, 110, 112, 23);
		gradientPanel_2.add(lblNewLabel_7_4);
		
		JDateChooser dateChooser = new JDateChooser();
		dateChooser.setBounds(132, 107, 135, 27);
		gradientPanel_2.add(dateChooser);
		
		JLabel lblNewLabel_7_5 = new JLabel("Type du contact :");
		lblNewLabel_7_5.setBounds(10, 143, 101, 23);
		gradientPanel_2.add(lblNewLabel_7_5);
		
		JComboBox type = new JComboBox();
		type.setBounds(132, 144, 132, 23);
		gradientPanel_2.add(type);
		
		JLabel lblProduit = new JLabel("Produit :");
		lblProduit.setBounds(10, 176, 50, 32);
		gradientPanel_2.add(lblProduit);
		
		JCheckBox car = new JCheckBox("Careaux");
		car.setBounds(66, 182, 75, 21);
		gradientPanel_2.add(car);
		
		JCheckBox pav = new JCheckBox("Pav\u00E9s");
		pav.setBounds(185, 182, 62, 21);
		gradientPanel_2.add(pav);
		
		JCheckBox bord = new JCheckBox("Bordures/Agglos/Hourdis");
		bord.setBounds(66, 207, 188, 26);
		gradientPanel_2.add(bord);
		
		JLabel lblVersement = new JLabel("Versement :");
		lblVersement.setBounds(10, 239, 105, 32);
		gradientPanel_2.add(lblVersement);
		
		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(132, 245, 135, 21);
		gradientPanel_2.add(textField);
		
		JLabel lblAutoDeVersement = new JLabel("Auto de versement :");
		lblAutoDeVersement.setBounds(10, 281, 129, 21);
		gradientPanel_2.add(lblAutoDeVersement);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(132, 280, 135, 19);
		gradientPanel_2.add(textField_1);
		
		JLabel lblNewLabel_7_4_1 = new JLabel("Date pr\u00E9vue :");
		lblNewLabel_7_4_1.setBounds(10, 323, 105, 23);
		gradientPanel_2.add(lblNewLabel_7_4_1);
		
		JDateChooser dateChooser_1 = new JDateChooser();
		dateChooser_1.setBounds(132, 319, 135, 27);
		gradientPanel_2.add(dateChooser_1);
		
		JScrollPane scrollPane_4 = new JScrollPane();
		scrollPane_4.setBounds(618, 157, 488, 391);
		contentPane.add(scrollPane_4);
		
		table = new JTable();
		scrollPane_4.setViewportView(table);
		
		JLabel lblNewLabel_2 = new JLabel("Action");
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setFont(new Font("Malgun Gothic", Font.PLAIN, 20));
		lblNewLabel_2.setBounds(10, 111, 160, 36);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_2_1 = new JLabel("Infos du contact");
		lblNewLabel_2_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2_1.setFont(new Font("Malgun Gothic", Font.PLAIN, 20));
		lblNewLabel_2_1.setBounds(292, 115, 160, 36);
		contentPane.add(lblNewLabel_2_1);
		resetT();
		table.getTableHeader().setBackground(Color.LIGHT_GRAY);
	}
	
	public void resetT() {
		table.setModel(new DefaultTableModel(
				new Object[][] {
				},
				new String[] {
						"Code", "Cin", "Nom", "Prenom"
				}
			));
	}
}
