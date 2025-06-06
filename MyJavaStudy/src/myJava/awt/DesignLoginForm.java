package myJava.awt;

//This program shows to design a login GUI
import java.awt.Button;
import java.awt.Frame;
import java.awt.Label;
import java.awt.TextField;

class DesignLoginForm {
	Frame f;
	Button b;
	Label l, l2;
	TextField tf, tf2;

	DesignLoginForm(String ss) {
		Frame f = new Frame(ss);
		l = new Label("Enter the ID");
		l.setBounds(40, 40, 120, 20);
		f.add(l);
		tf = new TextField();
		tf.setBounds(180, 40, 50, 20);
		f.add(tf);

		l2 = new Label("Enter the Password");
		l2.setBounds(40, 80, 120, 20);
		f.add(l2);
		tf2 = new TextField();
		tf2.setBounds(180, 80, 50, 20);
		f.add(tf2);

		b = new Button("Login");
		b.setBounds(100, 120, 50, 30);
		f.add(b);
		f.setLayout(null);
		f.setSize(400, 400);
		f.setVisible(true);
	}

	public static void main(String... s) {
		new DesignLoginForm("Login Form");
	}
}
/*
 * Output Login GUI will appear.
 */