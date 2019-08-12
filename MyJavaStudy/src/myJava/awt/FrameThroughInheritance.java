package myJava.awt;

import java.awt.Frame;

class FrameThroughInheritance extends Frame {
	FrameThroughInheritance(String ss) {
		super(ss);
		setSize(400, 400);
		setVisible(true);
	}

	public static void main(String... s) {
		new FrameThroughInheritance("First Frame");
	}
}