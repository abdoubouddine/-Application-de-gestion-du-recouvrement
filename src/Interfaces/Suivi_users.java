package Interfaces;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.border.MatteBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.JScrollPane;
import javax.swing.JButton;
import javax.swing.JTable;
import javax.swing.JScrollBar;
import javax.swing.JTextField;
import com.toedter.calendar.JDateChooser;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;

public class Suivi_users extends JFrame {

	private JPanel contentPane;
	private JTable table;
	private JTextField lgn;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Suivi_users frame = new Suivi_users();
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
	public Suivi_users() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 997, 604);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setLayout(null);
		panel.setBorder(new MatteBorder(0, 0, 3, 0, (Color) new Color(255, 0, 0)));
		panel.setBackground(Color.WHITE);
		panel.setBounds(0, 0, 983, 84);
		contentPane.add(panel);
		
		JLabel lblGestionDesUtilisateurs = new JLabel("GESTION DES UTILISATEURS");
		lblGestionDesUtilisateurs.setHorizontalAlignment(SwingConstants.CENTER);
		lblGestionDesUtilisateurs.setForeground(Color.RED);
		lblGestionDesUtilisateurs.setFont(new Font("Microsoft JhengHei UI", Font.BOLD | Font.ITALIC, 20));
		lblGestionDesUtilisateurs.setBounds(141, 10, 665, 41);
		panel.add(lblGestionDesUtilisateurs);
		
		JLabel lblNewLabel_1_2 = new JLabel("LES G\u00C9ANTS DU REVETEMENT");
		lblNewLabel_1_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_2.setForeground(new Color(128, 0, 128));
		lblNewLabel_1_2.setFont(new Font("Microsoft JhengHei UI", Font.BOLD | Font.ITALIC, 20));
		lblNewLabel_1_2.setBounds(116, 43, 728, 41);
		panel.add(lblNewLabel_1_2);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 181, 447, 376);
		contentPane.add(scrollPane);
		
		JPanel panel_1 = new JPanel();
		scrollPane.setViewportView(panel_1);
		panel_1.setLayout(null);
		
		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(47, 71, 364, 104);
		panel_1.add(scrollPane_1);
		
		JPanel panel_3 = new JPanel();
		scrollPane_1.setViewportView(panel_3);
		panel_3.setLayout(null);
		
		JLabel lblNewLabel_5 = new JLabel("Login :");
		lblNewLabel_5.setBounds(10, 10, 99, 30);
		panel_3.add(lblNewLabel_5);
		
		JLabel lblNewLabel_5_1 = new JLabel(" Date :");
		lblNewLabel_5_1.setBounds(10, 62, 99, 30);
		panel_3.add(lblNewLabel_5_1);
		
		lgn = new JTextField();
		lgn.setBounds(150, 16, 125, 19);
		panel_3.add(lgn);
		lgn.setColumns(10);
		
		JDateChooser dateChooser = new JDateChooser();
		dateChooser.getCalendarButton().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		dateChooser.setBounds(150, 73, 125, 19);
		panel_3.add(dateChooser);
		
		JScrollPane scrollPane_2 = new JScrollPane();
		scrollPane_2.setBounds(47, 229, 364, 135);
		panel_1.add(scrollPane_2);
		
		JPanel panel_2 = new JPanel();
		scrollPane_2.setViewportView(panel_2);
		panel_2.setLayout(null);
		
		JButton btnAff = new JButton("Afficher tout");
		btnAff.setBounds(124, 10, 110, 21);
		panel_2.add(btnAff);
		
		JButton btnClr = new JButton("Vider");
		btnClr.setBounds(124, 59, 110, 21);
		panel_2.add(btnClr);
		
		JButton btnClose = new JButton("Fermer");
		btnClose.setBounds(124, 102, 110, 21);
		panel_2.add(btnClose);
		
		JLabel lblNewLabel_3_1 = new JLabel("Rechercher :");
		lblNewLabel_3_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3_1.setFont(new Font("Sitka Small", Font.ITALIC, 20));
		lblNewLabel_3_1.setBounds(47, 35, 188, 30);
		panel_1.add(lblNewLabel_3_1);
		
		JLabel lblNewLabel_3_1_1 = new JLabel("Commande :");
		lblNewLabel_3_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3_1_1.setFont(new Font("Sitka Small", Font.ITALIC, 20));
		lblNewLabel_3_1_1.setBounds(47, 189, 188, 30);
		panel_1.add(lblNewLabel_3_1_1);
		
		JScrollPane scrollPane_3 = new JScrollPane();
		scrollPane_3.setBounds(480, 94, 493, 463);
		contentPane.add(scrollPane_3);
		
		table = new JTable();
		scrollPane_3.setViewportView(table);
		resetT();
		table.getTableHeader().setBackground(Color.LIGHT_GRAY);
		
		JScrollBar scrollBar = new JScrollBar();
		scrollPane_3.setRowHeaderView(scrollBar);
		
		JLabel lblNewLabel_2_1 = new JLabel("Action");
		lblNewLabel_2_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2_1.setFont(new Font("Malgun Gothic", Font.BOLD, 23));
		lblNewLabel_2_1.setBounds(10, 136, 160, 36);
		contentPane.add(lblNewLabel_2_1);
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
