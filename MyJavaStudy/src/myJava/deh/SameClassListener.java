package myJava.deh;

//This program represents the Same class Listener in which we are proving our own class object to the addActionListener method
import java.awt.Button;
import java.awt.Frame;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class SameClassListener implements ActionListener {
	Frame f;
	TextField tf;
	Button b, b1;

	SameClassListener(String ss) {
		f = new Frame(ss);
		b = new Button("OK");
		b1 = new Button("Cancel");
		b.setBounds(20, 100, 50, 50);
		b1.setBounds(80, 100, 50, 50);
		b.addActionListener(this);
		b1.addActionListener(this);
		f.add(b);
		f.add(b1);
		tf = new TextField();
		tf.setBounds(20, 40, 100, 40);
		f.add(tf);
		f.setLayout(null);
		f.setSize(150, 160);
		f.setVisible(true);
	}

	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == b) {
			tf.setText("OK");
		}
		if (e.getSource() == b1) {
			tf.setText("Cancel");
		}
	}

	public static void main(String[] args) {
		new SameClassListener("Same Class Listener");
	}
}