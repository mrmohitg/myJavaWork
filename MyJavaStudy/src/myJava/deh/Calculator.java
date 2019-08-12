package myJava.deh;

//This is a Working Calculator
import java.awt.Button;
import java.awt.Frame;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

class Calculator implements ActionListener {
	char ch1[] = { '=' };
	Frame f;
	String s = "", s1, s2;
	float result = 0, f1 = 0, f2 = 0, sum, minus, r1, multi, divide, per, f3 = 0, equal;
	Button b[][] = new Button[4][5];
	String a[][] = { { "7", "8", "9", "+/-", "CE" }, { "4", "5", "6", "/", "%" }, { "1", "2", "3", "*", "-" },
			{ "0", "00", ".", "+", "=" } };
	TextField tf;

	Calculator(String s) {
		f = new Frame(s);
		f.setSize(230, 290);
		f.setVisible(true);
		f.setLayout(null);

		tf = new TextField();
		tf.setBounds(15, 40, 200, 30);
		f.add(tf);
		int d = 40;
		for (int i = 0; i < b.length; i++) {
			d = d + 30 + 20;
			int c = 15;
			for (int j = 0; j < b[i].length; j++) {
				b[i][j] = new Button(a[i][j]);
				b[i][j].setBounds(c, d, 30, 30);
				b[i][j].addActionListener(this);
				f.add(b[i][j]);
				c = c + 30 + 10;
			}
		}
	}

	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == b[0][0]) {
			s = s + "7";
			tf.setText(s);
		}
		if (e.getSource() == b[0][1]) {
			s = s + "8";
			tf.setText(s);
		}
		if (e.getSource() == b[0][2]) {
			s = s + "9";
			tf.setText(s);
		}
		if (e.getSource() == b[1][0]) {
			s = s + "4";
			tf.setText(s);
		}
		if (e.getSource() == b[1][1]) {
			s = s + "5";
			tf.setText(s);
		}
		if (e.getSource() == b[1][2]) {
			s = s + "6";
			tf.setText(s);
		}
		if (e.getSource() == b[2][0]) {
			s = s + "1";
			tf.setText(s);
		}
		if (e.getSource() == b[2][1]) {
			s = s + "2";
			tf.setText(s);
		}
		if (e.getSource() == b[2][2]) {
			s = s + "3";
			tf.setText(s);
		}
		if (e.getSource() == b[3][0]) {
			s = s + "0";
			tf.setText(s);
		}
		if (e.getSource() == b[3][1]) {
			s = s + "00";
			tf.setText(s);
		}
		if (e.getSource() == b[3][2]) {
			char ch[] = s.toCharArray();
			int count = 0;
			for (int i = 0; i < ch.length; i++) {
				if (ch[i] == '.') {
					count++;
				}
			}
			if (count == 0) {
				s = s + ".";
				tf.setText(s);
			}
		}
		if (e.getSource() == b[3][3]) {
			String s1 = sum();
			ch1[0] = '+';
			tf.setText(s1);
			s = "";
		}
		if (e.getSource() == b[2][4]) {
			String s1 = minus();
			ch1[0] = '-';
			tf.setText(s1);
			s = "";
		}
		if (e.getSource() == b[1][3]) {
			String s1 = divide();
			ch1[0] = '/';
			tf.setText(s1);
			s = "";
		}

		if (e.getSource() == b[2][3]) {
			String s1 = multiplay();
			ch1[0] = '*';
			tf.setText(s1);
			s = "";
		}

		if (e.getSource() == b[1][4]) {
			String s1 = percentage();
			tf.setText(s1);
			s = "";
		}

		if (e.getSource() == b[0][3]) {
			plusminus();

		}

		if (e.getSource() == b[0][4]) {
			String s1 = "0";
			tf.setText(s1);
			f1 = 0;
			s = "";
			result = 0;
			ch1[0] = '=';
		}

		if (e.getSource() == b[3][4]) {
			String s1 = equal();
			tf.setText(s1);
			f1 = 0;
		}
	}

	String equal() {
		try {
			if (s != "") {
				s2 = s;
				s = "";
			}
			{
				Float f = Float.valueOf(s2);
				f2 = f.floatValue();
				if (ch1[0] == '=') {
					ch1[0] = '=';
				}
				result = result();
			}
			s1 = String.valueOf(result);
			return s1;
		} catch (NumberFormatException e) {
			return s1;
		} catch (Exception e) {
			return s1;
		}
	}

	String sum() {
		try {
			if (f1 == 0) {
				Float f = Float.valueOf(s);
				f1 = f.floatValue();
				ch1[0] = '+';
				result = f1;
			} else {
				Float f = Float.valueOf(s);
				f2 = f.floatValue();
				result = result();
				ch1[0] = '+';
			}
			s1 = String.valueOf(result);
			return s1;
		} catch (NumberFormatException e) {
			return s1;
		} catch (Exception e) {
			return s1;
		}
	}

	String minus() {
		try {
			if (f1 == 0) {
				Float f = Float.valueOf(s);
				f1 = f.floatValue();
				ch1[0] = '-';
				result = f1;
			} else {
				Float f = Float.valueOf(s);
				f2 = f.floatValue();
				result = result();
				ch1[0] = '-';
			}
			s1 = String.valueOf(result);
			return s1;
		} catch (NumberFormatException e) {
			return s1;
		} catch (Exception e) {
			return s1;
		}
	}

	String multiplay() {
		try {
			if (f1 == 0) {
				Float f = Float.valueOf(s);
				f1 = f.floatValue();
				ch1[0] = '*';
				result = f1;
			} else {
				Float f = Float.valueOf(s);
				f2 = f.floatValue();
				result = result();
				ch1[0] = '*';
			}
			s1 = String.valueOf(result);
			return s1;
		} catch (NumberFormatException e) {
			return s1;
		} catch (Exception e) {
			return s1;
		}
	}

	String divide() {
		try {
			if (f1 == 0) {
				Float f = Float.valueOf(s);
				f1 = f.floatValue();
				ch1[0] = '/';
				result = f1;
			} else {
				Float f = Float.valueOf(s);
				f2 = f.floatValue();
				result = result();
				ch1[0] = '/';
			}
			s1 = String.valueOf(result);
			return s1;
		} catch (NumberFormatException e) {
			return s1;
		} catch (Exception e) {
			return s1;
		}
	}

	void plusminus() {
		try {
			if (s != "") {
				s = plusminuscheck(s);
				tf.setText(s);
			} else if (ch1[0] != '=') {
				result = -(result);
				String s2 = String.valueOf(result);
				tf.setText(s2);
			}
		} catch (NumberFormatException e) {
			System.out.println(e);
		} catch (Exception e) {
			System.out.println(e);
		}
	}

	String plusminuscheck(String s1) {
		s = s1;
		char ch[] = s.toCharArray();
		if (ch[0] != '+' && ch[0] != '-') {
			char ch2[] = new char[ch.length + 1];
			ch2[0] = '+';
			for (int i = 0; i < ch.length; i++) {
				ch2[i + 1] = ch[i];
			}
			s = new String(ch2);
		} else if (ch[0] == '+') {
			ch[0] = '-';
			s = new String(ch);
		} else if (ch[0] == '-') {
			ch[0] = '+';
			s = new String(ch);
		}
		return s;
	}

	String percentage() {
		try {
			Float f = Float.valueOf(s);
			f2 = f.floatValue();
			result = result();
			if (ch1[0] == '*') {
				result = result / 100;
			} else if (ch1[0] == '/') {
				result = result * 100;
			} else {
				result = 0;
			}
			s1 = String.valueOf(result);
			return s1;
		} catch (NumberFormatException e) {
			return s1;
		} catch (Exception e) {
			return s1;
		}
	}

	float result() {
		if (ch1[0] == '-') {
			minus = result - f2;
			r1 = minus;
		}
		if (ch1[0] == '+') {
			sum = result + f2;
			r1 = sum;
		}
		if (ch1[0] == '*') {
			multi = result * f2;
			r1 = multi;
		}
		if (ch1[0] == '/') {
			if (f2 == 0.0) {
				divide = 0;
				r1 = divide;
			} else {
				divide = result / f2;
				r1 = divide;
			}
		}
		if (ch1[0] == '=') {
			equal = f2;
			r1 = equal;
		}

		return r1;
	}

	public static void main(String... s) {
		new Calculator("Calculator");
	}
}

class WindowListener extends WindowAdapter {
	public void windowClosing(WindowEvent e1) {
		System.exit(0);
	}
}
/*
 * Output Working Calculator
 */