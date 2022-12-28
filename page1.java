package project;
import java.awt.EventQueue;

import javax.swing.*;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import java.awt.Color;
import javax.swing.border.LineBorder;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.border.MatteBorder;
import java.awt.Toolkit;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import java.awt.SystemColor;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.awt.event.ActionEvent;

public class LabelDemo extends JFrame {

	private JPanel mainPane;
	private JTextField txname;
	private JTextField txpass;
	private JTextField txmail;
	private JTextField txphone;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	private final ButtonGroup buttonGroup_1 = new ButtonGroup();

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LabelDemo frame = new LabelDemo();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public LabelDemo() {
		setFont(new Font("Cooper Black", Font.PLAIN, 14));
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\om wanjari\\Downloads\\plane.png"));
		setTitle("YATRA");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1215, 690);
		mainPane = new JPanel();
		mainPane.setBackground(new Color(51, 153, 204));
		//mainPane.setBorder(new LineBorder(PanelColour,5,true));
		setContentPane(mainPane); 
		mainPane.setLayout(null);
		
		JPanel rightpanel = new JPanel();
		rightpanel.setBackground(new Color(0, 0,0,50));
		rightpanel.setBounds(475, 78, 609, 473);
		mainPane.add(rightpanel);
		rightpanel.setLayout(null);
		
		JLabel lbmain = new JLabel("Bike Trip");
		lbmain.setForeground(Color.WHITE);
		lbmain.setFont(new Font("Bauhaus 93", Font.PLAIN, 66));
		lbmain.setBounds(23, 23, 303, 71);
		rightpanel.add(lbmain);
		
		JLabel name = new JLabel("Name");
		name.setForeground(Color.WHITE);
		name.setFont(new Font("Bahnschrift", Font.PLAIN, 25));
		name.setBounds(23, 108, 72, 31);
		rightpanel.add(name);
		
		JLabel phone = new JLabel("New label");
		phone.setIcon(new ImageIcon(LabelDemo.class.getResource("/image/telephone.png")));
		phone.setBounds(40, 316, 38, 38);
		rightpanel.add(phone);
		
		JLabel mail = new JLabel("New label");
		mail.setIcon(new ImageIcon(LabelDemo.class.getResource("/image/kisspng-gmail-computer-icons-logo-email-gmail-5abe0b09a7c104.1578517615224041056871 (1).png")));
		mail.setBounds(40, 243, 38, 38);
		rightpanel.add(mail);
		
		JLabel hotel = new JLabel("New label");
		hotel.setIcon(new ImageIcon(LabelDemo.class.getResource("/image/logo-home-png-7411 (1).png")));
		hotel.setBounds(379, 85, 38, 38);
		rightpanel.add(hotel);
		
		txname = new JTextField();
		txname.setForeground(new Color(102, 102, 102));
		txname.setFont(new Font("Bahnschrift", Font.PLAIN, 21));
		txname.setBackground(new Color(153, 255, 255));
		txname.setBounds(105, 108, 238, 31);
		txname.setBorder(new MatteBorder(0, 0, 1, 0, (Color) new Color(255, 255, 255)));
		rightpanel.add(txname);
		txname.setColumns(10);
		
		txpass = new JTextField();
		txpass.setBackground(new Color(153, 255, 255));
		txpass.setBorder(new MatteBorder(0, 0, 1, 0, (Color) new Color(255, 255, 255)));
		txpass.setForeground(new Color(102, 102, 102));
		txpass.setFont(new Font("Bahnschrift", Font.PLAIN, 21));
		txpass.setBounds(147, 176, 196, 38);
		rightpanel.add(txpass);
		txpass.setColumns(10);
		
		txmail = new JTextField();
		txmail.setBackground(new Color(153, 255, 255));
		txmail.setBorder(new MatteBorder(0, 0, 1, 0, (Color) new Color(255, 255, 255)));
		txmail.setForeground(new Color(102, 102, 102));
		txmail.setFont(new Font("Bahnschrift", Font.PLAIN, 21));
		txmail.setBounds(105, 243, 238, 38);
		rightpanel.add(txmail);
		txmail.setColumns(10);
		
		txphone = new JTextField();
		txphone.setBackground(new Color(153, 255, 255));
		txphone.setBorder(new MatteBorder(0, 0, 1, 0, (Color) new Color(255, 255, 255)));
		txphone.setForeground(new Color(102, 102, 102));
		txphone.setFont(new Font("Bahnschrift", Font.PLAIN, 21));
		txphone.setBounds(105, 326, 238, 31);
		rightpanel.add(txphone);
		txphone.setColumns(10);
		
		JLabel pass = new JLabel("Password");
		pass.setForeground(new Color(255, 255, 255));
		pass.setFont(new Font("Bahnschrift", Font.PLAIN, 25));
		pass.setBounds(23, 176, 155, 47);
		rightpanel.add(pass);
		
		JLabel lbhotel = new JLabel("Hotel(Leh)");
		lbhotel.setBackground(new Color(240, 240, 240));
		lbhotel.setForeground(new Color(255, 255, 255));
		lbhotel.setFont(new Font("Bahnschrift", Font.PLAIN, 25));
		lbhotel.setBounds(432, 84, 139, 38);
		rightpanel.add(lbhotel);
		
		JRadioButton rbroom1 = new JRadioButton("1 Room( $2000 )");
		rbroom1.setBackground(new Color(153, 255, 255));
		rbroom1.setForeground(new Color(102, 102, 102));
		rbroom1.setFont(new Font("Bahnschrift", Font.PLAIN, 15));
		buttonGroup.add(rbroom1);
		rbroom1.setBounds(417, 128, 143, 21);
		rightpanel.add(rbroom1);
		
