package Interfaces;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import keeptoo.KGradientPanel;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.JCheckBox;
import javax.swing.JTable;

public class Affich_Clients extends JFrame {

	private JPanel contentPane;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Affich_Clients frame = new Affich_Clients();
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
	public Affich_Clients() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1068, 599);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel_2 = new JLabel("Action");
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setFont(new Font("Malgun Gothic", Font.PLAIN, 20));
		lblNewLabel_2.setBounds(27, 57, 160, 36);
		contentPane.add(lblNewLabel_2);
		
		KGradientPanel gradientPanel_1 = new KGradientPanel();
		gradientPanel_1.setLayout(null);
		gradientPanel_1.kStartColor = Color.WHITE;
		gradientPanel_1.setkStartColor(new Color(127, 255, 0));
		gradientPanel_1.kEndColor = Color.WHITE;
		gradientPanel_1.setkEndColor(new Color(255, 228, 181));
		gradientPanel_1.setBounds(10, 106, 277, 352);
		contentPane.add(gradientPanel_1);
		
		JLabel lblNewLabel_3_1 = new JLabel("Commande :");
		lblNewLabel_3_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3_1.setFont(new Font("Sitka Small", Font.ITALIC, 20));
		lblNewLabel_3_1.setBounds(40, 53, 188, 30);
		gradientPanel_1.add(lblNewLabel_3_1);
		
		JPanel panel_1 = new JPanel();
		panel_1.setLayout(null);
		panel_1.setBounds(46, 105, 182, 208);
		gradientPanel_1.add(panel_1);
		
		JButton btnAff = new JButton("Afficher");
		btnAff.setForeground(Color.BLACK);
		btnAff.setBackground(Color.LIGHT_GRAY);
		btnAff.setBounds(31, 29, 117, 21);
		panel_1.add(btnAff);
		
		JButton btnAffAll = new JButton("Afficher tout");
		btnAffAll.setForeground(Color.BLACK);
		btnAffAll.setBackground(Color.LIGHT_GRAY);
		btnAffAll.setBounds(31, 91, 117, 21);
		panel_1.add(btnAffAll);
		
		JButton btnFermer = new JButton("Fermer");
		btnFermer.setForeground(Color.BLACK);
		btnFermer.setBackground(Color.LIGHT_GRAY);
		btnFermer.setBounds(31, 157, 117, 21);
		panel_1.add(btnFermer);
		
		KGradientPanel gradientPanel = new KGradientPanel();
		gradientPanel.kStartColor = Color.WHITE;
		gradientPanel.kEndColor = Color.WHITE;
		gradientPanel.setBounds(0, 0, 277, 352);
		gradientPanel_1.add(gradientPanel);
		
		JLabel lblNewLabel_2_1 = new JLabel("Action");
		lblNewLabel_2_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2_1.setFont(new Font("Malgun Gothic", Font.PLAIN, 20));
		lblNewLabel_2_1.setBounds(330, 57, 160, 36);
		contentPane.add(lblNewLabel_2_1);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(312, 106, 207, 446);
		contentPane.add(scrollPane);
		
		JPanel panel = new JPanel();
		scrollPane.setViewportView(panel);
		panel.setLayout(null);
		
		JCheckBox non_contacté = new JCheckBox("Non contact\u00E9 ");
		non_contacté.setBounds(31, 338, 93, 21);
		panel.add(non_contacté);
		
		JCheckBox avExp = new JCheckBox("AV Expir\u00E9e");
		avExp.setBounds(31, 266, 154, 21);
		panel.add(avExp);
		
		JCheckBox poRep = new JCheckBox("Pas de r\u00E9ponse");
		poRep.setBounds(31, 180, 154, 21);
		panel.add(poRep);
		
		JCheckBox dernEch = new JCheckBox("Derni\u00E8re \u00E9cheance");
		dernEch.setBounds(31, 94, 154, 21);
		panel.add(dernEch);
		
		JCheckBox boite_vocale = new JCheckBox("Bo\u00EEte vocale ");
		boite_vocale.setBounds(31, 21, 154, 21);
		panel.add(boite_vocale);
		
		JCheckBox non_contacté_1 = new JCheckBox("Demande du d\u00E9lai");
		non_contacté_1.setBounds(31, 405, 154, 21);
		panel.add(non_contacté_1);
		
		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(558, 34, 486, 518);
		contentPane.add(scrollPane_1);
		
		table = new JTable();
		scrollPane_1.setViewportView(table);
	}
}
