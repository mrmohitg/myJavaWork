package myJava.awt;

//This program is to design the calculator.
import java.awt.Button;
import java.awt.Frame;
import java.awt.TextField;

class Calc {
	Frame f;
	Button b[][] = new Button[4][4];
	TextField tf;
	char ch[][] = { { '0', '1', '2', '3' }, { '4', '5', '6', '7' }, { '8', '9', '+', '-' }, { '*', '/', '%', 'C' } };
	int x = 20, y = 100, w = 80, h = 50;

	Calc(String ss) {
		Frame f = new Frame(ss);
		tf = new TextField();
		tf.setBounds(20, 40, 360, 50);
		f.add(tf);
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 4; j++) {
				b[i][j] = new Button(String.valueOf(ch[i][j]));
				b[i][j].setBounds(x, y, w, h);
				f.add(b[i][j]);
				x = x + 90;
			}
			y = y + 70;
			x = 20;
		}
		f.setLayout(null);
		f.setSize(400, 400);
		f.setVisible(true);
	}

	public static void main(String... s) {
		new Calc("Calculator");
	}
}
/*
 * Output Calculator GUI will apper.
 */