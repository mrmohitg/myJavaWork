package myJava.deh;

//This program shows the Mouse Event
import java.awt.Color;
import java.awt.Frame;
import java.awt.TextField;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

class MouseEventDemo extends MouseAdapter implements MouseListener {
	Frame f;
	TextField tf;

	MouseEventDemo(String ss) {
		f = new Frame(ss);
		tf = new TextField();
		tf.setBounds(40, 40, 200, 50);
		tf.addMouseListener(this);
		f.add(tf);
		f.setLayout(null);
		f.setSize(300, 300);
		f.setVisible(true);
	}

	public static void main(String... s) {
		new MouseEventDemo("Mouse Event Listener");
	}

	public void mouseClicked(MouseEvent e) {
		if (e.getSource() == f) {
			tf.setText("Mouse Event");
			f.setBackground(Color.RED);
		}
	}
}
/*
 * Output One Frame with a textfield.
 */