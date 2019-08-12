package myJava.threading;

import javax.swing.JFrame;

class ShutDownHooks implements Runnable {
	public void run() {
		System.out.println("*** Shut-down Hook Started ***");
		System.out.println("*** Application Shutting Down ***");
		try {
			Thread.sleep(10000);
		} catch (Exception e) {
		}
	}
}

class RunHookUp {
	public static void main(String... s) {
		Runtime runtime = Runtime.getRuntime();
		ShutDownHooks hook = new ShutDownHooks();
		runtime.addShutdownHook(new Thread(hook));
		JFrame testFrame = new JFrame("Test Frame");
		testFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		testFrame.setSize(100, 100);
		testFrame.setVisible(true);
		System.out.println("Hello");
	}
}