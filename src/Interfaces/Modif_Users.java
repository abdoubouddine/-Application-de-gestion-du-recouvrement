package Interfaces;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JTable;
import javax.swing.JScrollBar;
import java.awt.Font;
import javax.swing.SwingConstants;
import keeptoo.KGradientPanel;
import java.awt.Color;

public class Modif_Users extends JFrame {

	private JPanel contentPane;
	private JTextField matricule;
	private JTable table;
	private JTextField num;
	private JTextField nom;
	private JTextField prenom;
	private JTextField login;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Modif_Users frame = new Modif_Users();
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
	public Modif_Users() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1165, 515);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 90, 351, 378);
		contentPane.add(scrollPane);
		
		JPanel panel = new JPanel();
		scrollPane.setViewportView(panel);
		panel.setLayout(null);
		
		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(20, 76, 319, 80);
		panel.add(scrollPane_1);
		
		JPanel panel_1 = new JPanel();
		scrollPane_1.setViewportView(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel_2 = new JLabel("Matricule :");
		lblNewLabel_2.setBounds(10, 10, 109, 23);
		panel_1.add(lblNewLabel_2);
		
		matricule = new JTextField();
		matricule.setBounds(40, 43, 177, 25);
		panel_1.add(matricule);
		matricule.setColumns(10);
		
		JButton btnRecg = new JButton();
		btnRecg.setIcon(new javax.swing.ImageIcon("rechercher.png"));
		btnRecg.setBounds(227, 29, 56, 39);
		panel_1.add(btnRecg);
		
		JScrollPane scrollPane_1_1 = new JScrollPane();
		scrollPane_1_1.setBounds(20, 212, 319, 143);
		panel.add(scrollPane_1_1);
		
		JPanel panel_2 = new JPanel();
		scrollPane_1_1.setViewportView(panel_2);
		panel_2.setLayout(null);
		
		JButton btnUpd = new JButton("Modifier");
		btnUpd.setBounds(81, 10, 152, 34);
		panel_2.add(btnUpd);
		
		JButton btnSupp = new JButton("Supprimer");
		btnSupp.setBounds(81, 54, 152, 34);
		panel_2.add(btnSupp);
		
		JButton btnClose = new JButton("Fermer");
		btnClose.setBounds(81, 97, 152, 34);
		panel_2.add(btnClose);
		
		JLabel lblNewLabel_3_1 = new JLabel("Rechercher :");
		lblNewLabel_3_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3_1.setFont(new Font("Sitka Small", Font.ITALIC, 20));
		lblNewLabel_3_1.setBounds(10, 32, 188, 30);
		panel.add(lblNewLabel_3_1);
		
		JLabel lblNewLabel_3_1_1 = new JLabel("Commande :");
		lblNewLabel_3_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3_1_1.setFont(new Font("Sitka Small", Font.ITALIC, 20));
		lblNewLabel_3_1_1.setBounds(0, 172, 188, 30);
		panel.add(lblNewLabel_3_1_1);
		
		KGradientPanel gradientPanel = new KGradientPanel();
		gradientPanel.kStartColor = Color.WHITE;
		gradientPanel.kEndColor = Color.WHITE;
		gradientPanel.setBounds(0, 0, 349, 376);
		panel.add(gradientPanel);
		
		JScrollPane scrollPane_3 = new JScrollPane();
		scrollPane_3.setBounds(754, 10, 387, 468);
		contentPane.add(scrollPane_3);
		
		table = new JTable();
		scrollPane_3.setViewportView(table);
		resetT();
		
		JScrollBar scrollBar = new JScrollBar();
		scrollPane_3.setRowHeaderView(scrollBar);
		
		JScrollPane scrollPane_2 = new JScrollPane();
		scrollPane_2.setBounds(371, 92, 373, 376);
		contentPane.add(scrollPane_2);
		
		JPanel panel_3 = new JPanel();
		panel_3.setLayout(null);
		scrollPane_2.setViewportView(panel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Matricule :");
		lblNewLabel_4.setBounds(10, 34, 122, 36);
		panel_3.add(lblNewLabel_4);
		
		JLabel lblNewLabel_4_1 = new JLabel("Nom :");
		lblNewLabel_4_1.setBounds(10, 96, 122, 36);
		panel_3.add(lblNewLabel_4_1);
		
		JLabel lblNewLabel_4_2 = new JLabel("Pr\u00E9nom :");
		lblNewLabel_4_2.setBounds(10, 170, 122, 36);
		panel_3.add(lblNewLabel_4_2);
		
		JLabel lblNewLabel_4_3 = new JLabel("Login :");
		lblNewLabel_4_3.setBounds(10, 250, 122, 36);
		panel_3.add(lblNewLabel_4_3);
		
		num = new JTextField();
		num.setColumns(10);
		num.setBounds(152, 43, 179, 29);
		panel_3.add(num);
		
		nom = new JTextField();
		nom.setColumns(10);
		nom.setBounds(152, 105, 179, 29);
		panel_3.add(nom);
		
		prenom = new JTextField();
		prenom.setColumns(10);
		prenom.setBounds(152, 170, 179, 29);
		panel_3.add(prenom);
		
		login = new JTextField();
		login.setColumns(10);
		login.setBounds(152, 250, 179, 29);
		panel_3.add(login);
		
		KGradientPanel gradientPanel_1 = new KGradientPanel();
		gradientPanel_1.kStartColor = Color.WHITE;
		gradientPanel_1.kEndColor = Color.WHITE;
		gradientPanel_1.setBounds(0, 0, 371, 374);
		panel_3.add(gradientPanel_1);
		
		JLabel lblNewLabel_2_1 = new JLabel("Action");
		lblNewLabel_2_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2_1.setFont(new Font("Malgun Gothic", Font.BOLD, 23));
		lblNewLabel_2_1.setBounds(0, 35, 160, 36);
		contentPane.add(lblNewLabel_2_1);
		
		JLabel lblNewLabel_2_1_1 = new JLabel("Informations d'utilisateur");
		lblNewLabel_2_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2_1_1.setFont(new Font("Malgun Gothic", Font.BOLD, 23));
		lblNewLabel_2_1_1.setBounds(380, 35, 322, 36);
		contentPane.add(lblNewLabel_2_1_1);
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