		JRadioButton rbroom2 = new JRadioButton("2 Rooms( $3000 )");
		rbroom2.setBackground(new Color(153, 255, 255));
		rbroom2.setForeground(new Color(102, 102, 102));
		rbroom2.setFont(new Font("Bahnschrift", Font.PLAIN, 15));
		buttonGroup.add(rbroom2);
		rbroom2.setBounds(417, 164, 143, 21);
		rightpanel.add(rbroom2);
		
		JLabel lbrent = new JLabel("Rent Bike");
		lbrent.setBackground(new Color(240, 240, 240));
		lbrent.setForeground(new Color(255, 255, 255));
		lbrent.setFont(new Font("Bahnschrift", Font.PLAIN, 25));
		lbrent.setBounds(392, 222, 115, 31);
		rightpanel.add(lbrent);
		
		JRadioButton rbhimalayan = new JRadioButton("RE Himalayan($2000)");
		buttonGroup_1.add(rbhimalayan);
		rbhimalayan.setBackground(new Color(153, 255, 255));
		rbhimalayan.setForeground(new Color(102, 102, 102));
		rbhimalayan.setFont(new Font("Bahnschrift", Font.PLAIN, 15));
		rbhimalayan.setBounds(417, 259, 175, 21);
		rightpanel.add(rbhimalayan);
		
		JRadioButton rbclassic = new JRadioButton("RE Classic350($1600)");
		buttonGroup_1.add(rbclassic);
		rbclassic.setBackground(new Color(153, 255, 255));
		rbclassic.setForeground(new Color(102, 102, 102));
		rbclassic.setFont(new Font("Bahnschrift", Font.PLAIN, 15));
		rbclassic.setBounds(417, 301, 175, 21);
		rightpanel.add(rbclassic);
		
		JRadioButton rbktm = new JRadioButton("KTM Duke 390($2200)");
		buttonGroup_1.add(rbktm);
		rbktm.setBackground(new Color(153, 255, 255));
		rbktm.setForeground(new Color(102, 102, 102));
		rbktm.setFont(new Font("Bahnschrift", Font.PLAIN, 15));
		rbktm.setBounds(417, 336, 175, 21);
		rightpanel.add(rbktm); 
		
		JButton button = new JButton("Booking");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					book obj = new book();
					int a;
					int b;
					int c;
					Class.forName("com.mysql.cj.jdbc.Driver");
					Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/newusers","root","omwanjari225");
					String query = "insert into Biketrip values(?,?,?,?,?,?)";
					PreparedStatement ps = con.prepareStatement(query);
					ps.setString(1, txname.getText());
					ps.setString(2, txpass.getText());
					ps.setString(3, txmail.getText());
					ps.setInt(4,Integer.parseInt(txphone.getText()));
					if(rbroom1.isSelected())
					{
						ps.setString(5, rbroom1.getText());
						obj.lblHotel_1.setText("$2000");
						a=2000;
					}    
					else
					{
						ps.setString(5, rbroom2.getText());
						obj.lblHotel_1.setText("$3000");
						a=3000;
					}
                    if(rbhimalayan.isSelected())
                    {
						ps.setString(6, rbhimalayan.getText());
						obj.lblBike.setText("$2000");
						b = 2000;
                    }
                    else if(rbclassic.isSelected())
                    {
					   ps.setString(6, rbclassic.getText());
						obj.lblBike.setText("$1600");
						b = 1600;
                    }
                    else
                    {
						ps.setString(6, rbktm.getText());
						obj.lblBike.setText("$2200");
						b = 2200;
					}
                    c = a+ b ;
                    String str1 = Integer.toString(c);
					obj.lbltotal.setText("$"+str1);
                    obj.setVisible(true);
                    int i = ps.executeUpdate();
                    JOptionPane.showMessageDialog(button,i+"## BOOKING SUCCESSFULL ##");
                    ps.close();
                    con.close();
                    
				} catch (Exception e1) {
					e1.printStackTrace();
				}
			}
		});
		
		button.setForeground(new Color(0, 0, 0));
		button.setIcon(new ImageIcon("C:\\Users\\om wanjari\\Downloads\\login.png"));
		button.setBackground(new Color(0, 255, 255));
		button.setFont(new Font("Brush Script MT", Font.BOLD, 37));
		button.setBounds(176, 395, 267, 55);
		rightpanel.add(button);
		
		JPanel leftpanel = new JPanel();
		leftpanel.setBorder(null);
		leftpanel.setBackground(new Color(51, 153, 204));
		leftpanel.setBounds(129, 78, 326, 473);
		mainPane.add(leftpanel);
		leftpanel.setLayout(null);
		
		JLabel lblNewLabel_2 = new JLabel("New label");
		lblNewLabel_2.setIcon(new ImageIcon("C:\\Users\\om wanjari\\Downloads\\nPUwg1660483219.png"));
		lblNewLabel_2.setBounds(0, 0, 326, 473);
		leftpanel.add(lblNewLabel_2);
		
		JLabel yatra = new JLabel("");
		yatra.setIcon(new ImageIcon("C:\\Users\\om wanjari\\Downloads\\plane (3).png"));
		yatra.setBounds(1037, 496, 164, 133);
		mainPane.add(yatra);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\om wanjari\\Downloads\\ss12-1 (1).png"));
		lblNewLabel.setBounds(800, 548, 280, 91);
		mainPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setBackground(new Color(153, 255, 255));
		lblNewLabel_1.setIcon(new ImageIcon("C:\\Users\\om wanjari\\Downloads\\willian-justen-de-vasconcellos-jUCQRQeRs3k-unsplash.jpg"));
		lblNewLabel_1.setBounds(0, 0,1201, 653 );
		mainPane.add(lblNewLabel_1);
	}
}
