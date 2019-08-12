package myJava.threading.taskScheduling;

import java.awt.Frame;
import java.util.Timer;
import java.util.TimerTask;

class Task extends TimerTask {
	int count = 1;

	public void run() {
		Frame f = new Frame();
		f.setSize(200, 200);
		f.setVisible(true);
	}
}

class TaskScheduling {
	public static void main(String args[]) {
		Timer timer = new Timer();
		int delay = 5000;
		int period = 1000;
		timer.scheduleAtFixedRate(new Task(), delay, period);
	}
}