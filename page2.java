package project;

import java.awt.EventQueue;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Color;
import java.awt.Font;
import java.awt.Toolkit;

public class book extends JFrame {

	private JPanel contentPane;
	JLabel lblHotel_1;
	JLabel lblBike;
	JLabel lbltotal;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					book frame = new book();
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
	public book() {
		setTitle("YATRA");
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\om wanjari\\Downloads\\plane (3).png"));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1215, 690);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(204, 204, 204));
		panel.setBounds(504, 62,488 , 496);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("New label");
		lblNewLabel_1.setIcon(new ImageIcon("C:\\Users\\om wanjari\\Downloads\\NIeUn1660503726.png"));
		lblNewLabel_1.setBounds(0, 0, 489, 496);
		panel.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setIcon(new ImageIcon("C:\\Users\\om wanjari\\Downloads\\ss12-1 (1).png"));
		lblNewLabel_2.setBounds(795, 568, 280, 91);
		contentPane.add(lblNewLabel_2);
		
		JLabel yatra = new JLabel("");
		yatra.setIcon(new ImageIcon("C:\\Users\\om wanjari\\Downloads\\plane (3).png"));
		yatra.setBounds(1037, 510, 164, 133);
		contentPane.add(yatra);
		
		JPanel panel_1_1 = new JPanel();
		panel_1_1.setBounds(189, 62, 291, 496);
		contentPane.add(panel_1_1);
		panel_1_1.setBackground(new Color(0, 0,0,80));
		panel_1_1.setLayout(null);
		
		JLabel lblBill = new JLabel(" Bill");
		lblBill.setForeground(new Color(255, 255, 255));
		lblBill.setFont(new Font("Harlow Solid Italic", Font.PLAIN, 48));
		lblBill.setBounds(17, 25, 128, 65);
		panel_1_1.add(lblBill);
		
		JLabel lblHotel = new JLabel("Hotel");
		lblHotel.setForeground(new Color(255, 255, 255));
		lblHotel.setFont(new Font("Harlow Solid Italic", Font.PLAIN, 28));
		lblHotel.setBounds(43, 86, 74, 65);
		panel_1_1.add(lblHotel);
		
		JLabel lblBill_1_1 = new JLabel(" Bike");
		lblBill_1_1.setForeground(new Color(255, 255, 255));
		lblBill_1_1.setFont(new Font("Harlow Solid Italic", Font.PLAIN, 28));
		lblBill_1_1.setBounds(43, 148, 79, 65);
		panel_1_1.add(lblBill_1_1);
		
		JLabel lbltotal1_2 = new JLabel(" Total");
		lbltotal1_2.setForeground(new Color(0, 0, 0));
		lbltotal1_2.setFont(new Font("Harlow Solid Italic", Font.PLAIN, 28));
		lbltotal1_2.setBounds(43, 212, 74, 65);
		panel_1_1.add(lbltotal1_2);
		
		lblHotel_1 = new JLabel("");
		lblHotel_1.setForeground(new Color(255, 255, 255));
		lblHotel_1.setFont(new Font("Harlow Solid Italic", Font.PLAIN, 28));
		lblHotel_1.setBounds(162, 86, 74, 65);
		panel_1_1.add(lblHotel_1);
		
		lblBike = new JLabel("");
		lblBike.setForeground(new Color(255, 255, 255));
		lblBike.setFont(new Font("Harlow Solid Italic", Font.PLAIN, 28));
		lblBike.setBounds(162, 148, 74, 65);
		panel_1_1.add(lblBike);
		
		lbltotal = new JLabel("");
		lbltotal.setForeground(new Color(0, 0, 0));
		lbltotal.setFont(new Font("Harlow Solid Italic", Font.PLAIN, 28));
		lbltotal.setBounds(162, 212, 74, 65);
		panel_1_1.add(lbltotal);
		
		JLabel lbltotal1_2_1 = new JLabel("Thanks for Visiting");
		lbltotal1_2_1.setForeground(Color.WHITE);
		lbltotal1_2_1.setFont(new Font("Harlow Solid Italic", Font.PLAIN, 28));
		lbltotal1_2_1.setBounds(27, 312, 240, 65);
		panel_1_1.add(lbltotal1_2_1);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("Yatra");
		lblNewLabel_1_1_1.setBounds(51, 369, 196, 82);
		panel_1_1.add(lblNewLabel_1_1_1);
		lblNewLabel_1_1_1.setForeground(new Color(255, 51, 51));
		lblNewLabel_1_1_1.setFont(new Font("Harlow Solid Italic", Font.PLAIN, 66));
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\om wanjari\\Downloads\\willian-justen-de-vasconcellos-jUCQRQeRs3k-unsplash.jpg"));
		lblNewLabel.setBounds(0, 0, 1201, 659);
		contentPane.add(lblNewLabel);
	}
}
