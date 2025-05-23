package myJava.deh;

//This program shows the Inner Listener 
import java.awt.Button;
import java.awt.Frame;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class InnerClassListener implements ActionListener {
	Frame f;
	TextField tf;
	Button b, b1;

	InnerClassListener(String ss) {
		f = new Frame(ss);
		b = new Button("OK");
		b1 = new Button("Cancel");
		b.setBounds(20, 100, 40, 40);
		b1.setBounds(20, 180, 40, 40);
		b.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tf.setText("Inner Listener");
			}
		});
		b1.addActionListener(this);
		f.add(b);
		f.add(b1);
		tf = new TextField();
		tf.setBounds(20, 40, 100, 40);
		f.add(tf);
		f.setLayout(null);
		f.setSize(400, 400);
		f.setVisible(true);
	}

	public static void main(String[] args) {
		new InnerClassListener("Inner Class Listener Example");
	}

	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == b1) {
			tf.setText("Cancel");
		}
	}
}

/*
 * Output Frame with a textfield and two buttons
 */