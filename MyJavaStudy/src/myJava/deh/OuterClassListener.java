package myJava.deh;

//This program represents the Outer Class Listener
import java.awt.Button;
import java.awt.Frame;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class OuterClassListener {
	Frame f;
	TextField tf;
	Button b, b1;

	OuterClassListener(String ss) {
		f = new Frame(ss);
		b = new Button("OK");
		b1 = new Button("Cancel");
		b.setBounds(20, 100, 40, 40);
		b1.setBounds(20, 180, 40, 40);
		Outer o = new Outer(this);
		b.addActionListener(o);
		Outer o1 = new Outer(this);
		b1.addActionListener(o1);
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
		new OuterClassListener("Outer Class Listener");
	}
}

class Outer implements ActionListener {
	OuterClassListener ocl;

	Outer(OuterClassListener f) {
		this.ocl = f;
	}

	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == ocl.b) {
			ocl.tf.setText("OK");
		}
		if (e.getSource() == ocl.b1) {
			ocl.tf.setText("Cancel");
		}
	}
}
/*
 * Output One Frame with a Textfield and two buttons.
 */