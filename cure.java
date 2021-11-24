import javax.swing.*;
import java.awt.event.*;

public class cure {

	public static void converter()
	{

		JFrame f = new JFrame("CURRENCY CONVERTER");

		JLabel l1, l2;

		JTextField t1, t2;

		JButton b1, b2, b3;

		l1 = new JLabel("Rupees:");
		l1.setBounds(20, 40, 60, 30);
		l2 = new JLabel("Dollars:");
		l2.setBounds(170, 40, 60, 30);

		t1 = new JTextField("0");
		t1.setBounds(80, 40, 90, 30);
		t2 = new JTextField("0");
		t2.setBounds(240, 40, 90, 30);

		b1 = new JButton("INR=>USD");
		b1.setBounds(130, 80, 100, 30);
		b2 = new JButton("USD=>INR");
		b2.setBounds(130, 120, 100, 30);
		b3 = new JButton("close");
		b3.setBounds(130, 180, 100, 30);
		b1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e)
			{
				double d
					= Double.parseDouble(t1.getText());
				double d1 = (d / 74.42);
				String str1 = String.valueOf(String.format("%.2f", d1));
				t2.setText(str1);
			}
		});
		b2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e)
			{
				double d2
					= Double.parseDouble(t2.getText());
				double d3 = (d2 * 74.42);
				String str2 = String.valueOf(d3);
				t1.setText(str2);
			}
		});
		b3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e)
			{
				f.dispose();
			}
		});
		f.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e)
			{
				System.exit(0);
			}
		});
		f.add(l1);
		f.add(t1);
		f.add(l2);
		f.add(t2);
		f.add(b1);
		f.add(b2);
		f.add(b3);

		f.setLayout(null);
		f.setSize(400, 300);
		f.setVisible(true);
	}
	public static void main(String args[])
	{
		converter();
	}
}
