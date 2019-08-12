package myJava.enums;

enum TrafficLight {
	RED(30) {
		public TrafficLight next() {
			return GREEN;
		}
	},
	AMBER(10) {
		public TrafficLight next() {
			return RED;
		}
	},
	GREEN(30) {
		public TrafficLight next() {
			return AMBER;
		}
	};
	public abstract TrafficLight next();

	private final int seconds;

	TrafficLight(int seconds) {
		this.seconds = seconds;
	}

	int getSeconds() {
		return seconds;
	}
}

public class AbstractMethodInEnum {
	public static void main(String... args) {
		for (TrafficLight light : TrafficLight.values()) {
			System.out.printf("%s : %d Seconds, next is %s \n", light, light.getSeconds(), light.next());
		}
	}
}