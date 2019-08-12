package myJava.deh;

//This program is used for to sum the two numbers by taking them in the textbox.
import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

class SumAWT extends WindowAdapter implements ActionListener {
	Frame f;
	Button b;
	TextField tf1, tf2, tf3;

	SumAWT(String ss) {
		f = new Frame(ss);
		tf1 = new TextField("");
		tf2 = new TextField("");
		tf3 = new TextField("");
		f.add(tf1);
		f.add(tf2);
		f.add(tf3);
		b = new Button("Click To Sum");
		b.addActionListener(this);
		f.add(b);
		f.addWindowListener(new WindowListenerr());
		f.setLayout(new FlowLayout());
		f.setSize(400, 400);
		f.setVisible(true);
	}

	public void actionPerformed(ActionEvent ae) {
		String s1 = tf1.getText();
		String s2 = tf2.getText();
		int n1 = Integer.parseInt(s1);
		int n2 = Integer.parseInt(s2);
		int n3 = n1 + n2;
		tf3.setText(String.valueOf(n3));
	}

	public static void main(String... s) {
		new SumAWT("SUM");
	}
}

class WindowListenerr extends WindowAdapter {
	public void windowClosing(WindowEvent we) {
		System.exit(0);
	}
}